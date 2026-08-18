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
import org.apache.hc.client5.http.auth.AuthScope;
import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.apache.hc.client5.http.impl.auth.BasicCredentialsProvider;
import org.apache.hc.core5.http.HttpHost;
import org.opensearch.client.json.jackson3.JacksonJsonpMapper;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.httpclient5.ApacheHttpClient5TransportBuilder;
import org.opensearch.client.transport.httpclient5.ResponseException;

/**
 * Probes every generated UltraWarm endpoint against an AOS domain without
 * UltraWarm capacity. Mutating operations must reach the service and be rejected.
 */
public final class AosUltrawarmLiveTest {
    private AosUltrawarmLiveTest() {}

    public static void main(String[] args) throws Exception {
        Map<String, String> environment = System.getenv();
        URI endpoint = parseEndpoint(required(environment, "AOS_ENDPOINT"));
        String username = required(environment, "AOS_USERNAME");
        String password = required(environment, "AOS_PASSWORD");
        if (!Boolean.parseBoolean(required(environment, "AOS_EXPECT_ULTRAWARM_DISABLED"))) {
            throw new IllegalArgumentException("AOS_EXPECT_ULTRAWARM_DISABLED must be true");
        }

        HttpHost host = new HttpHost(endpoint.getScheme(), endpoint.getHost(), endpoint.getPort() < 0 ? 443 : endpoint.getPort());
        BasicCredentialsProvider credentials = new BasicCredentialsProvider();
        credentials.setCredentials(new AuthScope(host), new UsernamePasswordCredentials(username, password.toCharArray()));

        OpenSearchTransport transport = ApacheHttpClient5TransportBuilder.builder(host)
            .setMapper(new JacksonJsonpMapper())
            .setHttpClientConfigCallback(builder -> builder.setDefaultCredentialsProvider(credentials))
            .build();
        OpenSearchClient client = new OpenSearchClient(transport);
        String index = "aos-ultrawarm-probe-" + UUID.randomUUID().toString().toLowerCase(Locale.ROOT);
        boolean indexCreated = false;
        ProbeRecorder recorder = new ProbeRecorder();

        try {
            indexCreated = client.indices()
                .create(request -> request.index(index).settings(settings -> settings.numberOfShards(1).numberOfReplicas(0)))
                .acknowledged();
            require(indexCreated, "temporary index creation was not acknowledged");

            recorder.requireSuccess("ultrawarm.list_migration_status", () -> client.ultrawarm().listMigrationStatus());
            recorder.allowSuccessOrServiceRejection(
                "ultrawarm.get_migration_status",
                () -> client.ultrawarm().getMigrationStatus(request -> request.index(index))
            );
            recorder.requireServiceRejection(
                "ultrawarm.migrate_to_warm",
                () -> client.ultrawarm().migrateToWarm(request -> request.index(index))
            );
            recorder.allowSuccessOrServiceRejection(
                "ultrawarm.migrate_to_hot",
                () -> client.ultrawarm().migrateToHot(request -> request.index(index))
            );
            recorder.requireServiceRejection(
                "ultrawarm.migrate_to_cold.ignore_timestamp",
                () -> client.ultrawarm().migrateToCold(request -> request.index(index).ignore("timestamp"))
            );
            recorder.requireServiceRejection(
                "ultrawarm.migrate_to_cold.time_range",
                () -> client.ultrawarm().migrateToCold(request -> request.index(index).startTime("2020-01-01").endTime("2020-01-02"))
            );
            recorder.allowSuccessOrServiceRejection(
                "ultrawarm.cancel_migration",
                () -> client.ultrawarm().cancelMigration(request -> request.index(index))
            );
        } finally {
            if (indexCreated) {
                require(
                    client.indices().delete(request -> request.index(index)).acknowledged(),
                    "temporary index deletion was not acknowledged"
                );
            }
            transport.close();
        }

        recorder.finish();
    }

    @FunctionalInterface
    private interface CheckedAction {
        Object run() throws Exception;
    }

    private static final class ProbeRecorder {
        private int success;
        private int serviceRejection;
        private int failure;

        private void requireSuccess(String name, CheckedAction action) {
            try {
                action.run();
                success++;
                System.out.println("PASS " + name + ": success response");
            } catch (Exception exception) {
                failure++;
                System.out.println("FAIL " + name + ": " + safeMessage(exception));
            }
        }

        private void requireServiceRejection(String name, CheckedAction action) {
            try {
                action.run();
                failure++;
                System.out.println("FAIL " + name + ": service unexpectedly accepted the operation");
            } catch (OpenSearchException exception) {
                recordServiceRejection(name, exception);
            } catch (ResponseException exception) {
                recordServiceRejection(name, exception.status(), exception.getMessage());
            } catch (Exception exception) {
                failure++;
                System.out.println("FAIL " + name + ": " + safeMessage(exception));
            }
        }

        private void allowSuccessOrServiceRejection(String name, CheckedAction action) {
            try {
                action.run();
                success++;
                System.out.println("PASS " + name + ": success response");
            } catch (OpenSearchException exception) {
                recordServiceRejection(name, exception);
            } catch (ResponseException exception) {
                recordServiceRejection(name, exception.status(), exception.getMessage());
            } catch (Exception exception) {
                failure++;
                System.out.println("FAIL " + name + ": " + safeMessage(exception));
            }
        }

        private void recordServiceRejection(String name, OpenSearchException exception) {
            String reason = exception.response().error().reason();
            recordServiceRejection(name, exception.status(), reason);
        }

        private void recordServiceRejection(String name, int status, String reason) {
            String normalized = reason == null ? "" : reason.toLowerCase(Locale.ROOT);
            if (normalized.contains("no handler found") || normalized.contains("incorrect http method")) {
                failure++;
                System.out.printf("FAIL %s: endpoint was not routed, status=%d reason=%s%n", name, status, reason);
                return;
            }
            serviceRejection++;
            System.out.printf("PASS %s: service rejection, status=%d reason=%s%n", name, status, reason);
        }

        private void finish() {
            System.out.printf(
                "SUMMARY success=%d service_rejection=%d failure=%d total=%d%n",
                success,
                serviceRejection,
                failure,
                success + serviceRejection + failure
            );
            require(failure == 0, failure + " UltraWarm endpoint probes failed");
        }
    }

    private static URI parseEndpoint(String value) {
        URI uri = URI.create(value);
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

    private static String safeMessage(Throwable throwable) {
        String message = throwable.getMessage();
        return throwable.getClass().getSimpleName() + ": " + (message == null ? "" : message.replace('\n', ' '));
    }

    private static void require(boolean condition, String message) {
        if (!condition) {
            throw new IllegalStateException(message);
        }
    }
}
