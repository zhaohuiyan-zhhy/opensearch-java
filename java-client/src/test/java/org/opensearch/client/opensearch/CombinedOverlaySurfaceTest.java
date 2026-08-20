/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.opensearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import org.junit.Test;
import org.opensearch.client.documentation.FailingTransport;
import org.opensearch.client.json.JsonData;
import org.opensearch.client.json.jackson.JacksonJsonpMapper;
import org.opensearch.client.opensearch.core.FieldCapsRequest;
import org.opensearch.client.opensearch.model.ModelTestCase;
import org.opensearch.client.opensearch.snapshot.CreateRepositoryRequest;
import org.opensearch.client.opensearch.snapshot.GetSnapshotRequest;
import org.opensearch.client.opensearch.snapshot.RestoreSnapshotRequest;
import org.opensearch.client.transport.TransportException;

public class CombinedOverlaySurfaceTest {
    private final OpenSearchClient client = new OpenSearchClient(new FailingTransport());

    @Test
    public void sendsCombinedApiSurfaceToTransportWithoutDistributionChecks() {
        assertThrows(TransportException.class, () -> client.nodes().info());
        assertThrows(TransportException.class, () -> client.ultrawarm().listMigrationStatus());
        assertThrows(TransportException.class, () -> client.ultrawarm().updateMigration(request -> request.index("index")));
        assertThrows(
            TransportException.class,
            () -> client.snapshot().restore(request -> request.repository("repository").snapshot("snapshot").sourceCollectionId("abc123"))
        );
    }

    @Test
    public void serializesAossSnapshotExtensions() {
        RestoreSnapshotRequest restore = RestoreSnapshotRequest.of(
            builder -> builder.repository("repository").snapshot("snapshot").sourceCollectionId("abc123").allowRegex(true)
        );
        String restoreJson = ModelTestCase.toJson(restore, new JacksonJsonpMapper());
        assertTrue(restoreJson.contains("\"sourceCollectionId\":\"abc123\""));
        assertTrue(restoreJson.contains("\"allow_regex\":true"));

        GetSnapshotRequest get = GetSnapshotRequest.of(
            builder -> builder.repository("repository").snapshot("snapshot").sourceCollectionId("abc123")
        );
        String getJson = ModelTestCase.toJson(get, new JacksonJsonpMapper());
        assertTrue(getJson.contains("\"sourceCollectionId\":\"abc123\""));

        CreateRepositoryRequest repository = CreateRepositoryRequest.of(
            builder -> builder.name("repository")
                .type("s3")
                .settings(settings -> settings.location("bucket"))
                .cryptoSettings(Map.of("kms_key_arn", JsonData.of("key")))
        );
        String repositoryJson = ModelTestCase.toJson(repository, new JacksonJsonpMapper());
        assertTrue(repositoryJson.contains("\"crypto_settings\""));
        assertTrue(repositoryJson.contains("\"kms_key_arn\":\"key\""));
    }

    @Test
    public void prefersQueryForFieldsDeclaredInTheQueryAndBody() {
        FieldCapsRequest request = FieldCapsRequest.of(builder -> builder.index("index").fields("message", "category"));

        assertEquals("message,category", FieldCapsRequest._ENDPOINT.queryParameters(request).get("fields"));
        assertEquals("{}", ModelTestCase.toJson(request, new JacksonJsonpMapper()));
    }
}
