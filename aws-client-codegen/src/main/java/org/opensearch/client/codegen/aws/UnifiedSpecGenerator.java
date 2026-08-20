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
import java.util.Set;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/** Applies the public AOS and AOSS overlays to the OSS OpenAPI specification. */
public final class UnifiedSpecGenerator {
    private static final Set<String> HTTP_METHODS = Set.of("delete", "get", "head", "options", "patch", "post", "put", "trace");

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
                "Wrote combined OSS + AOS + AOSS specification %s: %d paths, %d operations%n",
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
        ObjectNode document = DistributionSpecGenerator.loadObject(input);
        applyAdditiveOverlay(document, DistributionSpecGenerator.loadObject(aosOverlayPath));
        applyAdditiveOverlay(document, DistributionSpecGenerator.loadObject(aossOverlayPath));
        return document;
    }

    private static void applyAdditiveOverlay(ObjectNode document, ObjectNode overlay) {
        JsonNode actions = overlay.get("actions");
        if (!(actions instanceof ArrayNode)) {
            throw new IllegalArgumentException("Overlay must contain an actions list");
        }

        ObjectNode additiveOverlay = overlay.deepCopy();
        ArrayNode additiveActions = additiveOverlay.putArray("actions");
        for (JsonNode action : actions) {
            if (action.path("update").isObject()) {
                additiveActions.add(action.deepCopy());
            } else if (!action.path("remove").asBoolean(false)) {
                throw new IllegalArgumentException("Overlay action must contain update or remove");
            }
        }
        DistributionSpecGenerator.applyOverlay(document, additiveOverlay);
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

    private static Options options() {
        return new Options()
            .addOption(requiredOption("input", "Base OSS OpenAPI specification"))
            .addOption(requiredOption("aos-overlay", "AOS OpenAPI Overlay document"))
            .addOption(requiredOption("aoss-overlay", "AOSS OpenAPI Overlay document"))
            .addOption(requiredOption("output", "Combined OpenAPI output"));
    }

    private static Option requiredOption(String name, String description) {
        return Option.builder().longOpt(name).hasArg().required().desc(description).build();
    }
}
