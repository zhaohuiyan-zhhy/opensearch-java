/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.ml;

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
 * Client for the ml namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class OpenSearchMlAsyncClient extends ApiClient<OpenSearchTransport, OpenSearchMlAsyncClient> {
    public OpenSearchMlAsyncClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchMlAsyncClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchMlAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchMlAsyncClient(this.transport, transportOptions);
    }

    // ----- Endpoint: ml.add_agentic_memory

    /**
     * Add agentic memory to a memory container.
     */
    public CompletableFuture<AddAgenticMemoryResponse> addAgenticMemory(AddAgenticMemoryRequest request) throws IOException,
        OpenSearchException {
        return addAgenticMemory(request, ApiType.OSS);
    }

    /**
     * Add agentic memory to a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<AddAgenticMemoryResponse> addAgenticMemory(AddAgenticMemoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.add_agentic_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, AddAgenticMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Add agentic memory to a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link AddAgenticMemoryRequest}
     */
    public final CompletableFuture<AddAgenticMemoryResponse> addAgenticMemory(
        Function<AddAgenticMemoryRequest.Builder, ObjectBuilder<AddAgenticMemoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return addAgenticMemory(fn, ApiType.OSS);
    }

    /**
     * Add agentic memory to a memory container.
     *
     * @param fn   a function that initializes a builder to create the {@link AddAgenticMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AddAgenticMemoryResponse> addAgenticMemory(
        Function<AddAgenticMemoryRequest.Builder, ObjectBuilder<AddAgenticMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return addAgenticMemory(fn.apply(new AddAgenticMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.create_connector

    /**
     * Creates a standalone connector.
     */
    public CompletableFuture<CreateConnectorResponse> createConnector(CreateConnectorRequest request) throws IOException,
        OpenSearchException {
        return createConnector(request, ApiType.OSS);
    }

    /**
     * Creates a standalone connector.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateConnectorResponse> createConnector(CreateConnectorRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.create_connector", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateConnectorRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates a standalone connector.
     *
     * @param fn a function that initializes a builder to create the {@link CreateConnectorRequest}
     */
    public final CompletableFuture<CreateConnectorResponse> createConnector(
        Function<CreateConnectorRequest.Builder, ObjectBuilder<CreateConnectorRequest>> fn
    ) throws IOException, OpenSearchException {
        return createConnector(fn, ApiType.OSS);
    }

    /**
     * Creates a standalone connector.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateConnectorRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateConnectorResponse> createConnector(
        Function<CreateConnectorRequest.Builder, ObjectBuilder<CreateConnectorRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createConnector(fn.apply(new CreateConnectorRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.create_controller

    /**
     * Creates a controller.
     */
    public CompletableFuture<CreateControllerResponse> createController(CreateControllerRequest request) throws IOException,
        OpenSearchException {
        return createController(request, ApiType.OSS);
    }

    /**
     * Creates a controller.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateControllerResponse> createController(CreateControllerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.create_controller", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateControllerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates a controller.
     *
     * @param fn a function that initializes a builder to create the {@link CreateControllerRequest}
     */
    public final CompletableFuture<CreateControllerResponse> createController(
        Function<CreateControllerRequest.Builder, ObjectBuilder<CreateControllerRequest>> fn
    ) throws IOException, OpenSearchException {
        return createController(fn, ApiType.OSS);
    }

    /**
     * Creates a controller.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateControllerRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateControllerResponse> createController(
        Function<CreateControllerRequest.Builder, ObjectBuilder<CreateControllerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createController(fn.apply(new CreateControllerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.create_memory

    /**
     * Create a memory.
     */
    public CompletableFuture<CreateMemoryResponse> createMemory(CreateMemoryRequest request) throws IOException, OpenSearchException {
        return createMemory(request, ApiType.OSS);
    }

    /**
     * Create a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateMemoryResponse> createMemory(CreateMemoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.create_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create a memory.
     *
     * @param fn a function that initializes a builder to create the {@link CreateMemoryRequest}
     */
    public final CompletableFuture<CreateMemoryResponse> createMemory(
        Function<CreateMemoryRequest.Builder, ObjectBuilder<CreateMemoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return createMemory(fn, ApiType.OSS);
    }

    /**
     * Create a memory.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateMemoryResponse> createMemory(
        Function<CreateMemoryRequest.Builder, ObjectBuilder<CreateMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createMemory(fn.apply(new CreateMemoryRequest.Builder()).build(), type);
    }

    /**
     * Create a memory.
     */
    public final CompletableFuture<CreateMemoryResponse> createMemory() throws IOException, OpenSearchException {
        return createMemory(ApiType.OSS);
    }

    /**
     * Create a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateMemoryResponse> createMemory(ApiType type) throws IOException, OpenSearchException {
        return createMemory(new CreateMemoryRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.create_memory_container

    /**
     * Create a memory container.
     */
    public CompletableFuture<CreateMemoryContainerResponse> createMemoryContainer(CreateMemoryContainerRequest request) throws IOException,
        OpenSearchException {
        return createMemoryContainer(request, ApiType.OSS);
    }

    /**
     * Create a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateMemoryContainerResponse> createMemoryContainer(CreateMemoryContainerRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.create_memory_container", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateMemoryContainerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link CreateMemoryContainerRequest}
     */
    public final CompletableFuture<CreateMemoryContainerResponse> createMemoryContainer(
        Function<CreateMemoryContainerRequest.Builder, ObjectBuilder<CreateMemoryContainerRequest>> fn
    ) throws IOException, OpenSearchException {
        return createMemoryContainer(fn, ApiType.OSS);
    }

    /**
     * Create a memory container.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateMemoryContainerRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateMemoryContainerResponse> createMemoryContainer(
        Function<CreateMemoryContainerRequest.Builder, ObjectBuilder<CreateMemoryContainerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createMemoryContainer(fn.apply(new CreateMemoryContainerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.create_memory_container_session

    /**
     * Create session in a memory container.
     */
    public CompletableFuture<CreateMemoryContainerSessionResponse> createMemoryContainerSession(CreateMemoryContainerSessionRequest request)
        throws IOException, OpenSearchException {
        return createMemoryContainerSession(request, ApiType.OSS);
    }

    /**
     * Create session in a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateMemoryContainerSessionResponse> createMemoryContainerSession(
        CreateMemoryContainerSessionRequest request,
        ApiType type
    ) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.create_memory_container_session", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateMemoryContainerSessionRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create session in a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link CreateMemoryContainerSessionRequest}
     */
    public final CompletableFuture<CreateMemoryContainerSessionResponse> createMemoryContainerSession(
        Function<CreateMemoryContainerSessionRequest.Builder, ObjectBuilder<CreateMemoryContainerSessionRequest>> fn
    ) throws IOException, OpenSearchException {
        return createMemoryContainerSession(fn, ApiType.OSS);
    }

    /**
     * Create session in a memory container.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateMemoryContainerSessionRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateMemoryContainerSessionResponse> createMemoryContainerSession(
        Function<CreateMemoryContainerSessionRequest.Builder, ObjectBuilder<CreateMemoryContainerSessionRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createMemoryContainerSession(fn.apply(new CreateMemoryContainerSessionRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.create_message

    /**
     * Create a message.
     */
    public CompletableFuture<CreateMessageResponse> createMessage(CreateMessageRequest request) throws IOException, OpenSearchException {
        return createMessage(request, ApiType.OSS);
    }

    /**
     * Create a message.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateMessageResponse> createMessage(CreateMessageRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.create_message", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateMessageRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create a message.
     *
     * @param fn a function that initializes a builder to create the {@link CreateMessageRequest}
     */
    public final CompletableFuture<CreateMessageResponse> createMessage(
        Function<CreateMessageRequest.Builder, ObjectBuilder<CreateMessageRequest>> fn
    ) throws IOException, OpenSearchException {
        return createMessage(fn, ApiType.OSS);
    }

    /**
     * Create a message.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateMessageRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateMessageResponse> createMessage(
        Function<CreateMessageRequest.Builder, ObjectBuilder<CreateMessageRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createMessage(fn.apply(new CreateMessageRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.create_model_meta

    /**
     * Registers model metadata.
     */
    @Deprecated
    public CompletableFuture<CreateModelMetaResponse> createModelMeta(CreateModelMetaRequest request) throws IOException,
        OpenSearchException {
        return createModelMeta(request, ApiType.OSS);
    }

    /**
     * Registers model metadata.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public CompletableFuture<CreateModelMetaResponse> createModelMeta(CreateModelMetaRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.create_model_meta", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateModelMetaRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Registers model metadata.
     *
     * @param fn a function that initializes a builder to create the {@link CreateModelMetaRequest}
     */
    @Deprecated
    public final CompletableFuture<CreateModelMetaResponse> createModelMeta(
        Function<CreateModelMetaRequest.Builder, ObjectBuilder<CreateModelMetaRequest>> fn
    ) throws IOException, OpenSearchException {
        return createModelMeta(fn, ApiType.OSS);
    }

    /**
     * Registers model metadata.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateModelMetaRequest}
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final CompletableFuture<CreateModelMetaResponse> createModelMeta(
        Function<CreateModelMetaRequest.Builder, ObjectBuilder<CreateModelMetaRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createModelMeta(fn.apply(new CreateModelMetaRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_agent

    /**
     * Delete an agent.
     */
    public CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request) throws IOException, OpenSearchException {
        return deleteAgent(request, ApiType.OSS);
    }

    /**
     * Delete an agent.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_agent", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteAgentRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete an agent.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteAgentRequest}
     */
    public final CompletableFuture<DeleteAgentResponse> deleteAgent(
        Function<DeleteAgentRequest.Builder, ObjectBuilder<DeleteAgentRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteAgent(fn, ApiType.OSS);
    }

    /**
     * Delete an agent.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteAgentRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteAgentResponse> deleteAgent(
        Function<DeleteAgentRequest.Builder, ObjectBuilder<DeleteAgentRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteAgent(fn.apply(new DeleteAgentRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_agentic_memory

    /**
     * Delete a specific memory by its type and ID.
     */
    public CompletableFuture<DeleteAgenticMemoryResponse> deleteAgenticMemory(DeleteAgenticMemoryRequest request) throws IOException,
        OpenSearchException {
        return deleteAgenticMemory(request, ApiType.OSS);
    }

    /**
     * Delete a specific memory by its type and ID.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteAgenticMemoryResponse> deleteAgenticMemory(DeleteAgenticMemoryRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_agentic_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteAgenticMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete a specific memory by its type and ID.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteAgenticMemoryRequest}
     */
    public final CompletableFuture<DeleteAgenticMemoryResponse> deleteAgenticMemory(
        Function<DeleteAgenticMemoryRequest.Builder, ObjectBuilder<DeleteAgenticMemoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteAgenticMemory(fn, ApiType.OSS);
    }

    /**
     * Delete a specific memory by its type and ID.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteAgenticMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteAgenticMemoryResponse> deleteAgenticMemory(
        Function<DeleteAgenticMemoryRequest.Builder, ObjectBuilder<DeleteAgenticMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteAgenticMemory(fn.apply(new DeleteAgenticMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_agentic_memory_query

    /**
     * Delete multiple memories using a query to match specific criteria.
     */
    public CompletableFuture<DeleteAgenticMemoryQueryResponse> deleteAgenticMemoryQuery(DeleteAgenticMemoryQueryRequest request)
        throws IOException, OpenSearchException {
        return deleteAgenticMemoryQuery(request, ApiType.OSS);
    }

    /**
     * Delete multiple memories using a query to match specific criteria.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteAgenticMemoryQueryResponse> deleteAgenticMemoryQuery(
        DeleteAgenticMemoryQueryRequest request,
        ApiType type
    ) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_agentic_memory_query", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteAgenticMemoryQueryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete multiple memories using a query to match specific criteria.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteAgenticMemoryQueryRequest}
     */
    public final CompletableFuture<DeleteAgenticMemoryQueryResponse> deleteAgenticMemoryQuery(
        Function<DeleteAgenticMemoryQueryRequest.Builder, ObjectBuilder<DeleteAgenticMemoryQueryRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteAgenticMemoryQuery(fn, ApiType.OSS);
    }

    /**
     * Delete multiple memories using a query to match specific criteria.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteAgenticMemoryQueryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteAgenticMemoryQueryResponse> deleteAgenticMemoryQuery(
        Function<DeleteAgenticMemoryQueryRequest.Builder, ObjectBuilder<DeleteAgenticMemoryQueryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteAgenticMemoryQuery(fn.apply(new DeleteAgenticMemoryQueryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_connector

    /**
     * Deletes a standalone connector.
     */
    public CompletableFuture<DeleteConnectorResponse> deleteConnector(DeleteConnectorRequest request) throws IOException,
        OpenSearchException {
        return deleteConnector(request, ApiType.OSS);
    }

    /**
     * Deletes a standalone connector.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteConnectorResponse> deleteConnector(DeleteConnectorRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_connector", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteConnectorRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a standalone connector.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteConnectorRequest}
     */
    public final CompletableFuture<DeleteConnectorResponse> deleteConnector(
        Function<DeleteConnectorRequest.Builder, ObjectBuilder<DeleteConnectorRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteConnector(fn, ApiType.OSS);
    }

    /**
     * Deletes a standalone connector.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteConnectorRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteConnectorResponse> deleteConnector(
        Function<DeleteConnectorRequest.Builder, ObjectBuilder<DeleteConnectorRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteConnector(fn.apply(new DeleteConnectorRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_controller

    /**
     * Deletes a controller.
     */
    public CompletableFuture<DeleteControllerResponse> deleteController(DeleteControllerRequest request) throws IOException,
        OpenSearchException {
        return deleteController(request, ApiType.OSS);
    }

    /**
     * Deletes a controller.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteControllerResponse> deleteController(DeleteControllerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_controller", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteControllerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a controller.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteControllerRequest}
     */
    public final CompletableFuture<DeleteControllerResponse> deleteController(
        Function<DeleteControllerRequest.Builder, ObjectBuilder<DeleteControllerRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteController(fn, ApiType.OSS);
    }

    /**
     * Deletes a controller.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteControllerRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteControllerResponse> deleteController(
        Function<DeleteControllerRequest.Builder, ObjectBuilder<DeleteControllerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteController(fn.apply(new DeleteControllerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_memory

    /**
     * Delete a memory.
     */
    public CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request) throws IOException, OpenSearchException {
        return deleteMemory(request, ApiType.OSS);
    }

    /**
     * Delete a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete a memory.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteMemoryRequest}
     */
    public final CompletableFuture<DeleteMemoryResponse> deleteMemory(
        Function<DeleteMemoryRequest.Builder, ObjectBuilder<DeleteMemoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteMemory(fn, ApiType.OSS);
    }

    /**
     * Delete a memory.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteMemoryResponse> deleteMemory(
        Function<DeleteMemoryRequest.Builder, ObjectBuilder<DeleteMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteMemory(fn.apply(new DeleteMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_memory_container

    /**
     * Delete a memory container.
     */
    public CompletableFuture<DeleteMemoryContainerResponse> deleteMemoryContainer(DeleteMemoryContainerRequest request) throws IOException,
        OpenSearchException {
        return deleteMemoryContainer(request, ApiType.OSS);
    }

    /**
     * Delete a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteMemoryContainerResponse> deleteMemoryContainer(DeleteMemoryContainerRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_memory_container", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteMemoryContainerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteMemoryContainerRequest}
     */
    public final CompletableFuture<DeleteMemoryContainerResponse> deleteMemoryContainer(
        Function<DeleteMemoryContainerRequest.Builder, ObjectBuilder<DeleteMemoryContainerRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteMemoryContainer(fn, ApiType.OSS);
    }

    /**
     * Delete a memory container.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteMemoryContainerRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteMemoryContainerResponse> deleteMemoryContainer(
        Function<DeleteMemoryContainerRequest.Builder, ObjectBuilder<DeleteMemoryContainerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteMemoryContainer(fn.apply(new DeleteMemoryContainerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_model

    /**
     * Deletes a model.
     */
    public CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request) throws IOException, OpenSearchException {
        return deleteModel(request, ApiType.OSS);
    }

    /**
     * Deletes a model.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a model.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteModelRequest}
     */
    public final CompletableFuture<DeleteModelResponse> deleteModel(
        Function<DeleteModelRequest.Builder, ObjectBuilder<DeleteModelRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteModel(fn, ApiType.OSS);
    }

    /**
     * Deletes a model.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteModelResponse> deleteModel(
        Function<DeleteModelRequest.Builder, ObjectBuilder<DeleteModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteModel(fn.apply(new DeleteModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_model_group

    /**
     * Deletes a model group.
     */
    public CompletableFuture<DeleteModelGroupResponse> deleteModelGroup(DeleteModelGroupRequest request) throws IOException,
        OpenSearchException {
        return deleteModelGroup(request, ApiType.OSS);
    }

    /**
     * Deletes a model group.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteModelGroupResponse> deleteModelGroup(DeleteModelGroupRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_model_group", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteModelGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a model group.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteModelGroupRequest}
     */
    public final CompletableFuture<DeleteModelGroupResponse> deleteModelGroup(
        Function<DeleteModelGroupRequest.Builder, ObjectBuilder<DeleteModelGroupRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteModelGroup(fn, ApiType.OSS);
    }

    /**
     * Deletes a model group.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteModelGroupRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteModelGroupResponse> deleteModelGroup(
        Function<DeleteModelGroupRequest.Builder, ObjectBuilder<DeleteModelGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteModelGroup(fn.apply(new DeleteModelGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_task

    /**
     * Deletes a task.
     */
    public CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request) throws IOException, OpenSearchException {
        return deleteTask(request, ApiType.OSS);
    }

    /**
     * Deletes a task.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_task", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteTaskRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a task.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteTaskRequest}
     */
    public final CompletableFuture<DeleteTaskResponse> deleteTask(Function<DeleteTaskRequest.Builder, ObjectBuilder<DeleteTaskRequest>> fn)
        throws IOException, OpenSearchException {
        return deleteTask(fn, ApiType.OSS);
    }

    /**
     * Deletes a task.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteTaskRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteTaskResponse> deleteTask(
        Function<DeleteTaskRequest.Builder, ObjectBuilder<DeleteTaskRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteTask(fn.apply(new DeleteTaskRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.deploy_model

    /**
     * Deploys a model.
     */
    public CompletableFuture<DeployModelResponse> deployModel(DeployModelRequest request) throws IOException, OpenSearchException {
        return deployModel(request, ApiType.OSS);
    }

    /**
     * Deploys a model.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeployModelResponse> deployModel(DeployModelRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.deploy_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeployModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deploys a model.
     *
     * @param fn a function that initializes a builder to create the {@link DeployModelRequest}
     */
    public final CompletableFuture<DeployModelResponse> deployModel(
        Function<DeployModelRequest.Builder, ObjectBuilder<DeployModelRequest>> fn
    ) throws IOException, OpenSearchException {
        return deployModel(fn, ApiType.OSS);
    }

    /**
     * Deploys a model.
     *
     * @param fn   a function that initializes a builder to create the {@link DeployModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeployModelResponse> deployModel(
        Function<DeployModelRequest.Builder, ObjectBuilder<DeployModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deployModel(fn.apply(new DeployModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.execute_agent

    /**
     * Execute an agent.
     */
    public CompletableFuture<ExecuteAgentResponse> executeAgent(ExecuteAgentRequest request) throws IOException, OpenSearchException {
        return executeAgent(request, ApiType.OSS);
    }

    /**
     * Execute an agent.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ExecuteAgentResponse> executeAgent(ExecuteAgentRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.execute_agent", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ExecuteAgentRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Execute an agent.
     *
     * @param fn a function that initializes a builder to create the {@link ExecuteAgentRequest}
     */
    public final CompletableFuture<ExecuteAgentResponse> executeAgent(
        Function<ExecuteAgentRequest.Builder, ObjectBuilder<ExecuteAgentRequest>> fn
    ) throws IOException, OpenSearchException {
        return executeAgent(fn, ApiType.OSS);
    }

    /**
     * Execute an agent.
     *
     * @param fn   a function that initializes a builder to create the {@link ExecuteAgentRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ExecuteAgentResponse> executeAgent(
        Function<ExecuteAgentRequest.Builder, ObjectBuilder<ExecuteAgentRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return executeAgent(fn.apply(new ExecuteAgentRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.execute_agent_stream

    /**
     * Execute an agent in streaming mode.
     */
    public CompletableFuture<ExecuteAgentStreamResponse> executeAgentStream(ExecuteAgentStreamRequest request) throws IOException,
        OpenSearchException {
        return executeAgentStream(request, ApiType.OSS);
    }

    /**
     * Execute an agent in streaming mode.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ExecuteAgentStreamResponse> executeAgentStream(ExecuteAgentStreamRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.execute_agent_stream", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ExecuteAgentStreamRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Execute an agent in streaming mode.
     *
     * @param fn a function that initializes a builder to create the {@link ExecuteAgentStreamRequest}
     */
    public final CompletableFuture<ExecuteAgentStreamResponse> executeAgentStream(
        Function<ExecuteAgentStreamRequest.Builder, ObjectBuilder<ExecuteAgentStreamRequest>> fn
    ) throws IOException, OpenSearchException {
        return executeAgentStream(fn, ApiType.OSS);
    }

    /**
     * Execute an agent in streaming mode.
     *
     * @param fn   a function that initializes a builder to create the {@link ExecuteAgentStreamRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ExecuteAgentStreamResponse> executeAgentStream(
        Function<ExecuteAgentStreamRequest.Builder, ObjectBuilder<ExecuteAgentStreamRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return executeAgentStream(fn.apply(new ExecuteAgentStreamRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.execute_tool

    /**
     * Execute a tool.
     */
    public CompletableFuture<ExecuteToolResponse> executeTool(ExecuteToolRequest request) throws IOException, OpenSearchException {
        return executeTool(request, ApiType.OSS);
    }

    /**
     * Execute a tool.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ExecuteToolResponse> executeTool(ExecuteToolRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.execute_tool", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ExecuteToolRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Execute a tool.
     *
     * @param fn a function that initializes a builder to create the {@link ExecuteToolRequest}
     */
    public final CompletableFuture<ExecuteToolResponse> executeTool(
        Function<ExecuteToolRequest.Builder, ObjectBuilder<ExecuteToolRequest>> fn
    ) throws IOException, OpenSearchException {
        return executeTool(fn, ApiType.OSS);
    }

    /**
     * Execute a tool.
     *
     * @param fn   a function that initializes a builder to create the {@link ExecuteToolRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ExecuteToolResponse> executeTool(
        Function<ExecuteToolRequest.Builder, ObjectBuilder<ExecuteToolRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return executeTool(fn.apply(new ExecuteToolRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_agent

    /**
     * Get an agent.
     */
    public CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request) throws IOException, OpenSearchException {
        return getAgent(request, ApiType.OSS);
    }

    /**
     * Get an agent.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_agent", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetAgentRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get an agent.
     *
     * @param fn a function that initializes a builder to create the {@link GetAgentRequest}
     */
    public final CompletableFuture<GetAgentResponse> getAgent(Function<GetAgentRequest.Builder, ObjectBuilder<GetAgentRequest>> fn)
        throws IOException, OpenSearchException {
        return getAgent(fn, ApiType.OSS);
    }

    /**
     * Get an agent.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAgentRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAgentResponse> getAgent(
        Function<GetAgentRequest.Builder, ObjectBuilder<GetAgentRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAgent(fn.apply(new GetAgentRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_agentic_memory

    /**
     * Get a specific memory by its type and ID.
     */
    public CompletableFuture<GetAgenticMemoryResponse> getAgenticMemory(GetAgenticMemoryRequest request) throws IOException,
        OpenSearchException {
        return getAgenticMemory(request, ApiType.OSS);
    }

    /**
     * Get a specific memory by its type and ID.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetAgenticMemoryResponse> getAgenticMemory(GetAgenticMemoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_agentic_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetAgenticMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a specific memory by its type and ID.
     *
     * @param fn a function that initializes a builder to create the {@link GetAgenticMemoryRequest}
     */
    public final CompletableFuture<GetAgenticMemoryResponse> getAgenticMemory(
        Function<GetAgenticMemoryRequest.Builder, ObjectBuilder<GetAgenticMemoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return getAgenticMemory(fn, ApiType.OSS);
    }

    /**
     * Get a specific memory by its type and ID.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAgenticMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAgenticMemoryResponse> getAgenticMemory(
        Function<GetAgenticMemoryRequest.Builder, ObjectBuilder<GetAgenticMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAgenticMemory(fn.apply(new GetAgenticMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_all_memories

    /**
     * Get all memories.
     */
    public CompletableFuture<GetAllMemoriesResponse> getAllMemories(GetAllMemoriesRequest request) throws IOException, OpenSearchException {
        return getAllMemories(request, ApiType.OSS);
    }

    /**
     * Get all memories.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetAllMemoriesResponse> getAllMemories(GetAllMemoriesRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_all_memories", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetAllMemoriesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get all memories.
     *
     * @param fn a function that initializes a builder to create the {@link GetAllMemoriesRequest}
     */
    public final CompletableFuture<GetAllMemoriesResponse> getAllMemories(
        Function<GetAllMemoriesRequest.Builder, ObjectBuilder<GetAllMemoriesRequest>> fn
    ) throws IOException, OpenSearchException {
        return getAllMemories(fn, ApiType.OSS);
    }

    /**
     * Get all memories.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAllMemoriesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAllMemoriesResponse> getAllMemories(
        Function<GetAllMemoriesRequest.Builder, ObjectBuilder<GetAllMemoriesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAllMemories(fn.apply(new GetAllMemoriesRequest.Builder()).build(), type);
    }

    /**
     * Get all memories.
     */
    public final CompletableFuture<GetAllMemoriesResponse> getAllMemories() throws IOException, OpenSearchException {
        return getAllMemories(ApiType.OSS);
    }

    /**
     * Get all memories.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAllMemoriesResponse> getAllMemories(ApiType type) throws IOException, OpenSearchException {
        return getAllMemories(new GetAllMemoriesRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_all_messages

    /**
     * Get all messages in a memory.
     */
    public CompletableFuture<GetAllMessagesResponse> getAllMessages(GetAllMessagesRequest request) throws IOException, OpenSearchException {
        return getAllMessages(request, ApiType.OSS);
    }

    /**
     * Get all messages in a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetAllMessagesResponse> getAllMessages(GetAllMessagesRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_all_messages", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetAllMessagesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get all messages in a memory.
     *
     * @param fn a function that initializes a builder to create the {@link GetAllMessagesRequest}
     */
    public final CompletableFuture<GetAllMessagesResponse> getAllMessages(
        Function<GetAllMessagesRequest.Builder, ObjectBuilder<GetAllMessagesRequest>> fn
    ) throws IOException, OpenSearchException {
        return getAllMessages(fn, ApiType.OSS);
    }

    /**
     * Get all messages in a memory.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAllMessagesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAllMessagesResponse> getAllMessages(
        Function<GetAllMessagesRequest.Builder, ObjectBuilder<GetAllMessagesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAllMessages(fn.apply(new GetAllMessagesRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_all_tools

    /**
     * Get tools.
     */
    public CompletableFuture<GetAllToolsResponse> getAllTools(GetAllToolsRequest request) throws IOException, OpenSearchException {
        return getAllTools(request, ApiType.OSS);
    }

    /**
     * Get tools.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetAllToolsResponse> getAllTools(GetAllToolsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_all_tools", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetAllToolsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get tools.
     *
     * @param fn a function that initializes a builder to create the {@link GetAllToolsRequest}
     */
    public final CompletableFuture<GetAllToolsResponse> getAllTools(
        Function<GetAllToolsRequest.Builder, ObjectBuilder<GetAllToolsRequest>> fn
    ) throws IOException, OpenSearchException {
        return getAllTools(fn, ApiType.OSS);
    }

    /**
     * Get tools.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAllToolsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAllToolsResponse> getAllTools(
        Function<GetAllToolsRequest.Builder, ObjectBuilder<GetAllToolsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAllTools(fn.apply(new GetAllToolsRequest.Builder()).build(), type);
    }

    /**
     * Get tools.
     */
    public final CompletableFuture<GetAllToolsResponse> getAllTools() throws IOException, OpenSearchException {
        return getAllTools(ApiType.OSS);
    }

    /**
     * Get tools.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAllToolsResponse> getAllTools(ApiType type) throws IOException, OpenSearchException {
        return getAllTools(new GetAllToolsRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_connector

    /**
     * Retrieves a standalone connector.
     */
    public CompletableFuture<GetConnectorResponse> getConnector(GetConnectorRequest request) throws IOException, OpenSearchException {
        return getConnector(request, ApiType.OSS);
    }

    /**
     * Retrieves a standalone connector.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetConnectorResponse> getConnector(GetConnectorRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_connector", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetConnectorRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves a standalone connector.
     *
     * @param fn a function that initializes a builder to create the {@link GetConnectorRequest}
     */
    public final CompletableFuture<GetConnectorResponse> getConnector(
        Function<GetConnectorRequest.Builder, ObjectBuilder<GetConnectorRequest>> fn
    ) throws IOException, OpenSearchException {
        return getConnector(fn, ApiType.OSS);
    }

    /**
     * Retrieves a standalone connector.
     *
     * @param fn   a function that initializes a builder to create the {@link GetConnectorRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetConnectorResponse> getConnector(
        Function<GetConnectorRequest.Builder, ObjectBuilder<GetConnectorRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getConnector(fn.apply(new GetConnectorRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_controller

    /**
     * Retrieves a controller.
     */
    public CompletableFuture<GetControllerResponse> getController(GetControllerRequest request) throws IOException, OpenSearchException {
        return getController(request, ApiType.OSS);
    }

    /**
     * Retrieves a controller.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetControllerResponse> getController(GetControllerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_controller", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetControllerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves a controller.
     *
     * @param fn a function that initializes a builder to create the {@link GetControllerRequest}
     */
    public final CompletableFuture<GetControllerResponse> getController(
        Function<GetControllerRequest.Builder, ObjectBuilder<GetControllerRequest>> fn
    ) throws IOException, OpenSearchException {
        return getController(fn, ApiType.OSS);
    }

    /**
     * Retrieves a controller.
     *
     * @param fn   a function that initializes a builder to create the {@link GetControllerRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetControllerResponse> getController(
        Function<GetControllerRequest.Builder, ObjectBuilder<GetControllerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getController(fn.apply(new GetControllerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_memory

    /**
     * Get a memory.
     */
    public CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request) throws IOException, OpenSearchException {
        return getMemory(request, ApiType.OSS);
    }

    /**
     * Get a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a memory.
     *
     * @param fn a function that initializes a builder to create the {@link GetMemoryRequest}
     */
    public final CompletableFuture<GetMemoryResponse> getMemory(Function<GetMemoryRequest.Builder, ObjectBuilder<GetMemoryRequest>> fn)
        throws IOException, OpenSearchException {
        return getMemory(fn, ApiType.OSS);
    }

    /**
     * Get a memory.
     *
     * @param fn   a function that initializes a builder to create the {@link GetMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetMemoryResponse> getMemory(
        Function<GetMemoryRequest.Builder, ObjectBuilder<GetMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getMemory(fn.apply(new GetMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_memory_container

    /**
     * Get a memory container.
     */
    public CompletableFuture<GetMemoryContainerResponse> getMemoryContainer(GetMemoryContainerRequest request) throws IOException,
        OpenSearchException {
        return getMemoryContainer(request, ApiType.OSS);
    }

    /**
     * Get a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetMemoryContainerResponse> getMemoryContainer(GetMemoryContainerRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_memory_container", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetMemoryContainerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link GetMemoryContainerRequest}
     */
    public final CompletableFuture<GetMemoryContainerResponse> getMemoryContainer(
        Function<GetMemoryContainerRequest.Builder, ObjectBuilder<GetMemoryContainerRequest>> fn
    ) throws IOException, OpenSearchException {
        return getMemoryContainer(fn, ApiType.OSS);
    }

    /**
     * Get a memory container.
     *
     * @param fn   a function that initializes a builder to create the {@link GetMemoryContainerRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetMemoryContainerResponse> getMemoryContainer(
        Function<GetMemoryContainerRequest.Builder, ObjectBuilder<GetMemoryContainerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getMemoryContainer(fn.apply(new GetMemoryContainerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_message

    /**
     * Get a message.
     */
    public CompletableFuture<GetMessageResponse> getMessage(GetMessageRequest request) throws IOException, OpenSearchException {
        return getMessage(request, ApiType.OSS);
    }

    /**
     * Get a message.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetMessageResponse> getMessage(GetMessageRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_message", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetMessageRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a message.
     *
     * @param fn a function that initializes a builder to create the {@link GetMessageRequest}
     */
    public final CompletableFuture<GetMessageResponse> getMessage(Function<GetMessageRequest.Builder, ObjectBuilder<GetMessageRequest>> fn)
        throws IOException, OpenSearchException {
        return getMessage(fn, ApiType.OSS);
    }

    /**
     * Get a message.
     *
     * @param fn   a function that initializes a builder to create the {@link GetMessageRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetMessageResponse> getMessage(
        Function<GetMessageRequest.Builder, ObjectBuilder<GetMessageRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getMessage(fn.apply(new GetMessageRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_message_traces

    /**
     * Get a message traces.
     */
    public CompletableFuture<GetMessageTracesResponse> getMessageTraces(GetMessageTracesRequest request) throws IOException,
        OpenSearchException {
        return getMessageTraces(request, ApiType.OSS);
    }

    /**
     * Get a message traces.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetMessageTracesResponse> getMessageTraces(GetMessageTracesRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_message_traces", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetMessageTracesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a message traces.
     *
     * @param fn a function that initializes a builder to create the {@link GetMessageTracesRequest}
     */
    public final CompletableFuture<GetMessageTracesResponse> getMessageTraces(
        Function<GetMessageTracesRequest.Builder, ObjectBuilder<GetMessageTracesRequest>> fn
    ) throws IOException, OpenSearchException {
        return getMessageTraces(fn, ApiType.OSS);
    }

    /**
     * Get a message traces.
     *
     * @param fn   a function that initializes a builder to create the {@link GetMessageTracesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetMessageTracesResponse> getMessageTraces(
        Function<GetMessageTracesRequest.Builder, ObjectBuilder<GetMessageTracesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getMessageTraces(fn.apply(new GetMessageTracesRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_model

    /**
     * Retrieves a model.
     */
    public CompletableFuture<GetModelResponse> getModel(GetModelRequest request) throws IOException, OpenSearchException {
        return getModel(request, ApiType.OSS);
    }

    /**
     * Retrieves a model.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetModelResponse> getModel(GetModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves a model.
     *
     * @param fn a function that initializes a builder to create the {@link GetModelRequest}
     */
    public final CompletableFuture<GetModelResponse> getModel(Function<GetModelRequest.Builder, ObjectBuilder<GetModelRequest>> fn)
        throws IOException, OpenSearchException {
        return getModel(fn, ApiType.OSS);
    }

    /**
     * Retrieves a model.
     *
     * @param fn   a function that initializes a builder to create the {@link GetModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetModelResponse> getModel(
        Function<GetModelRequest.Builder, ObjectBuilder<GetModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getModel(fn.apply(new GetModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_model_group

    /**
     * Retrieves a model group.
     */
    public CompletableFuture<GetModelGroupResponse> getModelGroup(GetModelGroupRequest request) throws IOException, OpenSearchException {
        return getModelGroup(request, ApiType.OSS);
    }

    /**
     * Retrieves a model group.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetModelGroupResponse> getModelGroup(GetModelGroupRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_model_group", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetModelGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves a model group.
     *
     * @param fn a function that initializes a builder to create the {@link GetModelGroupRequest}
     */
    public final CompletableFuture<GetModelGroupResponse> getModelGroup(
        Function<GetModelGroupRequest.Builder, ObjectBuilder<GetModelGroupRequest>> fn
    ) throws IOException, OpenSearchException {
        return getModelGroup(fn, ApiType.OSS);
    }

    /**
     * Retrieves a model group.
     *
     * @param fn   a function that initializes a builder to create the {@link GetModelGroupRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetModelGroupResponse> getModelGroup(
        Function<GetModelGroupRequest.Builder, ObjectBuilder<GetModelGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getModelGroup(fn.apply(new GetModelGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_profile

    /**
     * Get a profile.
     */
    public CompletableFuture<GetProfileResponse> getProfile(GetProfileRequest request) throws IOException, OpenSearchException {
        return getProfile(request, ApiType.OSS);
    }

    /**
     * Get a profile.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetProfileResponse> getProfile(GetProfileRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_profile", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetProfileRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a profile.
     *
     * @param fn a function that initializes a builder to create the {@link GetProfileRequest}
     */
    public final CompletableFuture<GetProfileResponse> getProfile(Function<GetProfileRequest.Builder, ObjectBuilder<GetProfileRequest>> fn)
        throws IOException, OpenSearchException {
        return getProfile(fn, ApiType.OSS);
    }

    /**
     * Get a profile.
     *
     * @param fn   a function that initializes a builder to create the {@link GetProfileRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetProfileResponse> getProfile(
        Function<GetProfileRequest.Builder, ObjectBuilder<GetProfileRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getProfile(fn.apply(new GetProfileRequest.Builder()).build(), type);
    }

    /**
     * Get a profile.
     */
    public final CompletableFuture<GetProfileResponse> getProfile() throws IOException, OpenSearchException {
        return getProfile(ApiType.OSS);
    }

    /**
     * Get a profile.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetProfileResponse> getProfile(ApiType type) throws IOException, OpenSearchException {
        return getProfile(new GetProfileRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_profile_models

    /**
     * Get a profile models.
     */
    public CompletableFuture<GetProfileModelsResponse> getProfileModels(GetProfileModelsRequest request) throws IOException,
        OpenSearchException {
        return getProfileModels(request, ApiType.OSS);
    }

    /**
     * Get a profile models.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetProfileModelsResponse> getProfileModels(GetProfileModelsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_profile_models", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetProfileModelsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a profile models.
     *
     * @param fn a function that initializes a builder to create the {@link GetProfileModelsRequest}
     */
    public final CompletableFuture<GetProfileModelsResponse> getProfileModels(
        Function<GetProfileModelsRequest.Builder, ObjectBuilder<GetProfileModelsRequest>> fn
    ) throws IOException, OpenSearchException {
        return getProfileModels(fn, ApiType.OSS);
    }

    /**
     * Get a profile models.
     *
     * @param fn   a function that initializes a builder to create the {@link GetProfileModelsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetProfileModelsResponse> getProfileModels(
        Function<GetProfileModelsRequest.Builder, ObjectBuilder<GetProfileModelsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getProfileModels(fn.apply(new GetProfileModelsRequest.Builder()).build(), type);
    }

    /**
     * Get a profile models.
     */
    public final CompletableFuture<GetProfileModelsResponse> getProfileModels() throws IOException, OpenSearchException {
        return getProfileModels(ApiType.OSS);
    }

    /**
     * Get a profile models.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetProfileModelsResponse> getProfileModels(ApiType type) throws IOException, OpenSearchException {
        return getProfileModels(new GetProfileModelsRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_profile_tasks

    /**
     * Get a profile tasks.
     */
    public CompletableFuture<GetProfileTasksResponse> getProfileTasks(GetProfileTasksRequest request) throws IOException,
        OpenSearchException {
        return getProfileTasks(request, ApiType.OSS);
    }

    /**
     * Get a profile tasks.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetProfileTasksResponse> getProfileTasks(GetProfileTasksRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_profile_tasks", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetProfileTasksRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a profile tasks.
     *
     * @param fn a function that initializes a builder to create the {@link GetProfileTasksRequest}
     */
    public final CompletableFuture<GetProfileTasksResponse> getProfileTasks(
        Function<GetProfileTasksRequest.Builder, ObjectBuilder<GetProfileTasksRequest>> fn
    ) throws IOException, OpenSearchException {
        return getProfileTasks(fn, ApiType.OSS);
    }

    /**
     * Get a profile tasks.
     *
     * @param fn   a function that initializes a builder to create the {@link GetProfileTasksRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetProfileTasksResponse> getProfileTasks(
        Function<GetProfileTasksRequest.Builder, ObjectBuilder<GetProfileTasksRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getProfileTasks(fn.apply(new GetProfileTasksRequest.Builder()).build(), type);
    }

    /**
     * Get a profile tasks.
     */
    public final CompletableFuture<GetProfileTasksResponse> getProfileTasks() throws IOException, OpenSearchException {
        return getProfileTasks(ApiType.OSS);
    }

    /**
     * Get a profile tasks.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetProfileTasksResponse> getProfileTasks(ApiType type) throws IOException, OpenSearchException {
        return getProfileTasks(new GetProfileTasksRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_stats

    /**
     * Get stats.
     */
    public CompletableFuture<GetStatsResponse> getStats(GetStatsRequest request) throws IOException, OpenSearchException {
        return getStats(request, ApiType.OSS);
    }

    /**
     * Get stats.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetStatsResponse> getStats(GetStatsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_stats", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetStatsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get stats.
     *
     * @param fn a function that initializes a builder to create the {@link GetStatsRequest}
     */
    public final CompletableFuture<GetStatsResponse> getStats(Function<GetStatsRequest.Builder, ObjectBuilder<GetStatsRequest>> fn)
        throws IOException, OpenSearchException {
        return getStats(fn, ApiType.OSS);
    }

    /**
     * Get stats.
     *
     * @param fn   a function that initializes a builder to create the {@link GetStatsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetStatsResponse> getStats(
        Function<GetStatsRequest.Builder, ObjectBuilder<GetStatsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getStats(fn.apply(new GetStatsRequest.Builder()).build(), type);
    }

    /**
     * Get stats.
     */
    public final CompletableFuture<GetStatsResponse> getStats() throws IOException, OpenSearchException {
        return getStats(ApiType.OSS);
    }

    /**
     * Get stats.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetStatsResponse> getStats(ApiType type) throws IOException, OpenSearchException {
        return getStats(new GetStatsRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_task

    /**
     * Retrieves a task.
     */
    public CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request) throws IOException, OpenSearchException {
        return getTask(request, ApiType.OSS);
    }

    /**
     * Retrieves a task.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_task", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetTaskRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves a task.
     *
     * @param fn a function that initializes a builder to create the {@link GetTaskRequest}
     */
    public final CompletableFuture<GetTaskResponse> getTask(Function<GetTaskRequest.Builder, ObjectBuilder<GetTaskRequest>> fn)
        throws IOException, OpenSearchException {
        return getTask(fn, ApiType.OSS);
    }

    /**
     * Retrieves a task.
     *
     * @param fn   a function that initializes a builder to create the {@link GetTaskRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetTaskResponse> getTask(
        Function<GetTaskRequest.Builder, ObjectBuilder<GetTaskRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getTask(fn.apply(new GetTaskRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_tool

    /**
     * Get tools.
     */
    public CompletableFuture<GetToolResponse> getTool(GetToolRequest request) throws IOException, OpenSearchException {
        return getTool(request, ApiType.OSS);
    }

    /**
     * Get tools.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetToolResponse> getTool(GetToolRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_tool", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetToolRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get tools.
     *
     * @param fn a function that initializes a builder to create the {@link GetToolRequest}
     */
    public final CompletableFuture<GetToolResponse> getTool(Function<GetToolRequest.Builder, ObjectBuilder<GetToolRequest>> fn)
        throws IOException, OpenSearchException {
        return getTool(fn, ApiType.OSS);
    }

    /**
     * Get tools.
     *
     * @param fn   a function that initializes a builder to create the {@link GetToolRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetToolResponse> getTool(
        Function<GetToolRequest.Builder, ObjectBuilder<GetToolRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getTool(fn.apply(new GetToolRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.load_model

    /**
     * Deploys a model.
     */
    @Deprecated
    public CompletableFuture<LoadModelResponse> loadModel(LoadModelRequest request) throws IOException, OpenSearchException {
        return loadModel(request, ApiType.OSS);
    }

    /**
     * Deploys a model.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public CompletableFuture<LoadModelResponse> loadModel(LoadModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.load_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, LoadModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deploys a model.
     *
     * @param fn a function that initializes a builder to create the {@link LoadModelRequest}
     */
    @Deprecated
    public final CompletableFuture<LoadModelResponse> loadModel(Function<LoadModelRequest.Builder, ObjectBuilder<LoadModelRequest>> fn)
        throws IOException, OpenSearchException {
        return loadModel(fn, ApiType.OSS);
    }

    /**
     * Deploys a model.
     *
     * @param fn   a function that initializes a builder to create the {@link LoadModelRequest}
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final CompletableFuture<LoadModelResponse> loadModel(
        Function<LoadModelRequest.Builder, ObjectBuilder<LoadModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return loadModel(fn.apply(new LoadModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.predict_model_stream

    /**
     * Predicts a model in streaming mode.
     */
    public CompletableFuture<PredictModelStreamResponse> predictModelStream(PredictModelStreamRequest request) throws IOException,
        OpenSearchException {
        return predictModelStream(request, ApiType.OSS);
    }

    /**
     * Predicts a model in streaming mode.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PredictModelStreamResponse> predictModelStream(PredictModelStreamRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.predict_model_stream", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, PredictModelStreamRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Predicts a model in streaming mode.
     *
     * @param fn a function that initializes a builder to create the {@link PredictModelStreamRequest}
     */
    public final CompletableFuture<PredictModelStreamResponse> predictModelStream(
        Function<PredictModelStreamRequest.Builder, ObjectBuilder<PredictModelStreamRequest>> fn
    ) throws IOException, OpenSearchException {
        return predictModelStream(fn, ApiType.OSS);
    }

    /**
     * Predicts a model in streaming mode.
     *
     * @param fn   a function that initializes a builder to create the {@link PredictModelStreamRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PredictModelStreamResponse> predictModelStream(
        Function<PredictModelStreamRequest.Builder, ObjectBuilder<PredictModelStreamRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return predictModelStream(fn.apply(new PredictModelStreamRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.register_agents

    /**
     * Register an agent.
     */
    public CompletableFuture<RegisterAgentsResponse> registerAgents(RegisterAgentsRequest request) throws IOException, OpenSearchException {
        return registerAgents(request, ApiType.OSS);
    }

    /**
     * Register an agent.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<RegisterAgentsResponse> registerAgents(RegisterAgentsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.register_agents", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, RegisterAgentsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Register an agent.
     *
     * @param fn a function that initializes a builder to create the {@link RegisterAgentsRequest}
     */
    public final CompletableFuture<RegisterAgentsResponse> registerAgents(
        Function<RegisterAgentsRequest.Builder, ObjectBuilder<RegisterAgentsRequest>> fn
    ) throws IOException, OpenSearchException {
        return registerAgents(fn, ApiType.OSS);
    }

    /**
     * Register an agent.
     *
     * @param fn   a function that initializes a builder to create the {@link RegisterAgentsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RegisterAgentsResponse> registerAgents(
        Function<RegisterAgentsRequest.Builder, ObjectBuilder<RegisterAgentsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return registerAgents(fn.apply(new RegisterAgentsRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.register_model

    /**
     * Registers a model.
     */
    public CompletableFuture<RegisterModelResponse> registerModel(RegisterModelRequest request) throws IOException, OpenSearchException {
        return registerModel(request, ApiType.OSS);
    }

    /**
     * Registers a model.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<RegisterModelResponse> registerModel(RegisterModelRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.register_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, RegisterModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Registers a model.
     *
     * @param fn a function that initializes a builder to create the {@link RegisterModelRequest}
     */
    public final CompletableFuture<RegisterModelResponse> registerModel(
        Function<RegisterModelRequest.Builder, ObjectBuilder<RegisterModelRequest>> fn
    ) throws IOException, OpenSearchException {
        return registerModel(fn, ApiType.OSS);
    }

    /**
     * Registers a model.
     *
     * @param fn   a function that initializes a builder to create the {@link RegisterModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RegisterModelResponse> registerModel(
        Function<RegisterModelRequest.Builder, ObjectBuilder<RegisterModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return registerModel(fn.apply(new RegisterModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.register_model_group

    /**
     * Registers a model group.
     */
    public CompletableFuture<RegisterModelGroupResponse> registerModelGroup(RegisterModelGroupRequest request) throws IOException,
        OpenSearchException {
        return registerModelGroup(request, ApiType.OSS);
    }

    /**
     * Registers a model group.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<RegisterModelGroupResponse> registerModelGroup(RegisterModelGroupRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.register_model_group", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, RegisterModelGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Registers a model group.
     *
     * @param fn a function that initializes a builder to create the {@link RegisterModelGroupRequest}
     */
    public final CompletableFuture<RegisterModelGroupResponse> registerModelGroup(
        Function<RegisterModelGroupRequest.Builder, ObjectBuilder<RegisterModelGroupRequest>> fn
    ) throws IOException, OpenSearchException {
        return registerModelGroup(fn, ApiType.OSS);
    }

    /**
     * Registers a model group.
     *
     * @param fn   a function that initializes a builder to create the {@link RegisterModelGroupRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RegisterModelGroupResponse> registerModelGroup(
        Function<RegisterModelGroupRequest.Builder, ObjectBuilder<RegisterModelGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return registerModelGroup(fn.apply(new RegisterModelGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.register_model_meta

    /**
     * Registers model metadata.
     */
    public CompletableFuture<RegisterModelMetaResponse> registerModelMeta(RegisterModelMetaRequest request) throws IOException,
        OpenSearchException {
        return registerModelMeta(request, ApiType.OSS);
    }

    /**
     * Registers model metadata.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<RegisterModelMetaResponse> registerModelMeta(RegisterModelMetaRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.register_model_meta", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, RegisterModelMetaRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Registers model metadata.
     *
     * @param fn a function that initializes a builder to create the {@link RegisterModelMetaRequest}
     */
    public final CompletableFuture<RegisterModelMetaResponse> registerModelMeta(
        Function<RegisterModelMetaRequest.Builder, ObjectBuilder<RegisterModelMetaRequest>> fn
    ) throws IOException, OpenSearchException {
        return registerModelMeta(fn, ApiType.OSS);
    }

    /**
     * Registers model metadata.
     *
     * @param fn   a function that initializes a builder to create the {@link RegisterModelMetaRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<RegisterModelMetaResponse> registerModelMeta(
        Function<RegisterModelMetaRequest.Builder, ObjectBuilder<RegisterModelMetaRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return registerModelMeta(fn.apply(new RegisterModelMetaRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.undeploy_model

    /**
     * Undeploys a model.
     */
    public CompletableFuture<UndeployModelResponse> undeployModel(UndeployModelRequest request) throws IOException, OpenSearchException {
        return undeployModel(request, ApiType.OSS);
    }

    /**
     * Undeploys a model.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UndeployModelResponse> undeployModel(UndeployModelRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.undeploy_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UndeployModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Undeploys a model.
     *
     * @param fn a function that initializes a builder to create the {@link UndeployModelRequest}
     */
    public final CompletableFuture<UndeployModelResponse> undeployModel(
        Function<UndeployModelRequest.Builder, ObjectBuilder<UndeployModelRequest>> fn
    ) throws IOException, OpenSearchException {
        return undeployModel(fn, ApiType.OSS);
    }

    /**
     * Undeploys a model.
     *
     * @param fn   a function that initializes a builder to create the {@link UndeployModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UndeployModelResponse> undeployModel(
        Function<UndeployModelRequest.Builder, ObjectBuilder<UndeployModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return undeployModel(fn.apply(new UndeployModelRequest.Builder()).build(), type);
    }

    /**
     * Undeploys a model.
     */
    public final CompletableFuture<UndeployModelResponse> undeployModel() throws IOException, OpenSearchException {
        return undeployModel(ApiType.OSS);
    }

    /**
     * Undeploys a model.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UndeployModelResponse> undeployModel(ApiType type) throws IOException, OpenSearchException {
        return undeployModel(new UndeployModelRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.unload_model

    /**
     * Unloads a model.
     */
    @Deprecated
    public CompletableFuture<UnloadModelResponse> unloadModel(UnloadModelRequest request) throws IOException, OpenSearchException {
        return unloadModel(request, ApiType.OSS);
    }

    /**
     * Unloads a model.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public CompletableFuture<UnloadModelResponse> unloadModel(UnloadModelRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.unload_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UnloadModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Unloads a model.
     *
     * @param fn a function that initializes a builder to create the {@link UnloadModelRequest}
     */
    @Deprecated
    public final CompletableFuture<UnloadModelResponse> unloadModel(
        Function<UnloadModelRequest.Builder, ObjectBuilder<UnloadModelRequest>> fn
    ) throws IOException, OpenSearchException {
        return unloadModel(fn, ApiType.OSS);
    }

    /**
     * Unloads a model.
     *
     * @param fn   a function that initializes a builder to create the {@link UnloadModelRequest}
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final CompletableFuture<UnloadModelResponse> unloadModel(
        Function<UnloadModelRequest.Builder, ObjectBuilder<UnloadModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return unloadModel(fn.apply(new UnloadModelRequest.Builder()).build(), type);
    }

    /**
     * Unloads a model.
     */
    @Deprecated
    public final CompletableFuture<UnloadModelResponse> unloadModel() throws IOException, OpenSearchException {
        return unloadModel(ApiType.OSS);
    }

    /**
     * Unloads a model.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final CompletableFuture<UnloadModelResponse> unloadModel(ApiType type) throws IOException, OpenSearchException {
        return unloadModel(new UnloadModelRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.update_agentic_memory

    /**
     * Update a specific memory by its type and ID.
     */
    public CompletableFuture<UpdateAgenticMemoryResponse> updateAgenticMemory(UpdateAgenticMemoryRequest request) throws IOException,
        OpenSearchException {
        return updateAgenticMemory(request, ApiType.OSS);
    }

    /**
     * Update a specific memory by its type and ID.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateAgenticMemoryResponse> updateAgenticMemory(UpdateAgenticMemoryRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.update_agentic_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateAgenticMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Update a specific memory by its type and ID.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateAgenticMemoryRequest}
     */
    public final CompletableFuture<UpdateAgenticMemoryResponse> updateAgenticMemory(
        Function<UpdateAgenticMemoryRequest.Builder, ObjectBuilder<UpdateAgenticMemoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateAgenticMemory(fn, ApiType.OSS);
    }

    /**
     * Update a specific memory by its type and ID.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateAgenticMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateAgenticMemoryResponse> updateAgenticMemory(
        Function<UpdateAgenticMemoryRequest.Builder, ObjectBuilder<UpdateAgenticMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateAgenticMemory(fn.apply(new UpdateAgenticMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_connector

    /**
     * Updates a standalone connector.
     */
    public CompletableFuture<UpdateConnectorResponse> updateConnector(UpdateConnectorRequest request) throws IOException,
        OpenSearchException {
        return updateConnector(request, ApiType.OSS);
    }

    /**
     * Updates a standalone connector.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateConnectorResponse> updateConnector(UpdateConnectorRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.update_connector", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateConnectorRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates a standalone connector.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateConnectorRequest}
     */
    public final CompletableFuture<UpdateConnectorResponse> updateConnector(
        Function<UpdateConnectorRequest.Builder, ObjectBuilder<UpdateConnectorRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateConnector(fn, ApiType.OSS);
    }

    /**
     * Updates a standalone connector.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateConnectorRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateConnectorResponse> updateConnector(
        Function<UpdateConnectorRequest.Builder, ObjectBuilder<UpdateConnectorRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateConnector(fn.apply(new UpdateConnectorRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_controller

    /**
     * Updates a controller.
     */
    public CompletableFuture<UpdateControllerResponse> updateController(UpdateControllerRequest request) throws IOException,
        OpenSearchException {
        return updateController(request, ApiType.OSS);
    }

    /**
     * Updates a controller.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateControllerResponse> updateController(UpdateControllerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.update_controller", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateControllerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates a controller.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateControllerRequest}
     */
    public final CompletableFuture<UpdateControllerResponse> updateController(
        Function<UpdateControllerRequest.Builder, ObjectBuilder<UpdateControllerRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateController(fn, ApiType.OSS);
    }

    /**
     * Updates a controller.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateControllerRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateControllerResponse> updateController(
        Function<UpdateControllerRequest.Builder, ObjectBuilder<UpdateControllerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateController(fn.apply(new UpdateControllerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_memory

    /**
     * Update a memory.
     */
    public CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request) throws IOException, OpenSearchException {
        return updateMemory(request, ApiType.OSS);
    }

    /**
     * Update a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.update_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Update a memory.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateMemoryRequest}
     */
    public final CompletableFuture<UpdateMemoryResponse> updateMemory(
        Function<UpdateMemoryRequest.Builder, ObjectBuilder<UpdateMemoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateMemory(fn, ApiType.OSS);
    }

    /**
     * Update a memory.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateMemoryResponse> updateMemory(
        Function<UpdateMemoryRequest.Builder, ObjectBuilder<UpdateMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateMemory(fn.apply(new UpdateMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_memory_container

    /**
     * Update a memory container.
     */
    public CompletableFuture<UpdateMemoryContainerResponse> updateMemoryContainer(UpdateMemoryContainerRequest request) throws IOException,
        OpenSearchException {
        return updateMemoryContainer(request, ApiType.OSS);
    }

    /**
     * Update a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateMemoryContainerResponse> updateMemoryContainer(UpdateMemoryContainerRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.update_memory_container", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateMemoryContainerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Update a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateMemoryContainerRequest}
     */
    public final CompletableFuture<UpdateMemoryContainerResponse> updateMemoryContainer(
        Function<UpdateMemoryContainerRequest.Builder, ObjectBuilder<UpdateMemoryContainerRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateMemoryContainer(fn, ApiType.OSS);
    }

    /**
     * Update a memory container.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateMemoryContainerRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateMemoryContainerResponse> updateMemoryContainer(
        Function<UpdateMemoryContainerRequest.Builder, ObjectBuilder<UpdateMemoryContainerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateMemoryContainer(fn.apply(new UpdateMemoryContainerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_message

    /**
     * Update a message.
     */
    public CompletableFuture<UpdateMessageResponse> updateMessage(UpdateMessageRequest request) throws IOException, OpenSearchException {
        return updateMessage(request, ApiType.OSS);
    }

    /**
     * Update a message.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateMessageResponse> updateMessage(UpdateMessageRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.update_message", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateMessageRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Update a message.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateMessageRequest}
     */
    public final CompletableFuture<UpdateMessageResponse> updateMessage(
        Function<UpdateMessageRequest.Builder, ObjectBuilder<UpdateMessageRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateMessage(fn, ApiType.OSS);
    }

    /**
     * Update a message.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateMessageRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateMessageResponse> updateMessage(
        Function<UpdateMessageRequest.Builder, ObjectBuilder<UpdateMessageRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateMessage(fn.apply(new UpdateMessageRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_model

    /**
     * Updates a model.
     */
    public CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request) throws IOException, OpenSearchException {
        return updateModel(request, ApiType.OSS);
    }

    /**
     * Updates a model.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.update_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates a model.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateModelRequest}
     */
    public final CompletableFuture<UpdateModelResponse> updateModel(
        Function<UpdateModelRequest.Builder, ObjectBuilder<UpdateModelRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateModel(fn, ApiType.OSS);
    }

    /**
     * Updates a model.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateModelResponse> updateModel(
        Function<UpdateModelRequest.Builder, ObjectBuilder<UpdateModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateModel(fn.apply(new UpdateModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_model_group

    /**
     * Updates a model group.
     */
    public CompletableFuture<UpdateModelGroupResponse> updateModelGroup(UpdateModelGroupRequest request) throws IOException,
        OpenSearchException {
        return updateModelGroup(request, ApiType.OSS);
    }

    /**
     * Updates a model group.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateModelGroupResponse> updateModelGroup(UpdateModelGroupRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.update_model_group", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateModelGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates a model group.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateModelGroupRequest}
     */
    public final CompletableFuture<UpdateModelGroupResponse> updateModelGroup(
        Function<UpdateModelGroupRequest.Builder, ObjectBuilder<UpdateModelGroupRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateModelGroup(fn, ApiType.OSS);
    }

    /**
     * Updates a model group.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateModelGroupRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateModelGroupResponse> updateModelGroup(
        Function<UpdateModelGroupRequest.Builder, ObjectBuilder<UpdateModelGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateModelGroup(fn.apply(new UpdateModelGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.upload_chunk

    /**
     * Uploads model chunk.
     */
    public CompletableFuture<UploadChunkResponse> uploadChunk(UploadChunkRequest request) throws IOException, OpenSearchException {
        return uploadChunk(request, ApiType.OSS);
    }

    /**
     * Uploads model chunk.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UploadChunkResponse> uploadChunk(UploadChunkRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.upload_chunk", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UploadChunkRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Uploads model chunk.
     *
     * @param fn a function that initializes a builder to create the {@link UploadChunkRequest}
     */
    public final CompletableFuture<UploadChunkResponse> uploadChunk(
        Function<UploadChunkRequest.Builder, ObjectBuilder<UploadChunkRequest>> fn
    ) throws IOException, OpenSearchException {
        return uploadChunk(fn, ApiType.OSS);
    }

    /**
     * Uploads model chunk.
     *
     * @param fn   a function that initializes a builder to create the {@link UploadChunkRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UploadChunkResponse> uploadChunk(
        Function<UploadChunkRequest.Builder, ObjectBuilder<UploadChunkRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return uploadChunk(fn.apply(new UploadChunkRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.upload_model

    /**
     * Registers a model.
     */
    @Deprecated
    public CompletableFuture<UploadModelResponse> uploadModel(UploadModelRequest request) throws IOException, OpenSearchException {
        return uploadModel(request, ApiType.OSS);
    }

    /**
     * Registers a model.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public CompletableFuture<UploadModelResponse> uploadModel(UploadModelRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.upload_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UploadModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Registers a model.
     *
     * @param fn a function that initializes a builder to create the {@link UploadModelRequest}
     */
    @Deprecated
    public final CompletableFuture<UploadModelResponse> uploadModel(
        Function<UploadModelRequest.Builder, ObjectBuilder<UploadModelRequest>> fn
    ) throws IOException, OpenSearchException {
        return uploadModel(fn, ApiType.OSS);
    }

    /**
     * Registers a model.
     *
     * @param fn   a function that initializes a builder to create the {@link UploadModelRequest}
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final CompletableFuture<UploadModelResponse> uploadModel(
        Function<UploadModelRequest.Builder, ObjectBuilder<UploadModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return uploadModel(fn.apply(new UploadModelRequest.Builder()).build(), type);
    }
}
