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
import org.opensearch.client.opensearch.ApiType;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch._types.Refresh;
import org.opensearch.client.opensearch._types.Result;
import org.opensearch.client.opensearch.core.IndexResponse;
import org.opensearch.client.opensearch.indices.CreateIndexResponse;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.httpclient5.ApacheHttpClient5TransportBuilder;

/** Verifies that the packaged AOS JAR can call a real Amazon OpenSearch Service domain. */
public final class AosJarSmokeTest {
    private AosJarSmokeTest() {}

    public static void main(String[] args) throws Exception {
        Map<String, String> environment = System.getenv();
        URI endpoint = endpoint(required(environment, "AOS_ENDPOINT"));
        String username = required(environment, "AOS_USERNAME");
        String password = required(environment, "AOS_PASSWORD");
        HttpHost host = new HttpHost(endpoint.getScheme(), endpoint.getHost(), endpoint.getPort() < 0 ? 443 : endpoint.getPort());

        BasicCredentialsProvider credentials = new BasicCredentialsProvider();
        credentials.setCredentials(new AuthScope(host), new UsernamePasswordCredentials(username, password.toCharArray()));

        OpenSearchTransport transport = ApacheHttpClient5TransportBuilder.builder(host)
            .setMapper(new JacksonJsonpMapper())
            .setHttpClientConfigCallback(builder -> builder.setDefaultCredentialsProvider(credentials))
            .build();
        OpenSearchClient client = new OpenSearchClient(transport);
        String index = "aos-jar-test-" + UUID.randomUUID().toString().toLowerCase(Locale.ROOT);
        boolean indexCreated = false;

        try {
            String version = client.info(ApiType.AOS).version().number();
            require(version != null && !version.isEmpty(), "info response did not contain a version");
            System.out.println("PASS info: OpenSearch " + version);

            CreateIndexResponse created = client.indices()
                .create(request -> request.index(index).settings(settings -> settings.numberOfShards(1).numberOfReplicas(0)), ApiType.AOS);
            require(created.acknowledged(), "index creation was not acknowledged");
            indexCreated = true;
            require(client.indices().exists(request -> request.index(index), ApiType.AOS).value(), "created index does not exist");
            System.out.println("PASS indices.create/exists: " + index);

            IndexResponse indexed = client.index(
                request -> request.index(index)
                    .document(Map.of("message", "AOS JAR smoke test", "source", "opensearch-java-aos"))
                    .refresh(Refresh.True),
                ApiType.AOS
            );
            require(indexed.result() == Result.Created, "document was not created");
            require(indexed.id() != null && !indexed.id().isEmpty(), "index response did not contain a document ID");
            require(
                client.get(request -> request.index(index).id(indexed.id()), Map.class, ApiType.AOS).found(),
                "document could not be read by its generated ID"
            );
            System.out.println("PASS index/get: " + indexed.id());

            int migrations = client.ultrawarm().listMigrationStatus(ApiType.AOS).valueBody().size();
            require(migrations >= 0, "invalid UltraWarm migration count");
            System.out.println("PASS ultrawarm.list_migration_status: " + migrations);
        } finally {
            if (indexCreated) {
                require(
                    client.indices().delete(request -> request.index(index), ApiType.AOS).acknowledged(),
                    "index deletion was not acknowledged"
                );
                require(
                    !client.indices().exists(request -> request.index(index), ApiType.AOS).value(),
                    "temporary index still exists"
                );
                System.out.println("PASS cleanup: " + index);
            }
            transport.close();
        }

        System.out.println("AOS JAR smoke test passed");
    }

    private static URI endpoint(String value) {
        URI endpoint = URI.create(value);
        if (!"https".equals(endpoint.getScheme()) || endpoint.getHost() == null || !endpoint.getPath().isEmpty()) {
            throw new IllegalArgumentException("AOS_ENDPOINT must be an HTTPS origin without a path");
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

    private static void require(boolean condition, String message) {
        if (!condition) {
            throw new IllegalStateException(message);
        }
    }
}
