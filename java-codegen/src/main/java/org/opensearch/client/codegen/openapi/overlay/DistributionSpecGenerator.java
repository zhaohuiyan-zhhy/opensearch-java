/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen.openapi.overlay;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/** Applies an OpenAPI Overlay document and distribution metadata before client code generation. */
public final class DistributionSpecGenerator {
    private static final Set<String> HTTP_METHODS = Set.of("delete", "get", "head", "options", "patch", "post", "put", "trace");
    private static final ObjectMapper YAML_MAPPER = new ObjectMapper(new YAMLFactory()).enable(SerializationFeature.INDENT_OUTPUT);

    private DistributionSpecGenerator() {}

    public static void main(String[] args) throws Exception {
        Options options = options();
        try {
            var commandLine = new DefaultParser().parse(options, args);
            Path input = Paths.get(commandLine.getOptionValue("input"));
            Path overlay = Paths.get(commandLine.getOptionValue("overlay"));
            Path output = Paths.get(commandLine.getOptionValue("output"));
            String distribution = commandLine.getOptionValue("distribution");

            BuildResult result = buildDistributionSpec(input, overlay, distribution);
            Files.createDirectories(output.toAbsolutePath().getParent());
            YAML_MAPPER.writeValue(output.toFile(), result.document);
            System.out.printf(
                "Wrote %s: %d paths, %d operations (%d filtered), %d unique local references, %d overlay actions%n",
                output,
                result.pathCount,
                result.operationCount,
                result.filteredOperationCount,
                result.referenceCount,
                result.overlayActionCount
            );
        } catch (ParseException exception) {
            new HelpFormatter().printHelp("DistributionSpecGenerator", options);
            throw exception;
        }
    }

    static BuildResult buildDistributionSpec(Path input, Path overlayPath, String distribution) throws IOException {
        ObjectNode document = loadObject(input);
        ObjectNode overlay = loadObject(overlayPath);
        if (!document.has("openapi") || !document.path("paths").isObject()) {
            throw new IllegalArgumentException("Not an OpenAPI document: " + input);
        }

        int operationCountBeforeOverlay = countOperations(document);
        int overlayActionCount = applyOverlay(document, overlay);
        int operationCountBeforeFiltering = countOperations(document);
        JsonNode filtered = filterDistribution(document, distribution);
        if (!(filtered instanceof ObjectNode)) {
            throw new IllegalArgumentException("The root document excludes distribution " + distribution);
        }

        ObjectNode filteredDocument = (ObjectNode) filtered;
        removeEmptyPaths(filteredDocument);
        int operationCount = countOperations(filteredDocument);
        int referenceCount = validateLocalReferences(filteredDocument);
        return new BuildResult(
            filteredDocument,
            filteredDocument.path("paths").size(),
            operationCount,
            operationCountBeforeFiltering - operationCount,
            operationCountBeforeFiltering - operationCountBeforeOverlay,
            referenceCount,
            overlayActionCount
        );
    }

    static int applyOverlay(ObjectNode document, ObjectNode overlay) {
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
            JsonNode targetNode = action.get("target");
            if (targetNode == null || !targetNode.isTextual()) {
                throw new IllegalArgumentException("Overlay action " + actionNumber + " has no target");
            }

            List<String> keys = parseTarget(targetNode.asText());
            if (action.path("update").isObject()) {
                JsonNode target = getNode(document, keys);
                if (!(target instanceof ObjectNode)) {
                    throw new IllegalArgumentException("Overlay update target must be an object: " + targetNode.asText());
                }
                deepMerge((ObjectNode) target, (ObjectNode) action.get("update"));
            } else if (action.path("remove").asBoolean(false)) {
                removeTarget(document, keys, targetNode.asText());
            } else {
                throw new IllegalArgumentException("Overlay action " + actionNumber + " must contain update or remove");
            }
        }
        return actionNumber;
    }

    static JsonNode filterDistribution(JsonNode value, String distribution) {
        if (value.isObject()) {
            if (contains(value.get("x-distributions"), distribution) == Boolean.FALSE
                || contains(value.get("x-distributions-excluded"), distribution) == Boolean.TRUE) {
                return null;
            }

            ObjectNode filtered = YAML_MAPPER.createObjectNode();
            Iterator<Map.Entry<String, JsonNode>> fields = value.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> field = fields.next();
                JsonNode filteredChild = filterDistribution(field.getValue(), distribution);
                if (filteredChild != null) {
                    filtered.set(field.getKey(), filteredChild);
                }
            }
            return filtered;
        }

        if (value.isArray()) {
            ArrayNode filtered = YAML_MAPPER.createArrayNode();
            for (JsonNode child : value) {
                JsonNode filteredChild = filterDistribution(child, distribution);
                if (filteredChild != null) {
                    filtered.add(filteredChild);
                }
            }
            return filtered;
        }

        return value.deepCopy();
    }

    private static Boolean contains(JsonNode values, String expected) {
        if (values == null || !values.isArray()) {
            return null;
        }
        for (JsonNode value : values) {
            if (expected.equals(value.asText())) {
                return true;
            }
        }
        return false;
    }

    private static List<String> parseTarget(String target) {
        if (!target.startsWith("$")) {
            throw new IllegalArgumentException("Overlay target must start with '$': " + target);
        }

        List<String> keys = new ArrayList<>();
        int position = 1;
        while (position < target.length()) {
            if (target.charAt(position) == '.') {
                int end = position + 1;
                while (end < target.length() && target.charAt(end) != '.' && target.charAt(end) != '[') {
                    end++;
                }
                if (end == position + 1) {
                    throw new IllegalArgumentException("Empty overlay target segment: " + target);
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

    private static JsonNode getNode(JsonNode document, List<String> keys) {
        JsonNode node = document;
        for (String key : keys) {
            node = node.get(key);
            if (node == null) {
                throw new IllegalArgumentException("Overlay target does not exist: " + String.join(".", keys));
            }
        }
        return node;
    }

    private static void deepMerge(ObjectNode target, ObjectNode update) {
        update.fields().forEachRemaining(field -> {
            JsonNode existing = target.get(field.getKey());
            JsonNode value = field.getValue();
            if (existing instanceof ObjectNode && value instanceof ObjectNode) {
                deepMerge((ObjectNode) existing, (ObjectNode) value);
            } else {
                target.set(field.getKey(), value.deepCopy());
            }
        });
    }

    private static void removeTarget(ObjectNode document, List<String> keys, String target) {
        if (keys.isEmpty()) {
            throw new IllegalArgumentException("The document root cannot be removed");
        }
        JsonNode parent = getNode(document, keys.subList(0, keys.size() - 1));
        if (!(parent instanceof ObjectNode) || ((ObjectNode) parent).remove(keys.get(keys.size() - 1)) == null) {
            throw new IllegalArgumentException("Overlay remove target does not exist: " + target);
        }
    }

    private static void removeEmptyPaths(ObjectNode document) {
        ObjectNode paths = (ObjectNode) document.path("paths");
        Iterator<Map.Entry<String, JsonNode>> fields = paths.fields();
        Set<String> emptyPaths = new HashSet<>();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> path = fields.next();
            boolean hasOperation = path.getValue().isObject() && HTTP_METHODS.stream().anyMatch(method -> path.getValue().has(method));
            if (!hasOperation) {
                emptyPaths.add(path.getKey());
            }
        }
        emptyPaths.forEach(paths::remove);
    }

    private static int validateLocalReferences(JsonNode document) {
        Set<String> references = new TreeSet<>();
        collectLocalReferences(document, references);
        for (String reference : references) {
            if (document.at(reference.substring(1)).isMissingNode()) {
                throw new IllegalArgumentException("Dangling local reference: " + reference);
            }
        }
        return references.size();
    }

    private static void collectLocalReferences(JsonNode value, Set<String> references) {
        if (value.isObject()) {
            JsonNode reference = value.get("$ref");
            if (reference != null && reference.isTextual() && reference.asText().startsWith("#/")) {
                references.add(reference.asText());
            }
            value.elements().forEachRemaining(child -> collectLocalReferences(child, references));
        } else if (value.isArray()) {
            value.elements().forEachRemaining(child -> collectLocalReferences(child, references));
        }
    }

    private static int countOperations(JsonNode document) {
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

    private static ObjectNode loadObject(Path path) throws IOException {
        JsonNode value = YAML_MAPPER.readTree(path.toFile());
        if (!(value instanceof ObjectNode)) {
            throw new IllegalArgumentException("Expected a YAML object: " + path);
        }
        return (ObjectNode) value;
    }

    private static Options options() {
        return new Options().addOption(requiredOption("input", "Base OpenAPI specification"))
            .addOption(requiredOption("overlay", "OpenAPI Overlay document"))
            .addOption(requiredOption("distribution", "Distribution identifier"))
            .addOption(requiredOption("output", "Generated OpenAPI specification"));
    }

    private static Option requiredOption(String name, String description) {
        return Option.builder().longOpt(name).desc(description).hasArg().required().build();
    }

    static final class BuildResult {
        final ObjectNode document;
        final int pathCount;
        final int operationCount;
        final int filteredOperationCount;
        final int overlayOperationCount;
        final int referenceCount;
        final int overlayActionCount;

        BuildResult(
            ObjectNode document,
            int pathCount,
            int operationCount,
            int filteredOperationCount,
            int overlayOperationCount,
            int referenceCount,
            int overlayActionCount
        ) {
            this.document = document;
            this.pathCount = pathCount;
            this.operationCount = operationCount;
            this.filteredOperationCount = filteredOperationCount;
            this.overlayOperationCount = overlayOperationCount;
            this.referenceCount = referenceCount;
            this.overlayActionCount = overlayActionCount;
        }
    }
}
