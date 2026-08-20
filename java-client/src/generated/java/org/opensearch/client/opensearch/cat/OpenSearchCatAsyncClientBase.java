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
import org.opensearch.client.opensearch.ApiType;
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
        return aliases(request, ApiType.OSS);
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<AliasesResponse> aliases(AliasesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.aliases", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, AliasesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     *
     * @param fn a function that initializes a builder to create the {@link AliasesRequest}
     */
    public final CompletableFuture<AliasesResponse> aliases(Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn)
        throws IOException, OpenSearchException {
        return aliases(fn, ApiType.OSS);
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     *
     * @param fn   a function that initializes a builder to create the {@link AliasesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AliasesResponse> aliases(
        Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return aliases(fn.apply(new AliasesRequest.Builder()).build(), type);
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     */
    public final CompletableFuture<AliasesResponse> aliases() throws IOException, OpenSearchException {
        return aliases(ApiType.OSS);
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AliasesResponse> aliases(ApiType type) throws IOException, OpenSearchException {
        return aliases(new AliasesRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.all_pit_segments

    /**
     * Lists all active CAT point-in-time segments.
     */
    public CompletableFuture<AllPitSegmentsResponse> allPitSegments(AllPitSegmentsRequest request) throws IOException, OpenSearchException {
        return allPitSegments(request, ApiType.OSS);
    }

    /**
     * Lists all active CAT point-in-time segments.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<AllPitSegmentsResponse> allPitSegments(AllPitSegmentsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "cat.all_pit_segments", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, AllPitSegmentsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists all active CAT point-in-time segments.
     *
     * @param fn a function that initializes a builder to create the {@link AllPitSegmentsRequest}
     */
    public final CompletableFuture<AllPitSegmentsResponse> allPitSegments(
        Function<AllPitSegmentsRequest.Builder, ObjectBuilder<AllPitSegmentsRequest>> fn
    ) throws IOException, OpenSearchException {
        return allPitSegments(fn, ApiType.OSS);
    }

    /**
     * Lists all active CAT point-in-time segments.
     *
     * @param fn   a function that initializes a builder to create the {@link AllPitSegmentsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AllPitSegmentsResponse> allPitSegments(
        Function<AllPitSegmentsRequest.Builder, ObjectBuilder<AllPitSegmentsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return allPitSegments(fn.apply(new AllPitSegmentsRequest.Builder()).build(), type);
    }

    /**
     * Lists all active CAT point-in-time segments.
     */
    public final CompletableFuture<AllPitSegmentsResponse> allPitSegments() throws IOException, OpenSearchException {
        return allPitSegments(ApiType.OSS);
    }

    /**
     * Lists all active CAT point-in-time segments.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AllPitSegmentsResponse> allPitSegments(ApiType type) throws IOException, OpenSearchException {
        return allPitSegments(new AllPitSegmentsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.allocation

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     */
    public CompletableFuture<AllocationResponse> allocation(AllocationRequest request) throws IOException, OpenSearchException {
        return allocation(request, ApiType.OSS);
    }

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<AllocationResponse> allocation(AllocationRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "cat.allocation", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, AllocationRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     *
     * @param fn a function that initializes a builder to create the {@link AllocationRequest}
     */
    public final CompletableFuture<AllocationResponse> allocation(Function<AllocationRequest.Builder, ObjectBuilder<AllocationRequest>> fn)
        throws IOException, OpenSearchException {
        return allocation(fn, ApiType.OSS);
    }

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     *
     * @param fn   a function that initializes a builder to create the {@link AllocationRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AllocationResponse> allocation(
        Function<AllocationRequest.Builder, ObjectBuilder<AllocationRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return allocation(fn.apply(new AllocationRequest.Builder()).build(), type);
    }

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     */
    public final CompletableFuture<AllocationResponse> allocation() throws IOException, OpenSearchException {
        return allocation(ApiType.OSS);
    }

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AllocationResponse> allocation(ApiType type) throws IOException, OpenSearchException {
        return allocation(new AllocationRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.cluster_manager

    /**
     * Returns information about the cluster-manager node.
     */
    public CompletableFuture<ClusterManagerResponse> clusterManager(ClusterManagerRequest request) throws IOException, OpenSearchException {
        return clusterManager(request, ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ClusterManagerResponse> clusterManager(ClusterManagerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "cat.cluster_manager", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ClusterManagerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param fn a function that initializes a builder to create the {@link ClusterManagerRequest}
     */
    public final CompletableFuture<ClusterManagerResponse> clusterManager(
        Function<ClusterManagerRequest.Builder, ObjectBuilder<ClusterManagerRequest>> fn
    ) throws IOException, OpenSearchException {
        return clusterManager(fn, ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param fn   a function that initializes a builder to create the {@link ClusterManagerRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ClusterManagerResponse> clusterManager(
        Function<ClusterManagerRequest.Builder, ObjectBuilder<ClusterManagerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return clusterManager(fn.apply(new ClusterManagerRequest.Builder()).build(), type);
    }

    /**
     * Returns information about the cluster-manager node.
     */
    public final CompletableFuture<ClusterManagerResponse> clusterManager() throws IOException, OpenSearchException {
        return clusterManager(ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ClusterManagerResponse> clusterManager(ApiType type) throws IOException, OpenSearchException {
        return clusterManager(new ClusterManagerRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.count

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     */
    public CompletableFuture<CountResponse> count(CountRequest request) throws IOException, OpenSearchException {
        return count(request, ApiType.OSS);
    }

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CountResponse> count(CountRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.count", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CountRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     *
     * @param fn a function that initializes a builder to create the {@link CountRequest}
     */
    public final CompletableFuture<CountResponse> count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn) throws IOException,
        OpenSearchException {
        return count(fn, ApiType.OSS);
    }

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     *
     * @param fn   a function that initializes a builder to create the {@link CountRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CountResponse> count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return count(fn.apply(new CountRequest.Builder()).build(), type);
    }

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     */
    public final CompletableFuture<CountResponse> count() throws IOException, OpenSearchException {
        return count(ApiType.OSS);
    }

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CountResponse> count(ApiType type) throws IOException, OpenSearchException {
        return count(new CountRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.fielddata

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     */
    public CompletableFuture<FielddataResponse> fielddata(FielddataRequest request) throws IOException, OpenSearchException {
        return fielddata(request, ApiType.OSS);
    }

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<FielddataResponse> fielddata(FielddataRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.fielddata", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, FielddataRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     *
     * @param fn a function that initializes a builder to create the {@link FielddataRequest}
     */
    public final CompletableFuture<FielddataResponse> fielddata(Function<FielddataRequest.Builder, ObjectBuilder<FielddataRequest>> fn)
        throws IOException, OpenSearchException {
        return fielddata(fn, ApiType.OSS);
    }

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     *
     * @param fn   a function that initializes a builder to create the {@link FielddataRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<FielddataResponse> fielddata(
        Function<FielddataRequest.Builder, ObjectBuilder<FielddataRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return fielddata(fn.apply(new FielddataRequest.Builder()).build(), type);
    }

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     */
    public final CompletableFuture<FielddataResponse> fielddata() throws IOException, OpenSearchException {
        return fielddata(ApiType.OSS);
    }

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<FielddataResponse> fielddata(ApiType type) throws IOException, OpenSearchException {
        return fielddata(new FielddataRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.health

    /**
     * Returns a concise representation of the cluster health.
     */
    public CompletableFuture<HealthResponse> health(HealthRequest request) throws IOException, OpenSearchException {
        return health(request, ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster health.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<HealthResponse> health(HealthRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.health", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, HealthRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns a concise representation of the cluster health.
     *
     * @param fn a function that initializes a builder to create the {@link HealthRequest}
     */
    public final CompletableFuture<HealthResponse> health(Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn)
        throws IOException, OpenSearchException {
        return health(fn, ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster health.
     *
     * @param fn   a function that initializes a builder to create the {@link HealthRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<HealthResponse> health(Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return health(fn.apply(new HealthRequest.Builder()).build(), type);
    }

    /**
     * Returns a concise representation of the cluster health.
     */
    public final CompletableFuture<HealthResponse> health() throws IOException, OpenSearchException {
        return health(ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster health.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<HealthResponse> health(ApiType type) throws IOException, OpenSearchException {
        return health(new HealthRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.indices

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     */
    public CompletableFuture<IndicesResponse> indices(IndicesRequest request) throws IOException, OpenSearchException {
        return indices(request, ApiType.OSS);
    }

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<IndicesResponse> indices(IndicesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.indices", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
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
        return indices(fn, ApiType.OSS);
    }

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     *
     * @param fn   a function that initializes a builder to create the {@link IndicesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<IndicesResponse> indices(
        Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return indices(fn.apply(new IndicesRequest.Builder()).build(), type);
    }

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     */
    public final CompletableFuture<IndicesResponse> indices() throws IOException, OpenSearchException {
        return indices(ApiType.OSS);
    }

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<IndicesResponse> indices(ApiType type) throws IOException, OpenSearchException {
        return indices(new IndicesRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.master

    /**
     * Returns information about the cluster-manager node.
     */
    @Deprecated
    public CompletableFuture<MasterResponse> master(MasterRequest request) throws IOException, OpenSearchException {
        return master(request, ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public CompletableFuture<MasterResponse> master(MasterRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.master", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, MasterRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param fn a function that initializes a builder to create the {@link MasterRequest}
     */
    @Deprecated
    public final CompletableFuture<MasterResponse> master(Function<MasterRequest.Builder, ObjectBuilder<MasterRequest>> fn)
        throws IOException, OpenSearchException {
        return master(fn, ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param fn   a function that initializes a builder to create the {@link MasterRequest}
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final CompletableFuture<MasterResponse> master(Function<MasterRequest.Builder, ObjectBuilder<MasterRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return master(fn.apply(new MasterRequest.Builder()).build(), type);
    }

    /**
     * Returns information about the cluster-manager node.
     */
    @Deprecated
    public final CompletableFuture<MasterResponse> master() throws IOException, OpenSearchException {
        return master(ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final CompletableFuture<MasterResponse> master(ApiType type) throws IOException, OpenSearchException {
        return master(new MasterRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.nodeattrs

    /**
     * Returns information about custom node attributes.
     */
    public CompletableFuture<NodeattrsResponse> nodeattrs(NodeattrsRequest request) throws IOException, OpenSearchException {
        return nodeattrs(request, ApiType.OSS);
    }

    /**
     * Returns information about custom node attributes.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<NodeattrsResponse> nodeattrs(NodeattrsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.nodeattrs", ApiType.OSS);
        return this.transport.performRequestAsync(request, NodeattrsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about custom node attributes.
     *
     * @param fn a function that initializes a builder to create the {@link NodeattrsRequest}
     */
    public final CompletableFuture<NodeattrsResponse> nodeattrs(Function<NodeattrsRequest.Builder, ObjectBuilder<NodeattrsRequest>> fn)
        throws IOException, OpenSearchException {
        return nodeattrs(fn, ApiType.OSS);
    }

    /**
     * Returns information about custom node attributes.
     *
     * @param fn   a function that initializes a builder to create the {@link NodeattrsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<NodeattrsResponse> nodeattrs(
        Function<NodeattrsRequest.Builder, ObjectBuilder<NodeattrsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return nodeattrs(fn.apply(new NodeattrsRequest.Builder()).build(), type);
    }

    /**
     * Returns information about custom node attributes.
     */
    public final CompletableFuture<NodeattrsResponse> nodeattrs() throws IOException, OpenSearchException {
        return nodeattrs(ApiType.OSS);
    }

    /**
     * Returns information about custom node attributes.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<NodeattrsResponse> nodeattrs(ApiType type) throws IOException, OpenSearchException {
        return nodeattrs(new NodeattrsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.nodes

    /**
     * Returns basic statistics about the performance of cluster nodes.
     */
    public CompletableFuture<NodesResponse> nodes(NodesRequest request) throws IOException, OpenSearchException {
        return nodes(request, ApiType.OSS);
    }

    /**
     * Returns basic statistics about the performance of cluster nodes.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<NodesResponse> nodes(NodesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.nodes", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, NodesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns basic statistics about the performance of cluster nodes.
     *
     * @param fn a function that initializes a builder to create the {@link NodesRequest}
     */
    public final CompletableFuture<NodesResponse> nodes(Function<NodesRequest.Builder, ObjectBuilder<NodesRequest>> fn) throws IOException,
        OpenSearchException {
        return nodes(fn, ApiType.OSS);
    }

    /**
     * Returns basic statistics about the performance of cluster nodes.
     *
     * @param fn   a function that initializes a builder to create the {@link NodesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<NodesResponse> nodes(Function<NodesRequest.Builder, ObjectBuilder<NodesRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return nodes(fn.apply(new NodesRequest.Builder()).build(), type);
    }

    /**
     * Returns basic statistics about the performance of cluster nodes.
     */
    public final CompletableFuture<NodesResponse> nodes() throws IOException, OpenSearchException {
        return nodes(ApiType.OSS);
    }

    /**
     * Returns basic statistics about the performance of cluster nodes.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<NodesResponse> nodes(ApiType type) throws IOException, OpenSearchException {
        return nodes(new NodesRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.pending_tasks

    /**
     * Returns a concise representation of the cluster's pending tasks.
     */
    public CompletableFuture<PendingTasksResponse> pendingTasks(PendingTasksRequest request) throws IOException, OpenSearchException {
        return pendingTasks(request, ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster's pending tasks.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PendingTasksResponse> pendingTasks(PendingTasksRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "cat.pending_tasks", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, PendingTasksRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns a concise representation of the cluster's pending tasks.
     *
     * @param fn a function that initializes a builder to create the {@link PendingTasksRequest}
     */
    public final CompletableFuture<PendingTasksResponse> pendingTasks(
        Function<PendingTasksRequest.Builder, ObjectBuilder<PendingTasksRequest>> fn
    ) throws IOException, OpenSearchException {
        return pendingTasks(fn, ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster's pending tasks.
     *
     * @param fn   a function that initializes a builder to create the {@link PendingTasksRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PendingTasksResponse> pendingTasks(
        Function<PendingTasksRequest.Builder, ObjectBuilder<PendingTasksRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return pendingTasks(fn.apply(new PendingTasksRequest.Builder()).build(), type);
    }

    /**
     * Returns a concise representation of the cluster's pending tasks.
     */
    public final CompletableFuture<PendingTasksResponse> pendingTasks() throws IOException, OpenSearchException {
        return pendingTasks(ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster's pending tasks.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PendingTasksResponse> pendingTasks(ApiType type) throws IOException, OpenSearchException {
        return pendingTasks(new PendingTasksRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.pit_segments

    /**
     * Lists one or several CAT point-in-time segments.
     */
    public CompletableFuture<PitSegmentsResponse> pitSegments(PitSegmentsRequest request) throws IOException, OpenSearchException {
        return pitSegments(request, ApiType.OSS);
    }

    /**
     * Lists one or several CAT point-in-time segments.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PitSegmentsResponse> pitSegments(PitSegmentsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "cat.pit_segments", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, PitSegmentsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists one or several CAT point-in-time segments.
     *
     * @param fn a function that initializes a builder to create the {@link PitSegmentsRequest}
     */
    public final CompletableFuture<PitSegmentsResponse> pitSegments(
        Function<PitSegmentsRequest.Builder, ObjectBuilder<PitSegmentsRequest>> fn
    ) throws IOException, OpenSearchException {
        return pitSegments(fn, ApiType.OSS);
    }

    /**
     * Lists one or several CAT point-in-time segments.
     *
     * @param fn   a function that initializes a builder to create the {@link PitSegmentsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PitSegmentsResponse> pitSegments(
        Function<PitSegmentsRequest.Builder, ObjectBuilder<PitSegmentsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return pitSegments(fn.apply(new PitSegmentsRequest.Builder()).build(), type);
    }

    // ----- Endpoint: cat.plugins

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     */
    public CompletableFuture<PluginsResponse> plugins(PluginsRequest request) throws IOException, OpenSearchException {
        return plugins(request, ApiType.OSS);
    }

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PluginsResponse> plugins(PluginsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.plugins", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, PluginsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     *
     * @param fn a function that initializes a builder to create the {@link PluginsRequest}
     */
    public final CompletableFuture<PluginsResponse> plugins(Function<PluginsRequest.Builder, ObjectBuilder<PluginsRequest>> fn)
        throws IOException, OpenSearchException {
        return plugins(fn, ApiType.OSS);
    }

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     *
     * @param fn   a function that initializes a builder to create the {@link PluginsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PluginsResponse> plugins(
        Function<PluginsRequest.Builder, ObjectBuilder<PluginsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return plugins(fn.apply(new PluginsRequest.Builder()).build(), type);
    }

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     */
    public final CompletableFuture<PluginsResponse> plugins() throws IOException, OpenSearchException {
        return plugins(ApiType.OSS);
    }

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PluginsResponse> plugins(ApiType type) throws IOException, OpenSearchException {
        return plugins(new PluginsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.recovery

    /**
     * Returns all completed and ongoing index and shard recoveries.
     */
    public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request) throws IOException, OpenSearchException {
        return recovery(request, ApiType.OSS);
    }

    /**
     * Returns all completed and ongoing index and shard recoveries.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.recovery", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, RecoveryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns all completed and ongoing index and shard recoveries.
     *
     * @param fn a function that initializes a builder to create the {@link RecoveryRequest}
     */
    public final CompletableFuture<RecoveryResponse> recovery(Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn)
        throws IOException, OpenSearchException {
        return recovery(fn, ApiType.OSS);
    }

    /**
     * Returns all completed and ongoing index and shard recoveries.
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
     * Returns all completed and ongoing index and shard recoveries.
     */
    public final CompletableFuture<RecoveryResponse> recovery() throws IOException, OpenSearchException {
        return recovery(ApiType.OSS);
    }

    /**
     * Returns all completed and ongoing index and shard recoveries.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RecoveryResponse> recovery(ApiType type) throws IOException, OpenSearchException {
        return recovery(new RecoveryRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.repositories

    /**
     * Returns information about all snapshot repositories for a cluster.
     */
    public CompletableFuture<RepositoriesResponse> repositories(RepositoriesRequest request) throws IOException, OpenSearchException {
        return repositories(request, ApiType.OSS);
    }

    /**
     * Returns information about all snapshot repositories for a cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<RepositoriesResponse> repositories(RepositoriesRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "cat.repositories", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, RepositoriesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about all snapshot repositories for a cluster.
     *
     * @param fn a function that initializes a builder to create the {@link RepositoriesRequest}
     */
    public final CompletableFuture<RepositoriesResponse> repositories(
        Function<RepositoriesRequest.Builder, ObjectBuilder<RepositoriesRequest>> fn
    ) throws IOException, OpenSearchException {
        return repositories(fn, ApiType.OSS);
    }

    /**
     * Returns information about all snapshot repositories for a cluster.
     *
     * @param fn   a function that initializes a builder to create the {@link RepositoriesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RepositoriesResponse> repositories(
        Function<RepositoriesRequest.Builder, ObjectBuilder<RepositoriesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return repositories(fn.apply(new RepositoriesRequest.Builder()).build(), type);
    }

    /**
     * Returns information about all snapshot repositories for a cluster.
     */
    public final CompletableFuture<RepositoriesResponse> repositories() throws IOException, OpenSearchException {
        return repositories(ApiType.OSS);
    }

    /**
     * Returns information about all snapshot repositories for a cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RepositoriesResponse> repositories(ApiType type) throws IOException, OpenSearchException {
        return repositories(new RepositoriesRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.segment_replication

    /**
     * Returns information about active and last-completed segment replication events on each replica shard, including related shard-level
     * metrics. These metrics provide information about how far behind the primary shard the replicas are lagging.
     */
    public CompletableFuture<SegmentReplicationResponse> segmentReplication(SegmentReplicationRequest request) throws IOException,
        OpenSearchException {
        return segmentReplication(request, ApiType.OSS);
    }

    /**
     * Returns information about active and last-completed segment replication events on each replica shard, including related shard-level
     * metrics. These metrics provide information about how far behind the primary shard the replicas are lagging.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<SegmentReplicationResponse> segmentReplication(SegmentReplicationRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.segment_replication", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, SegmentReplicationRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about active and last-completed segment replication events on each replica shard, including related shard-level
     * metrics. These metrics provide information about how far behind the primary shard the replicas are lagging.
     *
     * @param fn a function that initializes a builder to create the {@link SegmentReplicationRequest}
     */
    public final CompletableFuture<SegmentReplicationResponse> segmentReplication(
        Function<SegmentReplicationRequest.Builder, ObjectBuilder<SegmentReplicationRequest>> fn
    ) throws IOException, OpenSearchException {
        return segmentReplication(fn, ApiType.OSS);
    }

    /**
     * Returns information about active and last-completed segment replication events on each replica shard, including related shard-level
     * metrics. These metrics provide information about how far behind the primary shard the replicas are lagging.
     *
     * @param fn   a function that initializes a builder to create the {@link SegmentReplicationRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SegmentReplicationResponse> segmentReplication(
        Function<SegmentReplicationRequest.Builder, ObjectBuilder<SegmentReplicationRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return segmentReplication(fn.apply(new SegmentReplicationRequest.Builder()).build(), type);
    }

    /**
     * Returns information about active and last-completed segment replication events on each replica shard, including related shard-level
     * metrics. These metrics provide information about how far behind the primary shard the replicas are lagging.
     */
    public final CompletableFuture<SegmentReplicationResponse> segmentReplication() throws IOException, OpenSearchException {
        return segmentReplication(ApiType.OSS);
    }

    /**
     * Returns information about active and last-completed segment replication events on each replica shard, including related shard-level
     * metrics. These metrics provide information about how far behind the primary shard the replicas are lagging.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SegmentReplicationResponse> segmentReplication(ApiType type) throws IOException, OpenSearchException {
        return segmentReplication(new SegmentReplicationRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.segments

    /**
     * Provides low-level information about the segments in the shards of an index.
     */
    public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request) throws IOException, OpenSearchException {
        return segments(request, ApiType.OSS);
    }

    /**
     * Provides low-level information about the segments in the shards of an index.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.segments", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, SegmentsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides low-level information about the segments in the shards of an index.
     *
     * @param fn a function that initializes a builder to create the {@link SegmentsRequest}
     */
    public final CompletableFuture<SegmentsResponse> segments(Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn)
        throws IOException, OpenSearchException {
        return segments(fn, ApiType.OSS);
    }

    /**
     * Provides low-level information about the segments in the shards of an index.
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
     * Provides low-level information about the segments in the shards of an index.
     */
    public final CompletableFuture<SegmentsResponse> segments() throws IOException, OpenSearchException {
        return segments(ApiType.OSS);
    }

    /**
     * Provides low-level information about the segments in the shards of an index.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SegmentsResponse> segments(ApiType type) throws IOException, OpenSearchException {
        return segments(new SegmentsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.shards

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     */
    public CompletableFuture<ShardsResponse> shards(ShardsRequest request) throws IOException, OpenSearchException {
        return shards(request, ApiType.OSS);
    }

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ShardsResponse> shards(ShardsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.shards", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ShardsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     *
     * @param fn a function that initializes a builder to create the {@link ShardsRequest}
     */
    public final CompletableFuture<ShardsResponse> shards(Function<ShardsRequest.Builder, ObjectBuilder<ShardsRequest>> fn)
        throws IOException, OpenSearchException {
        return shards(fn, ApiType.OSS);
    }

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     *
     * @param fn   a function that initializes a builder to create the {@link ShardsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ShardsResponse> shards(Function<ShardsRequest.Builder, ObjectBuilder<ShardsRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return shards(fn.apply(new ShardsRequest.Builder()).build(), type);
    }

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     */
    public final CompletableFuture<ShardsResponse> shards() throws IOException, OpenSearchException {
        return shards(ApiType.OSS);
    }

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ShardsResponse> shards(ApiType type) throws IOException, OpenSearchException {
        return shards(new ShardsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.snapshots

    /**
     * Lists all of the snapshots stored in a specific repository.
     */
    public CompletableFuture<SnapshotsResponse> snapshots(SnapshotsRequest request) throws IOException, OpenSearchException {
        return snapshots(request, ApiType.OSS);
    }

    /**
     * Lists all of the snapshots stored in a specific repository.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<SnapshotsResponse> snapshots(SnapshotsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.snapshots", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, SnapshotsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists all of the snapshots stored in a specific repository.
     *
     * @param fn a function that initializes a builder to create the {@link SnapshotsRequest}
     */
    public final CompletableFuture<SnapshotsResponse> snapshots(Function<SnapshotsRequest.Builder, ObjectBuilder<SnapshotsRequest>> fn)
        throws IOException, OpenSearchException {
        return snapshots(fn, ApiType.OSS);
    }

    /**
     * Lists all of the snapshots stored in a specific repository.
     *
     * @param fn   a function that initializes a builder to create the {@link SnapshotsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SnapshotsResponse> snapshots(
        Function<SnapshotsRequest.Builder, ObjectBuilder<SnapshotsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return snapshots(fn.apply(new SnapshotsRequest.Builder()).build(), type);
    }

    /**
     * Lists all of the snapshots stored in a specific repository.
     */
    public final CompletableFuture<SnapshotsResponse> snapshots() throws IOException, OpenSearchException {
        return snapshots(ApiType.OSS);
    }

    /**
     * Lists all of the snapshots stored in a specific repository.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SnapshotsResponse> snapshots(ApiType type) throws IOException, OpenSearchException {
        return snapshots(new SnapshotsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.tasks

    /**
     * Lists the progress of all tasks currently running on the cluster.
     */
    public CompletableFuture<TasksResponse> tasks(TasksRequest request) throws IOException, OpenSearchException {
        return tasks(request, ApiType.OSS);
    }

    /**
     * Lists the progress of all tasks currently running on the cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<TasksResponse> tasks(TasksRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.tasks", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, TasksRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists the progress of all tasks currently running on the cluster.
     *
     * @param fn a function that initializes a builder to create the {@link TasksRequest}
     */
    public final CompletableFuture<TasksResponse> tasks(Function<TasksRequest.Builder, ObjectBuilder<TasksRequest>> fn) throws IOException,
        OpenSearchException {
        return tasks(fn, ApiType.OSS);
    }

    /**
     * Lists the progress of all tasks currently running on the cluster.
     *
     * @param fn   a function that initializes a builder to create the {@link TasksRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<TasksResponse> tasks(Function<TasksRequest.Builder, ObjectBuilder<TasksRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return tasks(fn.apply(new TasksRequest.Builder()).build(), type);
    }

    /**
     * Lists the progress of all tasks currently running on the cluster.
     */
    public final CompletableFuture<TasksResponse> tasks() throws IOException, OpenSearchException {
        return tasks(ApiType.OSS);
    }

    /**
     * Lists the progress of all tasks currently running on the cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<TasksResponse> tasks(ApiType type) throws IOException, OpenSearchException {
        return tasks(new TasksRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.templates

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     */
    public CompletableFuture<TemplatesResponse> templates(TemplatesRequest request) throws IOException, OpenSearchException {
        return templates(request, ApiType.OSS);
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<TemplatesResponse> templates(TemplatesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.templates", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, TemplatesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     *
     * @param fn a function that initializes a builder to create the {@link TemplatesRequest}
     */
    public final CompletableFuture<TemplatesResponse> templates(Function<TemplatesRequest.Builder, ObjectBuilder<TemplatesRequest>> fn)
        throws IOException, OpenSearchException {
        return templates(fn, ApiType.OSS);
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     *
     * @param fn   a function that initializes a builder to create the {@link TemplatesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<TemplatesResponse> templates(
        Function<TemplatesRequest.Builder, ObjectBuilder<TemplatesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return templates(fn.apply(new TemplatesRequest.Builder()).build(), type);
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     */
    public final CompletableFuture<TemplatesResponse> templates() throws IOException, OpenSearchException {
        return templates(ApiType.OSS);
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<TemplatesResponse> templates(ApiType type) throws IOException, OpenSearchException {
        return templates(new TemplatesRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.thread_pool

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     */
    public CompletableFuture<ThreadPoolResponse> threadPool(ThreadPoolRequest request) throws IOException, OpenSearchException {
        return threadPool(request, ApiType.OSS);
    }

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ThreadPoolResponse> threadPool(ThreadPoolRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "cat.thread_pool", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ThreadPoolRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     *
     * @param fn a function that initializes a builder to create the {@link ThreadPoolRequest}
     */
    public final CompletableFuture<ThreadPoolResponse> threadPool(Function<ThreadPoolRequest.Builder, ObjectBuilder<ThreadPoolRequest>> fn)
        throws IOException, OpenSearchException {
        return threadPool(fn, ApiType.OSS);
    }

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     *
     * @param fn   a function that initializes a builder to create the {@link ThreadPoolRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ThreadPoolResponse> threadPool(
        Function<ThreadPoolRequest.Builder, ObjectBuilder<ThreadPoolRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return threadPool(fn.apply(new ThreadPoolRequest.Builder()).build(), type);
    }

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     */
    public final CompletableFuture<ThreadPoolResponse> threadPool() throws IOException, OpenSearchException {
        return threadPool(ApiType.OSS);
    }

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ThreadPoolResponse> threadPool(ApiType type) throws IOException, OpenSearchException {
        return threadPool(new ThreadPoolRequest.Builder().build(), type);
    }
}
