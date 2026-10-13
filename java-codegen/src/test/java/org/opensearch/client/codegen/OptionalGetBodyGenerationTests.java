/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.opensearch.client.codegen.openapi.OpenApiSpecification;
import org.opensearch.client.codegen.openapi.rewriter.SpecificationRewriter;
import org.opensearch.client.codegen.renderer.ShapeRenderingContext;
import org.opensearch.client.codegen.transformer.SpecTransformer;
import org.opensearch.client.codegen.transformer.overrides.Overrides;
import org.opensearch.client.codegen.utils.matcher.Matcher;

public class OptionalGetBodyGenerationTests {
    @TempDir
    Path directory;

    @ParameterizedTest
    @CsvSource({
        "get,false,false,true",
        "get,,false,true",
        "get,true,false,false",
        "get,false,true,false",
        "post,false,false,false",
        "delete,false,false,false" })
    public void preservesBodyRequirementsThroughParsingCloningAndGeneration(
        String method,
        Boolean requiredBody,
        boolean requiredField,
        boolean conditionalBody
    ) throws Exception {
        Path specification = directory.resolve("spec.yaml");
        Files.writeString(specification, """
            openapi: 3.0.3
            info:
              title: Optional body test
              version: 1.0.0
            paths:
              /example:
                %s:
                  operationId: example.inspect.0
                  description: Inspect an optional request body.
                  x-operation-group: example.inspect
                  requestBody:
                    $ref: '#/components/requestBodies/body'
                  responses:
                    '200':
                      description: Test response
                      content:
                        application/json:
                          schema:
                            type: object
                            properties:
                              result:
                                type: string
            components:
              requestBodies:
                body:
                  %s
                  content:
                    application/json:
                      schema:
                        type: object
                        required: %s
                        properties:
                          filter:
                            type: string
            """.formatted(method, requiredBody == null ? "" : "required: " + requiredBody, requiredField ? "[filter]" : "[]"));
        Overrides overrides = Overrides.builder().build();
        OpenApiSpecification spec = OpenApiSpecification.retrieve(specification.toUri()).clone();
        spec = SpecificationRewriter.rewrite(spec, overrides);
        SpecTransformer transformer = new SpecTransformer(Matcher.all(), overrides);
        transformer.visit(spec);

        Path output = directory.resolve("generated");
        try (
            ShapeRenderingContext context = ShapeRenderingContext.builder()
                .withOutputDir(output.toFile())
                .withJavaCodeFormatter(
                    b -> b.withRootDir(output).withEclipseFormatterConfig(Path.of("../buildSrc/formatterConfig-generated.xml").toFile())
                )
                .withTemplateLoader(b -> b.withTemplatesResourceSubPath("/org/opensearch/client/codegen/templates"))
                .build()
        ) {
            transformer.getRoot().render(context);
        }
        String generated = Files.readString(output.resolve("example/InspectRequest.java"));
        assertEquals(conditionalBody, generated.contains("request -> request.filter() != null"));
    }
}
