/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.opensearch.aos;

import java.net.URI;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import org.apache.hc.client5.http.auth.AuthScope;
import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.apache.hc.client5.http.impl.auth.BasicCredentialsProvider;
import org.apache.hc.core5.http.HttpHost;
import org.opensearch.client.json.jackson3.JacksonJsonpMapper;
import org.opensearch.client.opensearch.OpenSearchAsyncClient;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch._types.Refresh;
import org.opensearch.client.opensearch._types.Result;
import org.opensearch.client.opensearch.core.IndexResponse;
import org.opensearch.client.opensearch.indices.CreateIndexResponse;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.httpclient5.ApacheHttpClient5TransportBuilder;

/** Live smoke test for sources generated from the AOS distribution specification. */
public final class AosLiveSmokeTest {
    private AosLiveSmokeTest() {}

    public static void main(String[] args) throws Exception {
        Map<String, String> environment = System.getenv();
        URI endpoint = parseEndpoint(required(environment, "AOS_ENDPOINT"));
        String username = required(environment, "AOS_USERNAME");
        String password = required(environment, "AOS_PASSWORD");
        int port = endpoint.getPort() < 0 ? 443 : endpoint.getPort();
        HttpHost host = new HttpHost(endpoint.getScheme(), endpoint.getHost(), port);

        BasicCredentialsProvider credentials = new BasicCredentialsProvider();
        credentials.setCredentials(new AuthScope(host), new UsernamePasswordCredentials(username, password.toCharArray()));

        OpenSearchTransport transport = ApacheHttpClient5TransportBuilder.builder(host)
            .setMapper(new JacksonJsonpMapper())
            .setHttpClientConfigCallback(builder -> builder.setDefaultCredentialsProvider(credentials))
            .build();

        String prefix = "aos-java-live-" + UUID.randomUUID().toString().toLowerCase(Locale.ROOT);
        String index = prefix + "-index";
        String asyncIndex = prefix + "-async";
        String alias = prefix + "-alias";
        OpenSearchClient client = new OpenSearchClient(transport);
        OpenSearchAsyncClient asyncClient = new OpenSearchAsyncClient(transport);
        Recorder recorder = new Recorder();
        boolean indexCreated = false;
        boolean asyncIndexCreated = false;
        boolean aliasCreated = false;
        boolean appendOnly = false;

        try {
            runReadOnlyChecks(client, recorder);

            CreateIndexResponse created = recorder.check(
                "indices.create",
                () -> client.indices()
                    .create(request -> request.index(index).settings(settings -> settings.numberOfShards(1).numberOfReplicas(0))),
                CreateIndexResponse::acknowledged
            );
            indexCreated = created != null;
            if (indexCreated) {
                runIndexMetadataChecks(client, recorder, index);
                appendOnly = runDocumentChecks(client, recorder, index);

                Boolean aliasAdded = recorder.check(
                    "indices.put_alias",
                    () -> client.indices().putAlias(request -> request.index(index).name(alias)).acknowledged(),
                    Boolean.TRUE::equals
                );
                aliasCreated = Boolean.TRUE.equals(aliasAdded);
                if (aliasCreated) {
                    runAliasChecks(client, recorder, index, alias);
                    Boolean aliasDeleted = recorder.check(
                        "indices.delete_alias",
                        () -> client.indices().deleteAlias(request -> request.index(index).name(alias)).acknowledged(),
                        Boolean.TRUE::equals
                    );
                    aliasCreated = !Boolean.TRUE.equals(aliasDeleted);
                }
            }

            recorder.check(
                "ultrawarm.list_migration_status",
                () -> client.ultrawarm().listMigrationStatus().valueBody().size(),
                count -> count >= 0
            );

            recorder.check("async.root.info", () -> asyncClient.info().get(30, TimeUnit.SECONDS).version().number(), notEmpty());
            recorder.check(
                "async.cluster.health",
                () -> asyncClient.cluster().health().get(30, TimeUnit.SECONDS).status().jsonValue(),
                AosLiveSmokeTest::healthy
            );
            CreateIndexResponse asyncCreated = recorder.check(
                "async.indices.create",
                () -> asyncClient.indices()
                    .create(request -> request.index(asyncIndex).settings(settings -> settings.numberOfShards(1).numberOfReplicas(0)))
                    .get(30, TimeUnit.SECONDS),
                CreateIndexResponse::acknowledged
            );
            asyncIndexCreated = asyncCreated != null;
            if (asyncIndexCreated) {
                runAsyncDocumentChecks(asyncClient, recorder, asyncIndex, appendOnly);
            }
        } finally {
            if (aliasCreated) {
                recorder.check(
                    "cleanup.indices.delete_alias",
                    () -> client.indices().deleteAlias(request -> request.index(index).name(alias)).acknowledged(),
                    Boolean.TRUE::equals
                );
            }
            if (asyncIndexCreated) {
                recorder.check(
                    "cleanup.async.indices.delete",
                    () -> asyncClient.indices().delete(request -> request.index(asyncIndex)).get(30, TimeUnit.SECONDS).acknowledged(),
                    Boolean.TRUE::equals
                );
                recorder.check(
                    "cleanup.async.index_absent",
                    () -> !client.indices().exists(request -> request.index(asyncIndex)).value(),
                    Boolean.TRUE::equals
                );
            }
            if (indexCreated) {
                recorder.check(
                    "cleanup.indices.delete",
                    () -> client.indices().delete(request -> request.index(index)).acknowledged(),
                    Boolean.TRUE::equals
                );
                recorder.check(
                    "cleanup.index_absent",
                    () -> !client.indices().exists(request -> request.index(index)).value(),
                    Boolean.TRUE::equals
                );
            }
            transport.close();
        }

        recordInfrastructureSkips(recorder);
        recorder.finish();
    }

    private static void runReadOnlyChecks(OpenSearchClient client, Recorder recorder) {
        recorder.check("root.ping", () -> client.ping().value(), Boolean.TRUE::equals);
        recorder.check("root.info", () -> client.info().version().number(), notEmpty());
        recorder.check("cluster.health", () -> client.cluster().health().status().jsonValue(), AosLiveSmokeTest::healthy);
        recorder.check("cluster.get_settings", () -> client.cluster().getSettings(), value -> value != null);
        recorder.check("cluster.stats", () -> client.cluster().stats(), value -> value != null);
        recorder.check("cluster.pending_tasks", () -> client.cluster().pendingTasks(), value -> value != null);
        recorder.check("nodes.info", () -> client.nodes().info(), value -> value != null);
        recorder.check("nodes.stats", () -> client.nodes().stats(), value -> value != null);
        recorder.check("nodes.usage", () -> client.nodes().usage(), value -> value != null);
        recorder.check("cat.health", () -> client.cat().health().valueBody().size(), count -> count > 0);
        recorder.check("cat.nodes", () -> client.cat().nodes().valueBody().size(), count -> count > 0);
        recorder.check("cat.plugins", () -> client.cat().plugins().valueBody().size(), count -> count >= 0);
        recorder.check("tasks.list", () -> client.tasks().list(), value -> value != null);
        recorder.check("security.get_sslinfo", () -> client.security().getSslinfo(), value -> value != null);
    }

    private static void runIndexMetadataChecks(OpenSearchClient client, Recorder recorder, String index) {
        recorder.check("indices.exists", () -> client.indices().exists(request -> request.index(index)).value(), Boolean.TRUE::equals);
        recorder.check("indices.get", () -> client.indices().get(request -> request.index(index)), value -> value != null);
        recorder.check("indices.get_mapping", () -> client.indices().getMapping(request -> request.index(index)), value -> value != null);
        recorder.check("indices.get_settings", () -> client.indices().getSettings(request -> request.index(index)), value -> value != null);
        recorder.check(
            "indices.analyze",
            () -> client.indices().analyze(request -> request.index(index).analyzer("standard").text("AOS smoke test")).tokens().size(),
            count -> count > 0
        );
        recorder.check(
            "indices.resolve_index",
            () -> client.indices().resolveIndex(request -> request.name(index)).indices().size(),
            count -> count > 0
        );
        recorder.check("indices.stats", () -> client.indices().stats(request -> request.index(index)), value -> value != null);
    }

    private static boolean runDocumentChecks(OpenSearchClient client, Recorder recorder, String index) {
        Map<String, Object> first = document("first smoke document", "alpha", 1);
        Map<String, Object> second = document("second smoke document", "beta", 2);

        IndexResponse indexed = recorder.check(
            "root.index",
            () -> client.index(request -> request.index(index).document(first).refresh(Refresh.True)),
            response -> response.result() == Result.Created || response.result() == Result.Updated
        );
        String firstId = indexed == null ? null : indexed.id();

        recorder.check(
            "root.create",
            () -> client.create(request -> request.index(index).id("2").document(second).refresh(Refresh.True)).result(),
            result -> result == Result.Created
        );
        if (firstId != null) {
            recorder.check("root.exists", () -> client.exists(request -> request.index(index).id(firstId)).value(), Boolean.TRUE::equals);
            recorder.check(
                "root.get",
                () -> client.get(request -> request.index(index).id(firstId), Map.class).found(),
                Boolean.TRUE::equals
            );
        }

        Result deleted = recorder.checkOrSkip(
            "root.delete",
            () -> client.delete(request -> request.index(index).id("2").refresh(Refresh.True)).result(),
            result -> result == Result.Deleted,
            AosLiveSmokeTest::isAppendOnlyError,
            "Optimized Engine append-only indexes reject document deletion"
        );
        boolean appendOnly = deleted == null;
        if (appendOnly) {
            recorder.skip("root.count", "Optimized Engine blocks count requests on this domain");
            recorder.skip("root.search", "Optimized Engine blocks search requests on this domain");
        } else {
            recorder.check("root.count", () -> client.count(request -> request.index(index)).count(), count -> count >= 1);
            recorder.check(
                "root.search",
                () -> client.search(request -> request.index(index).query(query -> query.matchAll(matchAll -> matchAll)), Map.class)
                    .hits()
                    .hits()
                    .size(),
                count -> count >= 1
            );
        }
        recorder.check(
            "root.field_caps",
            () -> client.fieldCaps(request -> request.index(index).fields("category", "count")),
            value -> value != null
        );
        recorder.check("root.search_shards", () -> client.searchShards(request -> request.index(index)), value -> value != null);
        recorder.check("indices.refresh", () -> client.indices().refresh(request -> request.index(index)), value -> value != null);
        recorder.check("indices.flush", () -> client.indices().flush(request -> request.index(index)), value -> value != null);
        recorder.check("cat.indices", () -> client.cat().indices(request -> request.index(index)).valueBody().size(), count -> count > 0);
        recorder.check("cat.count", () -> client.cat().count(request -> request.index(index)).valueBody().size(), count -> count > 0);
        recorder.check("cat.shards", () -> client.cat().shards(request -> request.index(index)).valueBody().size(), count -> count > 0);
        return appendOnly;
    }

    private static void runAliasChecks(OpenSearchClient client, Recorder recorder, String index, String alias) {
        recorder.check(
            "indices.exists_alias",
            () -> client.indices().existsAlias(request -> request.index(index).name(alias)).value(),
            Boolean.TRUE::equals
        );
        recorder.check(
            "indices.get_alias",
            () -> client.indices().getAlias(request -> request.index(index).name(alias)),
            value -> value != null
        );
        recorder.check("cat.aliases", () -> client.cat().aliases(request -> request.name(alias)).valueBody().size(), count -> count > 0);
    }

    private static void runAsyncDocumentChecks(OpenSearchAsyncClient client, Recorder recorder, String index, boolean appendOnly) {
        Map<String, Object> document = document("async smoke document", "async", 1);
        String documentId = recorder.check("async.root.index", () -> client.index(request -> {
            return request.index(index).document(document).refresh(Refresh.True);
        }).get(30, TimeUnit.SECONDS).id(), notEmpty());
        if (documentId != null) {
            recorder.check(
                "async.root.exists",
                () -> client.exists(request -> request.index(index).id(documentId)).get(30, TimeUnit.SECONDS).value(),
                Boolean.TRUE::equals
            );
            recorder.check(
                "async.root.get",
                () -> client.get(request -> request.index(index).id(documentId), Map.class).get(30, TimeUnit.SECONDS).found(),
                Boolean.TRUE::equals
            );
        }
        if (appendOnly) {
            recorder.skip("async.root.count", "Optimized Engine blocks count requests on this domain");
            recorder.skip("async.root.delete", "Optimized Engine append-only indexes reject document deletion");
        } else {
            recorder.check(
                "async.root.count",
                () -> client.count(request -> request.index(index)).get(30, TimeUnit.SECONDS).count(),
                count -> count == 1
            );
            recorder.check(
                "async.root.delete",
                () -> client.delete(request -> request.index(index).id(documentId).refresh(Refresh.True))
                    .get(30, TimeUnit.SECONDS)
                    .result(),
                result -> result == Result.Deleted
            );
        }
    }

    private static boolean isAppendOnlyError(Throwable throwable) {
        return Recorder.safeMessage(throwable).contains("append_only.enabled");
    }

    private static Map<String, Object> document(String message, String category, int count) {
        return Map.of("message", message, "category", category, "count", count);
    }

    private static void recordInfrastructureSkips(Recorder recorder) {
        recorder.skip("snapshot.*", "requires a preconfigured repository and IAM role");
        recorder.skip("ultrawarm.migrate_*", "requires UltraWarm capacity and a long-running migration");
        recorder.skip("cluster.reroute/put_settings", "changes domain-wide state");
        recorder.skip("nodes.reload_secure_settings", "requires node-wide credentials and changes");
        recorder.skip("ingestion.pause/resume", "requires an existing ingestion sourceCollectionId");
        recorder.skip("ML/neural/remote cluster APIs", "require external models, connectors, or clusters");
    }

    private static boolean healthy(String status) {
        return "green".equals(status) || "yellow".equals(status);
    }

    private static Predicate<String> notEmpty() {
        return value -> value != null && !value.isEmpty();
    }

    private static URI parseEndpoint(String endpoint) {
        URI uri = URI.create(endpoint);
        if (!"https".equals(uri.getScheme()) || uri.getHost() == null || !uri.getPath().isEmpty()) {
            throw new IllegalArgumentException("AOS_ENDPOINT must be an HTTPS origin without a path");
        }
        return uri;
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
        private int passed;
        private int failed;
        private int skipped;

        private <T> T check(String name, CheckedSupplier<T> action, Predicate<T> validation) {
            long started = System.nanoTime();
            try {
                T value = action.get();
                if (!validation.test(value)) {
                    throw new IllegalStateException("response validation failed");
                }
                passed++;
                System.out.printf("PASS %s (%d ms)%n", name, elapsedMillis(started));
                return value;
            } catch (Exception exception) {
                failed++;
                Throwable cause = unwrap(exception);
                System.out.printf(
                    "FAIL %s (%d ms): %s: %s%n",
                    name,
                    elapsedMillis(started),
                    cause.getClass().getSimpleName(),
                    safeMessage(cause)
                );
                return null;
            }
        }

        private <T> T checkOrSkip(
            String name,
            CheckedSupplier<T> action,
            Predicate<T> validation,
            Predicate<Throwable> unsupported,
            String reason
        ) {
            long started = System.nanoTime();
            try {
                T value = action.get();
                if (!validation.test(value)) {
                    throw new IllegalStateException("response validation failed");
                }
                passed++;
                System.out.printf("PASS %s (%d ms)%n", name, elapsedMillis(started));
                return value;
            } catch (Exception exception) {
                Throwable cause = unwrap(exception);
                if (unsupported.test(cause)) {
                    skip(name, reason);
                    return null;
                }
                failed++;
                System.out.printf(
                    "FAIL %s (%d ms): %s: %s%n",
                    name,
                    elapsedMillis(started),
                    cause.getClass().getSimpleName(),
                    safeMessage(cause)
                );
                return null;
            }
        }

        private void skip(String name, String reason) {
            skipped++;
            System.out.printf("SKIP %s: %s%n", name, reason);
        }

        private void finish() {
            System.out.printf("SUMMARY pass=%d fail=%d skip=%d%n", passed, failed, skipped);
            if (failed > 0) {
                throw new IllegalStateException(failed + " live checks failed");
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
            return message == null ? "" : message.replace('\n', ' ');
        }
    }
}
