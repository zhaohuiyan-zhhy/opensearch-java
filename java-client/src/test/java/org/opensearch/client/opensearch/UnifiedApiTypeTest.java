/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.opensearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import org.junit.Test;
import org.opensearch.client.documentation.FailingTransport;
import org.opensearch.client.json.JsonData;
import org.opensearch.client.json.jackson.JacksonJsonpMapper;
import org.opensearch.client.opensearch._types.NodeAttributes;
import org.opensearch.client.opensearch.core.FieldCapsRequest;
import org.opensearch.client.opensearch.indices.ResolveIndexResponse;
import org.opensearch.client.opensearch.model.ModelTestCase;
import org.opensearch.client.opensearch.snapshot.CreateRepositoryRequest;
import org.opensearch.client.opensearch.snapshot.RestoreSnapshotRequest;
import org.opensearch.client.transport.TransportException;

public class UnifiedApiTypeTest {
    private final OpenSearchClient client = new OpenSearchClient(new FailingTransport());

    @Test
    public void rejectsUnsupportedApiTypeBeforeTransport() {
        IllegalArgumentException nodesException = assertThrows(IllegalArgumentException.class, () -> client.nodes().info(ApiType.AOSS));
        assertTrue(nodesException.getMessage().contains("nodes.info does not support AOSS"));

        IllegalArgumentException ultrawarmException = assertThrows(
            IllegalArgumentException.class,
            () -> client.ultrawarm().listMigrationStatus(ApiType.OSS)
        );
        assertTrue(ultrawarmException.getMessage().contains("ultrawarm.list_migration_status does not support OSS"));
    }

    @Test
    public void allowsSupportedApiTypeToReachTransport() {
        assertThrows(TransportException.class, () -> client.nodes().info(ApiType.OSS));
        assertThrows(TransportException.class, () -> client.ultrawarm().listMigrationStatus(ApiType.AOS));
        assertThrows(TransportException.class, () -> client.indices().create(b -> b.index("index"), ApiType.AOSS));
    }

    @Test
    public void defaultsApiTypeToOss() {
        assertThrows(TransportException.class, () -> client.nodes().info());
        assertThrows(TransportException.class, () -> client.indices().clearCache());
        assertThrows(TransportException.class, () -> client.cat().help());

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.ultrawarm().listMigrationStatus());
        assertTrue(exception.getMessage().contains("ultrawarm.list_migration_status does not support OSS"));
    }

    @Test
    public void validatesDistributionSpecificPathParameters() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.indices().clearCache(ApiType.AOSS));
        assertTrue(exception.getMessage().contains("does not support the provided path parameter combination for API type AOSS"));

        assertThrows(TransportException.class, () -> client.indices().clearCache(ApiType.OSS));
        assertThrows(TransportException.class, () -> client.indices().clearCache(request -> request.index("index"), ApiType.AOSS));

        assertThrows(IllegalArgumentException.class, () -> client.indices().getSettings(ApiType.AOSS));
        assertThrows(
            TransportException.class,
            () -> client.indices().getSettings(request -> request.name("index.refresh_interval"), ApiType.AOSS)
        );
    }

    @Test
    public void validatesDistributionSpecificRequestFields() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> client.snapshot()
                .restore(request -> request.repository("repository").snapshot("snapshot").sourceCollectionId("abc123"), ApiType.AOS)
        );
        assertTrue(exception.getMessage().contains("snapshot.restore field sourceCollectionId does not support AOS"));

        assertThrows(
            IllegalArgumentException.class,
            () -> client.snapshot().restore(request -> request.repository("repository").snapshot("snapshot").allowRegex(true), ApiType.OSS)
        );
        assertThrows(
            IllegalArgumentException.class,
            () -> client.snapshot()
                .createRepository(
                    request -> request.name("repository")
                        .type("s3")
                        .settings(settings -> settings.location("bucket"))
                        .cryptoSettings(Map.of("kms_key_arn", JsonData.of("key"))),
                    ApiType.AOS
                )
        );

        assertThrows(
            TransportException.class,
            () -> client.snapshot()
                .restore(request -> request.repository("repository").snapshot("snapshot").sourceCollectionId("abc123"), ApiType.AOSS)
        );
    }

    @Test
    public void serializesAossSnapshotFieldsFromUnifiedModel() {
        RestoreSnapshotRequest restore = RestoreSnapshotRequest.of(
            b -> b.repository("repository").snapshot("snapshot").sourceCollectionId("abc123").allowRegex(true)
        );
        String restoreJson = ModelTestCase.toJson(restore, new JacksonJsonpMapper());
        assertTrue(restoreJson.contains("\"sourceCollectionId\":\"abc123\""));
        assertTrue(restoreJson.contains("\"allow_regex\":true"));

        CreateRepositoryRequest repository = CreateRepositoryRequest.of(
            b -> b.name("repository")
                .type("s3")
                .settings(settings -> settings.location("bucket"))
                .cryptoSettings("kms_key_arn", JsonData.of("arn:aws:kms:us-east-1:123456789012:key/id"))
        );
        String repositoryJson = ModelTestCase.toJson(repository, new JacksonJsonpMapper());
        assertTrue(repositoryJson.contains("\"crypto_settings\""));
        assertTrue(repositoryJson.contains("\"kms_key_arn\":\"arn:aws:kms:us-east-1:123456789012:key/id\""));
    }

    @Test
    public void serializesFieldCapsFieldsAsQueryParametersForEveryApiType() {
        FieldCapsRequest request = FieldCapsRequest.of(b -> b.fields("title", "description").indexFilter(q -> q.matchAll(m -> m)));

        assertEquals("title,description", FieldCapsRequest._ENDPOINT.queryParameters(request).get("fields"));
        String json = ModelTestCase.toJson(request, new JacksonJsonpMapper());
        assertTrue(json.contains("\"index_filter\""));
        assertFalse(json.contains("\"fields\""));

        assertThrows(TransportException.class, () -> client.fieldCaps(request, ApiType.OSS));
        assertThrows(TransportException.class, () -> client.fieldCaps(request, ApiType.AOS));
        assertThrows(TransportException.class, () -> client.fieldCaps(request, ApiType.AOSS));
    }

    @Test
    public void deserializesSparseServiceResponses() {
        JacksonJsonpMapper mapper = new JacksonJsonpMapper();
        ResolveIndexResponse resolve = ModelTestCase.fromJson(
            "{\"aliases\":[],\"indices\":[{\"name\":\"index\"}]}",
            ResolveIndexResponse.class,
            mapper
        );
        assertEquals("index", resolve.indices().get(0).name());
        assertTrue(resolve.indices().get(0).attributes().isEmpty());

        NodeAttributes node = ModelTestCase.fromJson("{}", NodeAttributes.class, mapper);
        assertTrue(node.attributes().isEmpty());
        assertTrue(node.roles().isEmpty());
    }
}
