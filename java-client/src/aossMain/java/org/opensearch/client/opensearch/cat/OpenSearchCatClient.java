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

/** AOSS-compatible client for the supported CAT operations. */
public class OpenSearchCatClient extends OpenSearchCatClientBase<OpenSearchCatClient> {
    public OpenSearchCatClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchCatClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchCatClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchCatClient(this.transport, transportOptions);
    }
}
