/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.opensearch.cat;

import javax.annotation.Nullable;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;

/** AOSS-compatible async client for the supported CAT operations. */
public class OpenSearchCatAsyncClient extends OpenSearchCatAsyncClientBase<OpenSearchCatAsyncClient> {
    public OpenSearchCatAsyncClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchCatAsyncClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchCatAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchCatAsyncClient(this.transport, transportOptions);
    }
}
