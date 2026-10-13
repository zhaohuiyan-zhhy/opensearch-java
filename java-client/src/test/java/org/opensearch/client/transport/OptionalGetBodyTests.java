/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.transport;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.sun.net.httpserver.HttpServer;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.zip.GZIPInputStream;
import org.apache.hc.core5.http.HttpHost;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.opensearch.client.RestClient;
import org.opensearch.client.json.JsonData;
import org.opensearch.client.json.jackson.JacksonJsonpMapper;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch.cat.PitSegmentsRequest;
import org.opensearch.client.opensearch.generic.Requests;
import org.opensearch.client.opensearch.generic.Response;
import org.opensearch.client.opensearch.ml.GetProfileModelsRequest;
import org.opensearch.client.opensearch.ml.GetProfileRequest;
import org.opensearch.client.opensearch.ml.GetProfileTasksRequest;
import org.opensearch.client.transport.endpoints.DelegatingJsonEndpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;
import org.opensearch.client.transport.httpclient5.ApacheHttpClient5TransportBuilder;
import org.opensearch.client.transport.rest_client.RestClientTransport;

@RunWith(Parameterized.class)
public class OptionalGetBodyTests {
    private final String transportType;
    private final boolean compression;
    private final boolean chunked;
    private HttpServer server;
    private OpenSearchTransport transport;
    private final LinkedBlockingQueue<CapturedRequest> received = new LinkedBlockingQueue<>();

    public OptionalGetBodyTests(String transportType, boolean compression, boolean chunked) {
        this.transportType = transportType;
        this.compression = compression;
        this.chunked = chunked;
    }

    @Parameterized.Parameters(name = "{0}, compression: {1}, chunked: {2}")
    public static Collection<Object[]> parameters() {
        return List.of(
            new Object[] { "rest", false, false },
            new Object[] { "rest", true, false },
            new Object[] { "httpclient5", false, false },
            new Object[] { "httpclient5", true, false },
            new Object[] { "httpclient5", false, true }
        );
    }

    @Before
    public void setup() throws Exception {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/", exchange -> {
            InputStream input = exchange.getRequestBody();
            String encoding = exchange.getRequestHeaders().getFirst("Content-Encoding");
            if ("gzip".equals(encoding)) {
                input = new GZIPInputStream(input);
            }
            received.add(
                new CapturedRequest(
                    exchange.getRequestMethod(),
                    exchange.getRequestURI().getRawPath(),
                    new String(input.readAllBytes(), StandardCharsets.UTF_8),
                    exchange.getRequestHeaders().getFirst("Content-Type"),
                    encoding
                )
            );
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, 2);
            try (var output = exchange.getResponseBody()) {
                output.write("{}".getBytes(StandardCharsets.UTF_8));
            }
            exchange.close();
        });
        server.start();
        HttpHost host = new HttpHost("http", "127.0.0.1", server.getAddress().getPort());
        if ("rest".equals(transportType)) {
            transport = new RestClientTransport(
                RestClient.builder(host).setCompressionEnabled(compression).build(),
                new JacksonJsonpMapper()
            );
        } else {
            transport = ApacheHttpClient5TransportBuilder.builder(host)
                .setCompressionEnabled(compression)
                .setChunkedEnabled(chunked)
                .build();
        }
    }

    @After
    public void teardown() throws Exception {
        try {
            if (transport != null) {
                transport.close();
            }
        } finally {
            if (server != null) {
                server.stop(0);
            }
        }
    }

    @Test
    public void omitsUnsetMlBodies() throws Exception {
        assertExchange(GetProfileRequest.of(r -> r), GetProfileRequest._ENDPOINT, "/_plugins/_ml/profile", "");
        assertExchange(GetProfileModelsRequest.of(r -> r), GetProfileModelsRequest._ENDPOINT, "/_plugins/_ml/profile/models", "");
        assertExchange(
            GetProfileModelsRequest.of(r -> r.modelId("model-1")),
            GetProfileModelsRequest._ENDPOINT,
            "/_plugins/_ml/profile/models/model-1",
            ""
        );
        assertExchange(GetProfileTasksRequest.of(r -> r), GetProfileTasksRequest._ENDPOINT, "/_plugins/_ml/profile/tasks", "");
        assertExchange(
            GetProfileTasksRequest.of(r -> r.taskId("task-1")),
            GetProfileTasksRequest._ENDPOINT,
            "/_plugins/_ml/profile/tasks/task-1",
            ""
        );
    }

    @Test
    public void preservesExplicitAndRequiredBodies() throws Exception {
        assertExchange(
            GetProfileRequest.of(r -> r.returnAllModels(false)),
            GetProfileRequest._ENDPOINT,
            "/_plugins/_ml/profile",
            "{\"return_all_models\":false}"
        );
        assertExchange(
            GetProfileModelsRequest.of(r -> r.modelIds(Collections.emptyList())),
            GetProfileModelsRequest._ENDPOINT,
            "/_plugins/_ml/profile/models",
            "{\"model_ids\":[]}"
        );
        assertExchange(
            GetProfileTasksRequest.of(r -> r.taskIds("task-1")),
            GetProfileTasksRequest._ENDPOINT,
            "/_plugins/_ml/profile/tasks",
            "{\"task_ids\":[\"task-1\"]}"
        );
        assertExchange(
            PitSegmentsRequest.of(r -> r.pitId("pit-1")),
            PitSegmentsRequest._ENDPOINT,
            "/_cat/pit_segments",
            "{\"pit_id\":[\"pit-1\"]}"
        );
    }

    @Test
    public void preservesExplicitGenericBodies() throws Exception {
        OpenSearchClient client = new OpenSearchClient(transport);
        for (String method : List.of("GET", "POST", "DELETE")) {
            try (Response response = client.generic().execute(Requests.builder().method(method).endpoint("/").json("{}").build())) {
                assertEquals(200, response.getStatus());
                CapturedRequest captured = received.remove();
                assertEquals(method, captured.method());
                assertEquals("{}", captured.body());
            }
        }
    }

    private <T> void assertExchange(T request, Endpoint<T, ?, ErrorResponse> endpoint, String path, String body) throws Exception {
        // Preserve the body predicate through endpoint decoration and response parser replacement.
        var decorated = new DelegatingJsonEndpoint<>(((SimpleEndpoint<T, ?>) endpoint).withResponseDeserializer(JsonData._DESERIALIZER));
        for (boolean async : new boolean[] { false, true }) {
            if (async) {
                transport.performRequestAsync(request, decorated, null).get();
            } else {
                transport.performRequest(request, decorated, null);
            }
            CapturedRequest captured = received.remove();
            assertEquals("GET", captured.method());
            assertEquals(path, captured.path());
            assertEquals(body, captured.body());
            if (body.isEmpty()) {
                assertNull(captured.contentType());
                assertNull(captured.contentEncoding());
            }
        }
    }

    private record CapturedRequest(String method, String path, String body, String contentType, String contentEncoding) {
    }
}
