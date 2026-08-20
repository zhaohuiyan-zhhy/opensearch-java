/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.opensearch.aoss;

import java.net.URI;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import org.opensearch.client.opensearch.ApiType;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch._types.Result;
import org.opensearch.client.opensearch._types.Time;
import org.opensearch.client.opensearch.core.BulkRequest;
import org.opensearch.client.opensearch.core.IndexResponse;
import org.opensearch.client.opensearch.core.UpdateRequest;
import org.opensearch.client.opensearch.core.bulk.BulkOperation;
import org.opensearch.client.opensearch.core.bulk.IndexOperation;
import org.opensearch.client.opensearch.core.msearch.RequestItem;
import org.opensearch.client.opensearch.indices.CreateIndexResponse;
import org.opensearch.client.transport.aws.AwsSdk2Transport;
import org.opensearch.client.transport.aws.AwsSdk2TransportOptions;
import software.amazon.awssdk.auth.credentials.EnvironmentVariableCredentialsProvider;
import software.amazon.awssdk.http.urlconnection.UrlConnectionHttpClient;
import software.amazon.awssdk.regions.Region;

/** Live SigV4 coverage test for safe, reversible AOSS data-plane operations. */
public final class AossLiveSmokeTest {
    private static final ApiType API_TYPE = ApiType.AOSS;

    private AossLiveSmokeTest() {}

    public static void main(String[] args) throws Exception {
        Map<String, String> environment = System.getenv();
        URI endpoint = parseEndpoint(required(environment, "AOSS_ENDPOINT"));
        Region region = Region.of(environment.getOrDefault("AOSS_REGION", "us-east-1"));
        AwsSdk2TransportOptions options = AwsSdk2TransportOptions.builder()
            .setCredentials(EnvironmentVariableCredentialsProvider.create())
            .build();
        AwsSdk2Transport transport = new AwsSdk2Transport(UrlConnectionHttpClient.create(), endpoint.getHost(), "aoss", region, options);
        OpenSearchClient client = new OpenSearchClient(transport);

        String prefix = "aoss-java-live-" + UUID.randomUUID().toString().toLowerCase(Locale.ROOT);
        String componentTemplate = prefix + "-component";
        String indexTemplate = prefix + "-template";
        String index = prefix + "-index";
        String alias = prefix + "-alias";
        Recorder recorder = new Recorder();
        boolean componentTemplateCreated = false;
        boolean indexTemplateCreated = false;
        boolean indexCreated = false;
        boolean aliasCreated = false;
        String pitId = null;

        try {

            Boolean componentPut = recorder.check(
                "cluster.put_component_template",
                () -> client.cluster()
                    .putComponentTemplate(
                        request -> request.name(componentTemplate)
                            .template(
                                template -> template.mappings(
                                    mapping -> mapping.properties("template_marker", property -> property.keyword(keyword -> keyword))
                                )
                            ),
                        API_TYPE
                    )
                    .acknowledged(),
                Boolean.TRUE::equals
            );
            componentTemplateCreated = Boolean.TRUE.equals(componentPut);
            if (componentTemplateCreated) {
                recorder.check(
                    "cluster.exists_component_template",
                    () -> client.cluster().existsComponentTemplate(request -> request.name(componentTemplate), API_TYPE).value(),
                    Boolean.TRUE::equals
                );
                recorder.check(
                    "cluster.get_component_template",
                    () -> client.cluster()
                        .getComponentTemplate(request -> request.name(componentTemplate), API_TYPE)
                        .componentTemplates()
                        .size(),
                    count -> count == 1
                );
            }

            Boolean indexTemplatePut = recorder.check(
                "indices.put_index_template",
                () -> client.indices()
                    .putIndexTemplate(
                        request -> request.name(indexTemplate).indexPatterns(prefix + "-*").composedOf(componentTemplate),
                        API_TYPE
                    )
                    .acknowledged(),
                Boolean.TRUE::equals
            );
            indexTemplateCreated = Boolean.TRUE.equals(indexTemplatePut);
            if (indexTemplateCreated) {
                recorder.check(
                    "indices.exists_index_template",
                    () -> client.indices().existsIndexTemplate(request -> request.name(indexTemplate), API_TYPE).value(),
                    Boolean.TRUE::equals
                );
                recorder.check(
                    "indices.get_index_template",
                    () -> client.indices().getIndexTemplate(request -> request.name(indexTemplate), API_TYPE).indexTemplates().size(),
                    count -> count == 1
                );
                recorder.check(
                    "cat.templates",
                    () -> client.cat().templates(request -> request.name(indexTemplate), API_TYPE).valueBody().size(),
                    count -> count == 1
                );
            }

            CreateIndexResponse created = recorder.check(
                "indices.create",
                () -> client.indices().create(request -> request.index(index), API_TYPE),
                CreateIndexResponse::acknowledged
            );
            indexCreated = created != null;
            if (indexCreated) {
                runIndexMetadataChecks(client, recorder, index);
                runDocumentChecks(client, recorder, index);

                Boolean aliasPut = recorder.check(
                    "indices.put_alias",
                    () -> client.indices().putAlias(request -> request.index(index).name(alias), API_TYPE).acknowledged(),
                    Boolean.TRUE::equals
                );
                aliasCreated = Boolean.TRUE.equals(aliasPut);
                if (aliasCreated) {
                    runAliasChecks(client, recorder, index, alias);
                    Boolean aliasDeleted = recorder.check(
                        "indices.delete_alias",
                        () -> client.indices().deleteAlias(request -> request.index(index).name(alias), API_TYPE).acknowledged(),
                        Boolean.TRUE::equals
                    );
                    aliasCreated = !Boolean.TRUE.equals(aliasDeleted);
                }

                pitId = recorder.check(
                    "root.create_pit",
                    () -> client.createPit(request -> request.index(index).keepAlive(Time.of(time -> time.time("1m"))), API_TYPE).pitId(),
                    notEmpty()
                );
                if (pitId != null) {
                    String createdPitId = pitId;
                    recorder.check(
                        "root.get_all_pits",
                        () -> client.getAllPits(API_TYPE).pits().stream().anyMatch(pit -> createdPitId.equals(pit.pitId())),
                        Boolean.TRUE::equals
                    );
                    Boolean pitDeleted = recorder.check(
                        "root.delete_pit",
                        () -> client.deletePit(request -> request.pitId(createdPitId), API_TYPE)
                            .pits()
                            .stream()
                            .anyMatch(pit -> createdPitId.equals(pit.pitId()) && pit.successful()),
                        Boolean.TRUE::equals
                    );
                    if (Boolean.TRUE.equals(pitDeleted)) {
                        pitId = null;
                    }
                }
            }
        } finally {
            if (pitId != null) {
                String leakedPitId = pitId;
                recorder.check(
                    "root.delete_pit",
                    () -> client.deletePit(request -> request.pitId(leakedPitId), API_TYPE)
                        .pits()
                        .stream()
                        .anyMatch(pit -> leakedPitId.equals(pit.pitId()) && pit.successful()),
                    Boolean.TRUE::equals
                );
            }
            if (aliasCreated) {
                recorder.check(
                    "indices.delete_alias",
                    () -> client.indices().deleteAlias(request -> request.index(index).name(alias), API_TYPE).acknowledged(),
                    Boolean.TRUE::equals
                );
            }
            if (indexCreated) {
                recorder.check(
                    "indices.delete",
                    () -> client.indices().delete(request -> request.index(index), API_TYPE).acknowledged(),
                    Boolean.TRUE::equals
                );
                recorder.check(
                    "indices.exists",
                    () -> !client.indices().exists(request -> request.index(index), API_TYPE).value(),
                    Boolean.TRUE::equals
                );
            }
            if (indexTemplateCreated) {
                recorder.check(
                    "indices.delete_index_template",
                    () -> client.indices().deleteIndexTemplate(request -> request.name(indexTemplate), API_TYPE).acknowledged(),
                    Boolean.TRUE::equals
                );
            }
            if (componentTemplateCreated) {
                recorder.check(
                    "cluster.delete_component_template",
                    () -> client.cluster().deleteComponentTemplate(request -> request.name(componentTemplate), API_TYPE).acknowledged(),
                    Boolean.TRUE::equals
                );
            }
            transport.close();
        }

        recorder.exclude("indices.put_settings", "requires a confirmed AOSS-supported mutable setting");
        recorder.exclude("snapshot.*", "requires a repository, KMS, and cross-collection setup");
        recorder.exclude("ingest/search_pipeline.*", "requires pipeline-specific processor configuration");
        recorder.exclude("ml/plugin.*", "requires models, connectors, or plugin-specific resources");
        recorder.finish();
    }

    private static void runIndexMetadataChecks(OpenSearchClient client, Recorder recorder, String index) {
        recorder.check(
            "indices.exists",
            () -> client.indices().exists(request -> request.index(index), API_TYPE).value(),
            Boolean.TRUE::equals
        );
        recorder.check(
            "indices.get",
            () -> client.indices().get(request -> request.index(index), API_TYPE).result().containsKey(index),
            Boolean.TRUE::equals
        );
        recorder.check(
            "indices.put_mapping",
            () -> client.indices()
                .putMapping(
                    request -> request.index(index)
                        .properties("message", property -> property.text(text -> text))
                        .properties("category", property -> property.keyword(keyword -> keyword))
                        .properties("count", property -> property.integer(integer -> integer)),
                    API_TYPE
                )
                .acknowledged(),
            Boolean.TRUE::equals
        );
        recorder.check(
            "indices.get_mapping",
            () -> client.indices().getMapping(request -> request.index(index), API_TYPE).result().containsKey(index),
            Boolean.TRUE::equals
        );
        recorder.check(
            "indices.get_settings",
            () -> client.indices().getSettings(request -> request.index(index), API_TYPE).result().containsKey(index),
            Boolean.TRUE::equals
        );
        recorder.check(
            "indices.resolve_index",
            () -> client.indices().resolveIndex(request -> request.name(index), API_TYPE).indices().size(),
            count -> count == 1
        );
        recorder.check(
            "indices.analyze",
            () -> client.indices()
                .analyze(request -> request.index(index).analyzer("standard").text("AOSS coverage test"), API_TYPE)
                .tokens()
                .size(),
            count -> count > 0
        );
        recorder.check(
            "indices.validate_query",
            () -> client.indices()
                .validateQuery(request -> request.index(index).query(query -> query.matchAll(matchAll -> matchAll)), API_TYPE)
                .valid(),
            Boolean.TRUE::equals
        );
        recorder.check(
            "cat.indices",
            () -> client.cat().indices(request -> request.index(index), API_TYPE).valueBody().size(),
            count -> count == 1
        );
    }

    private static void runDocumentChecks(OpenSearchClient client, Recorder recorder, String index) {
        IndexResponse indexed = recorder.check(
            "root.index",
            () -> client.index(request -> request.index(index).id("doc-1").document(document("first document", "alpha", 1)), API_TYPE),
            response -> response.result() == Result.Created || response.result() == Result.Updated
        );
        recorder.check(
            "root.create",
            () -> client.create(
                request -> request.index(index).id("doc-2").document(document("second document", "beta", 2)),
                API_TYPE
            ).result(),
            result -> result == Result.Created
        );

        List<BulkOperation> operations = List.of(
            BulkOperation.of(
                operation -> operation.index(
                    IndexOperation.of(item -> item.index(index).id("doc-3").document(document("third document", "gamma", 3)))
                )
            ),
            BulkOperation.of(
                operation -> operation.index(
                    IndexOperation.of(item -> item.index(index).id("doc-4").document(document("fourth document", "delta", 4)))
                )
            )
        );
        recorder.check(
            "root.bulk",
            () -> client.bulk(new BulkRequest.Builder().index(index).operations(operations).build(), API_TYPE),
            response -> !response.errors() && response.items().size() == 2
        );

        if (indexed != null) {
            recorder.check(
                "root.exists",
                () -> waitForBoolean(() -> client.exists(request -> request.index(index).id("doc-1"), API_TYPE).value(), true),
                Boolean.TRUE::equals
            );
            recorder.check(
                "root.exists_source",
                () -> client.existsSource(request -> request.index(index).id("doc-1"), API_TYPE).value(),
                Boolean.TRUE::equals
            );
            recorder.check(
                "root.get",
                () -> waitForBoolean(
                    () -> client.get(request -> request.index(index).id("doc-1"), Map.class, API_TYPE).found(),
                    true
                ),
                Boolean.TRUE::equals
            );
            recorder.check(
                "root.get_source",
                () -> client.getSource(request -> request.index(index).id("doc-1"), Map.class, API_TYPE).valueBody().get("message"),
                "first document"::equals
            );
            recorder.check(
                "root.explain",
                () -> client.explain(
                    request -> request.index(index).id("doc-1").query(query -> query.matchAll(matchAll -> matchAll)),
                    Map.class,
                    API_TYPE
                ).matched(),
                Boolean.TRUE::equals
            );

            UpdateRequest<Map, Map> update = new UpdateRequest.Builder<Map, Map>().index(index)
                .id("doc-1")
                .doc(Map.of("count", 10))

                .build();
            recorder.check("root.update", () -> client.update(update, Map.class, API_TYPE).result(), result -> result == Result.Updated);
        }

        recorder.check(
            "root.mget",
            () -> client.mget(request -> request.index(index).ids("doc-1", "doc-2", "doc-3"), Map.class, API_TYPE).docs().size(),
            count -> count == 3
        );
        recorder.check("root.count", () -> waitForCount(client, index, 4), count -> count >= 4);
        recorder.check(
            "root.search",
            () -> client.search(
                request -> request.index(index).query(query -> query.matchAll(matchAll -> matchAll)),
                Map.class,
                API_TYPE
            )
                .hits()
                .hits()
                .size(),
            count -> count >= 4
        );
        recorder.check(
            "root.msearch",
            () -> client.msearch(
                request -> request.index(index)
                    .searches(
                        RequestItem.of(
                            item -> item.header(header -> header).body(body -> body.query(query -> query.matchAll(matchAll -> matchAll)))
                        )
                    ),
                Map.class,
                API_TYPE
            ).responses().size(),
            count -> count == 1
        );
        recorder.check(
            "root.field_caps",
            () -> client.fieldCaps(request -> request.index(index).fields("message", "category", "count"), API_TYPE),
            response -> response != null
        );
        recorder.check(
            "root.delete",
            () -> client.delete(request -> request.index(index).id("doc-2"), API_TYPE).result(),
            result -> result == Result.Deleted
        );
        recorder.check(
            "root.exists",
            () -> waitForBoolean(() -> client.exists(request -> request.index(index).id("doc-2"), API_TYPE).value(), false),
            Boolean.TRUE::equals
        );
    }

    private static void runAliasChecks(OpenSearchClient client, Recorder recorder, String index, String alias) {
        recorder.check(
            "indices.exists_alias",
            () -> client.indices().existsAlias(request -> request.index(index).name(alias), API_TYPE).value(),
            Boolean.TRUE::equals
        );
        recorder.check(
            "indices.get_alias",
            () -> client.indices().getAlias(request -> request.index(index).name(alias), API_TYPE).result().containsKey(index),
            Boolean.TRUE::equals
        );
        recorder.check(
            "cat.aliases",
            () -> client.cat().aliases(request -> request.name(alias), API_TYPE).valueBody().size(),
            count -> count == 1
        );
    }

    private static boolean waitForBoolean(CheckedSupplier<Boolean> action, boolean expected) throws Exception {
        long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(30);
        boolean value;
        do {
            value = action.get();
            if (value == expected) {
                return true;
            }
            Thread.sleep(1000);
        } while (System.nanoTime() < deadline);
        return false;
    }

    private static long waitForCount(OpenSearchClient client, String index, long expected) throws Exception {
        long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(30);
        long count = 0;
        do {
            count = client.count(request -> request.index(index), API_TYPE).count();
            if (count >= expected) {
                return count;
            }
            Thread.sleep(1000);
        } while (System.nanoTime() < deadline);
        return count;
    }

    private static Map<String, Object> document(String message, String category, int count) {
        return Map.of("message", message, "category", category, "count", count);
    }

    private static Predicate<String> notEmpty() {
        return value -> value != null && !value.isEmpty();
    }

    private static URI parseEndpoint(String value) {
        URI endpoint = URI.create(value);
        if (!"https".equals(endpoint.getScheme())
            || endpoint.getHost() == null
            || endpoint.getPort() >= 0
            || !endpoint.getPath().isEmpty()
            || endpoint.getQuery() != null
            || endpoint.getFragment() != null) {
            throw new IllegalArgumentException("AOSS_ENDPOINT must be an HTTPS origin without a port or path");
        }
        return endpoint;
    }

    private static String required(Map<String, String> environment, String name) {
        String value = environment.get(name);
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Missing environment variable " + name);
        }
        return value;
    }

    @FunctionalInterface
    private interface CheckedSupplier<T> {
        T get() throws Exception;
    }

    private static final class Recorder {
        private final Set<String> attemptedOperations = new LinkedHashSet<>();
        private final Set<String> passedOperations = new LinkedHashSet<>();
        private int passedChecks;
        private int failedChecks;
        private int excludedGroups;

        private <T> T check(String operation, CheckedSupplier<T> action, Predicate<T> validation) {
            attemptedOperations.add(operation);
            long started = System.nanoTime();
            try {
                T value = action.get();
                if (!validation.test(value)) {
                    throw new IllegalStateException("response validation failed");
                }
                passedChecks++;
                passedOperations.add(operation);
                System.out.printf("PASS %s (%d ms)%n", operation, elapsedMillis(started));
                return value;
            } catch (Exception exception) {
                failedChecks++;
                Throwable cause = unwrap(exception);
                System.out.printf(
                    "FAIL %s (%d ms): %s: %s%n",
                    operation,
                    elapsedMillis(started),
                    cause.getClass().getSimpleName(),
                    safeMessage(cause)
                );
                return null;
            }
        }

        private void exclude(String group, String reason) {
            excludedGroups++;
            System.out.printf("OUT_OF_SCOPE %s: %s%n", group, reason);
        }

        private void finish() {
            int attempted = attemptedOperations.size();
            int covered = passedOperations.size();
            double coverage = attempted == 0 ? 0.0 : covered * 100.0 / attempted;
            System.out.printf(
                "SUMMARY checks_pass=%d checks_fail=%d unique_operations=%d/%d coverage=%.1f%% excluded_groups=%d%n",
                passedChecks,
                failedChecks,
                covered,
                attempted,
                coverage,
                excludedGroups
            );
            System.out.println("COVERED " + String.join(", ", passedOperations));
            if (failedChecks > 0) {
                throw new IllegalStateException(failedChecks + " live checks failed");
            }
        }

        private static long elapsedMillis(long started) {
            return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - started);
        }

        private static Throwable unwrap(Exception exception) {
            if (exception instanceof ExecutionException && exception.getCause() != null) {
                return exception.getCause();
            }
            return exception;
        }

        private static String safeMessage(Throwable throwable) {
            String message = throwable.getMessage();
            return message == null ? "" : message.replace("\n", " ");
        }
    }
}
