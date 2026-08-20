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

package org.opensearch.client.opensearch;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.opensearch.cat.OpenSearchCatAsyncClient;
import org.opensearch.client.opensearch.cluster.OpenSearchClusterAsyncClient;
import org.opensearch.client.opensearch.core.ClearScrollRequest;
import org.opensearch.client.opensearch.core.ClearScrollResponse;
import org.opensearch.client.opensearch.core.CountRequest;
import org.opensearch.client.opensearch.core.CountResponse;
import org.opensearch.client.opensearch.core.CreatePitRequest;
import org.opensearch.client.opensearch.core.CreatePitResponse;
import org.opensearch.client.opensearch.core.DeleteAllPitsRequest;
import org.opensearch.client.opensearch.core.DeleteAllPitsResponse;
import org.opensearch.client.opensearch.core.DeleteByQueryRequest;
import org.opensearch.client.opensearch.core.DeleteByQueryResponse;
import org.opensearch.client.opensearch.core.DeleteByQueryRethrottleRequest;
import org.opensearch.client.opensearch.core.DeleteByQueryRethrottleResponse;
import org.opensearch.client.opensearch.core.DeletePitRequest;
import org.opensearch.client.opensearch.core.DeletePitResponse;
import org.opensearch.client.opensearch.core.DeleteRequest;
import org.opensearch.client.opensearch.core.DeleteResponse;
import org.opensearch.client.opensearch.core.DeleteScriptRequest;
import org.opensearch.client.opensearch.core.DeleteScriptResponse;
import org.opensearch.client.opensearch.core.ExistsRequest;
import org.opensearch.client.opensearch.core.ExistsSourceRequest;
import org.opensearch.client.opensearch.core.ExplainRequest;
import org.opensearch.client.opensearch.core.ExplainResponse;
import org.opensearch.client.opensearch.core.FieldCapsRequest;
import org.opensearch.client.opensearch.core.FieldCapsResponse;
import org.opensearch.client.opensearch.core.GetAllPitsRequest;
import org.opensearch.client.opensearch.core.GetAllPitsResponse;
import org.opensearch.client.opensearch.core.GetRequest;
import org.opensearch.client.opensearch.core.GetResponse;
import org.opensearch.client.opensearch.core.GetScriptContextRequest;
import org.opensearch.client.opensearch.core.GetScriptContextResponse;
import org.opensearch.client.opensearch.core.GetScriptLanguagesRequest;
import org.opensearch.client.opensearch.core.GetScriptLanguagesResponse;
import org.opensearch.client.opensearch.core.GetScriptRequest;
import org.opensearch.client.opensearch.core.GetScriptResponse;
import org.opensearch.client.opensearch.core.GetSourceRequest;
import org.opensearch.client.opensearch.core.GetSourceResponse;
import org.opensearch.client.opensearch.core.InfoRequest;
import org.opensearch.client.opensearch.core.InfoResponse;
import org.opensearch.client.opensearch.core.MtermvectorsRequest;
import org.opensearch.client.opensearch.core.MtermvectorsResponse;
import org.opensearch.client.opensearch.core.PingRequest;
import org.opensearch.client.opensearch.core.PutScriptRequest;
import org.opensearch.client.opensearch.core.PutScriptResponse;
import org.opensearch.client.opensearch.core.RankEvalRequest;
import org.opensearch.client.opensearch.core.RankEvalResponse;
import org.opensearch.client.opensearch.core.ReindexRequest;
import org.opensearch.client.opensearch.core.ReindexResponse;
import org.opensearch.client.opensearch.core.ReindexRethrottleRequest;
import org.opensearch.client.opensearch.core.ReindexRethrottleResponse;
import org.opensearch.client.opensearch.core.RenderSearchTemplateRequest;
import org.opensearch.client.opensearch.core.RenderSearchTemplateResponse;
import org.opensearch.client.opensearch.core.ScriptsPainlessExecuteRequest;
import org.opensearch.client.opensearch.core.ScriptsPainlessExecuteResponse;
import org.opensearch.client.opensearch.core.ScrollRequest;
import org.opensearch.client.opensearch.core.ScrollResponse;
import org.opensearch.client.opensearch.core.SearchRequest;
import org.opensearch.client.opensearch.core.SearchResponse;
import org.opensearch.client.opensearch.core.SearchShardsRequest;
import org.opensearch.client.opensearch.core.SearchShardsResponse;
import org.opensearch.client.opensearch.core.SearchTemplateRequest;
import org.opensearch.client.opensearch.core.SearchTemplateResponse;
import org.opensearch.client.opensearch.core.UpdateByQueryRequest;
import org.opensearch.client.opensearch.core.UpdateByQueryResponse;
import org.opensearch.client.opensearch.core.UpdateByQueryRethrottleRequest;
import org.opensearch.client.opensearch.core.UpdateByQueryRethrottleResponse;
import org.opensearch.client.opensearch.dangling_indices.OpenSearchDanglingIndicesAsyncClient;
import org.opensearch.client.opensearch.geospatial.OpenSearchGeospatialAsyncClient;
import org.opensearch.client.opensearch.indices.OpenSearchIndicesAsyncClient;
import org.opensearch.client.opensearch.ingest.OpenSearchIngestAsyncClient;
import org.opensearch.client.opensearch.ingestion.OpenSearchIngestionAsyncClient;
import org.opensearch.client.opensearch.ism.OpenSearchIsmAsyncClient;
import org.opensearch.client.opensearch.knn.OpenSearchKnnAsyncClient;
import org.opensearch.client.opensearch.ltr.OpenSearchLtrAsyncClient;
import org.opensearch.client.opensearch.ml.OpenSearchMlAsyncClient;
import org.opensearch.client.opensearch.nodes.OpenSearchNodesAsyncClient;
import org.opensearch.client.opensearch.search_pipeline.OpenSearchSearchPipelineAsyncClient;
import org.opensearch.client.opensearch.search_relevance.OpenSearchSearchRelevanceAsyncClient;
import org.opensearch.client.opensearch.security.OpenSearchSecurityAsyncClient;
import org.opensearch.client.opensearch.snapshot.OpenSearchSnapshotAsyncClient;
import org.opensearch.client.opensearch.tasks.OpenSearchTasksAsyncClient;
import org.opensearch.client.opensearch.ubi.OpenSearchUbiAsyncClient;
import org.opensearch.client.opensearch.ultrawarm.OpenSearchUltrawarmAsyncClient;
import org.opensearch.client.transport.JsonEndpoint;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.transport.endpoints.BooleanResponse;
import org.opensearch.client.transport.endpoints.EndpointWithResponseMapperAttr;
import org.opensearch.client.util.ObjectBuilder;

/**
 * Client for the namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public abstract class OpenSearchAsyncClientBase<Self extends OpenSearchAsyncClientBase<Self>> extends ApiClient<OpenSearchTransport, Self> {
    public OpenSearchAsyncClientBase(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    // ----- Child clients

    public OpenSearchCatAsyncClient cat() {
        return new OpenSearchCatAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchClusterAsyncClient cluster() {
        return new OpenSearchClusterAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchDanglingIndicesAsyncClient danglingIndices() {
        return new OpenSearchDanglingIndicesAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchGeospatialAsyncClient geospatial() {
        return new OpenSearchGeospatialAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchIndicesAsyncClient indices() {
        return new OpenSearchIndicesAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchIngestAsyncClient ingest() {
        return new OpenSearchIngestAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchIngestionAsyncClient ingestion() {
        return new OpenSearchIngestionAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchIsmAsyncClient ism() {
        return new OpenSearchIsmAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchKnnAsyncClient knn() {
        return new OpenSearchKnnAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchLtrAsyncClient ltr() {
        return new OpenSearchLtrAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchMlAsyncClient ml() {
        return new OpenSearchMlAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchNodesAsyncClient nodes() {
        return new OpenSearchNodesAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchSearchPipelineAsyncClient searchPipeline() {
        return new OpenSearchSearchPipelineAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchSearchRelevanceAsyncClient searchRelevance() {
        return new OpenSearchSearchRelevanceAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchSecurityAsyncClient security() {
        return new OpenSearchSecurityAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchSnapshotAsyncClient snapshot() {
        return new OpenSearchSnapshotAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchTasksAsyncClient tasks() {
        return new OpenSearchTasksAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchUbiAsyncClient ubi() {
        return new OpenSearchUbiAsyncClient(this.transport, this.transportOptions);
    }

    public OpenSearchUltrawarmAsyncClient ultrawarm() {
        return new OpenSearchUltrawarmAsyncClient(this.transport, this.transportOptions);
    }

    // ----- Endpoint: clear_scroll

    /**
     * Explicitly clears the search context for a scroll.
     */
    public CompletableFuture<ClearScrollResponse> clearScroll(ClearScrollRequest request) throws IOException, OpenSearchException {
        return clearScroll(request, ApiType.OSS);
    }

    /**
     * Explicitly clears the search context for a scroll.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ClearScrollResponse> clearScroll(ClearScrollRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "clear_scroll", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ClearScrollRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Explicitly clears the search context for a scroll.
     *
     * @param fn a function that initializes a builder to create the {@link ClearScrollRequest}
     */
    public final CompletableFuture<ClearScrollResponse> clearScroll(
        Function<ClearScrollRequest.Builder, ObjectBuilder<ClearScrollRequest>> fn
    ) throws IOException, OpenSearchException {
        return clearScroll(fn, ApiType.OSS);
    }

    /**
     * Explicitly clears the search context for a scroll.
     *
     * @param fn   a function that initializes a builder to create the {@link ClearScrollRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ClearScrollResponse> clearScroll(
        Function<ClearScrollRequest.Builder, ObjectBuilder<ClearScrollRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return clearScroll(fn.apply(new ClearScrollRequest.Builder()).build(), type);
    }

    /**
     * Explicitly clears the search context for a scroll.
     */
    public final CompletableFuture<ClearScrollResponse> clearScroll() throws IOException, OpenSearchException {
        return clearScroll(ApiType.OSS);
    }

    /**
     * Explicitly clears the search context for a scroll.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ClearScrollResponse> clearScroll(ApiType type) throws IOException, OpenSearchException {
        return clearScroll(new ClearScrollRequest.Builder().build(), type);
    }

    // ----- Endpoint: count

    /**
     * Returns number of documents matching a query.
     */
    public CompletableFuture<CountResponse> count(CountRequest request) throws IOException, OpenSearchException {
        return count(request, ApiType.OSS);
    }

    /**
     * Returns number of documents matching a query.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CountResponse> count(CountRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "count", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CountRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns number of documents matching a query.
     *
     * @param fn a function that initializes a builder to create the {@link CountRequest}
     */
    public final CompletableFuture<CountResponse> count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn) throws IOException,
        OpenSearchException {
        return count(fn, ApiType.OSS);
    }

    /**
     * Returns number of documents matching a query.
     *
     * @param fn   a function that initializes a builder to create the {@link CountRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CountResponse> count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return count(fn.apply(new CountRequest.Builder()).build(), type);
    }

    /**
     * Returns number of documents matching a query.
     */
    public final CompletableFuture<CountResponse> count() throws IOException, OpenSearchException {
        return count(ApiType.OSS);
    }

    /**
     * Returns number of documents matching a query.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CountResponse> count(ApiType type) throws IOException, OpenSearchException {
        return count(new CountRequest.Builder().build(), type);
    }

    // ----- Endpoint: create_pit

    /**
     * Creates point in time context.
     */
    public CompletableFuture<CreatePitResponse> createPit(CreatePitRequest request) throws IOException, OpenSearchException {
        return createPit(request, ApiType.OSS);
    }

    /**
     * Creates point in time context.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreatePitResponse> createPit(CreatePitRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "create_pit", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreatePitRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates point in time context.
     *
     * @param fn a function that initializes a builder to create the {@link CreatePitRequest}
     */
    public final CompletableFuture<CreatePitResponse> createPit(Function<CreatePitRequest.Builder, ObjectBuilder<CreatePitRequest>> fn)
        throws IOException, OpenSearchException {
        return createPit(fn, ApiType.OSS);
    }

    /**
     * Creates point in time context.
     *
     * @param fn   a function that initializes a builder to create the {@link CreatePitRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreatePitResponse> createPit(
        Function<CreatePitRequest.Builder, ObjectBuilder<CreatePitRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createPit(fn.apply(new CreatePitRequest.Builder()).build(), type);
    }

    // ----- Endpoint: delete

    /**
     * Removes a document from the index.
     */
    public CompletableFuture<DeleteResponse> delete(DeleteRequest request) throws IOException, OpenSearchException {
        return delete(request, ApiType.OSS);
    }

    /**
     * Removes a document from the index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteResponse> delete(DeleteRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "delete", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Removes a document from the index.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteRequest}
     */
    public final CompletableFuture<DeleteResponse> delete(Function<DeleteRequest.Builder, ObjectBuilder<DeleteRequest>> fn)
        throws IOException, OpenSearchException {
        return delete(fn, ApiType.OSS);
    }

    /**
     * Removes a document from the index.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteResponse> delete(Function<DeleteRequest.Builder, ObjectBuilder<DeleteRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return delete(fn.apply(new DeleteRequest.Builder()).build(), type);
    }

    // ----- Endpoint: delete_all_pits

    /**
     * Deletes all active point in time searches.
     */
    public CompletableFuture<DeleteAllPitsResponse> deleteAllPits(DeleteAllPitsRequest request) throws IOException, OpenSearchException {
        return deleteAllPits(request, ApiType.OSS);
    }

    /**
     * Deletes all active point in time searches.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteAllPitsResponse> deleteAllPits(DeleteAllPitsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "delete_all_pits", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteAllPitsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes all active point in time searches.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteAllPitsRequest}
     */
    public final CompletableFuture<DeleteAllPitsResponse> deleteAllPits(
        Function<DeleteAllPitsRequest.Builder, ObjectBuilder<DeleteAllPitsRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteAllPits(fn, ApiType.OSS);
    }

    /**
     * Deletes all active point in time searches.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteAllPitsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteAllPitsResponse> deleteAllPits(
        Function<DeleteAllPitsRequest.Builder, ObjectBuilder<DeleteAllPitsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteAllPits(fn.apply(new DeleteAllPitsRequest.Builder()).build(), type);
    }

    /**
     * Deletes all active point in time searches.
     */
    public final CompletableFuture<DeleteAllPitsResponse> deleteAllPits() throws IOException, OpenSearchException {
        return deleteAllPits(ApiType.OSS);
    }

    /**
     * Deletes all active point in time searches.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteAllPitsResponse> deleteAllPits(ApiType type) throws IOException, OpenSearchException {
        return deleteAllPits(new DeleteAllPitsRequest.Builder().build(), type);
    }

    // ----- Endpoint: delete_by_query

    /**
     * Deletes documents matching the provided query.
     */
    public CompletableFuture<DeleteByQueryResponse> deleteByQuery(DeleteByQueryRequest request) throws IOException, OpenSearchException {
        return deleteByQuery(request, ApiType.OSS);
    }

    /**
     * Deletes documents matching the provided query.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteByQueryResponse> deleteByQuery(DeleteByQueryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "delete_by_query", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteByQueryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes documents matching the provided query.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteByQueryRequest}
     */
    public final CompletableFuture<DeleteByQueryResponse> deleteByQuery(
        Function<DeleteByQueryRequest.Builder, ObjectBuilder<DeleteByQueryRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteByQuery(fn, ApiType.OSS);
    }

    /**
     * Deletes documents matching the provided query.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteByQueryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteByQueryResponse> deleteByQuery(
        Function<DeleteByQueryRequest.Builder, ObjectBuilder<DeleteByQueryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteByQuery(fn.apply(new DeleteByQueryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: delete_by_query_rethrottle

    /**
     * Changes the number of requests per second for a particular Delete By Query operation.
     */
    public CompletableFuture<DeleteByQueryRethrottleResponse> deleteByQueryRethrottle(DeleteByQueryRethrottleRequest request)
        throws IOException, OpenSearchException {
        return deleteByQueryRethrottle(request, ApiType.OSS);
    }

    /**
     * Changes the number of requests per second for a particular Delete By Query operation.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteByQueryRethrottleResponse> deleteByQueryRethrottle(DeleteByQueryRethrottleRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "delete_by_query_rethrottle", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteByQueryRethrottleRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Changes the number of requests per second for a particular Delete By Query operation.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteByQueryRethrottleRequest}
     */
    public final CompletableFuture<DeleteByQueryRethrottleResponse> deleteByQueryRethrottle(
        Function<DeleteByQueryRethrottleRequest.Builder, ObjectBuilder<DeleteByQueryRethrottleRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteByQueryRethrottle(fn, ApiType.OSS);
    }

    /**
     * Changes the number of requests per second for a particular Delete By Query operation.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteByQueryRethrottleRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteByQueryRethrottleResponse> deleteByQueryRethrottle(
        Function<DeleteByQueryRethrottleRequest.Builder, ObjectBuilder<DeleteByQueryRethrottleRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteByQueryRethrottle(fn.apply(new DeleteByQueryRethrottleRequest.Builder()).build(), type);
    }

    // ----- Endpoint: delete_pit

    /**
     * Deletes one or more point in time searches based on the IDs passed.
     */
    public CompletableFuture<DeletePitResponse> deletePit(DeletePitRequest request) throws IOException, OpenSearchException {
        return deletePit(request, ApiType.OSS);
    }

    /**
     * Deletes one or more point in time searches based on the IDs passed.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeletePitResponse> deletePit(DeletePitRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "delete_pit", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeletePitRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes one or more point in time searches based on the IDs passed.
     *
     * @param fn a function that initializes a builder to create the {@link DeletePitRequest}
     */
    public final CompletableFuture<DeletePitResponse> deletePit(Function<DeletePitRequest.Builder, ObjectBuilder<DeletePitRequest>> fn)
        throws IOException, OpenSearchException {
        return deletePit(fn, ApiType.OSS);
    }

    /**
     * Deletes one or more point in time searches based on the IDs passed.
     *
     * @param fn   a function that initializes a builder to create the {@link DeletePitRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeletePitResponse> deletePit(
        Function<DeletePitRequest.Builder, ObjectBuilder<DeletePitRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deletePit(fn.apply(new DeletePitRequest.Builder()).build(), type);
    }

    // ----- Endpoint: delete_script

    /**
     * Deletes a script.
     */
    public CompletableFuture<DeleteScriptResponse> deleteScript(DeleteScriptRequest request) throws IOException, OpenSearchException {
        return deleteScript(request, ApiType.OSS);
    }

    /**
     * Deletes a script.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteScriptResponse> deleteScript(DeleteScriptRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "delete_script", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteScriptRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a script.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteScriptRequest}
     */
    public final CompletableFuture<DeleteScriptResponse> deleteScript(
        Function<DeleteScriptRequest.Builder, ObjectBuilder<DeleteScriptRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteScript(fn, ApiType.OSS);
    }

    /**
     * Deletes a script.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteScriptRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteScriptResponse> deleteScript(
        Function<DeleteScriptRequest.Builder, ObjectBuilder<DeleteScriptRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteScript(fn.apply(new DeleteScriptRequest.Builder()).build(), type);
    }

    // ----- Endpoint: exists

    /**
     * Returns information about whether a document exists in an index.
     */
    public CompletableFuture<BooleanResponse> exists(ExistsRequest request) throws IOException, OpenSearchException {
        return exists(request, ApiType.OSS);
    }

    /**
     * Returns information about whether a document exists in an index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<BooleanResponse> exists(ExistsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "exists", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ExistsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about whether a document exists in an index.
     *
     * @param fn a function that initializes a builder to create the {@link ExistsRequest}
     */
    public final CompletableFuture<BooleanResponse> exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn)
        throws IOException, OpenSearchException {
        return exists(fn, ApiType.OSS);
    }

    /**
     * Returns information about whether a document exists in an index.
     *
     * @param fn   a function that initializes a builder to create the {@link ExistsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<BooleanResponse> exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return exists(fn.apply(new ExistsRequest.Builder()).build(), type);
    }

    // ----- Endpoint: exists_source

    /**
     * Returns information about whether a document source exists in an index.
     */
    public CompletableFuture<BooleanResponse> existsSource(ExistsSourceRequest request) throws IOException, OpenSearchException {
        return existsSource(request, ApiType.OSS);
    }

    /**
     * Returns information about whether a document source exists in an index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<BooleanResponse> existsSource(ExistsSourceRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "exists_source", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ExistsSourceRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about whether a document source exists in an index.
     *
     * @param fn a function that initializes a builder to create the {@link ExistsSourceRequest}
     */
    public final CompletableFuture<BooleanResponse> existsSource(
        Function<ExistsSourceRequest.Builder, ObjectBuilder<ExistsSourceRequest>> fn
    ) throws IOException, OpenSearchException {
        return existsSource(fn, ApiType.OSS);
    }

    /**
     * Returns information about whether a document source exists in an index.
     *
     * @param fn   a function that initializes a builder to create the {@link ExistsSourceRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<BooleanResponse> existsSource(
        Function<ExistsSourceRequest.Builder, ObjectBuilder<ExistsSourceRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return existsSource(fn.apply(new ExistsSourceRequest.Builder()).build(), type);
    }

    // ----- Endpoint: explain

    /**
     * Returns information about why a specific document matches (or doesn't match) a query.
     */
    public <TDocument> CompletableFuture<ExplainResponse<TDocument>> explain(ExplainRequest request, Class<TDocument> tDocumentClass)
        throws IOException, OpenSearchException {
        return explain(request, tDocumentClass, ApiType.OSS);
    }

    /**
     * Returns information about why a specific document matches (or doesn't match) a query.
     *
     * @param type target OpenSearch API distribution
     */
    public <TDocument> CompletableFuture<ExplainResponse<TDocument>> explain(
        ExplainRequest request,
        Class<TDocument> tDocumentClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "explain", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        @SuppressWarnings("unchecked")
        JsonEndpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<
            ExplainRequest,
            ExplainResponse<TDocument>,
            ErrorResponse>) ExplainRequest._ENDPOINT;
        endpoint = new EndpointWithResponseMapperAttr<>(
            endpoint,
            "org.opensearch.client:Deserializer:_global.explain.TDocument",
            getDeserializer(tDocumentClass)
        );

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Returns information about why a specific document matches (or doesn't match) a query.
     *
     * @param fn a function that initializes a builder to create the {@link ExplainRequest}
     */
    public final <TDocument> CompletableFuture<ExplainResponse<TDocument>> explain(
        Function<ExplainRequest.Builder, ObjectBuilder<ExplainRequest>> fn,
        Class<TDocument> tDocumentClass
    ) throws IOException, OpenSearchException {
        return explain(fn, tDocumentClass, ApiType.OSS);
    }

    /**
     * Returns information about why a specific document matches (or doesn't match) a query.
     *
     * @param fn   a function that initializes a builder to create the {@link ExplainRequest}
     * @param type target OpenSearch API distribution
     */
    public final <TDocument> CompletableFuture<ExplainResponse<TDocument>> explain(
        Function<ExplainRequest.Builder, ObjectBuilder<ExplainRequest>> fn,
        Class<TDocument> tDocumentClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        return explain(fn.apply(new ExplainRequest.Builder()).build(), tDocumentClass, type);
    }

    // ----- Endpoint: field_caps

    /**
     * Returns the information about the capabilities of fields among multiple indexes.
     */
    public CompletableFuture<FieldCapsResponse> fieldCaps(FieldCapsRequest request) throws IOException, OpenSearchException {
        return fieldCaps(request, ApiType.OSS);
    }

    /**
     * Returns the information about the capabilities of fields among multiple indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<FieldCapsResponse> fieldCaps(FieldCapsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "field_caps", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, FieldCapsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns the information about the capabilities of fields among multiple indexes.
     *
     * @param fn a function that initializes a builder to create the {@link FieldCapsRequest}
     */
    public final CompletableFuture<FieldCapsResponse> fieldCaps(Function<FieldCapsRequest.Builder, ObjectBuilder<FieldCapsRequest>> fn)
        throws IOException, OpenSearchException {
        return fieldCaps(fn, ApiType.OSS);
    }

    /**
     * Returns the information about the capabilities of fields among multiple indexes.
     *
     * @param fn   a function that initializes a builder to create the {@link FieldCapsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<FieldCapsResponse> fieldCaps(
        Function<FieldCapsRequest.Builder, ObjectBuilder<FieldCapsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return fieldCaps(fn.apply(new FieldCapsRequest.Builder()).build(), type);
    }

    /**
     * Returns the information about the capabilities of fields among multiple indexes.
     */
    public final CompletableFuture<FieldCapsResponse> fieldCaps() throws IOException, OpenSearchException {
        return fieldCaps(ApiType.OSS);
    }

    /**
     * Returns the information about the capabilities of fields among multiple indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<FieldCapsResponse> fieldCaps(ApiType type) throws IOException, OpenSearchException {
        return fieldCaps(new FieldCapsRequest.Builder().build(), type);
    }

    // ----- Endpoint: get

    /**
     * Returns a document.
     */
    public <TDocument> CompletableFuture<GetResponse<TDocument>> get(GetRequest request, Class<TDocument> tDocumentClass)
        throws IOException, OpenSearchException {
        return get(request, tDocumentClass, ApiType.OSS);
    }

    /**
     * Returns a document.
     *
     * @param type target OpenSearch API distribution
     */
    public <TDocument> CompletableFuture<GetResponse<TDocument>> get(GetRequest request, Class<TDocument> tDocumentClass, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "get", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        @SuppressWarnings("unchecked")
        JsonEndpoint<GetRequest, GetResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<
            GetRequest,
            GetResponse<TDocument>,
            ErrorResponse>) GetRequest._ENDPOINT;
        endpoint = new EndpointWithResponseMapperAttr<>(
            endpoint,
            "org.opensearch.client:Deserializer:_global.get.TDocument",
            getDeserializer(tDocumentClass)
        );

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Returns a document.
     *
     * @param fn a function that initializes a builder to create the {@link GetRequest}
     */
    public final <TDocument> CompletableFuture<GetResponse<TDocument>> get(
        Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn,
        Class<TDocument> tDocumentClass
    ) throws IOException, OpenSearchException {
        return get(fn, tDocumentClass, ApiType.OSS);
    }

    /**
     * Returns a document.
     *
     * @param fn   a function that initializes a builder to create the {@link GetRequest}
     * @param type target OpenSearch API distribution
     */
    public final <TDocument> CompletableFuture<GetResponse<TDocument>> get(
        Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn,
        Class<TDocument> tDocumentClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        return get(fn.apply(new GetRequest.Builder()).build(), tDocumentClass, type);
    }

    // ----- Endpoint: get_all_pits

    /**
     * Lists all active point in time searches.
     */
    public CompletableFuture<GetAllPitsResponse> getAllPits(GetAllPitsRequest request) throws IOException, OpenSearchException {
        return getAllPits(request, ApiType.OSS);
    }

    /**
     * Lists all active point in time searches.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetAllPitsResponse> getAllPits(GetAllPitsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "get_all_pits", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetAllPitsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists all active point in time searches.
     *
     * @param fn a function that initializes a builder to create the {@link GetAllPitsRequest}
     */
    public final CompletableFuture<GetAllPitsResponse> getAllPits(Function<GetAllPitsRequest.Builder, ObjectBuilder<GetAllPitsRequest>> fn)
        throws IOException, OpenSearchException {
        return getAllPits(fn, ApiType.OSS);
    }

    /**
     * Lists all active point in time searches.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAllPitsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAllPitsResponse> getAllPits(
        Function<GetAllPitsRequest.Builder, ObjectBuilder<GetAllPitsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAllPits(fn.apply(new GetAllPitsRequest.Builder()).build(), type);
    }

    /**
     * Lists all active point in time searches.
     */
    public final CompletableFuture<GetAllPitsResponse> getAllPits() throws IOException, OpenSearchException {
        return getAllPits(ApiType.OSS);
    }

    /**
     * Lists all active point in time searches.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAllPitsResponse> getAllPits(ApiType type) throws IOException, OpenSearchException {
        return getAllPits(new GetAllPitsRequest.Builder().build(), type);
    }

    // ----- Endpoint: get_script

    /**
     * Returns a script.
     */
    public CompletableFuture<GetScriptResponse> getScript(GetScriptRequest request) throws IOException, OpenSearchException {
        return getScript(request, ApiType.OSS);
    }

    /**
     * Returns a script.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetScriptResponse> getScript(GetScriptRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "get_script", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetScriptRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns a script.
     *
     * @param fn a function that initializes a builder to create the {@link GetScriptRequest}
     */
    public final CompletableFuture<GetScriptResponse> getScript(Function<GetScriptRequest.Builder, ObjectBuilder<GetScriptRequest>> fn)
        throws IOException, OpenSearchException {
        return getScript(fn, ApiType.OSS);
    }

    /**
     * Returns a script.
     *
     * @param fn   a function that initializes a builder to create the {@link GetScriptRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetScriptResponse> getScript(
        Function<GetScriptRequest.Builder, ObjectBuilder<GetScriptRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getScript(fn.apply(new GetScriptRequest.Builder()).build(), type);
    }

    // ----- Endpoint: get_script_context

    /**
     * Returns all script contexts.
     */
    public CompletableFuture<GetScriptContextResponse> getScriptContext(GetScriptContextRequest request) throws IOException,
        OpenSearchException {
        return getScriptContext(request, ApiType.OSS);
    }

    /**
     * Returns all script contexts.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetScriptContextResponse> getScriptContext(GetScriptContextRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "get_script_context", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetScriptContextRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns all script contexts.
     *
     * @param fn a function that initializes a builder to create the {@link GetScriptContextRequest}
     */
    public final CompletableFuture<GetScriptContextResponse> getScriptContext(
        Function<GetScriptContextRequest.Builder, ObjectBuilder<GetScriptContextRequest>> fn
    ) throws IOException, OpenSearchException {
        return getScriptContext(fn, ApiType.OSS);
    }

    /**
     * Returns all script contexts.
     *
     * @param fn   a function that initializes a builder to create the {@link GetScriptContextRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetScriptContextResponse> getScriptContext(
        Function<GetScriptContextRequest.Builder, ObjectBuilder<GetScriptContextRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getScriptContext(fn.apply(new GetScriptContextRequest.Builder()).build(), type);
    }

    /**
     * Returns all script contexts.
     */
    public final CompletableFuture<GetScriptContextResponse> getScriptContext() throws IOException, OpenSearchException {
        return getScriptContext(ApiType.OSS);
    }

    /**
     * Returns all script contexts.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetScriptContextResponse> getScriptContext(ApiType type) throws IOException, OpenSearchException {
        return getScriptContext(new GetScriptContextRequest.Builder().build(), type);
    }

    // ----- Endpoint: get_script_languages

    /**
     * Returns available script types, languages and contexts.
     */
    public CompletableFuture<GetScriptLanguagesResponse> getScriptLanguages(GetScriptLanguagesRequest request) throws IOException,
        OpenSearchException {
        return getScriptLanguages(request, ApiType.OSS);
    }

    /**
     * Returns available script types, languages and contexts.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetScriptLanguagesResponse> getScriptLanguages(GetScriptLanguagesRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "get_script_languages", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetScriptLanguagesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns available script types, languages and contexts.
     *
     * @param fn a function that initializes a builder to create the {@link GetScriptLanguagesRequest}
     */
    public final CompletableFuture<GetScriptLanguagesResponse> getScriptLanguages(
        Function<GetScriptLanguagesRequest.Builder, ObjectBuilder<GetScriptLanguagesRequest>> fn
    ) throws IOException, OpenSearchException {
        return getScriptLanguages(fn, ApiType.OSS);
    }

    /**
     * Returns available script types, languages and contexts.
     *
     * @param fn   a function that initializes a builder to create the {@link GetScriptLanguagesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetScriptLanguagesResponse> getScriptLanguages(
        Function<GetScriptLanguagesRequest.Builder, ObjectBuilder<GetScriptLanguagesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getScriptLanguages(fn.apply(new GetScriptLanguagesRequest.Builder()).build(), type);
    }

    /**
     * Returns available script types, languages and contexts.
     */
    public final CompletableFuture<GetScriptLanguagesResponse> getScriptLanguages() throws IOException, OpenSearchException {
        return getScriptLanguages(ApiType.OSS);
    }

    /**
     * Returns available script types, languages and contexts.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetScriptLanguagesResponse> getScriptLanguages(ApiType type) throws IOException, OpenSearchException {
        return getScriptLanguages(new GetScriptLanguagesRequest.Builder().build(), type);
    }

    // ----- Endpoint: get_source

    /**
     * Returns the source of a document.
     */
    public <TDocument> CompletableFuture<GetSourceResponse<TDocument>> getSource(GetSourceRequest request, Class<TDocument> tDocumentClass)
        throws IOException, OpenSearchException {
        return getSource(request, tDocumentClass, ApiType.OSS);
    }

    /**
     * Returns the source of a document.
     *
     * @param type target OpenSearch API distribution
     */
    public <TDocument> CompletableFuture<GetSourceResponse<TDocument>> getSource(
        GetSourceRequest request,
        Class<TDocument> tDocumentClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "get_source", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        @SuppressWarnings("unchecked")
        JsonEndpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<
            GetSourceRequest,
            GetSourceResponse<TDocument>,
            ErrorResponse>) GetSourceRequest._ENDPOINT;
        endpoint = new EndpointWithResponseMapperAttr<>(
            endpoint,
            "org.opensearch.client:Deserializer:_global.get_source.TDocument",
            getDeserializer(tDocumentClass)
        );

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Returns the source of a document.
     *
     * @param fn a function that initializes a builder to create the {@link GetSourceRequest}
     */
    public final <TDocument> CompletableFuture<GetSourceResponse<TDocument>> getSource(
        Function<GetSourceRequest.Builder, ObjectBuilder<GetSourceRequest>> fn,
        Class<TDocument> tDocumentClass
    ) throws IOException, OpenSearchException {
        return getSource(fn, tDocumentClass, ApiType.OSS);
    }

    /**
     * Returns the source of a document.
     *
     * @param fn   a function that initializes a builder to create the {@link GetSourceRequest}
     * @param type target OpenSearch API distribution
     */
    public final <TDocument> CompletableFuture<GetSourceResponse<TDocument>> getSource(
        Function<GetSourceRequest.Builder, ObjectBuilder<GetSourceRequest>> fn,
        Class<TDocument> tDocumentClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getSource(fn.apply(new GetSourceRequest.Builder()).build(), tDocumentClass, type);
    }

    // ----- Endpoint: info

    /**
     * Returns basic information about the cluster.
     */
    public CompletableFuture<InfoResponse> info(InfoRequest request) throws IOException, OpenSearchException {
        return info(request, ApiType.OSS);
    }

    /**
     * Returns basic information about the cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<InfoResponse> info(InfoRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "info", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, InfoRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns basic information about the cluster.
     *
     * @param fn a function that initializes a builder to create the {@link InfoRequest}
     */
    public final CompletableFuture<InfoResponse> info(Function<InfoRequest.Builder, ObjectBuilder<InfoRequest>> fn) throws IOException,
        OpenSearchException {
        return info(fn, ApiType.OSS);
    }

    /**
     * Returns basic information about the cluster.
     *
     * @param fn   a function that initializes a builder to create the {@link InfoRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<InfoResponse> info(Function<InfoRequest.Builder, ObjectBuilder<InfoRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return info(fn.apply(new InfoRequest.Builder()).build(), type);
    }

    /**
     * Returns basic information about the cluster.
     */
    public final CompletableFuture<InfoResponse> info() throws IOException, OpenSearchException {
        return info(ApiType.OSS);
    }

    /**
     * Returns basic information about the cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<InfoResponse> info(ApiType type) throws IOException, OpenSearchException {
        return info(new InfoRequest.Builder().build(), type);
    }

    // ----- Endpoint: mtermvectors

    /**
     * Returns multiple termvectors in one request.
     */
    public CompletableFuture<MtermvectorsResponse> mtermvectors(MtermvectorsRequest request) throws IOException, OpenSearchException {
        return mtermvectors(request, ApiType.OSS);
    }

    /**
     * Returns multiple termvectors in one request.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<MtermvectorsResponse> mtermvectors(MtermvectorsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "mtermvectors", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, MtermvectorsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns multiple termvectors in one request.
     *
     * @param fn a function that initializes a builder to create the {@link MtermvectorsRequest}
     */
    public final CompletableFuture<MtermvectorsResponse> mtermvectors(
        Function<MtermvectorsRequest.Builder, ObjectBuilder<MtermvectorsRequest>> fn
    ) throws IOException, OpenSearchException {
        return mtermvectors(fn, ApiType.OSS);
    }

    /**
     * Returns multiple termvectors in one request.
     *
     * @param fn   a function that initializes a builder to create the {@link MtermvectorsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<MtermvectorsResponse> mtermvectors(
        Function<MtermvectorsRequest.Builder, ObjectBuilder<MtermvectorsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return mtermvectors(fn.apply(new MtermvectorsRequest.Builder()).build(), type);
    }

    /**
     * Returns multiple termvectors in one request.
     */
    public final CompletableFuture<MtermvectorsResponse> mtermvectors() throws IOException, OpenSearchException {
        return mtermvectors(ApiType.OSS);
    }

    /**
     * Returns multiple termvectors in one request.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<MtermvectorsResponse> mtermvectors(ApiType type) throws IOException, OpenSearchException {
        return mtermvectors(new MtermvectorsRequest.Builder().build(), type);
    }

    // ----- Endpoint: ping

    /**
     * Returns whether the cluster is running.
     */
    public CompletableFuture<BooleanResponse> ping(PingRequest request) throws IOException, OpenSearchException {
        return ping(request, ApiType.OSS);
    }

    /**
     * Returns whether the cluster is running.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<BooleanResponse> ping(PingRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ping", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, PingRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns whether the cluster is running.
     *
     * @param fn a function that initializes a builder to create the {@link PingRequest}
     */
    public final CompletableFuture<BooleanResponse> ping(Function<PingRequest.Builder, ObjectBuilder<PingRequest>> fn) throws IOException,
        OpenSearchException {
        return ping(fn, ApiType.OSS);
    }

    /**
     * Returns whether the cluster is running.
     *
     * @param fn   a function that initializes a builder to create the {@link PingRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<BooleanResponse> ping(Function<PingRequest.Builder, ObjectBuilder<PingRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return ping(fn.apply(new PingRequest.Builder()).build(), type);
    }

    /**
     * Returns whether the cluster is running.
     */
    public final CompletableFuture<BooleanResponse> ping() throws IOException, OpenSearchException {
        return ping(ApiType.OSS);
    }

    /**
     * Returns whether the cluster is running.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<BooleanResponse> ping(ApiType type) throws IOException, OpenSearchException {
        return ping(new PingRequest.Builder().build(), type);
    }

    // ----- Endpoint: put_script

    /**
     * Creates or updates a script.
     */
    public CompletableFuture<PutScriptResponse> putScript(PutScriptRequest request) throws IOException, OpenSearchException {
        return putScript(request, ApiType.OSS);
    }

    /**
     * Creates or updates a script.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PutScriptResponse> putScript(PutScriptRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "put_script", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, PutScriptRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates a script.
     *
     * @param fn a function that initializes a builder to create the {@link PutScriptRequest}
     */
    public final CompletableFuture<PutScriptResponse> putScript(Function<PutScriptRequest.Builder, ObjectBuilder<PutScriptRequest>> fn)
        throws IOException, OpenSearchException {
        return putScript(fn, ApiType.OSS);
    }

    /**
     * Creates or updates a script.
     *
     * @param fn   a function that initializes a builder to create the {@link PutScriptRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PutScriptResponse> putScript(
        Function<PutScriptRequest.Builder, ObjectBuilder<PutScriptRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return putScript(fn.apply(new PutScriptRequest.Builder()).build(), type);
    }

    // ----- Endpoint: rank_eval

    /**
     * Allows to evaluate the quality of ranked search results over a set of typical search queries.
     */
    public CompletableFuture<RankEvalResponse> rankEval(RankEvalRequest request) throws IOException, OpenSearchException {
        return rankEval(request, ApiType.OSS);
    }

    /**
     * Allows to evaluate the quality of ranked search results over a set of typical search queries.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<RankEvalResponse> rankEval(RankEvalRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "rank_eval", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, RankEvalRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Allows to evaluate the quality of ranked search results over a set of typical search queries.
     *
     * @param fn a function that initializes a builder to create the {@link RankEvalRequest}
     */
    public final CompletableFuture<RankEvalResponse> rankEval(Function<RankEvalRequest.Builder, ObjectBuilder<RankEvalRequest>> fn)
        throws IOException, OpenSearchException {
        return rankEval(fn, ApiType.OSS);
    }

    /**
     * Allows to evaluate the quality of ranked search results over a set of typical search queries.
     *
     * @param fn   a function that initializes a builder to create the {@link RankEvalRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RankEvalResponse> rankEval(
        Function<RankEvalRequest.Builder, ObjectBuilder<RankEvalRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return rankEval(fn.apply(new RankEvalRequest.Builder()).build(), type);
    }

    // ----- Endpoint: reindex

    /**
     * Allows to copy documents from one index to another, optionally filtering the source documents by a query, changing the destination
     * index settings, or fetching the documents from a remote cluster.
     */
    public CompletableFuture<ReindexResponse> reindex(ReindexRequest request) throws IOException, OpenSearchException {
        return reindex(request, ApiType.OSS);
    }

    /**
     * Allows to copy documents from one index to another, optionally filtering the source documents by a query, changing the destination
     * index settings, or fetching the documents from a remote cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ReindexResponse> reindex(ReindexRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "reindex", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ReindexRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Allows to copy documents from one index to another, optionally filtering the source documents by a query, changing the destination
     * index settings, or fetching the documents from a remote cluster.
     *
     * @param fn a function that initializes a builder to create the {@link ReindexRequest}
     */
    public final CompletableFuture<ReindexResponse> reindex(Function<ReindexRequest.Builder, ObjectBuilder<ReindexRequest>> fn)
        throws IOException, OpenSearchException {
        return reindex(fn, ApiType.OSS);
    }

    /**
     * Allows to copy documents from one index to another, optionally filtering the source documents by a query, changing the destination
     * index settings, or fetching the documents from a remote cluster.
     *
     * @param fn   a function that initializes a builder to create the {@link ReindexRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ReindexResponse> reindex(
        Function<ReindexRequest.Builder, ObjectBuilder<ReindexRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return reindex(fn.apply(new ReindexRequest.Builder()).build(), type);
    }

    // ----- Endpoint: reindex_rethrottle

    /**
     * Changes the number of requests per second for a particular reindex operation.
     */
    public CompletableFuture<ReindexRethrottleResponse> reindexRethrottle(ReindexRethrottleRequest request) throws IOException,
        OpenSearchException {
        return reindexRethrottle(request, ApiType.OSS);
    }

    /**
     * Changes the number of requests per second for a particular reindex operation.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ReindexRethrottleResponse> reindexRethrottle(ReindexRethrottleRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "reindex_rethrottle", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ReindexRethrottleRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Changes the number of requests per second for a particular reindex operation.
     *
     * @param fn a function that initializes a builder to create the {@link ReindexRethrottleRequest}
     */
    public final CompletableFuture<ReindexRethrottleResponse> reindexRethrottle(
        Function<ReindexRethrottleRequest.Builder, ObjectBuilder<ReindexRethrottleRequest>> fn
    ) throws IOException, OpenSearchException {
        return reindexRethrottle(fn, ApiType.OSS);
    }

    /**
     * Changes the number of requests per second for a particular reindex operation.
     *
     * @param fn   a function that initializes a builder to create the {@link ReindexRethrottleRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ReindexRethrottleResponse> reindexRethrottle(
        Function<ReindexRethrottleRequest.Builder, ObjectBuilder<ReindexRethrottleRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return reindexRethrottle(fn.apply(new ReindexRethrottleRequest.Builder()).build(), type);
    }

    // ----- Endpoint: render_search_template

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     */
    public CompletableFuture<RenderSearchTemplateResponse> renderSearchTemplate(RenderSearchTemplateRequest request) throws IOException,
        OpenSearchException {
        return renderSearchTemplate(request, ApiType.OSS);
    }

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<RenderSearchTemplateResponse> renderSearchTemplate(RenderSearchTemplateRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "render_search_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, RenderSearchTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     *
     * @param fn a function that initializes a builder to create the {@link RenderSearchTemplateRequest}
     */
    public final CompletableFuture<RenderSearchTemplateResponse> renderSearchTemplate(
        Function<RenderSearchTemplateRequest.Builder, ObjectBuilder<RenderSearchTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return renderSearchTemplate(fn, ApiType.OSS);
    }

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     *
     * @param fn   a function that initializes a builder to create the {@link RenderSearchTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RenderSearchTemplateResponse> renderSearchTemplate(
        Function<RenderSearchTemplateRequest.Builder, ObjectBuilder<RenderSearchTemplateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return renderSearchTemplate(fn.apply(new RenderSearchTemplateRequest.Builder()).build(), type);
    }

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     */
    public final CompletableFuture<RenderSearchTemplateResponse> renderSearchTemplate() throws IOException, OpenSearchException {
        return renderSearchTemplate(ApiType.OSS);
    }

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RenderSearchTemplateResponse> renderSearchTemplate(ApiType type) throws IOException,
        OpenSearchException {
        return renderSearchTemplate(new RenderSearchTemplateRequest.Builder().build(), type);
    }

    // ----- Endpoint: scripts_painless_execute

    /**
     * Allows an arbitrary script to be executed and a result to be returned.
     */
    public <TResult> CompletableFuture<ScriptsPainlessExecuteResponse<TResult>> scriptsPainlessExecute(
        ScriptsPainlessExecuteRequest request,
        Class<TResult> tResultClass
    ) throws IOException, OpenSearchException {
        return scriptsPainlessExecute(request, tResultClass, ApiType.OSS);
    }

    /**
     * Allows an arbitrary script to be executed and a result to be returned.
     *
     * @param type target OpenSearch API distribution
     */
    public <TResult> CompletableFuture<ScriptsPainlessExecuteResponse<TResult>> scriptsPainlessExecute(
        ScriptsPainlessExecuteRequest request,
        Class<TResult> tResultClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "scripts_painless_execute", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        @SuppressWarnings("unchecked")
        JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse> endpoint = (JsonEndpoint<
            ScriptsPainlessExecuteRequest,
            ScriptsPainlessExecuteResponse<TResult>,
            ErrorResponse>) ScriptsPainlessExecuteRequest._ENDPOINT;
        endpoint = new EndpointWithResponseMapperAttr<>(
            endpoint,
            "org.opensearch.client:Deserializer:_global.scripts_painless_execute.TResult",
            getDeserializer(tResultClass)
        );

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Allows an arbitrary script to be executed and a result to be returned.
     *
     * @param fn a function that initializes a builder to create the {@link ScriptsPainlessExecuteRequest}
     */
    public final <TResult> CompletableFuture<ScriptsPainlessExecuteResponse<TResult>> scriptsPainlessExecute(
        Function<ScriptsPainlessExecuteRequest.Builder, ObjectBuilder<ScriptsPainlessExecuteRequest>> fn,
        Class<TResult> tResultClass
    ) throws IOException, OpenSearchException {
        return scriptsPainlessExecute(fn, tResultClass, ApiType.OSS);
    }

    /**
     * Allows an arbitrary script to be executed and a result to be returned.
     *
     * @param fn   a function that initializes a builder to create the {@link ScriptsPainlessExecuteRequest}
     * @param type target OpenSearch API distribution
     */
    public final <TResult> CompletableFuture<ScriptsPainlessExecuteResponse<TResult>> scriptsPainlessExecute(
        Function<ScriptsPainlessExecuteRequest.Builder, ObjectBuilder<ScriptsPainlessExecuteRequest>> fn,
        Class<TResult> tResultClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        return scriptsPainlessExecute(fn.apply(new ScriptsPainlessExecuteRequest.Builder()).build(), tResultClass, type);
    }

    // ----- Endpoint: scroll

    /**
     * Allows to retrieve a large numbers of results from a single search request.
     */
    public <TDocument> CompletableFuture<ScrollResponse<TDocument>> scroll(ScrollRequest request, Class<TDocument> tDocumentClass)
        throws IOException, OpenSearchException {
        return scroll(request, tDocumentClass, ApiType.OSS);
    }

    /**
     * Allows to retrieve a large numbers of results from a single search request.
     *
     * @param type target OpenSearch API distribution
     */
    public <TDocument> CompletableFuture<ScrollResponse<TDocument>> scroll(
        ScrollRequest request,
        Class<TDocument> tDocumentClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "scroll", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        @SuppressWarnings("unchecked")
        JsonEndpoint<ScrollRequest, ScrollResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<
            ScrollRequest,
            ScrollResponse<TDocument>,
            ErrorResponse>) ScrollRequest._ENDPOINT;
        endpoint = new EndpointWithResponseMapperAttr<>(
            endpoint,
            "org.opensearch.client:Deserializer:_global.scroll.TDocument",
            getDeserializer(tDocumentClass)
        );

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Allows to retrieve a large numbers of results from a single search request.
     *
     * @param fn a function that initializes a builder to create the {@link ScrollRequest}
     */
    public final <TDocument> CompletableFuture<ScrollResponse<TDocument>> scroll(
        Function<ScrollRequest.Builder, ObjectBuilder<ScrollRequest>> fn,
        Class<TDocument> tDocumentClass
    ) throws IOException, OpenSearchException {
        return scroll(fn, tDocumentClass, ApiType.OSS);
    }

    /**
     * Allows to retrieve a large numbers of results from a single search request.
     *
     * @param fn   a function that initializes a builder to create the {@link ScrollRequest}
     * @param type target OpenSearch API distribution
     */
    public final <TDocument> CompletableFuture<ScrollResponse<TDocument>> scroll(
        Function<ScrollRequest.Builder, ObjectBuilder<ScrollRequest>> fn,
        Class<TDocument> tDocumentClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        return scroll(fn.apply(new ScrollRequest.Builder()).build(), tDocumentClass, type);
    }

    // ----- Endpoint: search

    /**
     * Returns results matching a query.
     */
    public <TDocument> CompletableFuture<SearchResponse<TDocument>> search(SearchRequest request, Class<TDocument> tDocumentClass)
        throws IOException, OpenSearchException {
        return search(request, tDocumentClass, ApiType.OSS);
    }

    /**
     * Returns results matching a query.
     *
     * @param type target OpenSearch API distribution
     */
    public <TDocument> CompletableFuture<SearchResponse<TDocument>> search(
        SearchRequest request,
        Class<TDocument> tDocumentClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "search", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        @SuppressWarnings("unchecked")
        JsonEndpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<
            SearchRequest,
            SearchResponse<TDocument>,
            ErrorResponse>) SearchRequest._ENDPOINT;
        endpoint = new EndpointWithResponseMapperAttr<>(
            endpoint,
            "org.opensearch.client:Deserializer:_global.search.TDocument",
            getDeserializer(tDocumentClass)
        );

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Returns results matching a query.
     *
     * @param fn a function that initializes a builder to create the {@link SearchRequest}
     */
    public final <TDocument> CompletableFuture<SearchResponse<TDocument>> search(
        Function<SearchRequest.Builder, ObjectBuilder<SearchRequest>> fn,
        Class<TDocument> tDocumentClass
    ) throws IOException, OpenSearchException {
        return search(fn, tDocumentClass, ApiType.OSS);
    }

    /**
     * Returns results matching a query.
     *
     * @param fn   a function that initializes a builder to create the {@link SearchRequest}
     * @param type target OpenSearch API distribution
     */
    public final <TDocument> CompletableFuture<SearchResponse<TDocument>> search(
        Function<SearchRequest.Builder, ObjectBuilder<SearchRequest>> fn,
        Class<TDocument> tDocumentClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        return search(fn.apply(new SearchRequest.Builder()).build(), tDocumentClass, type);
    }

    // ----- Endpoint: search_shards

    /**
     * Returns information about the indexes and shards that a search request would be executed against.
     */
    public CompletableFuture<SearchShardsResponse> searchShards(SearchShardsRequest request) throws IOException, OpenSearchException {
        return searchShards(request, ApiType.OSS);
    }

    /**
     * Returns information about the indexes and shards that a search request would be executed against.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<SearchShardsResponse> searchShards(SearchShardsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "search_shards", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, SearchShardsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about the indexes and shards that a search request would be executed against.
     *
     * @param fn a function that initializes a builder to create the {@link SearchShardsRequest}
     */
    public final CompletableFuture<SearchShardsResponse> searchShards(
        Function<SearchShardsRequest.Builder, ObjectBuilder<SearchShardsRequest>> fn
    ) throws IOException, OpenSearchException {
        return searchShards(fn, ApiType.OSS);
    }

    /**
     * Returns information about the indexes and shards that a search request would be executed against.
     *
     * @param fn   a function that initializes a builder to create the {@link SearchShardsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SearchShardsResponse> searchShards(
        Function<SearchShardsRequest.Builder, ObjectBuilder<SearchShardsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return searchShards(fn.apply(new SearchShardsRequest.Builder()).build(), type);
    }

    /**
     * Returns information about the indexes and shards that a search request would be executed against.
     */
    public final CompletableFuture<SearchShardsResponse> searchShards() throws IOException, OpenSearchException {
        return searchShards(ApiType.OSS);
    }

    /**
     * Returns information about the indexes and shards that a search request would be executed against.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SearchShardsResponse> searchShards(ApiType type) throws IOException, OpenSearchException {
        return searchShards(new SearchShardsRequest.Builder().build(), type);
    }

    // ----- Endpoint: search_template

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     */
    public <TDocument> CompletableFuture<SearchTemplateResponse<TDocument>> searchTemplate(
        SearchTemplateRequest request,
        Class<TDocument> tDocumentClass
    ) throws IOException, OpenSearchException {
        return searchTemplate(request, tDocumentClass, ApiType.OSS);
    }

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     *
     * @param type target OpenSearch API distribution
     */
    public <TDocument> CompletableFuture<SearchTemplateResponse<TDocument>> searchTemplate(
        SearchTemplateRequest request,
        Class<TDocument> tDocumentClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "search_template", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        @SuppressWarnings("unchecked")
        JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<
            SearchTemplateRequest,
            SearchTemplateResponse<TDocument>,
            ErrorResponse>) SearchTemplateRequest._ENDPOINT;
        endpoint = new EndpointWithResponseMapperAttr<>(
            endpoint,
            "org.opensearch.client:Deserializer:_global.search_template.TDocument",
            getDeserializer(tDocumentClass)
        );

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     *
     * @param fn a function that initializes a builder to create the {@link SearchTemplateRequest}
     */
    public final <TDocument> CompletableFuture<SearchTemplateResponse<TDocument>> searchTemplate(
        Function<SearchTemplateRequest.Builder, ObjectBuilder<SearchTemplateRequest>> fn,
        Class<TDocument> tDocumentClass
    ) throws IOException, OpenSearchException {
        return searchTemplate(fn, tDocumentClass, ApiType.OSS);
    }

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     *
     * @param fn   a function that initializes a builder to create the {@link SearchTemplateRequest}
     * @param type target OpenSearch API distribution
     */
    public final <TDocument> CompletableFuture<SearchTemplateResponse<TDocument>> searchTemplate(
        Function<SearchTemplateRequest.Builder, ObjectBuilder<SearchTemplateRequest>> fn,
        Class<TDocument> tDocumentClass,
        ApiType type
    ) throws IOException, OpenSearchException {
        return searchTemplate(fn.apply(new SearchTemplateRequest.Builder()).build(), tDocumentClass, type);
    }

    // ----- Endpoint: update_by_query

    /**
     * Performs an update on every document in the index without changing the source, for example to pick up a mapping change.
     */
    public CompletableFuture<UpdateByQueryResponse> updateByQuery(UpdateByQueryRequest request) throws IOException, OpenSearchException {
        return updateByQuery(request, ApiType.OSS);
    }

    /**
     * Performs an update on every document in the index without changing the source, for example to pick up a mapping change.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateByQueryResponse> updateByQuery(UpdateByQueryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "update_by_query", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateByQueryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Performs an update on every document in the index without changing the source, for example to pick up a mapping change.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateByQueryRequest}
     */
    public final CompletableFuture<UpdateByQueryResponse> updateByQuery(
        Function<UpdateByQueryRequest.Builder, ObjectBuilder<UpdateByQueryRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateByQuery(fn, ApiType.OSS);
    }

    /**
     * Performs an update on every document in the index without changing the source, for example to pick up a mapping change.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateByQueryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateByQueryResponse> updateByQuery(
        Function<UpdateByQueryRequest.Builder, ObjectBuilder<UpdateByQueryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateByQuery(fn.apply(new UpdateByQueryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: update_by_query_rethrottle

    /**
     * Changes the number of requests per second for a particular Update By Query operation.
     */
    public CompletableFuture<UpdateByQueryRethrottleResponse> updateByQueryRethrottle(UpdateByQueryRethrottleRequest request)
        throws IOException, OpenSearchException {
        return updateByQueryRethrottle(request, ApiType.OSS);
    }

    /**
     * Changes the number of requests per second for a particular Update By Query operation.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateByQueryRethrottleResponse> updateByQueryRethrottle(UpdateByQueryRethrottleRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "update_by_query_rethrottle", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateByQueryRethrottleRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Changes the number of requests per second for a particular Update By Query operation.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateByQueryRethrottleRequest}
     */
    public final CompletableFuture<UpdateByQueryRethrottleResponse> updateByQueryRethrottle(
        Function<UpdateByQueryRethrottleRequest.Builder, ObjectBuilder<UpdateByQueryRethrottleRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateByQueryRethrottle(fn, ApiType.OSS);
    }

    /**
     * Changes the number of requests per second for a particular Update By Query operation.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateByQueryRethrottleRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateByQueryRethrottleResponse> updateByQueryRethrottle(
        Function<UpdateByQueryRethrottleRequest.Builder, ObjectBuilder<UpdateByQueryRethrottleRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateByQueryRethrottle(fn.apply(new UpdateByQueryRethrottleRequest.Builder()).build(), type);
    }
}
