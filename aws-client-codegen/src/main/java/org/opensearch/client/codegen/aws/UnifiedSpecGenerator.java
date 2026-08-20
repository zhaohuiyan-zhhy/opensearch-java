/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen.aws;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/** Builds one OpenAPI document containing the union of OSS, AOS, and AOSS APIs. */
public final class UnifiedSpecGenerator {
    private static final Set<String> HTTP_METHODS = Set.of("delete", "get", "head", "options", "patch", "post", "put", "trace");
    private static final Set<String> COMPATIBLE_UNION_REMOVALS = Set.of(
        "$.components.requestBodies.field_caps.content['application/json'].schema.properties.fields"
    );

    private UnifiedSpecGenerator() {}

    public static void main(String[] args) throws Exception {
        Options options = options();
        try {
            var commandLine = new DefaultParser().parse(options, args);
            Path input = Paths.get(commandLine.getOptionValue("input"));
            Path aosOverlay = Paths.get(commandLine.getOptionValue("aos-overlay"));
            Path aossOverlay = Paths.get(commandLine.getOptionValue("aoss-overlay"));
            Path output = Paths.get(commandLine.getOptionValue("output"));

            ObjectNode document = buildUnifiedSpec(input, aosOverlay, aossOverlay);
            DistributionSpecGenerator.writeObject(output, document);
            System.out.printf(
                "Wrote unified OSS/AOS/AOSS specification %s: %d paths, %d operations%n",
                output,
                document.path("paths").size(),
                countOperations(document)
            );
        } catch (ParseException exception) {
            new HelpFormatter().printHelp("UnifiedSpecGenerator", options);
            throw exception;
        }
    }

    static ObjectNode buildUnifiedSpec(Path input, Path aosOverlayPath, Path aossOverlayPath) throws IOException {
        ObjectNode oss = DistributionSpecGenerator.loadObject(input);
        ObjectNode aos = DistributionSpecGenerator.buildDistributionSpec(input, aosOverlayPath, "amazon-managed").document;
        ObjectNode aoss = DistributionSpecGenerator.buildDistributionSpec(input, aossOverlayPath, "amazon-serverless").document;
        ObjectNode unified = oss.deepCopy();

        applyUnionOverlay(unified, DistributionSpecGenerator.loadObject(aosOverlayPath));
        applyUnionOverlay(unified, DistributionSpecGenerator.loadObject(aossOverlayPath));
        annotateDeclaredApiTypes(unified, Set.of("AOS", "AOSS", "OSS"));
        annotateApiTypes(unified, operationLocations(oss), operationLocations(aos), operationLocations(aoss));
        return unified;
    }

    private static void applyUnionOverlay(ObjectNode document, ObjectNode overlay) {
        if (!"1.0.0".equals(overlay.path("overlay").asText())) {
            throw new IllegalArgumentException("Expected an OpenAPI Overlay 1.0.0 document");
        }
        JsonNode actions = overlay.get("actions");
        if (!(actions instanceof ArrayNode)) {
            throw new IllegalArgumentException("Overlay must contain an actions list");
        }

        int actionNumber = 0;
        for (JsonNode actionNode : actions) {
            actionNumber++;
            if (!(actionNode instanceof ObjectNode)) {
                throw new IllegalArgumentException("Overlay action " + actionNumber + " must be an object");
            }
            ObjectNode action = (ObjectNode) actionNode;
            String target = action.path("target").asText(null);
            if (target == null) {
                throw new IllegalArgumentException("Overlay action " + actionNumber + " has no target");
            }

            if (action.path("update").isObject()) {
                JsonNode targetNode = select(document, target);
                if (!(targetNode instanceof ObjectNode)) {
                    throw new IllegalArgumentException("Overlay update target must be an object: " + target);
                }
                deepMerge((ObjectNode) targetNode, (ObjectNode) action.get("update"));
            } else if (action.path("remove").asBoolean(false)) {
                // Removals define distribution availability. A union keeps the node and
                // records its availability in x-client-api-types instead. The field_caps
                // body field is a compatibility exception: every distribution supports
                // the same field as a query parameter, which also satisfies the AOS proxy.
                if (COMPATIBLE_UNION_REMOVALS.contains(target)) {
                    remove(document, target);
                } else if (!target.startsWith("$.paths")) {
                    throw new IllegalArgumentException("Unified client cannot represent overlay removal: " + target);
                }
            } else {
                throw new IllegalArgumentException("Overlay action " + actionNumber + " must contain update or remove");
            }
        }
    }

    private static void annotateApiTypes(ObjectNode document, Set<String> oss, Set<String> aos, Set<String> aoss) {
        Iterator<Map.Entry<String, JsonNode>> paths = document.path("paths").fields();
        while (paths.hasNext()) {
            Map.Entry<String, JsonNode> path = paths.next();
            JsonNode pathItem = path.getValue();
            for (String method : HTTP_METHODS) {
                JsonNode operationNode = pathItem.get(method);
                if (!(operationNode instanceof ObjectNode)) {
                    continue;
                }
                ObjectNode operation = (ObjectNode) operationNode;
                String location = operationLocation(path.getKey(), method);
                if (!operation.hasNonNull("x-operation-group")) {
                    throw new IllegalArgumentException("Operation has no x-operation-group: " + operation.path("operationId").asText());
                }

                ArrayNode types = operation.putArray("x-client-api-types");
                if (aos.contains(location)) {
                    types.add("AOS");
                }
                if (aoss.contains(location)) {
                    types.add("AOSS");
                }
                if (oss.contains(location)) {
                    types.add("OSS");
                }
                if (types.isEmpty()) {
                    throw new IllegalArgumentException("Operation is unavailable in every API type: " + location);
                }
            }
        }
    }

    private static Set<String> operationLocations(ObjectNode document) {
        Set<String> locations = new LinkedHashSet<>();
        Iterator<Map.Entry<String, JsonNode>> paths = document.path("paths").fields();
        while (paths.hasNext()) {
            Map.Entry<String, JsonNode> path = paths.next();
            JsonNode pathItem = path.getValue();
            for (String method : HTTP_METHODS) {
                JsonNode operation = pathItem.get(method);
                if (operation != null) {
                    locations.add(operationLocation(path.getKey(), method));
                }
            }
        }
        return locations;
    }

    private static String operationLocation(String path, String method) {
        return method.toUpperCase() + " " + path;
    }

    private static void annotateDeclaredApiTypes(JsonNode node, Set<String> inheritedTypes) {
        if (node.isArray()) {
            node.forEach(child -> annotateDeclaredApiTypes(child, inheritedTypes));
            return;
        }
        if (!(node instanceof ObjectNode)) {
            return;
        }

        ObjectNode object = (ObjectNode) node;
        Set<String> allowedTypes = declaredApiTypes(object, inheritedTypes);
        if (!allowedTypes.equals(Set.of("AOS", "AOSS", "OSS")) && looksLikeSchema(object)) {
            ArrayNode apiTypes = object.putArray("x-client-api-types");
            allowedTypes.forEach(apiTypes::add);
        }

        object.fields().forEachRemaining(field -> {
            if (!"x-client-api-types".equals(field.getKey())) {
                annotateDeclaredApiTypes(field.getValue(), allowedTypes);
            }
        });
    }

    private static Set<String> declaredApiTypes(ObjectNode object, Set<String> inheritedTypes) {
        Set<String> allowed = new LinkedHashSet<>(inheritedTypes);
        JsonNode included = object.get("x-distributions");
        if (included != null && included.isArray()) {
            allowed.retainAll(apiTypesForDistributions(included));
        }
        JsonNode excluded = object.get("x-distributions-excluded");
        if (excluded != null && excluded.isArray()) {
            allowed.removeAll(apiTypesForDistributions(excluded));
        }
        return allowed;
    }

    private static Set<String> apiTypesForDistributions(JsonNode distributions) {
        Set<String> types = new LinkedHashSet<>();
        for (JsonNode distribution : distributions) {
            switch (distribution.asText()) {
                case "amazon-managed":
                    types.add("AOS");
                    break;
                case "amazon-serverless":
                    types.add("AOSS");
                    break;
                case "opensearch":
                    types.add("OSS");
                    break;
                default:
                    break;
            }
        }
        return types;
    }

    private static boolean looksLikeSchema(ObjectNode object) {
        return List.of(
            "$ref",
            "type",
            "types",
            "allOf",
            "anyOf",
            "oneOf",
            "items",
            "properties",
            "additionalProperties",
            "enum",
            "const"
        ).stream().anyMatch(object::has);
    }

    private static int countOperations(ObjectNode document) {
        int count = 0;
        for (JsonNode pathItem : document.path("paths")) {
            for (String method : HTTP_METHODS) {
                if (pathItem.has(method)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static JsonNode select(JsonNode document, String target) {
        JsonNode node = document;
        for (String key : parseTarget(target)) {
            node = node.get(key);
            if (node == null) {
                throw new IllegalArgumentException("Overlay target does not exist: " + target);
            }
        }
        return node;
    }

    private static void remove(ObjectNode document, String target) {
        var keys = parseTarget(target);
        if (keys.isEmpty()) {
            throw new IllegalArgumentException("The document root cannot be removed");
        }
        JsonNode parent = document;
        for (String key : keys.subList(0, keys.size() - 1)) {
            parent = parent.get(key);
            if (parent == null) {
                return;
            }
        }
        if (parent instanceof ObjectNode) {
            ((ObjectNode) parent).remove(keys.get(keys.size() - 1));
        }
    }

    private static java.util.List<String> parseTarget(String target) {
        if (!target.startsWith("$")) {
            throw new IllegalArgumentException("Overlay target must start with '$': " + target);
        }

        var keys = new java.util.ArrayList<String>();
        int position = 1;
        while (position < target.length()) {
            if (target.charAt(position) == '.') {
                int end = position + 1;
                while (end < target.length() && target.charAt(end) != '.' && target.charAt(end) != '[') {
                    end++;
                }
                keys.add(target.substring(position + 1, end));
                position = end;
            } else if (target.startsWith("['", position)) {
                int end = target.indexOf("']", position + 2);
                if (end < 0) {
                    throw new IllegalArgumentException("Unterminated overlay target segment: " + target);
                }
                keys.add(target.substring(position + 2, end));
                position = end + 2;
            } else {
                throw new IllegalArgumentException("Unsupported overlay target syntax at position " + position + ": " + target);
            }
        }
        return keys;
    }

    private static void deepMerge(ObjectNode target, ObjectNode update) {
        Iterator<Map.Entry<String, JsonNode>> fields = update.fields();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> field = fields.next();
            JsonNode existing = target.get(field.getKey());
            if (existing instanceof ObjectNode && field.getValue() instanceof ObjectNode) {
                deepMerge((ObjectNode) existing, (ObjectNode) field.getValue());
            } else {
                target.set(field.getKey(), field.getValue().deepCopy());
            }
        }
    }

    private static Options options() {
        return new Options().addOption(requiredOption("input", "Base OpenAPI specification"))
            .addOption(requiredOption("aos-overlay", "AOS OpenAPI Overlay document"))
            .addOption(requiredOption("aoss-overlay", "AOSS OpenAPI Overlay document"))
            .addOption(requiredOption("output", "Generated unified OpenAPI specification"));
    }

    private static Option requiredOption(String name, String description) {
        return Option.builder().longOpt(name).desc(description).hasArg().required().build();
    }
}
