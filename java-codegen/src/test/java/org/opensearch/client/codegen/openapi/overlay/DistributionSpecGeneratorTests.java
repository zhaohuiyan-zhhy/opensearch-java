/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen.openapi.overlay;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class DistributionSpecGeneratorTests {
    @TempDir
    Path temporaryDirectory;

    @Test
    void appliesOverlayAndFiltersDistribution() throws Exception {
        Path specification = temporaryDirectory.resolve("specification.yaml");
        Path overlay = temporaryDirectory.resolve("overlay.yaml");
        Files.write(
            specification,
            String.join(
                "\n",
                "openapi: 3.1.0",
                "paths:",
                "  /available:",
                "    get:",
                "      operationId: available.0",
                "      responses:",
                "        '200':",
                "          $ref: '#/components/responses/ok'",
                "  /excluded:",
                "    get:",
                "      operationId: excluded.0",
                "      x-distributions-excluded:",
                "        - amazon-managed",
                "      responses:",
                "        '200':",
                "          $ref: '#/components/responses/ok'",
                "  /other:",
                "    get:",
                "      operationId: other.0",
                "      x-distributions:",
                "        - amazon-serverless",
                "      responses:",
                "        '200':",
                "          $ref: '#/components/responses/ok'",
                "components:",
                "  responses:",
                "    ok:",
                "      description: ok",
                ""
            ).getBytes(StandardCharsets.UTF_8)
        );
        Files.write(
            overlay,
            String.join(
                "\n",
                "overlay: 1.0.0",
                "actions:",
                "  - target: '$.paths'",
                "    update:",
                "      /aos:",
                "        post:",
                "          operationId: aos.0",
                "          x-distributions:",
                "            - amazon-managed",
                "          responses:",
                "            '200':",
                "              $ref: '#/components/responses/ok'",
                ""
            ).getBytes(StandardCharsets.UTF_8)
        );

        DistributionSpecGenerator.BuildResult result = DistributionSpecGenerator.buildDistributionSpec(
            specification,
            overlay,
            "amazon-managed"
        );

        assertEquals(2, result.pathCount);
        assertEquals(2, result.operationCount);
        assertEquals(2, result.filteredOperationCount);
        assertEquals(1, result.overlayOperationCount);
        assertTrue(result.document.path("paths").has("/available"));
        assertTrue(result.document.path("paths").has("/aos"));
        assertFalse(result.document.path("paths").has("/excluded"));
        assertFalse(result.document.path("paths").has("/other"));
    }

    @Test
    void appliesRemoveAndReplacesArrays() throws Exception {
        Path specification = temporaryDirectory.resolve("specification.yaml");
        Path overlay = temporaryDirectory.resolve("overlay.yaml");
        Files.write(
            specification,
            String.join(
                "\n",
                "openapi: 3.1.0",
                "paths: {}",
                "components:",
                "  requestBodies:",
                "    field_caps:",
                "      content:",
                "        application/json:",
                "          schema:",
                "            type: object",
                "            properties:",
                "              fields:",
                "                type: array",
                "              index_filter:",
                "                type: object",
                "  schemas:",
                "    NodeAttributes:",
                "      type: object",
                "      required:",
                "        - name",
                "        - transport_address",
                ""
            ).getBytes(StandardCharsets.UTF_8)
        );
        Files.write(
            overlay,
            String.join(
                "\n",
                "overlay: 1.0.0",
                "actions:",
                "  - target: \"$.components.requestBodies.field_caps.content['application/json'].schema.properties.fields\"",
                "    remove: true",
                "  - target: \"$.components.schemas['NodeAttributes']\"",
                "    update:",
                "      required: []",
                ""
            ).getBytes(StandardCharsets.UTF_8)
        );

        DistributionSpecGenerator.BuildResult result = DistributionSpecGenerator.buildDistributionSpec(
            specification,
            overlay,
            "amazon-managed"
        );

        assertFalse(result.document.at("/components/requestBodies/field_caps/content/application~1json/schema/properties").has("fields"));
        assertTrue(
            result.document.at("/components/requestBodies/field_caps/content/application~1json/schema/properties").has("index_filter")
        );
        assertTrue(result.document.at("/components/schemas/NodeAttributes/required").isEmpty());
        assertEquals(2, result.overlayActionCount);
    }

    @Test
    void rejectsDanglingReferencesAfterDistributionFiltering() throws Exception {
        Path specification = temporaryDirectory.resolve("specification.yaml");
        Path overlay = temporaryDirectory.resolve("overlay.yaml");
        Files.write(
            specification,
            String.join(
                "\n",
                "openapi: 3.1.0",
                "paths:",
                "  /broken:",
                "    get:",
                "      operationId: broken.0",
                "      responses:",
                "        '200':",
                "          $ref: '#/components/responses/otherDistributionOnly'",
                "components:",
                "  responses:",
                "    otherDistributionOnly:",
                "      x-distributions:",
                "        - amazon-serverless",
                "      description: unavailable",
                ""
            ).getBytes(StandardCharsets.UTF_8)
        );
        Files.write(overlay, String.join("\n", "overlay: 1.0.0", "actions: []", "").getBytes(StandardCharsets.UTF_8));

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> DistributionSpecGenerator.buildDistributionSpec(specification, overlay, "amazon-managed")
        );

        assertTrue(exception.getMessage().contains("Dangling local reference"));
    }
}
