/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.transport.aws;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.Test;
import org.opensearch.client.opensearch.OpenSearchAsyncClient;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch.generic.Requests;
import org.opensearch.client.transport.TransportException;
import software.amazon.awssdk.http.SdkHttpClient;
import software.amazon.awssdk.http.apache.ApacheHttpClient;
import software.amazon.awssdk.http.urlconnection.UrlConnectionHttpClient;
import software.amazon.awssdk.regions.Region;

public class AwsSdk2TransportUrlConnectionTests {
    @Test
    public void detectsOnlyTheConcreteUrlConnectionClient() {
        assertFalse(AwsSdk2Transport.isAwsSdkUrlConnectionHttpClient(null));
        assertFalse(AwsSdk2Transport.isAwsSdkUrlConnectionHttpClient(() -> {}));
        try (SdkHttpClient urlConnection = UrlConnectionHttpClient.create(); SdkHttpClient apache = ApacheHttpClient.create()) {
            assertTrue(AwsSdk2Transport.isAwsSdkUrlConnectionHttpClient(urlConnection));
            assertFalse(AwsSdk2Transport.isAwsSdkUrlConnectionHttpClient(apache));
        }
    }

    @Test
    public void rejectsExplicitGetBodiesIncludingZeroBytesBeforeSigning() throws Exception {
        try (SdkHttpClient http = UrlConnectionHttpClient.create()) {
            AwsSdk2Transport transport = new AwsSdk2Transport(
                http,
                "example.invalid",
                Region.US_EAST_1,
                AwsSdk2TransportOptions.builder().setCredentials(() -> {
                    throw new AssertionError("Signing must not be reached for unsupported GET bodies");
                }).build()
            );
            OpenSearchClient client = new OpenSearchClient(transport);
            OpenSearchAsyncClient asyncClient = new OpenSearchAsyncClient(transport);
            for (String body : List.of("", "{}")) {
                var request = Requests.builder().method("GET").endpoint("/").json(body).build();
                TransportException error = assertThrows(TransportException.class, () -> client.generic().execute(request));
                assertTrue(error.getMessage().contains("UrlConnectionHttpClient"));
                ExecutionException asyncError = assertThrows(ExecutionException.class, () -> client.generic().executeAsync(request).get());
                assertTrue(asyncError.getCause() instanceof TransportException);
            }
            assertThrows(TransportException.class, () -> client.ml().getProfile(r -> r.returnAllModels(false)));
            assertThrows(TransportException.class, () -> client.ml().getProfileModels(r -> r.modelIds(List.of())));
            assertThrows(TransportException.class, () -> client.cat().pitSegments(r -> r.pitId("pit-1")));
            ExecutionException asyncError = assertThrows(
                ExecutionException.class,
                () -> asyncClient.ml().getProfile(r -> r.returnAllModels(false)).get()
            );
            assertTrue(asyncError.getCause() instanceof TransportException);
        }
    }
}
