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

package org.opensearch.client.opensearch.indices;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch.ApiType;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.transport.endpoints.BooleanResponse;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;

/**
 * Client for the indices namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public abstract class OpenSearchIndicesAsyncClientBase<Self extends OpenSearchIndicesAsyncClientBase<Self>> extends ApiClient<
    OpenSearchTransport,
    Self> {
    public OpenSearchIndicesAsyncClientBase(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    // ----- Endpoint: indices.add_block

    /**
     * Adds a block to an index.
     */
    public CompletableFuture<AddBlockResponse> addBlock(AddBlockRequest request) throws IOException, OpenSearchException {
        return addBlock(request, ApiType.OSS);
    }

    /**
     * Adds a block to an index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<AddBlockResponse> addBlock(AddBlockRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.add_block", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, AddBlockRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Adds a block to an index.
     *
     * @param fn a function that initializes a builder to create the {@link AddBlockRequest}
     */
    public final CompletableFuture<AddBlockResponse> addBlock(Function<AddBlockRequest.Builder, ObjectBuilder<AddBlockRequest>> fn)
        throws IOException, OpenSearchException {
        return addBlock(fn, ApiType.OSS);
    }

    /**
     * Adds a block to an index.
     *
     * @param fn   a function that initializes a builder to create the {@link AddBlockRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AddBlockResponse> addBlock(
        Function<AddBlockRequest.Builder, ObjectBuilder<AddBlockRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return addBlock(fn.apply(new AddBlockRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.analyze

    /**
     * Performs the analysis process on a text and return the tokens breakdown of the text.
     */
    public CompletableFuture<AnalyzeResponse> analyze(AnalyzeRequest request) throws IOException, OpenSearchException {
        return analyze(request, ApiType.OSS);
    }

    /**
     * Performs the analysis process on a text and return the tokens breakdown of the text.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<AnalyzeResponse> analyze(AnalyzeRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.analyze", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, AnalyzeRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Performs the analysis process on a text and return the tokens breakdown of the text.
     *
     * @param fn a function that initializes a builder to create the {@link AnalyzeRequest}
     */
    public final CompletableFuture<AnalyzeResponse> analyze(Function<AnalyzeRequest.Builder, ObjectBuilder<AnalyzeRequest>> fn)
        throws IOException, OpenSearchException {
        return analyze(fn, ApiType.OSS);
    }

    /**
     * Performs the analysis process on a text and return the tokens breakdown of the text.
     *
     * @param fn   a function that initializes a builder to create the {@link AnalyzeRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AnalyzeResponse> analyze(
        Function<AnalyzeRequest.Builder, ObjectBuilder<AnalyzeRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return analyze(fn.apply(new AnalyzeRequest.Builder()).build(), type);
    }

    /**
     * Performs the analysis process on a text and return the tokens breakdown of the text.
     */
    public final CompletableFuture<AnalyzeResponse> analyze() throws IOException, OpenSearchException {
        return analyze(ApiType.OSS);
    }

    /**
     * Performs the analysis process on a text and return the tokens breakdown of the text.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AnalyzeResponse> analyze(ApiType type) throws IOException, OpenSearchException {
        return analyze(new AnalyzeRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.clear_cache

    /**
     * Clears all or specific caches for one or more indexes.
     */
    public CompletableFuture<ClearCacheResponse> clearCache(ClearCacheRequest request) throws IOException, OpenSearchException {
        return clearCache(request, ApiType.OSS);
    }

    /**
     * Clears all or specific caches for one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ClearCacheResponse> clearCache(ClearCacheRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.clear_cache", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        ApiType.requirePathSupported(type, ApiType.AOS, "indices.clear_cache", 0 | (ApiTypeHelper.isDefined(request.index()) ? 1 : 0), 1);
        ApiType.requirePathSupported(type, ApiType.AOSS, "indices.clear_cache", 0 | (ApiTypeHelper.isDefined(request.index()) ? 1 : 0), 1);
        return this.transport.performRequestAsync(request, ClearCacheRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Clears all or specific caches for one or more indexes.
     *
     * @param fn a function that initializes a builder to create the {@link ClearCacheRequest}
     */
    public final CompletableFuture<ClearCacheResponse> clearCache(Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn)
        throws IOException, OpenSearchException {
        return clearCache(fn, ApiType.OSS);
    }

    /**
     * Clears all or specific caches for one or more indexes.
     *
     * @param fn   a function that initializes a builder to create the {@link ClearCacheRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ClearCacheResponse> clearCache(
        Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return clearCache(fn.apply(new ClearCacheRequest.Builder()).build(), type);
    }

    /**
     * Clears all or specific caches for one or more indexes.
     */
    public final CompletableFuture<ClearCacheResponse> clearCache() throws IOException, OpenSearchException {
        return clearCache(ApiType.OSS);
    }

    /**
     * Clears all or specific caches for one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ClearCacheResponse> clearCache(ApiType type) throws IOException, OpenSearchException {
        return clearCache(new ClearCacheRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.clone

    /**
     * Clones an index.
     */
    public CompletableFuture<CloneIndexResponse> clone(CloneIndexRequest request) throws IOException, OpenSearchException {
        return clone(request, ApiType.OSS);
    }

    /**
     * Clones an index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CloneIndexResponse> clone(CloneIndexRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.clone", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CloneIndexRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Clones an index.
     *
     * @param fn a function that initializes a builder to create the {@link CloneIndexRequest}
     */
    public final CompletableFuture<CloneIndexResponse> clone(Function<CloneIndexRequest.Builder, ObjectBuilder<CloneIndexRequest>> fn)
        throws IOException, OpenSearchException {
        return clone(fn, ApiType.OSS);
    }

    /**
     * Clones an index.
     *
     * @param fn   a function that initializes a builder to create the {@link CloneIndexRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CloneIndexResponse> clone(
        Function<CloneIndexRequest.Builder, ObjectBuilder<CloneIndexRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return clone(fn.apply(new CloneIndexRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.close

    /**
     * Closes an index.
     */
    public CompletableFuture<CloseIndexResponse> close(CloseIndexRequest request) throws IOException, OpenSearchException {
        return close(request, ApiType.OSS);
    }

    /**
     * Closes an index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CloseIndexResponse> close(CloseIndexRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.close", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CloseIndexRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Closes an index.
     *
     * @param fn a function that initializes a builder to create the {@link CloseIndexRequest}
     */
    public final CompletableFuture<CloseIndexResponse> close(Function<CloseIndexRequest.Builder, ObjectBuilder<CloseIndexRequest>> fn)
        throws IOException, OpenSearchException {
        return close(fn, ApiType.OSS);
    }

    /**
     * Closes an index.
     *
     * @param fn   a function that initializes a builder to create the {@link CloseIndexRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CloseIndexResponse> close(
        Function<CloseIndexRequest.Builder, ObjectBuilder<CloseIndexRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return close(fn.apply(new CloseIndexRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.create

    /**
     * Creates an index with optional settings and mappings.
     */
    public CompletableFuture<CreateIndexResponse> create(CreateIndexRequest request) throws IOException, OpenSearchException {
        return create(request, ApiType.OSS);
    }

    /**
     * Creates an index with optional settings and mappings.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateIndexResponse> create(CreateIndexRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.create", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateIndexRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates an index with optional settings and mappings.
     *
     * @param fn a function that initializes a builder to create the {@link CreateIndexRequest}
     */
    public final CompletableFuture<CreateIndexResponse> create(Function<CreateIndexRequest.Builder, ObjectBuilder<CreateIndexRequest>> fn)
        throws IOException, OpenSearchException {
        return create(fn, ApiType.OSS);
    }

    /**
     * Creates an index with optional settings and mappings.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateIndexRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateIndexResponse> create(
        Function<CreateIndexRequest.Builder, ObjectBuilder<CreateIndexRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return create(fn.apply(new CreateIndexRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.create_data_stream

    /**
     * Creates or updates a data stream.
     */
    public CompletableFuture<CreateDataStreamResponse> createDataStream(CreateDataStreamRequest request) throws IOException,
        OpenSearchException {
        return createDataStream(request, ApiType.OSS);
    }

    /**
     * Creates or updates a data stream.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateDataStreamResponse> createDataStream(CreateDataStreamRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.create_data_stream", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateDataStreamRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates a data stream.
     *
     * @param fn a function that initializes a builder to create the {@link CreateDataStreamRequest}
     */
    public final CompletableFuture<CreateDataStreamResponse> createDataStream(
        Function<CreateDataStreamRequest.Builder, ObjectBuilder<CreateDataStreamRequest>> fn
    ) throws IOException, OpenSearchException {
        return createDataStream(fn, ApiType.OSS);
    }

    /**
     * Creates or updates a data stream.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateDataStreamRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateDataStreamResponse> createDataStream(
        Function<CreateDataStreamRequest.Builder, ObjectBuilder<CreateDataStreamRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createDataStream(fn.apply(new CreateDataStreamRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.data_streams_stats

    /**
     * Provides statistics on operations happening in a data stream.
     */
    public CompletableFuture<DataStreamsStatsResponse> dataStreamsStats(DataStreamsStatsRequest request) throws IOException,
        OpenSearchException {
        return dataStreamsStats(request, ApiType.OSS);
    }

    /**
     * Provides statistics on operations happening in a data stream.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DataStreamsStatsResponse> dataStreamsStats(DataStreamsStatsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.data_streams_stats", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DataStreamsStatsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides statistics on operations happening in a data stream.
     *
     * @param fn a function that initializes a builder to create the {@link DataStreamsStatsRequest}
     */
    public final CompletableFuture<DataStreamsStatsResponse> dataStreamsStats(
        Function<DataStreamsStatsRequest.Builder, ObjectBuilder<DataStreamsStatsRequest>> fn
    ) throws IOException, OpenSearchException {
        return dataStreamsStats(fn, ApiType.OSS);
    }

    /**
     * Provides statistics on operations happening in a data stream.
     *
     * @param fn   a function that initializes a builder to create the {@link DataStreamsStatsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DataStreamsStatsResponse> dataStreamsStats(
        Function<DataStreamsStatsRequest.Builder, ObjectBuilder<DataStreamsStatsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return dataStreamsStats(fn.apply(new DataStreamsStatsRequest.Builder()).build(), type);
    }

    /**
     * Provides statistics on operations happening in a data stream.
     */
    public final CompletableFuture<DataStreamsStatsResponse> dataStreamsStats() throws IOException, OpenSearchException {
        return dataStreamsStats(ApiType.OSS);
    }

    /**
     * Provides statistics on operations happening in a data stream.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DataStreamsStatsResponse> dataStreamsStats(ApiType type) throws IOException, OpenSearchException {
        return dataStreamsStats(new DataStreamsStatsRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.delete

    /**
     * Deletes an index.
     */
    public CompletableFuture<DeleteIndexResponse> delete(DeleteIndexRequest request) throws IOException, OpenSearchException {
        return delete(request, ApiType.OSS);
    }

    /**
     * Deletes an index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteIndexResponse> delete(DeleteIndexRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.delete", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteIndexRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes an index.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteIndexRequest}
     */
    public final CompletableFuture<DeleteIndexResponse> delete(Function<DeleteIndexRequest.Builder, ObjectBuilder<DeleteIndexRequest>> fn)
        throws IOException, OpenSearchException {
        return delete(fn, ApiType.OSS);
    }

    /**
     * Deletes an index.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteIndexRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteIndexResponse> delete(
        Function<DeleteIndexRequest.Builder, ObjectBuilder<DeleteIndexRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return delete(fn.apply(new DeleteIndexRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.delete_alias

    /**
     * Deletes an alias.
     */
    public CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request) throws IOException, OpenSearchException {
        return deleteAlias(request, ApiType.OSS);
    }

    /**
     * Deletes an alias.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.delete_alias", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteAliasRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes an alias.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteAliasRequest}
     */
    public final CompletableFuture<DeleteAliasResponse> deleteAlias(
        Function<DeleteAliasRequest.Builder, ObjectBuilder<DeleteAliasRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteAlias(fn, ApiType.OSS);
    }

    /**
     * Deletes an alias.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteAliasRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteAliasResponse> deleteAlias(
        Function<DeleteAliasRequest.Builder, ObjectBuilder<DeleteAliasRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteAlias(fn.apply(new DeleteAliasRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.delete_data_stream

    /**
     * Deletes a data stream.
     */
    public CompletableFuture<DeleteDataStreamResponse> deleteDataStream(DeleteDataStreamRequest request) throws IOException,
        OpenSearchException {
        return deleteDataStream(request, ApiType.OSS);
    }

    /**
     * Deletes a data stream.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteDataStreamResponse> deleteDataStream(DeleteDataStreamRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.delete_data_stream", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteDataStreamRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a data stream.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteDataStreamRequest}
     */
    public final CompletableFuture<DeleteDataStreamResponse> deleteDataStream(
        Function<DeleteDataStreamRequest.Builder, ObjectBuilder<DeleteDataStreamRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteDataStream(fn, ApiType.OSS);
    }

    /**
     * Deletes a data stream.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteDataStreamRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteDataStreamResponse> deleteDataStream(
        Function<DeleteDataStreamRequest.Builder, ObjectBuilder<DeleteDataStreamRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteDataStream(fn.apply(new DeleteDataStreamRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.delete_index_template

    /**
     * Deletes an index template.
     */
    public CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(DeleteIndexTemplateRequest request) throws IOException,
        OpenSearchException {
        return deleteIndexTemplate(request, ApiType.OSS);
    }

    /**
     * Deletes an index template.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(DeleteIndexTemplateRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.delete_index_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteIndexTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes an index template.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteIndexTemplateRequest}
     */
    public final CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(
        Function<DeleteIndexTemplateRequest.Builder, ObjectBuilder<DeleteIndexTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteIndexTemplate(fn, ApiType.OSS);
    }

    /**
     * Deletes an index template.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteIndexTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(
        Function<DeleteIndexTemplateRequest.Builder, ObjectBuilder<DeleteIndexTemplateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteIndexTemplate(fn.apply(new DeleteIndexTemplateRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.delete_template

    /**
     * Deletes an index template.
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request) throws IOException, OpenSearchException {
        return deleteTemplate(request, ApiType.OSS);
    }

    /**
     * Deletes an index template.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.delete_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes an index template.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteTemplateRequest}
     */
    public final CompletableFuture<DeleteTemplateResponse> deleteTemplate(
        Function<DeleteTemplateRequest.Builder, ObjectBuilder<DeleteTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteTemplate(fn, ApiType.OSS);
    }

    /**
     * Deletes an index template.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteTemplateResponse> deleteTemplate(
        Function<DeleteTemplateRequest.Builder, ObjectBuilder<DeleteTemplateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteTemplate(fn.apply(new DeleteTemplateRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.exists

    /**
     * Returns information about whether a particular index exists.
     */
    public CompletableFuture<BooleanResponse> exists(ExistsRequest request) throws IOException, OpenSearchException {
        return exists(request, ApiType.OSS);
    }

    /**
     * Returns information about whether a particular index exists.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<BooleanResponse> exists(ExistsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.exists", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ExistsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about whether a particular index exists.
     *
     * @param fn a function that initializes a builder to create the {@link ExistsRequest}
     */
    public final CompletableFuture<BooleanResponse> exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn)
        throws IOException, OpenSearchException {
        return exists(fn, ApiType.OSS);
    }

    /**
     * Returns information about whether a particular index exists.
     *
     * @param fn   a function that initializes a builder to create the {@link ExistsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<BooleanResponse> exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return exists(fn.apply(new ExistsRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.exists_alias

    /**
     * Returns information about whether a particular alias exists.
     */
    public CompletableFuture<BooleanResponse> existsAlias(ExistsAliasRequest request) throws IOException, OpenSearchException {
        return existsAlias(request, ApiType.OSS);
    }

    /**
     * Returns information about whether a particular alias exists.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<BooleanResponse> existsAlias(ExistsAliasRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.exists_alias", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ExistsAliasRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about whether a particular alias exists.
     *
     * @param fn a function that initializes a builder to create the {@link ExistsAliasRequest}
     */
    public final CompletableFuture<BooleanResponse> existsAlias(Function<ExistsAliasRequest.Builder, ObjectBuilder<ExistsAliasRequest>> fn)
        throws IOException, OpenSearchException {
        return existsAlias(fn, ApiType.OSS);
    }

    /**
     * Returns information about whether a particular alias exists.
     *
     * @param fn   a function that initializes a builder to create the {@link ExistsAliasRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<BooleanResponse> existsAlias(
        Function<ExistsAliasRequest.Builder, ObjectBuilder<ExistsAliasRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return existsAlias(fn.apply(new ExistsAliasRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.exists_index_template

    /**
     * Returns information about whether a particular index template exists.
     */
    public CompletableFuture<BooleanResponse> existsIndexTemplate(ExistsIndexTemplateRequest request) throws IOException,
        OpenSearchException {
        return existsIndexTemplate(request, ApiType.OSS);
    }

    /**
     * Returns information about whether a particular index template exists.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<BooleanResponse> existsIndexTemplate(ExistsIndexTemplateRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.exists_index_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ExistsIndexTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about whether a particular index template exists.
     *
     * @param fn a function that initializes a builder to create the {@link ExistsIndexTemplateRequest}
     */
    public final CompletableFuture<BooleanResponse> existsIndexTemplate(
        Function<ExistsIndexTemplateRequest.Builder, ObjectBuilder<ExistsIndexTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return existsIndexTemplate(fn, ApiType.OSS);
    }

    /**
     * Returns information about whether a particular index template exists.
     *
     * @param fn   a function that initializes a builder to create the {@link ExistsIndexTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<BooleanResponse> existsIndexTemplate(
        Function<ExistsIndexTemplateRequest.Builder, ObjectBuilder<ExistsIndexTemplateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return existsIndexTemplate(fn.apply(new ExistsIndexTemplateRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.exists_template

    /**
     * Returns information about whether a particular index template exists.
     */
    public CompletableFuture<BooleanResponse> existsTemplate(ExistsTemplateRequest request) throws IOException, OpenSearchException {
        return existsTemplate(request, ApiType.OSS);
    }

    /**
     * Returns information about whether a particular index template exists.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<BooleanResponse> existsTemplate(ExistsTemplateRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.exists_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ExistsTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about whether a particular index template exists.
     *
     * @param fn a function that initializes a builder to create the {@link ExistsTemplateRequest}
     */
    public final CompletableFuture<BooleanResponse> existsTemplate(
        Function<ExistsTemplateRequest.Builder, ObjectBuilder<ExistsTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return existsTemplate(fn, ApiType.OSS);
    }

    /**
     * Returns information about whether a particular index template exists.
     *
     * @param fn   a function that initializes a builder to create the {@link ExistsTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<BooleanResponse> existsTemplate(
        Function<ExistsTemplateRequest.Builder, ObjectBuilder<ExistsTemplateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return existsTemplate(fn.apply(new ExistsTemplateRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.flush

    /**
     * Performs the flush operation on one or more indexes.
     */
    public CompletableFuture<FlushResponse> flush(FlushRequest request) throws IOException, OpenSearchException {
        return flush(request, ApiType.OSS);
    }

    /**
     * Performs the flush operation on one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<FlushResponse> flush(FlushRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.flush", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, FlushRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Performs the flush operation on one or more indexes.
     *
     * @param fn a function that initializes a builder to create the {@link FlushRequest}
     */
    public final CompletableFuture<FlushResponse> flush(Function<FlushRequest.Builder, ObjectBuilder<FlushRequest>> fn) throws IOException,
        OpenSearchException {
        return flush(fn, ApiType.OSS);
    }

    /**
     * Performs the flush operation on one or more indexes.
     *
     * @param fn   a function that initializes a builder to create the {@link FlushRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<FlushResponse> flush(Function<FlushRequest.Builder, ObjectBuilder<FlushRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return flush(fn.apply(new FlushRequest.Builder()).build(), type);
    }

    /**
     * Performs the flush operation on one or more indexes.
     */
    public final CompletableFuture<FlushResponse> flush() throws IOException, OpenSearchException {
        return flush(ApiType.OSS);
    }

    /**
     * Performs the flush operation on one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<FlushResponse> flush(ApiType type) throws IOException, OpenSearchException {
        return flush(new FlushRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.forcemerge

    /**
     * Performs the force merge operation on one or more indexes.
     */
    public CompletableFuture<ForcemergeResponse> forcemerge(ForcemergeRequest request) throws IOException, OpenSearchException {
        return forcemerge(request, ApiType.OSS);
    }

    /**
     * Performs the force merge operation on one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ForcemergeResponse> forcemerge(ForcemergeRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.forcemerge", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        ApiType.requirePathSupported(type, ApiType.AOS, "indices.forcemerge", 0 | (ApiTypeHelper.isDefined(request.index()) ? 1 : 0), 1);
        ApiType.requirePathSupported(type, ApiType.AOSS, "indices.forcemerge", 0 | (ApiTypeHelper.isDefined(request.index()) ? 1 : 0), 1);
        return this.transport.performRequestAsync(request, ForcemergeRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Performs the force merge operation on one or more indexes.
     *
     * @param fn a function that initializes a builder to create the {@link ForcemergeRequest}
     */
    public final CompletableFuture<ForcemergeResponse> forcemerge(Function<ForcemergeRequest.Builder, ObjectBuilder<ForcemergeRequest>> fn)
        throws IOException, OpenSearchException {
        return forcemerge(fn, ApiType.OSS);
    }

    /**
     * Performs the force merge operation on one or more indexes.
     *
     * @param fn   a function that initializes a builder to create the {@link ForcemergeRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ForcemergeResponse> forcemerge(
        Function<ForcemergeRequest.Builder, ObjectBuilder<ForcemergeRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return forcemerge(fn.apply(new ForcemergeRequest.Builder()).build(), type);
    }

    /**
     * Performs the force merge operation on one or more indexes.
     */
    public final CompletableFuture<ForcemergeResponse> forcemerge() throws IOException, OpenSearchException {
        return forcemerge(ApiType.OSS);
    }

    /**
     * Performs the force merge operation on one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ForcemergeResponse> forcemerge(ApiType type) throws IOException, OpenSearchException {
        return forcemerge(new ForcemergeRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.get

    /**
     * Returns information about one or more indexes.
     */
    public CompletableFuture<GetIndexResponse> get(GetIndexRequest request) throws IOException, OpenSearchException {
        return get(request, ApiType.OSS);
    }

    /**
     * Returns information about one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetIndexResponse> get(GetIndexRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.get", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetIndexRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about one or more indexes.
     *
     * @param fn a function that initializes a builder to create the {@link GetIndexRequest}
     */
    public final CompletableFuture<GetIndexResponse> get(Function<GetIndexRequest.Builder, ObjectBuilder<GetIndexRequest>> fn)
        throws IOException, OpenSearchException {
        return get(fn, ApiType.OSS);
    }

    /**
     * Returns information about one or more indexes.
     *
     * @param fn   a function that initializes a builder to create the {@link GetIndexRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetIndexResponse> get(Function<GetIndexRequest.Builder, ObjectBuilder<GetIndexRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return get(fn.apply(new GetIndexRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.get_alias

    /**
     * Returns an alias.
     */
    public CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request) throws IOException, OpenSearchException {
        return getAlias(request, ApiType.OSS);
    }

    /**
     * Returns an alias.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.get_alias", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetAliasRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns an alias.
     *
     * @param fn a function that initializes a builder to create the {@link GetAliasRequest}
     */
    public final CompletableFuture<GetAliasResponse> getAlias(Function<GetAliasRequest.Builder, ObjectBuilder<GetAliasRequest>> fn)
        throws IOException, OpenSearchException {
        return getAlias(fn, ApiType.OSS);
    }

    /**
     * Returns an alias.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAliasRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAliasResponse> getAlias(
        Function<GetAliasRequest.Builder, ObjectBuilder<GetAliasRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAlias(fn.apply(new GetAliasRequest.Builder()).build(), type);
    }

    /**
     * Returns an alias.
     */
    public final CompletableFuture<GetAliasResponse> getAlias() throws IOException, OpenSearchException {
        return getAlias(ApiType.OSS);
    }

    /**
     * Returns an alias.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAliasResponse> getAlias(ApiType type) throws IOException, OpenSearchException {
        return getAlias(new GetAliasRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.get_data_stream

    /**
     * Returns data streams.
     */
    public CompletableFuture<GetDataStreamResponse> getDataStream(GetDataStreamRequest request) throws IOException, OpenSearchException {
        return getDataStream(request, ApiType.OSS);
    }

    /**
     * Returns data streams.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetDataStreamResponse> getDataStream(GetDataStreamRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.get_data_stream", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetDataStreamRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns data streams.
     *
     * @param fn a function that initializes a builder to create the {@link GetDataStreamRequest}
     */
    public final CompletableFuture<GetDataStreamResponse> getDataStream(
        Function<GetDataStreamRequest.Builder, ObjectBuilder<GetDataStreamRequest>> fn
    ) throws IOException, OpenSearchException {
        return getDataStream(fn, ApiType.OSS);
    }

    /**
     * Returns data streams.
     *
     * @param fn   a function that initializes a builder to create the {@link GetDataStreamRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetDataStreamResponse> getDataStream(
        Function<GetDataStreamRequest.Builder, ObjectBuilder<GetDataStreamRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getDataStream(fn.apply(new GetDataStreamRequest.Builder()).build(), type);
    }

    /**
     * Returns data streams.
     */
    public final CompletableFuture<GetDataStreamResponse> getDataStream() throws IOException, OpenSearchException {
        return getDataStream(ApiType.OSS);
    }

    /**
     * Returns data streams.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetDataStreamResponse> getDataStream(ApiType type) throws IOException, OpenSearchException {
        return getDataStream(new GetDataStreamRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.get_index_template

    /**
     * Returns an index template.
     */
    public CompletableFuture<GetIndexTemplateResponse> getIndexTemplate(GetIndexTemplateRequest request) throws IOException,
        OpenSearchException {
        return getIndexTemplate(request, ApiType.OSS);
    }

    /**
     * Returns an index template.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetIndexTemplateResponse> getIndexTemplate(GetIndexTemplateRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.get_index_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetIndexTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns an index template.
     *
     * @param fn a function that initializes a builder to create the {@link GetIndexTemplateRequest}
     */
    public final CompletableFuture<GetIndexTemplateResponse> getIndexTemplate(
        Function<GetIndexTemplateRequest.Builder, ObjectBuilder<GetIndexTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return getIndexTemplate(fn, ApiType.OSS);
    }

    /**
     * Returns an index template.
     *
     * @param fn   a function that initializes a builder to create the {@link GetIndexTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetIndexTemplateResponse> getIndexTemplate(
        Function<GetIndexTemplateRequest.Builder, ObjectBuilder<GetIndexTemplateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getIndexTemplate(fn.apply(new GetIndexTemplateRequest.Builder()).build(), type);
    }

    /**
     * Returns an index template.
     */
    public final CompletableFuture<GetIndexTemplateResponse> getIndexTemplate() throws IOException, OpenSearchException {
        return getIndexTemplate(ApiType.OSS);
    }

    /**
     * Returns an index template.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetIndexTemplateResponse> getIndexTemplate(ApiType type) throws IOException, OpenSearchException {
        return getIndexTemplate(new GetIndexTemplateRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.get_mapping

    /**
     * Returns mappings for one or more indexes.
     */
    public CompletableFuture<GetMappingResponse> getMapping(GetMappingRequest request) throws IOException, OpenSearchException {
        return getMapping(request, ApiType.OSS);
    }

    /**
     * Returns mappings for one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetMappingResponse> getMapping(GetMappingRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.get_mapping", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetMappingRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns mappings for one or more indexes.
     *
     * @param fn a function that initializes a builder to create the {@link GetMappingRequest}
     */
    public final CompletableFuture<GetMappingResponse> getMapping(Function<GetMappingRequest.Builder, ObjectBuilder<GetMappingRequest>> fn)
        throws IOException, OpenSearchException {
        return getMapping(fn, ApiType.OSS);
    }

    /**
     * Returns mappings for one or more indexes.
     *
     * @param fn   a function that initializes a builder to create the {@link GetMappingRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetMappingResponse> getMapping(
        Function<GetMappingRequest.Builder, ObjectBuilder<GetMappingRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getMapping(fn.apply(new GetMappingRequest.Builder()).build(), type);
    }

    /**
     * Returns mappings for one or more indexes.
     */
    public final CompletableFuture<GetMappingResponse> getMapping() throws IOException, OpenSearchException {
        return getMapping(ApiType.OSS);
    }

    /**
     * Returns mappings for one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetMappingResponse> getMapping(ApiType type) throws IOException, OpenSearchException {
        return getMapping(new GetMappingRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.get_settings

    /**
     * Returns settings for one or more indexes.
     */
    public CompletableFuture<GetIndicesSettingsResponse> getSettings(GetIndicesSettingsRequest request) throws IOException,
        OpenSearchException {
        return getSettings(request, ApiType.OSS);
    }

    /**
     * Returns settings for one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetIndicesSettingsResponse> getSettings(GetIndicesSettingsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.get_settings", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        ApiType.requirePathSupported(
            type,
            ApiType.AOS,
            "indices.get_settings",
            0 | (ApiTypeHelper.isDefined(request.index()) ? 1 : 0) | (ApiTypeHelper.isDefined(request.name()) ? 2 : 0),
            1,
            2,
            3
        );
        ApiType.requirePathSupported(
            type,
            ApiType.AOSS,
            "indices.get_settings",
            0 | (ApiTypeHelper.isDefined(request.index()) ? 1 : 0) | (ApiTypeHelper.isDefined(request.name()) ? 2 : 0),
            1,
            2,
            3
        );
        return this.transport.performRequestAsync(request, GetIndicesSettingsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns settings for one or more indexes.
     *
     * @param fn a function that initializes a builder to create the {@link GetIndicesSettingsRequest}
     */
    public final CompletableFuture<GetIndicesSettingsResponse> getSettings(
        Function<GetIndicesSettingsRequest.Builder, ObjectBuilder<GetIndicesSettingsRequest>> fn
    ) throws IOException, OpenSearchException {
        return getSettings(fn, ApiType.OSS);
    }

    /**
     * Returns settings for one or more indexes.
     *
     * @param fn   a function that initializes a builder to create the {@link GetIndicesSettingsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetIndicesSettingsResponse> getSettings(
        Function<GetIndicesSettingsRequest.Builder, ObjectBuilder<GetIndicesSettingsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getSettings(fn.apply(new GetIndicesSettingsRequest.Builder()).build(), type);
    }

    /**
     * Returns settings for one or more indexes.
     */
    public final CompletableFuture<GetIndicesSettingsResponse> getSettings() throws IOException, OpenSearchException {
        return getSettings(ApiType.OSS);
    }

    /**
     * Returns settings for one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetIndicesSettingsResponse> getSettings(ApiType type) throws IOException, OpenSearchException {
        return getSettings(new GetIndicesSettingsRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.get_template

    /**
     * Returns an index template.
     */
    public CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request) throws IOException, OpenSearchException {
        return getTemplate(request, ApiType.OSS);
    }

    /**
     * Returns an index template.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.get_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns an index template.
     *
     * @param fn a function that initializes a builder to create the {@link GetTemplateRequest}
     */
    public final CompletableFuture<GetTemplateResponse> getTemplate(
        Function<GetTemplateRequest.Builder, ObjectBuilder<GetTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return getTemplate(fn, ApiType.OSS);
    }

    /**
     * Returns an index template.
     *
     * @param fn   a function that initializes a builder to create the {@link GetTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetTemplateResponse> getTemplate(
        Function<GetTemplateRequest.Builder, ObjectBuilder<GetTemplateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getTemplate(fn.apply(new GetTemplateRequest.Builder()).build(), type);
    }

    /**
     * Returns an index template.
     */
    public final CompletableFuture<GetTemplateResponse> getTemplate() throws IOException, OpenSearchException {
        return getTemplate(ApiType.OSS);
    }

    /**
     * Returns an index template.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetTemplateResponse> getTemplate(ApiType type) throws IOException, OpenSearchException {
        return getTemplate(new GetTemplateRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.open

    /**
     * Opens an index.
     */
    public CompletableFuture<OpenResponse> open(OpenRequest request) throws IOException, OpenSearchException {
        return open(request, ApiType.OSS);
    }

    /**
     * Opens an index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<OpenResponse> open(OpenRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.open", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, OpenRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Opens an index.
     *
     * @param fn a function that initializes a builder to create the {@link OpenRequest}
     */
    public final CompletableFuture<OpenResponse> open(Function<OpenRequest.Builder, ObjectBuilder<OpenRequest>> fn) throws IOException,
        OpenSearchException {
        return open(fn, ApiType.OSS);
    }

    /**
     * Opens an index.
     *
     * @param fn   a function that initializes a builder to create the {@link OpenRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<OpenResponse> open(Function<OpenRequest.Builder, ObjectBuilder<OpenRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return open(fn.apply(new OpenRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.put_alias

    /**
     * Creates or updates an alias.
     */
    public CompletableFuture<PutAliasResponse> putAlias(PutAliasRequest request) throws IOException, OpenSearchException {
        return putAlias(request, ApiType.OSS);
    }

    /**
     * Creates or updates an alias.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PutAliasResponse> putAlias(PutAliasRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.put_alias", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, PutAliasRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates an alias.
     *
     * @param fn a function that initializes a builder to create the {@link PutAliasRequest}
     */
    public final CompletableFuture<PutAliasResponse> putAlias(Function<PutAliasRequest.Builder, ObjectBuilder<PutAliasRequest>> fn)
        throws IOException, OpenSearchException {
        return putAlias(fn, ApiType.OSS);
    }

    /**
     * Creates or updates an alias.
     *
     * @param fn   a function that initializes a builder to create the {@link PutAliasRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PutAliasResponse> putAlias(
        Function<PutAliasRequest.Builder, ObjectBuilder<PutAliasRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return putAlias(fn.apply(new PutAliasRequest.Builder()).build(), type);
    }

    /**
     * Creates or updates an alias.
     */
    public final CompletableFuture<PutAliasResponse> putAlias() throws IOException, OpenSearchException {
        return putAlias(ApiType.OSS);
    }

    /**
     * Creates or updates an alias.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PutAliasResponse> putAlias(ApiType type) throws IOException, OpenSearchException {
        return putAlias(new PutAliasRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.put_index_template

    /**
     * Creates or updates an index template.
     */
    public CompletableFuture<PutIndexTemplateResponse> putIndexTemplate(PutIndexTemplateRequest request) throws IOException,
        OpenSearchException {
        return putIndexTemplate(request, ApiType.OSS);
    }

    /**
     * Creates or updates an index template.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PutIndexTemplateResponse> putIndexTemplate(PutIndexTemplateRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.put_index_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, PutIndexTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates an index template.
     *
     * @param fn a function that initializes a builder to create the {@link PutIndexTemplateRequest}
     */
    public final CompletableFuture<PutIndexTemplateResponse> putIndexTemplate(
        Function<PutIndexTemplateRequest.Builder, ObjectBuilder<PutIndexTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return putIndexTemplate(fn, ApiType.OSS);
    }

    /**
     * Creates or updates an index template.
     *
     * @param fn   a function that initializes a builder to create the {@link PutIndexTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PutIndexTemplateResponse> putIndexTemplate(
        Function<PutIndexTemplateRequest.Builder, ObjectBuilder<PutIndexTemplateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return putIndexTemplate(fn.apply(new PutIndexTemplateRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.put_mapping

    /**
     * Updates the index mappings.
     */
    public CompletableFuture<PutMappingResponse> putMapping(PutMappingRequest request) throws IOException, OpenSearchException {
        return putMapping(request, ApiType.OSS);
    }

    /**
     * Updates the index mappings.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PutMappingResponse> putMapping(PutMappingRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.put_mapping", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, PutMappingRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the index mappings.
     *
     * @param fn a function that initializes a builder to create the {@link PutMappingRequest}
     */
    public final CompletableFuture<PutMappingResponse> putMapping(Function<PutMappingRequest.Builder, ObjectBuilder<PutMappingRequest>> fn)
        throws IOException, OpenSearchException {
        return putMapping(fn, ApiType.OSS);
    }

    /**
     * Updates the index mappings.
     *
     * @param fn   a function that initializes a builder to create the {@link PutMappingRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PutMappingResponse> putMapping(
        Function<PutMappingRequest.Builder, ObjectBuilder<PutMappingRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return putMapping(fn.apply(new PutMappingRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.put_settings

    /**
     * Updates the index settings.
     */
    public CompletableFuture<PutIndicesSettingsResponse> putSettings(PutIndicesSettingsRequest request) throws IOException,
        OpenSearchException {
        return putSettings(request, ApiType.OSS);
    }

    /**
     * Updates the index settings.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PutIndicesSettingsResponse> putSettings(PutIndicesSettingsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.put_settings", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, PutIndicesSettingsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the index settings.
     *
     * @param fn a function that initializes a builder to create the {@link PutIndicesSettingsRequest}
     */
    public final CompletableFuture<PutIndicesSettingsResponse> putSettings(
        Function<PutIndicesSettingsRequest.Builder, ObjectBuilder<PutIndicesSettingsRequest>> fn
    ) throws IOException, OpenSearchException {
        return putSettings(fn, ApiType.OSS);
    }

    /**
     * Updates the index settings.
     *
     * @param fn   a function that initializes a builder to create the {@link PutIndicesSettingsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PutIndicesSettingsResponse> putSettings(
        Function<PutIndicesSettingsRequest.Builder, ObjectBuilder<PutIndicesSettingsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return putSettings(fn.apply(new PutIndicesSettingsRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.put_template

    /**
     * Creates or updates an index template.
     */
    public CompletableFuture<PutTemplateResponse> putTemplate(PutTemplateRequest request) throws IOException, OpenSearchException {
        return putTemplate(request, ApiType.OSS);
    }

    /**
     * Creates or updates an index template.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PutTemplateResponse> putTemplate(PutTemplateRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.put_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, PutTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates an index template.
     *
     * @param fn a function that initializes a builder to create the {@link PutTemplateRequest}
     */
    public final CompletableFuture<PutTemplateResponse> putTemplate(
        Function<PutTemplateRequest.Builder, ObjectBuilder<PutTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return putTemplate(fn, ApiType.OSS);
    }

    /**
     * Creates or updates an index template.
     *
     * @param fn   a function that initializes a builder to create the {@link PutTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PutTemplateResponse> putTemplate(
        Function<PutTemplateRequest.Builder, ObjectBuilder<PutTemplateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return putTemplate(fn.apply(new PutTemplateRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.recovery

    /**
     * Returns information about ongoing index shard recoveries.
     */
    public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request) throws IOException, OpenSearchException {
        return recovery(request, ApiType.OSS);
    }

    /**
     * Returns information about ongoing index shard recoveries.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.recovery", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, RecoveryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about ongoing index shard recoveries.
     *
     * @param fn a function that initializes a builder to create the {@link RecoveryRequest}
     */
    public final CompletableFuture<RecoveryResponse> recovery(Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn)
        throws IOException, OpenSearchException {
        return recovery(fn, ApiType.OSS);
    }

    /**
     * Returns information about ongoing index shard recoveries.
     *
     * @param fn   a function that initializes a builder to create the {@link RecoveryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RecoveryResponse> recovery(
        Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return recovery(fn.apply(new RecoveryRequest.Builder()).build(), type);
    }

    /**
     * Returns information about ongoing index shard recoveries.
     */
    public final CompletableFuture<RecoveryResponse> recovery() throws IOException, OpenSearchException {
        return recovery(ApiType.OSS);
    }

    /**
     * Returns information about ongoing index shard recoveries.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RecoveryResponse> recovery(ApiType type) throws IOException, OpenSearchException {
        return recovery(new RecoveryRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.refresh

    /**
     * Performs the refresh operation in one or more indexes.
     */
    public CompletableFuture<RefreshResponse> refresh(RefreshRequest request) throws IOException, OpenSearchException {
        return refresh(request, ApiType.OSS);
    }

    /**
     * Performs the refresh operation in one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<RefreshResponse> refresh(RefreshRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.refresh", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, RefreshRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Performs the refresh operation in one or more indexes.
     *
     * @param fn a function that initializes a builder to create the {@link RefreshRequest}
     */
    public final CompletableFuture<RefreshResponse> refresh(Function<RefreshRequest.Builder, ObjectBuilder<RefreshRequest>> fn)
        throws IOException, OpenSearchException {
        return refresh(fn, ApiType.OSS);
    }

    /**
     * Performs the refresh operation in one or more indexes.
     *
     * @param fn   a function that initializes a builder to create the {@link RefreshRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RefreshResponse> refresh(
        Function<RefreshRequest.Builder, ObjectBuilder<RefreshRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return refresh(fn.apply(new RefreshRequest.Builder()).build(), type);
    }

    /**
     * Performs the refresh operation in one or more indexes.
     */
    public final CompletableFuture<RefreshResponse> refresh() throws IOException, OpenSearchException {
        return refresh(ApiType.OSS);
    }

    /**
     * Performs the refresh operation in one or more indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RefreshResponse> refresh(ApiType type) throws IOException, OpenSearchException {
        return refresh(new RefreshRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.resolve_index

    /**
     * Returns information about any matching indexes, aliases, and data streams.
     */
    public CompletableFuture<ResolveIndexResponse> resolveIndex(ResolveIndexRequest request) throws IOException, OpenSearchException {
        return resolveIndex(request, ApiType.OSS);
    }

    /**
     * Returns information about any matching indexes, aliases, and data streams.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ResolveIndexResponse> resolveIndex(ResolveIndexRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.resolve_index", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ResolveIndexRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about any matching indexes, aliases, and data streams.
     *
     * @param fn a function that initializes a builder to create the {@link ResolveIndexRequest}
     */
    public final CompletableFuture<ResolveIndexResponse> resolveIndex(
        Function<ResolveIndexRequest.Builder, ObjectBuilder<ResolveIndexRequest>> fn
    ) throws IOException, OpenSearchException {
        return resolveIndex(fn, ApiType.OSS);
    }

    /**
     * Returns information about any matching indexes, aliases, and data streams.
     *
     * @param fn   a function that initializes a builder to create the {@link ResolveIndexRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ResolveIndexResponse> resolveIndex(
        Function<ResolveIndexRequest.Builder, ObjectBuilder<ResolveIndexRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return resolveIndex(fn.apply(new ResolveIndexRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.rollover

    /**
     * Updates an alias to point to a new index when the existing index is considered to be too large or too old.
     */
    public CompletableFuture<RolloverResponse> rollover(RolloverRequest request) throws IOException, OpenSearchException {
        return rollover(request, ApiType.OSS);
    }

    /**
     * Updates an alias to point to a new index when the existing index is considered to be too large or too old.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<RolloverResponse> rollover(RolloverRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.rollover", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, RolloverRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates an alias to point to a new index when the existing index is considered to be too large or too old.
     *
     * @param fn a function that initializes a builder to create the {@link RolloverRequest}
     */
    public final CompletableFuture<RolloverResponse> rollover(Function<RolloverRequest.Builder, ObjectBuilder<RolloverRequest>> fn)
        throws IOException, OpenSearchException {
        return rollover(fn, ApiType.OSS);
    }

    /**
     * Updates an alias to point to a new index when the existing index is considered to be too large or too old.
     *
     * @param fn   a function that initializes a builder to create the {@link RolloverRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RolloverResponse> rollover(
        Function<RolloverRequest.Builder, ObjectBuilder<RolloverRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return rollover(fn.apply(new RolloverRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.segments

    /**
     * Provides low-level information about segments in a Lucene index.
     */
    public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request) throws IOException, OpenSearchException {
        return segments(request, ApiType.OSS);
    }

    /**
     * Provides low-level information about segments in a Lucene index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.segments", ApiType.OSS);
        return this.transport.performRequestAsync(request, SegmentsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides low-level information about segments in a Lucene index.
     *
     * @param fn a function that initializes a builder to create the {@link SegmentsRequest}
     */
    public final CompletableFuture<SegmentsResponse> segments(Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn)
        throws IOException, OpenSearchException {
        return segments(fn, ApiType.OSS);
    }

    /**
     * Provides low-level information about segments in a Lucene index.
     *
     * @param fn   a function that initializes a builder to create the {@link SegmentsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SegmentsResponse> segments(
        Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return segments(fn.apply(new SegmentsRequest.Builder()).build(), type);
    }

    /**
     * Provides low-level information about segments in a Lucene index.
     */
    public final CompletableFuture<SegmentsResponse> segments() throws IOException, OpenSearchException {
        return segments(ApiType.OSS);
    }

    /**
     * Provides low-level information about segments in a Lucene index.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SegmentsResponse> segments(ApiType type) throws IOException, OpenSearchException {
        return segments(new SegmentsRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.shard_stores

    /**
     * Provides store information for shard copies of indexes.
     */
    public CompletableFuture<ShardStoresResponse> shardStores(ShardStoresRequest request) throws IOException, OpenSearchException {
        return shardStores(request, ApiType.OSS);
    }

    /**
     * Provides store information for shard copies of indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ShardStoresResponse> shardStores(ShardStoresRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.shard_stores", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ShardStoresRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides store information for shard copies of indexes.
     *
     * @param fn a function that initializes a builder to create the {@link ShardStoresRequest}
     */
    public final CompletableFuture<ShardStoresResponse> shardStores(
        Function<ShardStoresRequest.Builder, ObjectBuilder<ShardStoresRequest>> fn
    ) throws IOException, OpenSearchException {
        return shardStores(fn, ApiType.OSS);
    }

    /**
     * Provides store information for shard copies of indexes.
     *
     * @param fn   a function that initializes a builder to create the {@link ShardStoresRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ShardStoresResponse> shardStores(
        Function<ShardStoresRequest.Builder, ObjectBuilder<ShardStoresRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return shardStores(fn.apply(new ShardStoresRequest.Builder()).build(), type);
    }

    /**
     * Provides store information for shard copies of indexes.
     */
    public final CompletableFuture<ShardStoresResponse> shardStores() throws IOException, OpenSearchException {
        return shardStores(ApiType.OSS);
    }

    /**
     * Provides store information for shard copies of indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ShardStoresResponse> shardStores(ApiType type) throws IOException, OpenSearchException {
        return shardStores(new ShardStoresRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.shrink

    /**
     * Allow to shrink an existing index into a new index with fewer primary shards.
     */
    public CompletableFuture<ShrinkResponse> shrink(ShrinkRequest request) throws IOException, OpenSearchException {
        return shrink(request, ApiType.OSS);
    }

    /**
     * Allow to shrink an existing index into a new index with fewer primary shards.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ShrinkResponse> shrink(ShrinkRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.shrink", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ShrinkRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Allow to shrink an existing index into a new index with fewer primary shards.
     *
     * @param fn a function that initializes a builder to create the {@link ShrinkRequest}
     */
    public final CompletableFuture<ShrinkResponse> shrink(Function<ShrinkRequest.Builder, ObjectBuilder<ShrinkRequest>> fn)
        throws IOException, OpenSearchException {
        return shrink(fn, ApiType.OSS);
    }

    /**
     * Allow to shrink an existing index into a new index with fewer primary shards.
     *
     * @param fn   a function that initializes a builder to create the {@link ShrinkRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ShrinkResponse> shrink(Function<ShrinkRequest.Builder, ObjectBuilder<ShrinkRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return shrink(fn.apply(new ShrinkRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.simulate_index_template

    /**
     * Simulate matching the given index name against the index templates in the system.
     */
    public CompletableFuture<SimulateIndexTemplateResponse> simulateIndexTemplate(SimulateIndexTemplateRequest request) throws IOException,
        OpenSearchException {
        return simulateIndexTemplate(request, ApiType.OSS);
    }

    /**
     * Simulate matching the given index name against the index templates in the system.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<SimulateIndexTemplateResponse> simulateIndexTemplate(SimulateIndexTemplateRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.simulate_index_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, SimulateIndexTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Simulate matching the given index name against the index templates in the system.
     *
     * @param fn a function that initializes a builder to create the {@link SimulateIndexTemplateRequest}
     */
    public final CompletableFuture<SimulateIndexTemplateResponse> simulateIndexTemplate(
        Function<SimulateIndexTemplateRequest.Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return simulateIndexTemplate(fn, ApiType.OSS);
    }

    /**
     * Simulate matching the given index name against the index templates in the system.
     *
     * @param fn   a function that initializes a builder to create the {@link SimulateIndexTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SimulateIndexTemplateResponse> simulateIndexTemplate(
        Function<SimulateIndexTemplateRequest.Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return simulateIndexTemplate(fn.apply(new SimulateIndexTemplateRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.simulate_template

    /**
     * Simulate resolving the given template name or body.
     */
    public CompletableFuture<SimulateTemplateResponse> simulateTemplate(SimulateTemplateRequest request) throws IOException,
        OpenSearchException {
        return simulateTemplate(request, ApiType.OSS);
    }

    /**
     * Simulate resolving the given template name or body.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<SimulateTemplateResponse> simulateTemplate(SimulateTemplateRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.simulate_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, SimulateTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Simulate resolving the given template name or body.
     *
     * @param fn a function that initializes a builder to create the {@link SimulateTemplateRequest}
     */
    public final CompletableFuture<SimulateTemplateResponse> simulateTemplate(
        Function<SimulateTemplateRequest.Builder, ObjectBuilder<SimulateTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return simulateTemplate(fn, ApiType.OSS);
    }

    /**
     * Simulate resolving the given template name or body.
     *
     * @param fn   a function that initializes a builder to create the {@link SimulateTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SimulateTemplateResponse> simulateTemplate(
        Function<SimulateTemplateRequest.Builder, ObjectBuilder<SimulateTemplateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return simulateTemplate(fn.apply(new SimulateTemplateRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.split

    /**
     * Allows you to split an existing index into a new index with more primary shards.
     */
    public CompletableFuture<SplitResponse> split(SplitRequest request) throws IOException, OpenSearchException {
        return split(request, ApiType.OSS);
    }

    /**
     * Allows you to split an existing index into a new index with more primary shards.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<SplitResponse> split(SplitRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "indices.split", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, SplitRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Allows you to split an existing index into a new index with more primary shards.
     *
     * @param fn a function that initializes a builder to create the {@link SplitRequest}
     */
    public final CompletableFuture<SplitResponse> split(Function<SplitRequest.Builder, ObjectBuilder<SplitRequest>> fn) throws IOException,
        OpenSearchException {
        return split(fn, ApiType.OSS);
    }

    /**
     * Allows you to split an existing index into a new index with more primary shards.
     *
     * @param fn   a function that initializes a builder to create the {@link SplitRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SplitResponse> split(Function<SplitRequest.Builder, ObjectBuilder<SplitRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return split(fn.apply(new SplitRequest.Builder()).build(), type);
    }

    // ----- Endpoint: indices.stats

    /**
     * Provides statistics on operations happening in an index.
     */
    public CompletableFuture<IndicesStatsResponse> stats(IndicesStatsRequest request) throws IOException, OpenSearchException {
        return stats(request, ApiType.OSS);
    }

    /**
     * Provides statistics on operations happening in an index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<IndicesStatsResponse> stats(IndicesStatsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.stats", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, IndicesStatsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides statistics on operations happening in an index.
     *
     * @param fn a function that initializes a builder to create the {@link IndicesStatsRequest}
     */
    public final CompletableFuture<IndicesStatsResponse> stats(Function<IndicesStatsRequest.Builder, ObjectBuilder<IndicesStatsRequest>> fn)
        throws IOException, OpenSearchException {
        return stats(fn, ApiType.OSS);
    }

    /**
     * Provides statistics on operations happening in an index.
     *
     * @param fn   a function that initializes a builder to create the {@link IndicesStatsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<IndicesStatsResponse> stats(
        Function<IndicesStatsRequest.Builder, ObjectBuilder<IndicesStatsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return stats(fn.apply(new IndicesStatsRequest.Builder()).build(), type);
    }

    /**
     * Provides statistics on operations happening in an index.
     */
    public final CompletableFuture<IndicesStatsResponse> stats() throws IOException, OpenSearchException {
        return stats(ApiType.OSS);
    }

    /**
     * Provides statistics on operations happening in an index.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<IndicesStatsResponse> stats(ApiType type) throws IOException, OpenSearchException {
        return stats(new IndicesStatsRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.update_aliases

    /**
     * Updates index aliases.
     */
    public CompletableFuture<UpdateAliasesResponse> updateAliases(UpdateAliasesRequest request) throws IOException, OpenSearchException {
        return updateAliases(request, ApiType.OSS);
    }

    /**
     * Updates index aliases.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateAliasesResponse> updateAliases(UpdateAliasesRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.update_aliases", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateAliasesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates index aliases.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateAliasesRequest}
     */
    public final CompletableFuture<UpdateAliasesResponse> updateAliases(
        Function<UpdateAliasesRequest.Builder, ObjectBuilder<UpdateAliasesRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateAliases(fn, ApiType.OSS);
    }

    /**
     * Updates index aliases.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateAliasesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateAliasesResponse> updateAliases(
        Function<UpdateAliasesRequest.Builder, ObjectBuilder<UpdateAliasesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateAliases(fn.apply(new UpdateAliasesRequest.Builder()).build(), type);
    }

    /**
     * Updates index aliases.
     */
    public final CompletableFuture<UpdateAliasesResponse> updateAliases() throws IOException, OpenSearchException {
        return updateAliases(ApiType.OSS);
    }

    /**
     * Updates index aliases.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateAliasesResponse> updateAliases(ApiType type) throws IOException, OpenSearchException {
        return updateAliases(new UpdateAliasesRequest.Builder().build(), type);
    }

    // ----- Endpoint: indices.validate_query

    /**
     * Allows a user to validate a potentially expensive query without executing it.
     */
    public CompletableFuture<ValidateQueryResponse> validateQuery(ValidateQueryRequest request) throws IOException, OpenSearchException {
        return validateQuery(request, ApiType.OSS);
    }

    /**
     * Allows a user to validate a potentially expensive query without executing it.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ValidateQueryResponse> validateQuery(ValidateQueryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "indices.validate_query", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ValidateQueryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Allows a user to validate a potentially expensive query without executing it.
     *
     * @param fn a function that initializes a builder to create the {@link ValidateQueryRequest}
     */
    public final CompletableFuture<ValidateQueryResponse> validateQuery(
        Function<ValidateQueryRequest.Builder, ObjectBuilder<ValidateQueryRequest>> fn
    ) throws IOException, OpenSearchException {
        return validateQuery(fn, ApiType.OSS);
    }

    /**
     * Allows a user to validate a potentially expensive query without executing it.
     *
     * @param fn   a function that initializes a builder to create the {@link ValidateQueryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ValidateQueryResponse> validateQuery(
        Function<ValidateQueryRequest.Builder, ObjectBuilder<ValidateQueryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return validateQuery(fn.apply(new ValidateQueryRequest.Builder()).build(), type);
    }

    /**
     * Allows a user to validate a potentially expensive query without executing it.
     */
    public final CompletableFuture<ValidateQueryResponse> validateQuery() throws IOException, OpenSearchException {
        return validateQuery(ApiType.OSS);
    }

    /**
     * Allows a user to validate a potentially expensive query without executing it.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ValidateQueryResponse> validateQuery(ApiType type) throws IOException, OpenSearchException {
        return validateQuery(new ValidateQueryRequest.Builder().build(), type);
    }
}
