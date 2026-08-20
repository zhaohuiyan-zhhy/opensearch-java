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
public abstract class OpenSearchCatClientBase<Self extends OpenSearchCatClientBase<Self>> extends ApiClient<OpenSearchTransport, Self> {
    public OpenSearchCatClientBase(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    // ----- Endpoint: cat.aliases

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     */
    public AliasesResponse aliases(AliasesRequest request) throws IOException, OpenSearchException {
        return aliases(request, ApiType.OSS);
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     *
     * @param type target OpenSearch API distribution
     */
    public AliasesResponse aliases(AliasesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.aliases", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, AliasesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     *
     * @param fn a function that initializes a builder to create the {@link AliasesRequest}
     */
    public final AliasesResponse aliases(Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn) throws IOException,
        OpenSearchException {
        return aliases(fn, ApiType.OSS);
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     *
     * @param fn   a function that initializes a builder to create the {@link AliasesRequest}
     * @param type target OpenSearch API distribution
     */
    public final AliasesResponse aliases(Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return aliases(fn.apply(new AliasesRequest.Builder()).build(), type);
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     */
    public final AliasesResponse aliases() throws IOException, OpenSearchException {
        return aliases(ApiType.OSS);
    }

    /**
     * Shows information about aliases currently configured to indexes, including filter and routing information.
     *
     * @param type target OpenSearch API distribution
     */
    public final AliasesResponse aliases(ApiType type) throws IOException, OpenSearchException {
        return aliases(new AliasesRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.all_pit_segments

    /**
     * Lists all active CAT point-in-time segments.
     */
    public AllPitSegmentsResponse allPitSegments(AllPitSegmentsRequest request) throws IOException, OpenSearchException {
        return allPitSegments(request, ApiType.OSS);
    }

    /**
     * Lists all active CAT point-in-time segments.
     *
     * @param type target OpenSearch API distribution
     */
    public AllPitSegmentsResponse allPitSegments(AllPitSegmentsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.all_pit_segments", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, AllPitSegmentsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists all active CAT point-in-time segments.
     *
     * @param fn a function that initializes a builder to create the {@link AllPitSegmentsRequest}
     */
    public final AllPitSegmentsResponse allPitSegments(Function<AllPitSegmentsRequest.Builder, ObjectBuilder<AllPitSegmentsRequest>> fn)
        throws IOException, OpenSearchException {
        return allPitSegments(fn, ApiType.OSS);
    }

    /**
     * Lists all active CAT point-in-time segments.
     *
     * @param fn   a function that initializes a builder to create the {@link AllPitSegmentsRequest}
     * @param type target OpenSearch API distribution
     */
    public final AllPitSegmentsResponse allPitSegments(
        Function<AllPitSegmentsRequest.Builder, ObjectBuilder<AllPitSegmentsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return allPitSegments(fn.apply(new AllPitSegmentsRequest.Builder()).build(), type);
    }

    /**
     * Lists all active CAT point-in-time segments.
     */
    public final AllPitSegmentsResponse allPitSegments() throws IOException, OpenSearchException {
        return allPitSegments(ApiType.OSS);
    }

    /**
     * Lists all active CAT point-in-time segments.
     *
     * @param type target OpenSearch API distribution
     */
    public final AllPitSegmentsResponse allPitSegments(ApiType type) throws IOException, OpenSearchException {
        return allPitSegments(new AllPitSegmentsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.allocation

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     */
    public AllocationResponse allocation(AllocationRequest request) throws IOException, OpenSearchException {
        return allocation(request, ApiType.OSS);
    }

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     *
     * @param type target OpenSearch API distribution
     */
    public AllocationResponse allocation(AllocationRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.allocation", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, AllocationRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     *
     * @param fn a function that initializes a builder to create the {@link AllocationRequest}
     */
    public final AllocationResponse allocation(Function<AllocationRequest.Builder, ObjectBuilder<AllocationRequest>> fn) throws IOException,
        OpenSearchException {
        return allocation(fn, ApiType.OSS);
    }

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     *
     * @param fn   a function that initializes a builder to create the {@link AllocationRequest}
     * @param type target OpenSearch API distribution
     */
    public final AllocationResponse allocation(Function<AllocationRequest.Builder, ObjectBuilder<AllocationRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return allocation(fn.apply(new AllocationRequest.Builder()).build(), type);
    }

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     */
    public final AllocationResponse allocation() throws IOException, OpenSearchException {
        return allocation(ApiType.OSS);
    }

    /**
     * Provides a snapshot of how many shards are allocated to each data node and how much disk space they are using.
     *
     * @param type target OpenSearch API distribution
     */
    public final AllocationResponse allocation(ApiType type) throws IOException, OpenSearchException {
        return allocation(new AllocationRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.cluster_manager

    /**
     * Returns information about the cluster-manager node.
     */
    public ClusterManagerResponse clusterManager(ClusterManagerRequest request) throws IOException, OpenSearchException {
        return clusterManager(request, ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param type target OpenSearch API distribution
     */
    public ClusterManagerResponse clusterManager(ClusterManagerRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.cluster_manager", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, ClusterManagerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param fn a function that initializes a builder to create the {@link ClusterManagerRequest}
     */
    public final ClusterManagerResponse clusterManager(Function<ClusterManagerRequest.Builder, ObjectBuilder<ClusterManagerRequest>> fn)
        throws IOException, OpenSearchException {
        return clusterManager(fn, ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param fn   a function that initializes a builder to create the {@link ClusterManagerRequest}
     * @param type target OpenSearch API distribution
     */
    public final ClusterManagerResponse clusterManager(
        Function<ClusterManagerRequest.Builder, ObjectBuilder<ClusterManagerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return clusterManager(fn.apply(new ClusterManagerRequest.Builder()).build(), type);
    }

    /**
     * Returns information about the cluster-manager node.
     */
    public final ClusterManagerResponse clusterManager() throws IOException, OpenSearchException {
        return clusterManager(ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param type target OpenSearch API distribution
     */
    public final ClusterManagerResponse clusterManager(ApiType type) throws IOException, OpenSearchException {
        return clusterManager(new ClusterManagerRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.count

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     */
    public CountResponse count(CountRequest request) throws IOException, OpenSearchException {
        return count(request, ApiType.OSS);
    }

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     *
     * @param type target OpenSearch API distribution
     */
    public CountResponse count(CountRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.count", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, CountRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     *
     * @param fn a function that initializes a builder to create the {@link CountRequest}
     */
    public final CountResponse count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn) throws IOException,
        OpenSearchException {
        return count(fn, ApiType.OSS);
    }

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     *
     * @param fn   a function that initializes a builder to create the {@link CountRequest}
     * @param type target OpenSearch API distribution
     */
    public final CountResponse count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn, ApiType type) throws IOException,
        OpenSearchException {
        return count(fn.apply(new CountRequest.Builder()).build(), type);
    }

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     */
    public final CountResponse count() throws IOException, OpenSearchException {
        return count(ApiType.OSS);
    }

    /**
     * Provides quick access to the document count of the entire cluster or of an individual index.
     *
     * @param type target OpenSearch API distribution
     */
    public final CountResponse count(ApiType type) throws IOException, OpenSearchException {
        return count(new CountRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.fielddata

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     */
    public FielddataResponse fielddata(FielddataRequest request) throws IOException, OpenSearchException {
        return fielddata(request, ApiType.OSS);
    }

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public FielddataResponse fielddata(FielddataRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.fielddata", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, FielddataRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     *
     * @param fn a function that initializes a builder to create the {@link FielddataRequest}
     */
    public final FielddataResponse fielddata(Function<FielddataRequest.Builder, ObjectBuilder<FielddataRequest>> fn) throws IOException,
        OpenSearchException {
        return fielddata(fn, ApiType.OSS);
    }

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     *
     * @param fn   a function that initializes a builder to create the {@link FielddataRequest}
     * @param type target OpenSearch API distribution
     */
    public final FielddataResponse fielddata(Function<FielddataRequest.Builder, ObjectBuilder<FielddataRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return fielddata(fn.apply(new FielddataRequest.Builder()).build(), type);
    }

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     */
    public final FielddataResponse fielddata() throws IOException, OpenSearchException {
        return fielddata(ApiType.OSS);
    }

    /**
     * Shows how much heap memory is currently being used by field data on every data node in the cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public final FielddataResponse fielddata(ApiType type) throws IOException, OpenSearchException {
        return fielddata(new FielddataRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.health

    /**
     * Returns a concise representation of the cluster health.
     */
    public HealthResponse health(HealthRequest request) throws IOException, OpenSearchException {
        return health(request, ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster health.
     *
     * @param type target OpenSearch API distribution
     */
    public HealthResponse health(HealthRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.health", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, HealthRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns a concise representation of the cluster health.
     *
     * @param fn a function that initializes a builder to create the {@link HealthRequest}
     */
    public final HealthResponse health(Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn) throws IOException,
        OpenSearchException {
        return health(fn, ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster health.
     *
     * @param fn   a function that initializes a builder to create the {@link HealthRequest}
     * @param type target OpenSearch API distribution
     */
    public final HealthResponse health(Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn, ApiType type) throws IOException,
        OpenSearchException {
        return health(fn.apply(new HealthRequest.Builder()).build(), type);
    }

    /**
     * Returns a concise representation of the cluster health.
     */
    public final HealthResponse health() throws IOException, OpenSearchException {
        return health(ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster health.
     *
     * @param type target OpenSearch API distribution
     */
    public final HealthResponse health(ApiType type) throws IOException, OpenSearchException {
        return health(new HealthRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.indices

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     */
    public IndicesResponse indices(IndicesRequest request) throws IOException, OpenSearchException {
        return indices(request, ApiType.OSS);
    }

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     *
     * @param type target OpenSearch API distribution
     */
    public IndicesResponse indices(IndicesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.indices", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, IndicesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     *
     * @param fn a function that initializes a builder to create the {@link IndicesRequest}
     */
    public final IndicesResponse indices(Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn) throws IOException,
        OpenSearchException {
        return indices(fn, ApiType.OSS);
    }

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     *
     * @param fn   a function that initializes a builder to create the {@link IndicesRequest}
     * @param type target OpenSearch API distribution
     */
    public final IndicesResponse indices(Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return indices(fn.apply(new IndicesRequest.Builder()).build(), type);
    }

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     */
    public final IndicesResponse indices() throws IOException, OpenSearchException {
        return indices(ApiType.OSS);
    }

    /**
     * Lists information related to indexes, that is, how much disk space they are using, how many shards they have, their health status,
     * and so on.
     *
     * @param type target OpenSearch API distribution
     */
    public final IndicesResponse indices(ApiType type) throws IOException, OpenSearchException {
        return indices(new IndicesRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.master

    /**
     * Returns information about the cluster-manager node.
     */
    @Deprecated
    public MasterResponse master(MasterRequest request) throws IOException, OpenSearchException {
        return master(request, ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public MasterResponse master(MasterRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.master", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, MasterRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param fn a function that initializes a builder to create the {@link MasterRequest}
     */
    @Deprecated
    public final MasterResponse master(Function<MasterRequest.Builder, ObjectBuilder<MasterRequest>> fn) throws IOException,
        OpenSearchException {
        return master(fn, ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param fn   a function that initializes a builder to create the {@link MasterRequest}
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final MasterResponse master(Function<MasterRequest.Builder, ObjectBuilder<MasterRequest>> fn, ApiType type) throws IOException,
        OpenSearchException {
        return master(fn.apply(new MasterRequest.Builder()).build(), type);
    }

    /**
     * Returns information about the cluster-manager node.
     */
    @Deprecated
    public final MasterResponse master() throws IOException, OpenSearchException {
        return master(ApiType.OSS);
    }

    /**
     * Returns information about the cluster-manager node.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final MasterResponse master(ApiType type) throws IOException, OpenSearchException {
        return master(new MasterRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.nodeattrs

    /**
     * Returns information about custom node attributes.
     */
    public NodeattrsResponse nodeattrs(NodeattrsRequest request) throws IOException, OpenSearchException {
        return nodeattrs(request, ApiType.OSS);
    }

    /**
     * Returns information about custom node attributes.
     *
     * @param type target OpenSearch API distribution
     */
    public NodeattrsResponse nodeattrs(NodeattrsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.nodeattrs", ApiType.OSS);
        return this.transport.performRequest(request, NodeattrsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about custom node attributes.
     *
     * @param fn a function that initializes a builder to create the {@link NodeattrsRequest}
     */
    public final NodeattrsResponse nodeattrs(Function<NodeattrsRequest.Builder, ObjectBuilder<NodeattrsRequest>> fn) throws IOException,
        OpenSearchException {
        return nodeattrs(fn, ApiType.OSS);
    }

    /**
     * Returns information about custom node attributes.
     *
     * @param fn   a function that initializes a builder to create the {@link NodeattrsRequest}
     * @param type target OpenSearch API distribution
     */
    public final NodeattrsResponse nodeattrs(Function<NodeattrsRequest.Builder, ObjectBuilder<NodeattrsRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return nodeattrs(fn.apply(new NodeattrsRequest.Builder()).build(), type);
    }

    /**
     * Returns information about custom node attributes.
     */
    public final NodeattrsResponse nodeattrs() throws IOException, OpenSearchException {
        return nodeattrs(ApiType.OSS);
    }

    /**
     * Returns information about custom node attributes.
     *
     * @param type target OpenSearch API distribution
     */
    public final NodeattrsResponse nodeattrs(ApiType type) throws IOException, OpenSearchException {
        return nodeattrs(new NodeattrsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.nodes

    /**
     * Returns basic statistics about the performance of cluster nodes.
     */
    public NodesResponse nodes(NodesRequest request) throws IOException, OpenSearchException {
        return nodes(request, ApiType.OSS);
    }

    /**
     * Returns basic statistics about the performance of cluster nodes.
     *
     * @param type target OpenSearch API distribution
     */
    public NodesResponse nodes(NodesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.nodes", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, NodesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns basic statistics about the performance of cluster nodes.
     *
     * @param fn a function that initializes a builder to create the {@link NodesRequest}
     */
    public final NodesResponse nodes(Function<NodesRequest.Builder, ObjectBuilder<NodesRequest>> fn) throws IOException,
        OpenSearchException {
        return nodes(fn, ApiType.OSS);
    }

    /**
     * Returns basic statistics about the performance of cluster nodes.
     *
     * @param fn   a function that initializes a builder to create the {@link NodesRequest}
     * @param type target OpenSearch API distribution
     */
    public final NodesResponse nodes(Function<NodesRequest.Builder, ObjectBuilder<NodesRequest>> fn, ApiType type) throws IOException,
        OpenSearchException {
        return nodes(fn.apply(new NodesRequest.Builder()).build(), type);
    }

    /**
     * Returns basic statistics about the performance of cluster nodes.
     */
    public final NodesResponse nodes() throws IOException, OpenSearchException {
        return nodes(ApiType.OSS);
    }

    /**
     * Returns basic statistics about the performance of cluster nodes.
     *
     * @param type target OpenSearch API distribution
     */
    public final NodesResponse nodes(ApiType type) throws IOException, OpenSearchException {
        return nodes(new NodesRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.pending_tasks

    /**
     * Returns a concise representation of the cluster's pending tasks.
     */
    public PendingTasksResponse pendingTasks(PendingTasksRequest request) throws IOException, OpenSearchException {
        return pendingTasks(request, ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster's pending tasks.
     *
     * @param type target OpenSearch API distribution
     */
    public PendingTasksResponse pendingTasks(PendingTasksRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.pending_tasks", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, PendingTasksRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns a concise representation of the cluster's pending tasks.
     *
     * @param fn a function that initializes a builder to create the {@link PendingTasksRequest}
     */
    public final PendingTasksResponse pendingTasks(Function<PendingTasksRequest.Builder, ObjectBuilder<PendingTasksRequest>> fn)
        throws IOException, OpenSearchException {
        return pendingTasks(fn, ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster's pending tasks.
     *
     * @param fn   a function that initializes a builder to create the {@link PendingTasksRequest}
     * @param type target OpenSearch API distribution
     */
    public final PendingTasksResponse pendingTasks(
        Function<PendingTasksRequest.Builder, ObjectBuilder<PendingTasksRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return pendingTasks(fn.apply(new PendingTasksRequest.Builder()).build(), type);
    }

    /**
     * Returns a concise representation of the cluster's pending tasks.
     */
    public final PendingTasksResponse pendingTasks() throws IOException, OpenSearchException {
        return pendingTasks(ApiType.OSS);
    }

    /**
     * Returns a concise representation of the cluster's pending tasks.
     *
     * @param type target OpenSearch API distribution
     */
    public final PendingTasksResponse pendingTasks(ApiType type) throws IOException, OpenSearchException {
        return pendingTasks(new PendingTasksRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.pit_segments

    /**
     * Lists one or several CAT point-in-time segments.
     */
    public PitSegmentsResponse pitSegments(PitSegmentsRequest request) throws IOException, OpenSearchException {
        return pitSegments(request, ApiType.OSS);
    }

    /**
     * Lists one or several CAT point-in-time segments.
     *
     * @param type target OpenSearch API distribution
     */
    public PitSegmentsResponse pitSegments(PitSegmentsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.pit_segments", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, PitSegmentsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists one or several CAT point-in-time segments.
     *
     * @param fn a function that initializes a builder to create the {@link PitSegmentsRequest}
     */
    public final PitSegmentsResponse pitSegments(Function<PitSegmentsRequest.Builder, ObjectBuilder<PitSegmentsRequest>> fn)
        throws IOException, OpenSearchException {
        return pitSegments(fn, ApiType.OSS);
    }

    /**
     * Lists one or several CAT point-in-time segments.
     *
     * @param fn   a function that initializes a builder to create the {@link PitSegmentsRequest}
     * @param type target OpenSearch API distribution
     */
    public final PitSegmentsResponse pitSegments(Function<PitSegmentsRequest.Builder, ObjectBuilder<PitSegmentsRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return pitSegments(fn.apply(new PitSegmentsRequest.Builder()).build(), type);
    }

    // ----- Endpoint: cat.plugins

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     */
    public PluginsResponse plugins(PluginsRequest request) throws IOException, OpenSearchException {
        return plugins(request, ApiType.OSS);
    }

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     *
     * @param type target OpenSearch API distribution
     */
    public PluginsResponse plugins(PluginsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.plugins", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, PluginsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     *
     * @param fn a function that initializes a builder to create the {@link PluginsRequest}
     */
    public final PluginsResponse plugins(Function<PluginsRequest.Builder, ObjectBuilder<PluginsRequest>> fn) throws IOException,
        OpenSearchException {
        return plugins(fn, ApiType.OSS);
    }

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     *
     * @param fn   a function that initializes a builder to create the {@link PluginsRequest}
     * @param type target OpenSearch API distribution
     */
    public final PluginsResponse plugins(Function<PluginsRequest.Builder, ObjectBuilder<PluginsRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return plugins(fn.apply(new PluginsRequest.Builder()).build(), type);
    }

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     */
    public final PluginsResponse plugins() throws IOException, OpenSearchException {
        return plugins(ApiType.OSS);
    }

    /**
     * Returns information about the names, components, and versions of the installed plugins.
     *
     * @param type target OpenSearch API distribution
     */
    public final PluginsResponse plugins(ApiType type) throws IOException, OpenSearchException {
        return plugins(new PluginsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.recovery

    /**
     * Returns all completed and ongoing index and shard recoveries.
     */
    public RecoveryResponse recovery(RecoveryRequest request) throws IOException, OpenSearchException {
        return recovery(request, ApiType.OSS);
    }

    /**
     * Returns all completed and ongoing index and shard recoveries.
     *
     * @param type target OpenSearch API distribution
     */
    public RecoveryResponse recovery(RecoveryRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.recovery", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, RecoveryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns all completed and ongoing index and shard recoveries.
     *
     * @param fn a function that initializes a builder to create the {@link RecoveryRequest}
     */
    public final RecoveryResponse recovery(Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn) throws IOException,
        OpenSearchException {
        return recovery(fn, ApiType.OSS);
    }

    /**
     * Returns all completed and ongoing index and shard recoveries.
     *
     * @param fn   a function that initializes a builder to create the {@link RecoveryRequest}
     * @param type target OpenSearch API distribution
     */
    public final RecoveryResponse recovery(Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return recovery(fn.apply(new RecoveryRequest.Builder()).build(), type);
    }

    /**
     * Returns all completed and ongoing index and shard recoveries.
     */
    public final RecoveryResponse recovery() throws IOException, OpenSearchException {
        return recovery(ApiType.OSS);
    }

    /**
     * Returns all completed and ongoing index and shard recoveries.
     *
     * @param type target OpenSearch API distribution
     */
    public final RecoveryResponse recovery(ApiType type) throws IOException, OpenSearchException {
        return recovery(new RecoveryRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.repositories

    /**
     * Returns information about all snapshot repositories for a cluster.
     */
    public RepositoriesResponse repositories(RepositoriesRequest request) throws IOException, OpenSearchException {
        return repositories(request, ApiType.OSS);
    }

    /**
     * Returns information about all snapshot repositories for a cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public RepositoriesResponse repositories(RepositoriesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.repositories", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, RepositoriesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about all snapshot repositories for a cluster.
     *
     * @param fn a function that initializes a builder to create the {@link RepositoriesRequest}
     */
    public final RepositoriesResponse repositories(Function<RepositoriesRequest.Builder, ObjectBuilder<RepositoriesRequest>> fn)
        throws IOException, OpenSearchException {
        return repositories(fn, ApiType.OSS);
    }

    /**
     * Returns information about all snapshot repositories for a cluster.
     *
     * @param fn   a function that initializes a builder to create the {@link RepositoriesRequest}
     * @param type target OpenSearch API distribution
     */
    public final RepositoriesResponse repositories(
        Function<RepositoriesRequest.Builder, ObjectBuilder<RepositoriesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return repositories(fn.apply(new RepositoriesRequest.Builder()).build(), type);
    }

    /**
     * Returns information about all snapshot repositories for a cluster.
     */
    public final RepositoriesResponse repositories() throws IOException, OpenSearchException {
        return repositories(ApiType.OSS);
    }

    /**
     * Returns information about all snapshot repositories for a cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public final RepositoriesResponse repositories(ApiType type) throws IOException, OpenSearchException {
        return repositories(new RepositoriesRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.segment_replication

    /**
     * Returns information about active and last-completed segment replication events on each replica shard, including related shard-level
     * metrics. These metrics provide information about how far behind the primary shard the replicas are lagging.
     */
    public SegmentReplicationResponse segmentReplication(SegmentReplicationRequest request) throws IOException, OpenSearchException {
        return segmentReplication(request, ApiType.OSS);
    }

    /**
     * Returns information about active and last-completed segment replication events on each replica shard, including related shard-level
     * metrics. These metrics provide information about how far behind the primary shard the replicas are lagging.
     *
     * @param type target OpenSearch API distribution
     */
    public SegmentReplicationResponse segmentReplication(SegmentReplicationRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "cat.segment_replication", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, SegmentReplicationRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about active and last-completed segment replication events on each replica shard, including related shard-level
     * metrics. These metrics provide information about how far behind the primary shard the replicas are lagging.
     *
     * @param fn a function that initializes a builder to create the {@link SegmentReplicationRequest}
     */
    public final SegmentReplicationResponse segmentReplication(
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
    public final SegmentReplicationResponse segmentReplication(
        Function<SegmentReplicationRequest.Builder, ObjectBuilder<SegmentReplicationRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return segmentReplication(fn.apply(new SegmentReplicationRequest.Builder()).build(), type);
    }

    /**
     * Returns information about active and last-completed segment replication events on each replica shard, including related shard-level
     * metrics. These metrics provide information about how far behind the primary shard the replicas are lagging.
     */
    public final SegmentReplicationResponse segmentReplication() throws IOException, OpenSearchException {
        return segmentReplication(ApiType.OSS);
    }

    /**
     * Returns information about active and last-completed segment replication events on each replica shard, including related shard-level
     * metrics. These metrics provide information about how far behind the primary shard the replicas are lagging.
     *
     * @param type target OpenSearch API distribution
     */
    public final SegmentReplicationResponse segmentReplication(ApiType type) throws IOException, OpenSearchException {
        return segmentReplication(new SegmentReplicationRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.segments

    /**
     * Provides low-level information about the segments in the shards of an index.
     */
    public SegmentsResponse segments(SegmentsRequest request) throws IOException, OpenSearchException {
        return segments(request, ApiType.OSS);
    }

    /**
     * Provides low-level information about the segments in the shards of an index.
     *
     * @param type target OpenSearch API distribution
     */
    public SegmentsResponse segments(SegmentsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.segments", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, SegmentsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides low-level information about the segments in the shards of an index.
     *
     * @param fn a function that initializes a builder to create the {@link SegmentsRequest}
     */
    public final SegmentsResponse segments(Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn) throws IOException,
        OpenSearchException {
        return segments(fn, ApiType.OSS);
    }

    /**
     * Provides low-level information about the segments in the shards of an index.
     *
     * @param fn   a function that initializes a builder to create the {@link SegmentsRequest}
     * @param type target OpenSearch API distribution
     */
    public final SegmentsResponse segments(Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return segments(fn.apply(new SegmentsRequest.Builder()).build(), type);
    }

    /**
     * Provides low-level information about the segments in the shards of an index.
     */
    public final SegmentsResponse segments() throws IOException, OpenSearchException {
        return segments(ApiType.OSS);
    }

    /**
     * Provides low-level information about the segments in the shards of an index.
     *
     * @param type target OpenSearch API distribution
     */
    public final SegmentsResponse segments(ApiType type) throws IOException, OpenSearchException {
        return segments(new SegmentsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.shards

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     */
    public ShardsResponse shards(ShardsRequest request) throws IOException, OpenSearchException {
        return shards(request, ApiType.OSS);
    }

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     *
     * @param type target OpenSearch API distribution
     */
    public ShardsResponse shards(ShardsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.shards", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, ShardsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     *
     * @param fn a function that initializes a builder to create the {@link ShardsRequest}
     */
    public final ShardsResponse shards(Function<ShardsRequest.Builder, ObjectBuilder<ShardsRequest>> fn) throws IOException,
        OpenSearchException {
        return shards(fn, ApiType.OSS);
    }

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     *
     * @param fn   a function that initializes a builder to create the {@link ShardsRequest}
     * @param type target OpenSearch API distribution
     */
    public final ShardsResponse shards(Function<ShardsRequest.Builder, ObjectBuilder<ShardsRequest>> fn, ApiType type) throws IOException,
        OpenSearchException {
        return shards(fn.apply(new ShardsRequest.Builder()).build(), type);
    }

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     */
    public final ShardsResponse shards() throws IOException, OpenSearchException {
        return shards(ApiType.OSS);
    }

    /**
     * Lists the states of all primary and replica shards and how they are distributed.
     *
     * @param type target OpenSearch API distribution
     */
    public final ShardsResponse shards(ApiType type) throws IOException, OpenSearchException {
        return shards(new ShardsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.snapshots

    /**
     * Lists all of the snapshots stored in a specific repository.
     */
    public SnapshotsResponse snapshots(SnapshotsRequest request) throws IOException, OpenSearchException {
        return snapshots(request, ApiType.OSS);
    }

    /**
     * Lists all of the snapshots stored in a specific repository.
     *
     * @param type target OpenSearch API distribution
     */
    public SnapshotsResponse snapshots(SnapshotsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.snapshots", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, SnapshotsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists all of the snapshots stored in a specific repository.
     *
     * @param fn a function that initializes a builder to create the {@link SnapshotsRequest}
     */
    public final SnapshotsResponse snapshots(Function<SnapshotsRequest.Builder, ObjectBuilder<SnapshotsRequest>> fn) throws IOException,
        OpenSearchException {
        return snapshots(fn, ApiType.OSS);
    }

    /**
     * Lists all of the snapshots stored in a specific repository.
     *
     * @param fn   a function that initializes a builder to create the {@link SnapshotsRequest}
     * @param type target OpenSearch API distribution
     */
    public final SnapshotsResponse snapshots(Function<SnapshotsRequest.Builder, ObjectBuilder<SnapshotsRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return snapshots(fn.apply(new SnapshotsRequest.Builder()).build(), type);
    }

    /**
     * Lists all of the snapshots stored in a specific repository.
     */
    public final SnapshotsResponse snapshots() throws IOException, OpenSearchException {
        return snapshots(ApiType.OSS);
    }

    /**
     * Lists all of the snapshots stored in a specific repository.
     *
     * @param type target OpenSearch API distribution
     */
    public final SnapshotsResponse snapshots(ApiType type) throws IOException, OpenSearchException {
        return snapshots(new SnapshotsRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.tasks

    /**
     * Lists the progress of all tasks currently running on the cluster.
     */
    public TasksResponse tasks(TasksRequest request) throws IOException, OpenSearchException {
        return tasks(request, ApiType.OSS);
    }

    /**
     * Lists the progress of all tasks currently running on the cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public TasksResponse tasks(TasksRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.tasks", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, TasksRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists the progress of all tasks currently running on the cluster.
     *
     * @param fn a function that initializes a builder to create the {@link TasksRequest}
     */
    public final TasksResponse tasks(Function<TasksRequest.Builder, ObjectBuilder<TasksRequest>> fn) throws IOException,
        OpenSearchException {
        return tasks(fn, ApiType.OSS);
    }

    /**
     * Lists the progress of all tasks currently running on the cluster.
     *
     * @param fn   a function that initializes a builder to create the {@link TasksRequest}
     * @param type target OpenSearch API distribution
     */
    public final TasksResponse tasks(Function<TasksRequest.Builder, ObjectBuilder<TasksRequest>> fn, ApiType type) throws IOException,
        OpenSearchException {
        return tasks(fn.apply(new TasksRequest.Builder()).build(), type);
    }

    /**
     * Lists the progress of all tasks currently running on the cluster.
     */
    public final TasksResponse tasks() throws IOException, OpenSearchException {
        return tasks(ApiType.OSS);
    }

    /**
     * Lists the progress of all tasks currently running on the cluster.
     *
     * @param type target OpenSearch API distribution
     */
    public final TasksResponse tasks(ApiType type) throws IOException, OpenSearchException {
        return tasks(new TasksRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.templates

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     */
    public TemplatesResponse templates(TemplatesRequest request) throws IOException, OpenSearchException {
        return templates(request, ApiType.OSS);
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     *
     * @param type target OpenSearch API distribution
     */
    public TemplatesResponse templates(TemplatesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.templates", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, TemplatesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     *
     * @param fn a function that initializes a builder to create the {@link TemplatesRequest}
     */
    public final TemplatesResponse templates(Function<TemplatesRequest.Builder, ObjectBuilder<TemplatesRequest>> fn) throws IOException,
        OpenSearchException {
        return templates(fn, ApiType.OSS);
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     *
     * @param fn   a function that initializes a builder to create the {@link TemplatesRequest}
     * @param type target OpenSearch API distribution
     */
    public final TemplatesResponse templates(Function<TemplatesRequest.Builder, ObjectBuilder<TemplatesRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return templates(fn.apply(new TemplatesRequest.Builder()).build(), type);
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     */
    public final TemplatesResponse templates() throws IOException, OpenSearchException {
        return templates(ApiType.OSS);
    }

    /**
     * Lists the names, patterns, order numbers, and version numbers of index templates.
     *
     * @param type target OpenSearch API distribution
     */
    public final TemplatesResponse templates(ApiType type) throws IOException, OpenSearchException {
        return templates(new TemplatesRequest.Builder().build(), type);
    }

    // ----- Endpoint: cat.thread_pool

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     */
    public ThreadPoolResponse threadPool(ThreadPoolRequest request) throws IOException, OpenSearchException {
        return threadPool(request, ApiType.OSS);
    }

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     *
     * @param type target OpenSearch API distribution
     */
    public ThreadPoolResponse threadPool(ThreadPoolRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "cat.thread_pool", ApiType.AOS, ApiType.OSS);
        return this.transport.performRequest(request, ThreadPoolRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     *
     * @param fn a function that initializes a builder to create the {@link ThreadPoolRequest}
     */
    public final ThreadPoolResponse threadPool(Function<ThreadPoolRequest.Builder, ObjectBuilder<ThreadPoolRequest>> fn) throws IOException,
        OpenSearchException {
        return threadPool(fn, ApiType.OSS);
    }

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     *
     * @param fn   a function that initializes a builder to create the {@link ThreadPoolRequest}
     * @param type target OpenSearch API distribution
     */
    public final ThreadPoolResponse threadPool(Function<ThreadPoolRequest.Builder, ObjectBuilder<ThreadPoolRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return threadPool(fn.apply(new ThreadPoolRequest.Builder()).build(), type);
    }

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     */
    public final ThreadPoolResponse threadPool() throws IOException, OpenSearchException {
        return threadPool(ApiType.OSS);
    }

    /**
     * Returns cluster-wide thread pool statistics per node. By default the active, queued, and rejected statistics are returned for all
     * thread pools.
     *
     * @param type target OpenSearch API distribution
     */
    public final ThreadPoolResponse threadPool(ApiType type) throws IOException, OpenSearchException {
        return threadPool(new ThreadPoolRequest.Builder().build(), type);
    }
}
