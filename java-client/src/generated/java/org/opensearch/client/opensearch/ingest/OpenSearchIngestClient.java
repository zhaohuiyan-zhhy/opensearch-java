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

package org.opensearch.client.opensearch.ingest;

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
 * Client for the ingest namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class OpenSearchIngestClient extends ApiClient<OpenSearchTransport, OpenSearchIngestClient> {
    public OpenSearchIngestClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchIngestClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchIngestClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchIngestClient(this.transport, transportOptions);
    }

    // ----- Endpoint: ingest.delete_pipeline

    /**
     * Deletes an ingest pipeline.
     */
    public DeletePipelineResponse deletePipeline(DeletePipelineRequest request) throws IOException, OpenSearchException {
        return deletePipeline(request, ApiType.OSS);
    }

    /**
     * Deletes an ingest pipeline.
     *
     * @param type target OpenSearch API distribution
     */
    public DeletePipelineResponse deletePipeline(DeletePipelineRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ingest.delete_pipeline", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeletePipelineRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes an ingest pipeline.
     *
     * @param fn a function that initializes a builder to create the {@link DeletePipelineRequest}
     */
    public final DeletePipelineResponse deletePipeline(Function<DeletePipelineRequest.Builder, ObjectBuilder<DeletePipelineRequest>> fn)
        throws IOException, OpenSearchException {
        return deletePipeline(fn, ApiType.OSS);
    }

    /**
     * Deletes an ingest pipeline.
     *
     * @param fn   a function that initializes a builder to create the {@link DeletePipelineRequest}
     * @param type target OpenSearch API distribution
     */
    public final DeletePipelineResponse deletePipeline(
        Function<DeletePipelineRequest.Builder, ObjectBuilder<DeletePipelineRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deletePipeline(fn.apply(new DeletePipelineRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ingest.get_pipeline

    /**
     * Returns an ingest pipeline.
     */
    public GetPipelineResponse getPipeline(GetPipelineRequest request) throws IOException, OpenSearchException {
        return getPipeline(request, ApiType.OSS);
    }

    /**
     * Returns an ingest pipeline.
     *
     * @param type target OpenSearch API distribution
     */
    public GetPipelineResponse getPipeline(GetPipelineRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ingest.get_pipeline", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetPipelineRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns an ingest pipeline.
     *
     * @param fn a function that initializes a builder to create the {@link GetPipelineRequest}
     */
    public final GetPipelineResponse getPipeline(Function<GetPipelineRequest.Builder, ObjectBuilder<GetPipelineRequest>> fn)
        throws IOException, OpenSearchException {
        return getPipeline(fn, ApiType.OSS);
    }

    /**
     * Returns an ingest pipeline.
     *
     * @param fn   a function that initializes a builder to create the {@link GetPipelineRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetPipelineResponse getPipeline(Function<GetPipelineRequest.Builder, ObjectBuilder<GetPipelineRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getPipeline(fn.apply(new GetPipelineRequest.Builder()).build(), type);
    }

    /**
     * Returns an ingest pipeline.
     */
    public final GetPipelineResponse getPipeline() throws IOException, OpenSearchException {
        return getPipeline(ApiType.OSS);
    }

    /**
     * Returns an ingest pipeline.
     *
     * @param type target OpenSearch API distribution
     */
    public final GetPipelineResponse getPipeline(ApiType type) throws IOException, OpenSearchException {
        return getPipeline(new GetPipelineRequest.Builder().build(), type);
    }

    // ----- Endpoint: ingest.processor_grok

    /**
     * Returns a list of built-in grok patterns.
     */
    public ProcessorGrokResponse processorGrok(ProcessorGrokRequest request) throws IOException, OpenSearchException {
        return processorGrok(request, ApiType.OSS);
    }

    /**
     * Returns a list of built-in grok patterns.
     *
     * @param type target OpenSearch API distribution
     */
    public ProcessorGrokResponse processorGrok(ProcessorGrokRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ingest.processor_grok", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, ProcessorGrokRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns a list of built-in grok patterns.
     *
     * @param fn a function that initializes a builder to create the {@link ProcessorGrokRequest}
     */
    public final ProcessorGrokResponse processorGrok(Function<ProcessorGrokRequest.Builder, ObjectBuilder<ProcessorGrokRequest>> fn)
        throws IOException, OpenSearchException {
        return processorGrok(fn, ApiType.OSS);
    }

    /**
     * Returns a list of built-in grok patterns.
     *
     * @param fn   a function that initializes a builder to create the {@link ProcessorGrokRequest}
     * @param type target OpenSearch API distribution
     */
    public final ProcessorGrokResponse processorGrok(
        Function<ProcessorGrokRequest.Builder, ObjectBuilder<ProcessorGrokRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return processorGrok(fn.apply(new ProcessorGrokRequest.Builder()).build(), type);
    }

    /**
     * Returns a list of built-in grok patterns.
     */
    public final ProcessorGrokResponse processorGrok() throws IOException, OpenSearchException {
        return processorGrok(ApiType.OSS);
    }

    /**
     * Returns a list of built-in grok patterns.
     *
     * @param type target OpenSearch API distribution
     */
    public final ProcessorGrokResponse processorGrok(ApiType type) throws IOException, OpenSearchException {
        return processorGrok(new ProcessorGrokRequest.Builder().build(), type);
    }

    // ----- Endpoint: ingest.put_pipeline

    /**
     * Creates or updates an ingest pipeline.
     */
    public PutPipelineResponse putPipeline(PutPipelineRequest request) throws IOException, OpenSearchException {
        return putPipeline(request, ApiType.OSS);
    }

    /**
     * Creates or updates an ingest pipeline.
     *
     * @param type target OpenSearch API distribution
     */
    public PutPipelineResponse putPipeline(PutPipelineRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ingest.put_pipeline", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, PutPipelineRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates an ingest pipeline.
     *
     * @param fn a function that initializes a builder to create the {@link PutPipelineRequest}
     */
    public final PutPipelineResponse putPipeline(Function<PutPipelineRequest.Builder, ObjectBuilder<PutPipelineRequest>> fn)
        throws IOException, OpenSearchException {
        return putPipeline(fn, ApiType.OSS);
    }

    /**
     * Creates or updates an ingest pipeline.
     *
     * @param fn   a function that initializes a builder to create the {@link PutPipelineRequest}
     * @param type target OpenSearch API distribution
     */
    public final PutPipelineResponse putPipeline(Function<PutPipelineRequest.Builder, ObjectBuilder<PutPipelineRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return putPipeline(fn.apply(new PutPipelineRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ingest.simulate

    /**
     * Simulates an ingest pipeline with example documents.
     */
    public SimulateResponse simulate(SimulateRequest request) throws IOException, OpenSearchException {
        return simulate(request, ApiType.OSS);
    }

    /**
     * Simulates an ingest pipeline with example documents.
     *
     * @param type target OpenSearch API distribution
     */
    public SimulateResponse simulate(SimulateRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ingest.simulate", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, SimulateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Simulates an ingest pipeline with example documents.
     *
     * @param fn a function that initializes a builder to create the {@link SimulateRequest}
     */
    public final SimulateResponse simulate(Function<SimulateRequest.Builder, ObjectBuilder<SimulateRequest>> fn) throws IOException,
        OpenSearchException {
        return simulate(fn, ApiType.OSS);
    }

    /**
     * Simulates an ingest pipeline with example documents.
     *
     * @param fn   a function that initializes a builder to create the {@link SimulateRequest}
     * @param type target OpenSearch API distribution
     */
    public final SimulateResponse simulate(Function<SimulateRequest.Builder, ObjectBuilder<SimulateRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return simulate(fn.apply(new SimulateRequest.Builder()).build(), type);
    }

    /**
     * Simulates an ingest pipeline with example documents.
     */
    public final SimulateResponse simulate() throws IOException, OpenSearchException {
        return simulate(ApiType.OSS);
    }

    /**
     * Simulates an ingest pipeline with example documents.
     *
     * @param type target OpenSearch API distribution
     */
    public final SimulateResponse simulate(ApiType type) throws IOException, OpenSearchException {
        return simulate(new SimulateRequest.Builder().build(), type);
    }
}
