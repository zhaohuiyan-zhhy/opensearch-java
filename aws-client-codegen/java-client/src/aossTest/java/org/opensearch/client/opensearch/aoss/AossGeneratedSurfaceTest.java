/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.opensearch.aoss;

import java.lang.reflect.Method;
import java.util.Map;
import org.opensearch.client.json.JsonData;
import org.opensearch.client.opensearch.OpenSearchAsyncClient;
import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.opensearch.cat.OpenSearchCatAsyncClient;
import org.opensearch.client.opensearch.cat.OpenSearchCatClient;
import org.opensearch.client.opensearch.cluster.OpenSearchClusterAsyncClient;
import org.opensearch.client.opensearch.cluster.OpenSearchClusterClient;
import org.opensearch.client.opensearch.snapshot.CreateRepositoryRequest;
import org.opensearch.client.opensearch.snapshot.GetSnapshotRequest;
import org.opensearch.client.opensearch.snapshot.RestoreSnapshotRequest;

/** Verifies supported and excluded AOSS APIs plus the serverless overlay fields. */
public final class AossGeneratedSurfaceTest {
    private AossGeneratedSurfaceTest() {}

    public static void main(String[] args) {
        verifyApiSurface();
        RestoreSnapshotRequest restore = RestoreSnapshotRequest.of(
            request -> request.repository("repository").snapshot("snapshot").sourceCollectionId("abc123").allowRegex(true)
        );
        require("abc123".equals(restore.sourceCollectionId()), "restore sourceCollectionId was not generated");
        require(Boolean.TRUE.equals(restore.allowRegex()), "restore allowRegex was not generated");
        requireJson(restore.toJsonString(), "\"sourceCollectionId\":\"abc123\"");
        requireJson(restore.toJsonString(), "\"allow_regex\":true");

        GetSnapshotRequest get = GetSnapshotRequest.of(
            request -> request.repository("repository").snapshot("snapshot").sourceCollectionId("abc123")
        );
        require("abc123".equals(get.sourceCollectionId()), "get snapshot sourceCollectionId was not generated");
        requireJson(get.toJsonString(), "\"sourceCollectionId\":\"abc123\"");

        CreateRepositoryRequest createRepository = CreateRepositoryRequest.of(
            request -> request.name("repository")
                .type("s3")
                .settings(settings -> settings.location("bucket"))
                .cryptoSettings(Map.of("kms_key_arn", JsonData.of("arn:aws:kms:us-east-1:123456789012:key/example")))
        );
        require(createRepository.cryptoSettings().containsKey("kms_key_arn"), "cryptoSettings was not generated");
        requireJson(createRepository.toJsonString(), "\"crypto_settings\":");
        requireJson(createRepository.toJsonString(), "\"kms_key_arn\":");

        System.out.println("AOSS generated surface test passed");
    }

    private static void verifyApiSurface() {
        requireMethod(OpenSearchClient.class, "cat");
        requireMethod(OpenSearchAsyncClient.class, "cat");
        requireNoMethod(OpenSearchClient.class, "nodes");
        requireNoMethod(OpenSearchAsyncClient.class, "nodes");
        requireNoMethod(OpenSearchClient.class, "ping");
        requireNoMethod(OpenSearchAsyncClient.class, "ping");

        for (String method : new String[] { "aliases", "indices", "templates" }) {
            requireMethod(OpenSearchCatClient.class, method);
            requireMethod(OpenSearchCatAsyncClient.class, method);
        }
        for (String method : new String[] { "allocation", "health", "help", "nodes" }) {
            requireNoMethod(OpenSearchCatClient.class, method);
            requireNoMethod(OpenSearchCatAsyncClient.class, method);
        }

        requireMethod(OpenSearchClusterClient.class, "getComponentTemplate");
        requireMethod(OpenSearchClusterAsyncClient.class, "getComponentTemplate");
        for (String method : new String[] { "allocationExplain", "getSettings", "health", "remoteInfo", "state", "stats" }) {
            requireNoMethod(OpenSearchClusterClient.class, method);
            requireNoMethod(OpenSearchClusterAsyncClient.class, method);
        }
    }

    private static void requireMethod(Class<?> type, String name) {
        require(hasMethod(type, name), "expected " + type.getSimpleName() + "." + name + " to be generated");
    }

    private static void requireNoMethod(Class<?> type, String name) {
        require(!hasMethod(type, name), "unexpected " + type.getSimpleName() + "." + name + " was generated");
    }

    private static boolean hasMethod(Class<?> type, String name) {
        for (Method method : type.getMethods()) {
            if (method.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private static void requireJson(String json, String expected) {
        require(json.contains(expected), "missing JSON fragment " + expected + " in " + json);
    }

    private static void require(boolean condition, String message) {
        if (!condition) {
            throw new IllegalStateException(message);
        }
    }
}
