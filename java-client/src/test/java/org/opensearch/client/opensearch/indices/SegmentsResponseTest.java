/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.opensearch.indices;

import java.util.Collections;
import org.junit.Test;
import org.opensearch.client.opensearch.indices.segments.Segment;
import org.opensearch.client.opensearch.model.ModelTestCase;
import org.opensearch.client.util.MissingRequiredPropertyException;

public class SegmentsResponseTest extends ModelTestCase {
    @Test
    public void acceptsMissingAttributes() {
        Segment segment = segment(response(",\"version\":\"10.4.0\",\"compound\":true"));

        assertTrue(segment.attributes().isEmpty());
        assertEquals(Boolean.TRUE, segment.compound());
        assertEquals("10.4.0", segment.version());
        assertFalse(toJson(segment).contains("\"attributes\""));
    }

    @Test
    public void acceptsMissingCompound() {
        Segment segment = segment(response(",\"attributes\":{\"codec\":\"test\"},\"version\":\"10.4.0\""));

        assertNull(segment.compound());
        assertEquals("test", segment.attributes().get("codec"));
        assertEquals("10.4.0", segment.version());
        assertFalse(toJson(segment).contains("\"compound\""));
    }

    @Test
    public void acceptsMissingVersion() {
        Segment segment = segment(response(",\"attributes\":{\"codec\":\"test\"},\"compound\":false"));

        assertNull(segment.version());
        assertEquals(Boolean.FALSE, segment.compound());
        assertEquals("test", segment.attributes().get("codec"));
        assertFalse(toJson(segment).contains("\"version\""));
    }

    @Test
    public void acceptsMissingOptionalMetadata() {
        SegmentsResponse response = response("");
        Segment segment = segment(response);

        assertTrue(segment.attributes().isEmpty());
        assertNull(segment.compound());
        assertNull(segment.version());
        assertTrue(segment.committed());
        assertEquals(1, segment.numDocs());

        String json = toJson(response);
        assertFalse(json.contains("\"attributes\""));
        assertFalse(json.contains("\"compound\""));
        assertFalse(json.contains("\"version\""));
        assertEquals(response, fromJson(json, SegmentsResponse._DESERIALIZER));
    }

    @Test
    public void preservesPresentMetadataAndExplicitFalse() {
        SegmentsResponse response = response(",\"attributes\":{\"codec\":\"test\"},\"compound\":false,\"version\":\"10.4.0\"");
        Segment segment = segment(response);

        assertEquals("test", segment.attributes().get("codec"));
        assertEquals(Boolean.FALSE, segment.compound());
        assertEquals("10.4.0", segment.version());
        assertTrue(toJson(segment).contains("\"compound\":false"));
        assertEquals(response, fromJson(toJson(response), SegmentsResponse._DESERIALIZER));
        assertEquals(segment, segment.toBuilder().build());
    }

    @Test
    public void retainsRequiredCommittedField() {
        MissingRequiredPropertyException error = assertThrows(
            MissingRequiredPropertyException.class,
            () -> Segment.of(
                b -> b.attributes(Collections.emptyMap())
                    .compound(false)
                    .deletedDocs(0)
                    .generation(1)
                    .numDocs(1)
                    .search(true)
                    .sizeInBytes(128)
                    .version("10.4.0")
            )
        );

        assertTrue(error.getMessage().contains("committed"));
    }

    private SegmentsResponse response(String metadata) {
        return fromJson(
            "{\"_shards\":{\"total\":1,\"successful\":1,\"failed\":0},"
                + "\"indices\":{\"test-index\":{\"shards\":{\"0\":[{"
                + "\"routing\":{\"state\":\"STARTED\",\"primary\":true,\"node\":\"node-1\"},"
                + "\"num_committed_segments\":1,\"num_search_segments\":1,"
                + "\"segments\":{\"_0\":{\"generation\":0,\"num_docs\":1,\"deleted_docs\":0,"
                + "\"size_in_bytes\":128,\"committed\":true,\"search\":true"
                + metadata
                + "}}}]}}}}",
            SegmentsResponse._DESERIALIZER
        );
    }

    private static Segment segment(SegmentsResponse response) {
        return response.indices().get("test-index").shards().get("0").get(0).segments().get("_0");
    }
}
