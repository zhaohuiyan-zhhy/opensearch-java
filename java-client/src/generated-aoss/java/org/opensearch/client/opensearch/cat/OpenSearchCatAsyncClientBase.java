/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.cat;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.util.ObjectBuilder;

/**
 * Client for the cat namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public abstract class OpenSearchCatAsyncClientBase<Self extends OpenSearchCatAsyncClientBase<Self>> extends ApiClient<
    OpenSearchTransport,
    Self> {
    public OpenSearchCatAsyncClientBase(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    // ----- Endpoint: cat.aliases

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     */
    public CompletableFuture<AliasesResponse> aliases(AliasesRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(request, AliasesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     *
     * @param fn a function that initializes a builder to create the {@link AliasesRequest}
     */
    public final CompletableFuture<AliasesResponse> aliases(Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn)
        throws IOException, OpenSearchException {
        return aliases(fn.apply(new AliasesRequest.Builder()).build());
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     */
    public final CompletableFuture<AliasesResponse> aliases() throws IOException, OpenSearchException {
        return aliases(new AliasesRequest.Builder().build());
    }

    // ----- Endpoint: cat.indices

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     */
    public CompletableFuture<IndicesResponse> indices(IndicesRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(request, IndicesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     *
     * @param fn a function that initializes a builder to create the {@link IndicesRequest}
     */
    public final CompletableFuture<IndicesResponse> indices(Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn)
        throws IOException, OpenSearchException {
        return indices(fn.apply(new IndicesRequest.Builder()).build());
    }

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     */
    public final CompletableFuture<IndicesResponse> indices() throws IOException, OpenSearchException {
        return indices(new IndicesRequest.Builder().build());
    }

    // ----- Endpoint: cat.templates

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     */
    public CompletableFuture<TemplatesResponse> templates(TemplatesRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(request, TemplatesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     *
     * @param fn a function that initializes a builder to create the {@link TemplatesRequest}
     */
    public final CompletableFuture<TemplatesResponse> templates(Function<TemplatesRequest.Builder, ObjectBuilder<TemplatesRequest>> fn)
        throws IOException, OpenSearchException {
        return templates(fn.apply(new TemplatesRequest.Builder()).build());
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     */
    public final CompletableFuture<TemplatesResponse> templates() throws IOException, OpenSearchException {
        return templates(new TemplatesRequest.Builder().build());
    }
}
