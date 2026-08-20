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
public class OpenSearchMlClient extends ApiClient<OpenSearchTransport, OpenSearchMlClient> {
    public OpenSearchMlClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchMlClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchMlClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchMlClient(this.transport, transportOptions);
    }

    // ----- Endpoint: ml.add_agentic_memory

    /**
     * Add agentic memory to a memory container.
     */
    public AddAgenticMemoryResponse addAgenticMemory(AddAgenticMemoryRequest request) throws IOException, OpenSearchException {
        return addAgenticMemory(request, ApiType.OSS);
    }

    /**
     * Add agentic memory to a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public AddAgenticMemoryResponse addAgenticMemory(AddAgenticMemoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.add_agentic_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, AddAgenticMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Add agentic memory to a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link AddAgenticMemoryRequest}
     */
    public final AddAgenticMemoryResponse addAgenticMemory(
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
    public final AddAgenticMemoryResponse addAgenticMemory(
        Function<AddAgenticMemoryRequest.Builder, ObjectBuilder<AddAgenticMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return addAgenticMemory(fn.apply(new AddAgenticMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.create_connector

    /**
     * Creates a standalone connector.
     */
    public CreateConnectorResponse createConnector(CreateConnectorRequest request) throws IOException, OpenSearchException {
        return createConnector(request, ApiType.OSS);
    }

    /**
     * Creates a standalone connector.
     *
     * @param type target OpenSearch API distribution
     */
    public CreateConnectorResponse createConnector(CreateConnectorRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.create_connector", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, CreateConnectorRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates a standalone connector.
     *
     * @param fn a function that initializes a builder to create the {@link CreateConnectorRequest}
     */
    public final CreateConnectorResponse createConnector(Function<CreateConnectorRequest.Builder, ObjectBuilder<CreateConnectorRequest>> fn)
        throws IOException, OpenSearchException {
        return createConnector(fn, ApiType.OSS);
    }

    /**
     * Creates a standalone connector.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateConnectorRequest}
     * @param type target OpenSearch API distribution
     */
    public final CreateConnectorResponse createConnector(
        Function<CreateConnectorRequest.Builder, ObjectBuilder<CreateConnectorRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createConnector(fn.apply(new CreateConnectorRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.create_controller

    /**
     * Creates a controller.
     */
    public CreateControllerResponse createController(CreateControllerRequest request) throws IOException, OpenSearchException {
        return createController(request, ApiType.OSS);
    }

    /**
     * Creates a controller.
     *
     * @param type target OpenSearch API distribution
     */
    public CreateControllerResponse createController(CreateControllerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.create_controller", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, CreateControllerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates a controller.
     *
     * @param fn a function that initializes a builder to create the {@link CreateControllerRequest}
     */
    public final CreateControllerResponse createController(
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
    public final CreateControllerResponse createController(
        Function<CreateControllerRequest.Builder, ObjectBuilder<CreateControllerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createController(fn.apply(new CreateControllerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.create_memory

    /**
     * Create a memory.
     */
    public CreateMemoryResponse createMemory(CreateMemoryRequest request) throws IOException, OpenSearchException {
        return createMemory(request, ApiType.OSS);
    }

    /**
     * Create a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public CreateMemoryResponse createMemory(CreateMemoryRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.create_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, CreateMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create a memory.
     *
     * @param fn a function that initializes a builder to create the {@link CreateMemoryRequest}
     */
    public final CreateMemoryResponse createMemory(Function<CreateMemoryRequest.Builder, ObjectBuilder<CreateMemoryRequest>> fn)
        throws IOException, OpenSearchException {
        return createMemory(fn, ApiType.OSS);
    }

    /**
     * Create a memory.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CreateMemoryResponse createMemory(
        Function<CreateMemoryRequest.Builder, ObjectBuilder<CreateMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createMemory(fn.apply(new CreateMemoryRequest.Builder()).build(), type);
    }

    /**
     * Create a memory.
     */
    public final CreateMemoryResponse createMemory() throws IOException, OpenSearchException {
        return createMemory(ApiType.OSS);
    }

    /**
     * Create a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public final CreateMemoryResponse createMemory(ApiType type) throws IOException, OpenSearchException {
        return createMemory(new CreateMemoryRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.create_memory_container

    /**
     * Create a memory container.
     */
    public CreateMemoryContainerResponse createMemoryContainer(CreateMemoryContainerRequest request) throws IOException,
        OpenSearchException {
        return createMemoryContainer(request, ApiType.OSS);
    }

    /**
     * Create a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public CreateMemoryContainerResponse createMemoryContainer(CreateMemoryContainerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.create_memory_container", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, CreateMemoryContainerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link CreateMemoryContainerRequest}
     */
    public final CreateMemoryContainerResponse createMemoryContainer(
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
    public final CreateMemoryContainerResponse createMemoryContainer(
        Function<CreateMemoryContainerRequest.Builder, ObjectBuilder<CreateMemoryContainerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createMemoryContainer(fn.apply(new CreateMemoryContainerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.create_memory_container_session

    /**
     * Create session in a memory container.
     */
    public CreateMemoryContainerSessionResponse createMemoryContainerSession(CreateMemoryContainerSessionRequest request)
        throws IOException, OpenSearchException {
        return createMemoryContainerSession(request, ApiType.OSS);
    }

    /**
     * Create session in a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public CreateMemoryContainerSessionResponse createMemoryContainerSession(CreateMemoryContainerSessionRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.create_memory_container_session", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, CreateMemoryContainerSessionRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create session in a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link CreateMemoryContainerSessionRequest}
     */
    public final CreateMemoryContainerSessionResponse createMemoryContainerSession(
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
    public final CreateMemoryContainerSessionResponse createMemoryContainerSession(
        Function<CreateMemoryContainerSessionRequest.Builder, ObjectBuilder<CreateMemoryContainerSessionRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createMemoryContainerSession(fn.apply(new CreateMemoryContainerSessionRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.create_message

    /**
     * Create a message.
     */
    public CreateMessageResponse createMessage(CreateMessageRequest request) throws IOException, OpenSearchException {
        return createMessage(request, ApiType.OSS);
    }

    /**
     * Create a message.
     *
     * @param type target OpenSearch API distribution
     */
    public CreateMessageResponse createMessage(CreateMessageRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.create_message", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, CreateMessageRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create a message.
     *
     * @param fn a function that initializes a builder to create the {@link CreateMessageRequest}
     */
    public final CreateMessageResponse createMessage(Function<CreateMessageRequest.Builder, ObjectBuilder<CreateMessageRequest>> fn)
        throws IOException, OpenSearchException {
        return createMessage(fn, ApiType.OSS);
    }

    /**
     * Create a message.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateMessageRequest}
     * @param type target OpenSearch API distribution
     */
    public final CreateMessageResponse createMessage(
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
    public CreateModelMetaResponse createModelMeta(CreateModelMetaRequest request) throws IOException, OpenSearchException {
        return createModelMeta(request, ApiType.OSS);
    }

    /**
     * Registers model metadata.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public CreateModelMetaResponse createModelMeta(CreateModelMetaRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.create_model_meta", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, CreateModelMetaRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Registers model metadata.
     *
     * @param fn a function that initializes a builder to create the {@link CreateModelMetaRequest}
     */
    @Deprecated
    public final CreateModelMetaResponse createModelMeta(Function<CreateModelMetaRequest.Builder, ObjectBuilder<CreateModelMetaRequest>> fn)
        throws IOException, OpenSearchException {
        return createModelMeta(fn, ApiType.OSS);
    }

    /**
     * Registers model metadata.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateModelMetaRequest}
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final CreateModelMetaResponse createModelMeta(
        Function<CreateModelMetaRequest.Builder, ObjectBuilder<CreateModelMetaRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createModelMeta(fn.apply(new CreateModelMetaRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_agent

    /**
     * Delete an agent.
     */
    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) throws IOException, OpenSearchException {
        return deleteAgent(request, ApiType.OSS);
    }

    /**
     * Delete an agent.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_agent", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteAgentRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete an agent.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteAgentRequest}
     */
    public final DeleteAgentResponse deleteAgent(Function<DeleteAgentRequest.Builder, ObjectBuilder<DeleteAgentRequest>> fn)
        throws IOException, OpenSearchException {
        return deleteAgent(fn, ApiType.OSS);
    }

    /**
     * Delete an agent.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteAgentRequest}
     * @param type target OpenSearch API distribution
     */
    public final DeleteAgentResponse deleteAgent(Function<DeleteAgentRequest.Builder, ObjectBuilder<DeleteAgentRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return deleteAgent(fn.apply(new DeleteAgentRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_agentic_memory

    /**
     * Delete a specific memory by its type and ID.
     */
    public DeleteAgenticMemoryResponse deleteAgenticMemory(DeleteAgenticMemoryRequest request) throws IOException, OpenSearchException {
        return deleteAgenticMemory(request, ApiType.OSS);
    }

    /**
     * Delete a specific memory by its type and ID.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteAgenticMemoryResponse deleteAgenticMemory(DeleteAgenticMemoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_agentic_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteAgenticMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete a specific memory by its type and ID.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteAgenticMemoryRequest}
     */
    public final DeleteAgenticMemoryResponse deleteAgenticMemory(
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
    public final DeleteAgenticMemoryResponse deleteAgenticMemory(
        Function<DeleteAgenticMemoryRequest.Builder, ObjectBuilder<DeleteAgenticMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteAgenticMemory(fn.apply(new DeleteAgenticMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_agentic_memory_query

    /**
     * Delete multiple memories using a query to match specific criteria.
     */
    public DeleteAgenticMemoryQueryResponse deleteAgenticMemoryQuery(DeleteAgenticMemoryQueryRequest request) throws IOException,
        OpenSearchException {
        return deleteAgenticMemoryQuery(request, ApiType.OSS);
    }

    /**
     * Delete multiple memories using a query to match specific criteria.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteAgenticMemoryQueryResponse deleteAgenticMemoryQuery(DeleteAgenticMemoryQueryRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_agentic_memory_query", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteAgenticMemoryQueryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete multiple memories using a query to match specific criteria.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteAgenticMemoryQueryRequest}
     */
    public final DeleteAgenticMemoryQueryResponse deleteAgenticMemoryQuery(
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
    public final DeleteAgenticMemoryQueryResponse deleteAgenticMemoryQuery(
        Function<DeleteAgenticMemoryQueryRequest.Builder, ObjectBuilder<DeleteAgenticMemoryQueryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteAgenticMemoryQuery(fn.apply(new DeleteAgenticMemoryQueryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_connector

    /**
     * Deletes a standalone connector.
     */
    public DeleteConnectorResponse deleteConnector(DeleteConnectorRequest request) throws IOException, OpenSearchException {
        return deleteConnector(request, ApiType.OSS);
    }

    /**
     * Deletes a standalone connector.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteConnectorResponse deleteConnector(DeleteConnectorRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_connector", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteConnectorRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a standalone connector.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteConnectorRequest}
     */
    public final DeleteConnectorResponse deleteConnector(Function<DeleteConnectorRequest.Builder, ObjectBuilder<DeleteConnectorRequest>> fn)
        throws IOException, OpenSearchException {
        return deleteConnector(fn, ApiType.OSS);
    }

    /**
     * Deletes a standalone connector.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteConnectorRequest}
     * @param type target OpenSearch API distribution
     */
    public final DeleteConnectorResponse deleteConnector(
        Function<DeleteConnectorRequest.Builder, ObjectBuilder<DeleteConnectorRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteConnector(fn.apply(new DeleteConnectorRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_controller

    /**
     * Deletes a controller.
     */
    public DeleteControllerResponse deleteController(DeleteControllerRequest request) throws IOException, OpenSearchException {
        return deleteController(request, ApiType.OSS);
    }

    /**
     * Deletes a controller.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteControllerResponse deleteController(DeleteControllerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_controller", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteControllerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a controller.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteControllerRequest}
     */
    public final DeleteControllerResponse deleteController(
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
    public final DeleteControllerResponse deleteController(
        Function<DeleteControllerRequest.Builder, ObjectBuilder<DeleteControllerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteController(fn.apply(new DeleteControllerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_memory

    /**
     * Delete a memory.
     */
    public DeleteMemoryResponse deleteMemory(DeleteMemoryRequest request) throws IOException, OpenSearchException {
        return deleteMemory(request, ApiType.OSS);
    }

    /**
     * Delete a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteMemoryResponse deleteMemory(DeleteMemoryRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete a memory.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteMemoryRequest}
     */
    public final DeleteMemoryResponse deleteMemory(Function<DeleteMemoryRequest.Builder, ObjectBuilder<DeleteMemoryRequest>> fn)
        throws IOException, OpenSearchException {
        return deleteMemory(fn, ApiType.OSS);
    }

    /**
     * Delete a memory.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final DeleteMemoryResponse deleteMemory(
        Function<DeleteMemoryRequest.Builder, ObjectBuilder<DeleteMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteMemory(fn.apply(new DeleteMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_memory_container

    /**
     * Delete a memory container.
     */
    public DeleteMemoryContainerResponse deleteMemoryContainer(DeleteMemoryContainerRequest request) throws IOException,
        OpenSearchException {
        return deleteMemoryContainer(request, ApiType.OSS);
    }

    /**
     * Delete a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteMemoryContainerResponse deleteMemoryContainer(DeleteMemoryContainerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_memory_container", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteMemoryContainerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteMemoryContainerRequest}
     */
    public final DeleteMemoryContainerResponse deleteMemoryContainer(
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
    public final DeleteMemoryContainerResponse deleteMemoryContainer(
        Function<DeleteMemoryContainerRequest.Builder, ObjectBuilder<DeleteMemoryContainerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteMemoryContainer(fn.apply(new DeleteMemoryContainerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_model

    /**
     * Deletes a model.
     */
    public DeleteModelResponse deleteModel(DeleteModelRequest request) throws IOException, OpenSearchException {
        return deleteModel(request, ApiType.OSS);
    }

    /**
     * Deletes a model.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteModelResponse deleteModel(DeleteModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a model.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteModelRequest}
     */
    public final DeleteModelResponse deleteModel(Function<DeleteModelRequest.Builder, ObjectBuilder<DeleteModelRequest>> fn)
        throws IOException, OpenSearchException {
        return deleteModel(fn, ApiType.OSS);
    }

    /**
     * Deletes a model.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final DeleteModelResponse deleteModel(Function<DeleteModelRequest.Builder, ObjectBuilder<DeleteModelRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return deleteModel(fn.apply(new DeleteModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_model_group

    /**
     * Deletes a model group.
     */
    public DeleteModelGroupResponse deleteModelGroup(DeleteModelGroupRequest request) throws IOException, OpenSearchException {
        return deleteModelGroup(request, ApiType.OSS);
    }

    /**
     * Deletes a model group.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteModelGroupResponse deleteModelGroup(DeleteModelGroupRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_model_group", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteModelGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a model group.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteModelGroupRequest}
     */
    public final DeleteModelGroupResponse deleteModelGroup(
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
    public final DeleteModelGroupResponse deleteModelGroup(
        Function<DeleteModelGroupRequest.Builder, ObjectBuilder<DeleteModelGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteModelGroup(fn.apply(new DeleteModelGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.delete_task

    /**
     * Deletes a task.
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) throws IOException, OpenSearchException {
        return deleteTask(request, ApiType.OSS);
    }

    /**
     * Deletes a task.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.delete_task", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteTaskRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a task.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteTaskRequest}
     */
    public final DeleteTaskResponse deleteTask(Function<DeleteTaskRequest.Builder, ObjectBuilder<DeleteTaskRequest>> fn) throws IOException,
        OpenSearchException {
        return deleteTask(fn, ApiType.OSS);
    }

    /**
     * Deletes a task.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteTaskRequest}
     * @param type target OpenSearch API distribution
     */
    public final DeleteTaskResponse deleteTask(Function<DeleteTaskRequest.Builder, ObjectBuilder<DeleteTaskRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return deleteTask(fn.apply(new DeleteTaskRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.deploy_model

    /**
     * Deploys a model.
     */
    public DeployModelResponse deployModel(DeployModelRequest request) throws IOException, OpenSearchException {
        return deployModel(request, ApiType.OSS);
    }

    /**
     * Deploys a model.
     *
     * @param type target OpenSearch API distribution
     */
    public DeployModelResponse deployModel(DeployModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.deploy_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeployModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deploys a model.
     *
     * @param fn a function that initializes a builder to create the {@link DeployModelRequest}
     */
    public final DeployModelResponse deployModel(Function<DeployModelRequest.Builder, ObjectBuilder<DeployModelRequest>> fn)
        throws IOException, OpenSearchException {
        return deployModel(fn, ApiType.OSS);
    }

    /**
     * Deploys a model.
     *
     * @param fn   a function that initializes a builder to create the {@link DeployModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final DeployModelResponse deployModel(Function<DeployModelRequest.Builder, ObjectBuilder<DeployModelRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return deployModel(fn.apply(new DeployModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.execute_agent

    /**
     * Execute an agent.
     */
    public ExecuteAgentResponse executeAgent(ExecuteAgentRequest request) throws IOException, OpenSearchException {
        return executeAgent(request, ApiType.OSS);
    }

    /**
     * Execute an agent.
     *
     * @param type target OpenSearch API distribution
     */
    public ExecuteAgentResponse executeAgent(ExecuteAgentRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.execute_agent", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, ExecuteAgentRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Execute an agent.
     *
     * @param fn a function that initializes a builder to create the {@link ExecuteAgentRequest}
     */
    public final ExecuteAgentResponse executeAgent(Function<ExecuteAgentRequest.Builder, ObjectBuilder<ExecuteAgentRequest>> fn)
        throws IOException, OpenSearchException {
        return executeAgent(fn, ApiType.OSS);
    }

    /**
     * Execute an agent.
     *
     * @param fn   a function that initializes a builder to create the {@link ExecuteAgentRequest}
     * @param type target OpenSearch API distribution
     */
    public final ExecuteAgentResponse executeAgent(
        Function<ExecuteAgentRequest.Builder, ObjectBuilder<ExecuteAgentRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return executeAgent(fn.apply(new ExecuteAgentRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.execute_agent_stream

    /**
     * Execute an agent in streaming mode.
     */
    public ExecuteAgentStreamResponse executeAgentStream(ExecuteAgentStreamRequest request) throws IOException, OpenSearchException {
        return executeAgentStream(request, ApiType.OSS);
    }

    /**
     * Execute an agent in streaming mode.
     *
     * @param type target OpenSearch API distribution
     */
    public ExecuteAgentStreamResponse executeAgentStream(ExecuteAgentStreamRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.execute_agent_stream", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, ExecuteAgentStreamRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Execute an agent in streaming mode.
     *
     * @param fn a function that initializes a builder to create the {@link ExecuteAgentStreamRequest}
     */
    public final ExecuteAgentStreamResponse executeAgentStream(
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
    public final ExecuteAgentStreamResponse executeAgentStream(
        Function<ExecuteAgentStreamRequest.Builder, ObjectBuilder<ExecuteAgentStreamRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return executeAgentStream(fn.apply(new ExecuteAgentStreamRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.execute_tool

    /**
     * Execute a tool.
     */
    public ExecuteToolResponse executeTool(ExecuteToolRequest request) throws IOException, OpenSearchException {
        return executeTool(request, ApiType.OSS);
    }

    /**
     * Execute a tool.
     *
     * @param type target OpenSearch API distribution
     */
    public ExecuteToolResponse executeTool(ExecuteToolRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.execute_tool", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, ExecuteToolRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Execute a tool.
     *
     * @param fn a function that initializes a builder to create the {@link ExecuteToolRequest}
     */
    public final ExecuteToolResponse executeTool(Function<ExecuteToolRequest.Builder, ObjectBuilder<ExecuteToolRequest>> fn)
        throws IOException, OpenSearchException {
        return executeTool(fn, ApiType.OSS);
    }

    /**
     * Execute a tool.
     *
     * @param fn   a function that initializes a builder to create the {@link ExecuteToolRequest}
     * @param type target OpenSearch API distribution
     */
    public final ExecuteToolResponse executeTool(Function<ExecuteToolRequest.Builder, ObjectBuilder<ExecuteToolRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return executeTool(fn.apply(new ExecuteToolRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_agent

    /**
     * Get an agent.
     */
    public GetAgentResponse getAgent(GetAgentRequest request) throws IOException, OpenSearchException {
        return getAgent(request, ApiType.OSS);
    }

    /**
     * Get an agent.
     *
     * @param type target OpenSearch API distribution
     */
    public GetAgentResponse getAgent(GetAgentRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_agent", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetAgentRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get an agent.
     *
     * @param fn a function that initializes a builder to create the {@link GetAgentRequest}
     */
    public final GetAgentResponse getAgent(Function<GetAgentRequest.Builder, ObjectBuilder<GetAgentRequest>> fn) throws IOException,
        OpenSearchException {
        return getAgent(fn, ApiType.OSS);
    }

    /**
     * Get an agent.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAgentRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetAgentResponse getAgent(Function<GetAgentRequest.Builder, ObjectBuilder<GetAgentRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getAgent(fn.apply(new GetAgentRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_agentic_memory

    /**
     * Get a specific memory by its type and ID.
     */
    public GetAgenticMemoryResponse getAgenticMemory(GetAgenticMemoryRequest request) throws IOException, OpenSearchException {
        return getAgenticMemory(request, ApiType.OSS);
    }

    /**
     * Get a specific memory by its type and ID.
     *
     * @param type target OpenSearch API distribution
     */
    public GetAgenticMemoryResponse getAgenticMemory(GetAgenticMemoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_agentic_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetAgenticMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a specific memory by its type and ID.
     *
     * @param fn a function that initializes a builder to create the {@link GetAgenticMemoryRequest}
     */
    public final GetAgenticMemoryResponse getAgenticMemory(
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
    public final GetAgenticMemoryResponse getAgenticMemory(
        Function<GetAgenticMemoryRequest.Builder, ObjectBuilder<GetAgenticMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAgenticMemory(fn.apply(new GetAgenticMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_all_memories

    /**
     * Get all memories.
     */
    public GetAllMemoriesResponse getAllMemories(GetAllMemoriesRequest request) throws IOException, OpenSearchException {
        return getAllMemories(request, ApiType.OSS);
    }

    /**
     * Get all memories.
     *
     * @param type target OpenSearch API distribution
     */
    public GetAllMemoriesResponse getAllMemories(GetAllMemoriesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_all_memories", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetAllMemoriesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get all memories.
     *
     * @param fn a function that initializes a builder to create the {@link GetAllMemoriesRequest}
     */
    public final GetAllMemoriesResponse getAllMemories(Function<GetAllMemoriesRequest.Builder, ObjectBuilder<GetAllMemoriesRequest>> fn)
        throws IOException, OpenSearchException {
        return getAllMemories(fn, ApiType.OSS);
    }

    /**
     * Get all memories.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAllMemoriesRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetAllMemoriesResponse getAllMemories(
        Function<GetAllMemoriesRequest.Builder, ObjectBuilder<GetAllMemoriesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAllMemories(fn.apply(new GetAllMemoriesRequest.Builder()).build(), type);
    }

    /**
     * Get all memories.
     */
    public final GetAllMemoriesResponse getAllMemories() throws IOException, OpenSearchException {
        return getAllMemories(ApiType.OSS);
    }

    /**
     * Get all memories.
     *
     * @param type target OpenSearch API distribution
     */
    public final GetAllMemoriesResponse getAllMemories(ApiType type) throws IOException, OpenSearchException {
        return getAllMemories(new GetAllMemoriesRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_all_messages

    /**
     * Get all messages in a memory.
     */
    public GetAllMessagesResponse getAllMessages(GetAllMessagesRequest request) throws IOException, OpenSearchException {
        return getAllMessages(request, ApiType.OSS);
    }

    /**
     * Get all messages in a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public GetAllMessagesResponse getAllMessages(GetAllMessagesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_all_messages", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetAllMessagesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get all messages in a memory.
     *
     * @param fn a function that initializes a builder to create the {@link GetAllMessagesRequest}
     */
    public final GetAllMessagesResponse getAllMessages(Function<GetAllMessagesRequest.Builder, ObjectBuilder<GetAllMessagesRequest>> fn)
        throws IOException, OpenSearchException {
        return getAllMessages(fn, ApiType.OSS);
    }

    /**
     * Get all messages in a memory.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAllMessagesRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetAllMessagesResponse getAllMessages(
        Function<GetAllMessagesRequest.Builder, ObjectBuilder<GetAllMessagesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAllMessages(fn.apply(new GetAllMessagesRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_all_tools

    /**
     * Get tools.
     */
    public GetAllToolsResponse getAllTools(GetAllToolsRequest request) throws IOException, OpenSearchException {
        return getAllTools(request, ApiType.OSS);
    }

    /**
     * Get tools.
     *
     * @param type target OpenSearch API distribution
     */
    public GetAllToolsResponse getAllTools(GetAllToolsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_all_tools", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetAllToolsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get tools.
     *
     * @param fn a function that initializes a builder to create the {@link GetAllToolsRequest}
     */
    public final GetAllToolsResponse getAllTools(Function<GetAllToolsRequest.Builder, ObjectBuilder<GetAllToolsRequest>> fn)
        throws IOException, OpenSearchException {
        return getAllTools(fn, ApiType.OSS);
    }

    /**
     * Get tools.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAllToolsRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetAllToolsResponse getAllTools(Function<GetAllToolsRequest.Builder, ObjectBuilder<GetAllToolsRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getAllTools(fn.apply(new GetAllToolsRequest.Builder()).build(), type);
    }

    /**
     * Get tools.
     */
    public final GetAllToolsResponse getAllTools() throws IOException, OpenSearchException {
        return getAllTools(ApiType.OSS);
    }

    /**
     * Get tools.
     *
     * @param type target OpenSearch API distribution
     */
    public final GetAllToolsResponse getAllTools(ApiType type) throws IOException, OpenSearchException {
        return getAllTools(new GetAllToolsRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_connector

    /**
     * Retrieves a standalone connector.
     */
    public GetConnectorResponse getConnector(GetConnectorRequest request) throws IOException, OpenSearchException {
        return getConnector(request, ApiType.OSS);
    }

    /**
     * Retrieves a standalone connector.
     *
     * @param type target OpenSearch API distribution
     */
    public GetConnectorResponse getConnector(GetConnectorRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_connector", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetConnectorRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves a standalone connector.
     *
     * @param fn a function that initializes a builder to create the {@link GetConnectorRequest}
     */
    public final GetConnectorResponse getConnector(Function<GetConnectorRequest.Builder, ObjectBuilder<GetConnectorRequest>> fn)
        throws IOException, OpenSearchException {
        return getConnector(fn, ApiType.OSS);
    }

    /**
     * Retrieves a standalone connector.
     *
     * @param fn   a function that initializes a builder to create the {@link GetConnectorRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetConnectorResponse getConnector(
        Function<GetConnectorRequest.Builder, ObjectBuilder<GetConnectorRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getConnector(fn.apply(new GetConnectorRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_controller

    /**
     * Retrieves a controller.
     */
    public GetControllerResponse getController(GetControllerRequest request) throws IOException, OpenSearchException {
        return getController(request, ApiType.OSS);
    }

    /**
     * Retrieves a controller.
     *
     * @param type target OpenSearch API distribution
     */
    public GetControllerResponse getController(GetControllerRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_controller", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetControllerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves a controller.
     *
     * @param fn a function that initializes a builder to create the {@link GetControllerRequest}
     */
    public final GetControllerResponse getController(Function<GetControllerRequest.Builder, ObjectBuilder<GetControllerRequest>> fn)
        throws IOException, OpenSearchException {
        return getController(fn, ApiType.OSS);
    }

    /**
     * Retrieves a controller.
     *
     * @param fn   a function that initializes a builder to create the {@link GetControllerRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetControllerResponse getController(
        Function<GetControllerRequest.Builder, ObjectBuilder<GetControllerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getController(fn.apply(new GetControllerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_memory

    /**
     * Get a memory.
     */
    public GetMemoryResponse getMemory(GetMemoryRequest request) throws IOException, OpenSearchException {
        return getMemory(request, ApiType.OSS);
    }

    /**
     * Get a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public GetMemoryResponse getMemory(GetMemoryRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a memory.
     *
     * @param fn a function that initializes a builder to create the {@link GetMemoryRequest}
     */
    public final GetMemoryResponse getMemory(Function<GetMemoryRequest.Builder, ObjectBuilder<GetMemoryRequest>> fn) throws IOException,
        OpenSearchException {
        return getMemory(fn, ApiType.OSS);
    }

    /**
     * Get a memory.
     *
     * @param fn   a function that initializes a builder to create the {@link GetMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetMemoryResponse getMemory(Function<GetMemoryRequest.Builder, ObjectBuilder<GetMemoryRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getMemory(fn.apply(new GetMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_memory_container

    /**
     * Get a memory container.
     */
    public GetMemoryContainerResponse getMemoryContainer(GetMemoryContainerRequest request) throws IOException, OpenSearchException {
        return getMemoryContainer(request, ApiType.OSS);
    }

    /**
     * Get a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public GetMemoryContainerResponse getMemoryContainer(GetMemoryContainerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_memory_container", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetMemoryContainerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link GetMemoryContainerRequest}
     */
    public final GetMemoryContainerResponse getMemoryContainer(
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
    public final GetMemoryContainerResponse getMemoryContainer(
        Function<GetMemoryContainerRequest.Builder, ObjectBuilder<GetMemoryContainerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getMemoryContainer(fn.apply(new GetMemoryContainerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_message

    /**
     * Get a message.
     */
    public GetMessageResponse getMessage(GetMessageRequest request) throws IOException, OpenSearchException {
        return getMessage(request, ApiType.OSS);
    }

    /**
     * Get a message.
     *
     * @param type target OpenSearch API distribution
     */
    public GetMessageResponse getMessage(GetMessageRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_message", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetMessageRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a message.
     *
     * @param fn a function that initializes a builder to create the {@link GetMessageRequest}
     */
    public final GetMessageResponse getMessage(Function<GetMessageRequest.Builder, ObjectBuilder<GetMessageRequest>> fn) throws IOException,
        OpenSearchException {
        return getMessage(fn, ApiType.OSS);
    }

    /**
     * Get a message.
     *
     * @param fn   a function that initializes a builder to create the {@link GetMessageRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetMessageResponse getMessage(Function<GetMessageRequest.Builder, ObjectBuilder<GetMessageRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getMessage(fn.apply(new GetMessageRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_message_traces

    /**
     * Get a message traces.
     */
    public GetMessageTracesResponse getMessageTraces(GetMessageTracesRequest request) throws IOException, OpenSearchException {
        return getMessageTraces(request, ApiType.OSS);
    }

    /**
     * Get a message traces.
     *
     * @param type target OpenSearch API distribution
     */
    public GetMessageTracesResponse getMessageTraces(GetMessageTracesRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_message_traces", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetMessageTracesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a message traces.
     *
     * @param fn a function that initializes a builder to create the {@link GetMessageTracesRequest}
     */
    public final GetMessageTracesResponse getMessageTraces(
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
    public final GetMessageTracesResponse getMessageTraces(
        Function<GetMessageTracesRequest.Builder, ObjectBuilder<GetMessageTracesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getMessageTraces(fn.apply(new GetMessageTracesRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_model

    /**
     * Retrieves a model.
     */
    public GetModelResponse getModel(GetModelRequest request) throws IOException, OpenSearchException {
        return getModel(request, ApiType.OSS);
    }

    /**
     * Retrieves a model.
     *
     * @param type target OpenSearch API distribution
     */
    public GetModelResponse getModel(GetModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves a model.
     *
     * @param fn a function that initializes a builder to create the {@link GetModelRequest}
     */
    public final GetModelResponse getModel(Function<GetModelRequest.Builder, ObjectBuilder<GetModelRequest>> fn) throws IOException,
        OpenSearchException {
        return getModel(fn, ApiType.OSS);
    }

    /**
     * Retrieves a model.
     *
     * @param fn   a function that initializes a builder to create the {@link GetModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetModelResponse getModel(Function<GetModelRequest.Builder, ObjectBuilder<GetModelRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getModel(fn.apply(new GetModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_model_group

    /**
     * Retrieves a model group.
     */
    public GetModelGroupResponse getModelGroup(GetModelGroupRequest request) throws IOException, OpenSearchException {
        return getModelGroup(request, ApiType.OSS);
    }

    /**
     * Retrieves a model group.
     *
     * @param type target OpenSearch API distribution
     */
    public GetModelGroupResponse getModelGroup(GetModelGroupRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_model_group", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetModelGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves a model group.
     *
     * @param fn a function that initializes a builder to create the {@link GetModelGroupRequest}
     */
    public final GetModelGroupResponse getModelGroup(Function<GetModelGroupRequest.Builder, ObjectBuilder<GetModelGroupRequest>> fn)
        throws IOException, OpenSearchException {
        return getModelGroup(fn, ApiType.OSS);
    }

    /**
     * Retrieves a model group.
     *
     * @param fn   a function that initializes a builder to create the {@link GetModelGroupRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetModelGroupResponse getModelGroup(
        Function<GetModelGroupRequest.Builder, ObjectBuilder<GetModelGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getModelGroup(fn.apply(new GetModelGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_profile

    /**
     * Get a profile.
     */
    public GetProfileResponse getProfile(GetProfileRequest request) throws IOException, OpenSearchException {
        return getProfile(request, ApiType.OSS);
    }

    /**
     * Get a profile.
     *
     * @param type target OpenSearch API distribution
     */
    public GetProfileResponse getProfile(GetProfileRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_profile", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetProfileRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a profile.
     *
     * @param fn a function that initializes a builder to create the {@link GetProfileRequest}
     */
    public final GetProfileResponse getProfile(Function<GetProfileRequest.Builder, ObjectBuilder<GetProfileRequest>> fn) throws IOException,
        OpenSearchException {
        return getProfile(fn, ApiType.OSS);
    }

    /**
     * Get a profile.
     *
     * @param fn   a function that initializes a builder to create the {@link GetProfileRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetProfileResponse getProfile(Function<GetProfileRequest.Builder, ObjectBuilder<GetProfileRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getProfile(fn.apply(new GetProfileRequest.Builder()).build(), type);
    }

    /**
     * Get a profile.
     */
    public final GetProfileResponse getProfile() throws IOException, OpenSearchException {
        return getProfile(ApiType.OSS);
    }

    /**
     * Get a profile.
     *
     * @param type target OpenSearch API distribution
     */
    public final GetProfileResponse getProfile(ApiType type) throws IOException, OpenSearchException {
        return getProfile(new GetProfileRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_profile_models

    /**
     * Get a profile models.
     */
    public GetProfileModelsResponse getProfileModels(GetProfileModelsRequest request) throws IOException, OpenSearchException {
        return getProfileModels(request, ApiType.OSS);
    }

    /**
     * Get a profile models.
     *
     * @param type target OpenSearch API distribution
     */
    public GetProfileModelsResponse getProfileModels(GetProfileModelsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.get_profile_models", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetProfileModelsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a profile models.
     *
     * @param fn a function that initializes a builder to create the {@link GetProfileModelsRequest}
     */
    public final GetProfileModelsResponse getProfileModels(
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
    public final GetProfileModelsResponse getProfileModels(
        Function<GetProfileModelsRequest.Builder, ObjectBuilder<GetProfileModelsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getProfileModels(fn.apply(new GetProfileModelsRequest.Builder()).build(), type);
    }

    /**
     * Get a profile models.
     */
    public final GetProfileModelsResponse getProfileModels() throws IOException, OpenSearchException {
        return getProfileModels(ApiType.OSS);
    }

    /**
     * Get a profile models.
     *
     * @param type target OpenSearch API distribution
     */
    public final GetProfileModelsResponse getProfileModels(ApiType type) throws IOException, OpenSearchException {
        return getProfileModels(new GetProfileModelsRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_profile_tasks

    /**
     * Get a profile tasks.
     */
    public GetProfileTasksResponse getProfileTasks(GetProfileTasksRequest request) throws IOException, OpenSearchException {
        return getProfileTasks(request, ApiType.OSS);
    }

    /**
     * Get a profile tasks.
     *
     * @param type target OpenSearch API distribution
     */
    public GetProfileTasksResponse getProfileTasks(GetProfileTasksRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_profile_tasks", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetProfileTasksRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a profile tasks.
     *
     * @param fn a function that initializes a builder to create the {@link GetProfileTasksRequest}
     */
    public final GetProfileTasksResponse getProfileTasks(Function<GetProfileTasksRequest.Builder, ObjectBuilder<GetProfileTasksRequest>> fn)
        throws IOException, OpenSearchException {
        return getProfileTasks(fn, ApiType.OSS);
    }

    /**
     * Get a profile tasks.
     *
     * @param fn   a function that initializes a builder to create the {@link GetProfileTasksRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetProfileTasksResponse getProfileTasks(
        Function<GetProfileTasksRequest.Builder, ObjectBuilder<GetProfileTasksRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getProfileTasks(fn.apply(new GetProfileTasksRequest.Builder()).build(), type);
    }

    /**
     * Get a profile tasks.
     */
    public final GetProfileTasksResponse getProfileTasks() throws IOException, OpenSearchException {
        return getProfileTasks(ApiType.OSS);
    }

    /**
     * Get a profile tasks.
     *
     * @param type target OpenSearch API distribution
     */
    public final GetProfileTasksResponse getProfileTasks(ApiType type) throws IOException, OpenSearchException {
        return getProfileTasks(new GetProfileTasksRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_stats

    /**
     * Get stats.
     */
    public GetStatsResponse getStats(GetStatsRequest request) throws IOException, OpenSearchException {
        return getStats(request, ApiType.OSS);
    }

    /**
     * Get stats.
     *
     * @param type target OpenSearch API distribution
     */
    public GetStatsResponse getStats(GetStatsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_stats", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetStatsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get stats.
     *
     * @param fn a function that initializes a builder to create the {@link GetStatsRequest}
     */
    public final GetStatsResponse getStats(Function<GetStatsRequest.Builder, ObjectBuilder<GetStatsRequest>> fn) throws IOException,
        OpenSearchException {
        return getStats(fn, ApiType.OSS);
    }

    /**
     * Get stats.
     *
     * @param fn   a function that initializes a builder to create the {@link GetStatsRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetStatsResponse getStats(Function<GetStatsRequest.Builder, ObjectBuilder<GetStatsRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getStats(fn.apply(new GetStatsRequest.Builder()).build(), type);
    }

    /**
     * Get stats.
     */
    public final GetStatsResponse getStats() throws IOException, OpenSearchException {
        return getStats(ApiType.OSS);
    }

    /**
     * Get stats.
     *
     * @param type target OpenSearch API distribution
     */
    public final GetStatsResponse getStats(ApiType type) throws IOException, OpenSearchException {
        return getStats(new GetStatsRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.get_task

    /**
     * Retrieves a task.
     */
    public GetTaskResponse getTask(GetTaskRequest request) throws IOException, OpenSearchException {
        return getTask(request, ApiType.OSS);
    }

    /**
     * Retrieves a task.
     *
     * @param type target OpenSearch API distribution
     */
    public GetTaskResponse getTask(GetTaskRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_task", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetTaskRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves a task.
     *
     * @param fn a function that initializes a builder to create the {@link GetTaskRequest}
     */
    public final GetTaskResponse getTask(Function<GetTaskRequest.Builder, ObjectBuilder<GetTaskRequest>> fn) throws IOException,
        OpenSearchException {
        return getTask(fn, ApiType.OSS);
    }

    /**
     * Retrieves a task.
     *
     * @param fn   a function that initializes a builder to create the {@link GetTaskRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetTaskResponse getTask(Function<GetTaskRequest.Builder, ObjectBuilder<GetTaskRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getTask(fn.apply(new GetTaskRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.get_tool

    /**
     * Get tools.
     */
    public GetToolResponse getTool(GetToolRequest request) throws IOException, OpenSearchException {
        return getTool(request, ApiType.OSS);
    }

    /**
     * Get tools.
     *
     * @param type target OpenSearch API distribution
     */
    public GetToolResponse getTool(GetToolRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.get_tool", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetToolRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get tools.
     *
     * @param fn a function that initializes a builder to create the {@link GetToolRequest}
     */
    public final GetToolResponse getTool(Function<GetToolRequest.Builder, ObjectBuilder<GetToolRequest>> fn) throws IOException,
        OpenSearchException {
        return getTool(fn, ApiType.OSS);
    }

    /**
     * Get tools.
     *
     * @param fn   a function that initializes a builder to create the {@link GetToolRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetToolResponse getTool(Function<GetToolRequest.Builder, ObjectBuilder<GetToolRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getTool(fn.apply(new GetToolRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.load_model

    /**
     * Deploys a model.
     */
    @Deprecated
    public LoadModelResponse loadModel(LoadModelRequest request) throws IOException, OpenSearchException {
        return loadModel(request, ApiType.OSS);
    }

    /**
     * Deploys a model.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public LoadModelResponse loadModel(LoadModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.load_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, LoadModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deploys a model.
     *
     * @param fn a function that initializes a builder to create the {@link LoadModelRequest}
     */
    @Deprecated
    public final LoadModelResponse loadModel(Function<LoadModelRequest.Builder, ObjectBuilder<LoadModelRequest>> fn) throws IOException,
        OpenSearchException {
        return loadModel(fn, ApiType.OSS);
    }

    /**
     * Deploys a model.
     *
     * @param fn   a function that initializes a builder to create the {@link LoadModelRequest}
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final LoadModelResponse loadModel(Function<LoadModelRequest.Builder, ObjectBuilder<LoadModelRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return loadModel(fn.apply(new LoadModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.predict_model_stream

    /**
     * Predicts a model in streaming mode.
     */
    public PredictModelStreamResponse predictModelStream(PredictModelStreamRequest request) throws IOException, OpenSearchException {
        return predictModelStream(request, ApiType.OSS);
    }

    /**
     * Predicts a model in streaming mode.
     *
     * @param type target OpenSearch API distribution
     */
    public PredictModelStreamResponse predictModelStream(PredictModelStreamRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.predict_model_stream", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, PredictModelStreamRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Predicts a model in streaming mode.
     *
     * @param fn a function that initializes a builder to create the {@link PredictModelStreamRequest}
     */
    public final PredictModelStreamResponse predictModelStream(
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
    public final PredictModelStreamResponse predictModelStream(
        Function<PredictModelStreamRequest.Builder, ObjectBuilder<PredictModelStreamRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return predictModelStream(fn.apply(new PredictModelStreamRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.register_agents

    /**
     * Register an agent.
     */
    public RegisterAgentsResponse registerAgents(RegisterAgentsRequest request) throws IOException, OpenSearchException {
        return registerAgents(request, ApiType.OSS);
    }

    /**
     * Register an agent.
     *
     * @param type target OpenSearch API distribution
     */
    public RegisterAgentsResponse registerAgents(RegisterAgentsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.register_agents", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, RegisterAgentsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Register an agent.
     *
     * @param fn a function that initializes a builder to create the {@link RegisterAgentsRequest}
     */
    public final RegisterAgentsResponse registerAgents(Function<RegisterAgentsRequest.Builder, ObjectBuilder<RegisterAgentsRequest>> fn)
        throws IOException, OpenSearchException {
        return registerAgents(fn, ApiType.OSS);
    }

    /**
     * Register an agent.
     *
     * @param fn   a function that initializes a builder to create the {@link RegisterAgentsRequest}
     * @param type target OpenSearch API distribution
     */
    public final RegisterAgentsResponse registerAgents(
        Function<RegisterAgentsRequest.Builder, ObjectBuilder<RegisterAgentsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return registerAgents(fn.apply(new RegisterAgentsRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.register_model

    /**
     * Registers a model.
     */
    public RegisterModelResponse registerModel(RegisterModelRequest request) throws IOException, OpenSearchException {
        return registerModel(request, ApiType.OSS);
    }

    /**
     * Registers a model.
     *
     * @param type target OpenSearch API distribution
     */
    public RegisterModelResponse registerModel(RegisterModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.register_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, RegisterModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Registers a model.
     *
     * @param fn a function that initializes a builder to create the {@link RegisterModelRequest}
     */
    public final RegisterModelResponse registerModel(Function<RegisterModelRequest.Builder, ObjectBuilder<RegisterModelRequest>> fn)
        throws IOException, OpenSearchException {
        return registerModel(fn, ApiType.OSS);
    }

    /**
     * Registers a model.
     *
     * @param fn   a function that initializes a builder to create the {@link RegisterModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final RegisterModelResponse registerModel(
        Function<RegisterModelRequest.Builder, ObjectBuilder<RegisterModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return registerModel(fn.apply(new RegisterModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.register_model_group

    /**
     * Registers a model group.
     */
    public RegisterModelGroupResponse registerModelGroup(RegisterModelGroupRequest request) throws IOException, OpenSearchException {
        return registerModelGroup(request, ApiType.OSS);
    }

    /**
     * Registers a model group.
     *
     * @param type target OpenSearch API distribution
     */
    public RegisterModelGroupResponse registerModelGroup(RegisterModelGroupRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.register_model_group", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, RegisterModelGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Registers a model group.
     *
     * @param fn a function that initializes a builder to create the {@link RegisterModelGroupRequest}
     */
    public final RegisterModelGroupResponse registerModelGroup(
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
    public final RegisterModelGroupResponse registerModelGroup(
        Function<RegisterModelGroupRequest.Builder, ObjectBuilder<RegisterModelGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return registerModelGroup(fn.apply(new RegisterModelGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.register_model_meta

    /**
     * Registers model metadata.
     */
    public RegisterModelMetaResponse registerModelMeta(RegisterModelMetaRequest request) throws IOException, OpenSearchException {
        return registerModelMeta(request, ApiType.OSS);
    }

    /**
     * Registers model metadata.
     *
     * @param type target OpenSearch API distribution
     */
    public RegisterModelMetaResponse registerModelMeta(RegisterModelMetaRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.register_model_meta", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, RegisterModelMetaRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Registers model metadata.
     *
     * @param fn a function that initializes a builder to create the {@link RegisterModelMetaRequest}
     */
    public final RegisterModelMetaResponse registerModelMeta(
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
    public final RegisterModelMetaResponse registerModelMeta(
        Function<RegisterModelMetaRequest.Builder, ObjectBuilder<RegisterModelMetaRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return registerModelMeta(fn.apply(new RegisterModelMetaRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.undeploy_model

    /**
     * Undeploys a model.
     */
    public UndeployModelResponse undeployModel(UndeployModelRequest request) throws IOException, OpenSearchException {
        return undeployModel(request, ApiType.OSS);
    }

    /**
     * Undeploys a model.
     *
     * @param type target OpenSearch API distribution
     */
    public UndeployModelResponse undeployModel(UndeployModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.undeploy_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UndeployModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Undeploys a model.
     *
     * @param fn a function that initializes a builder to create the {@link UndeployModelRequest}
     */
    public final UndeployModelResponse undeployModel(Function<UndeployModelRequest.Builder, ObjectBuilder<UndeployModelRequest>> fn)
        throws IOException, OpenSearchException {
        return undeployModel(fn, ApiType.OSS);
    }

    /**
     * Undeploys a model.
     *
     * @param fn   a function that initializes a builder to create the {@link UndeployModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final UndeployModelResponse undeployModel(
        Function<UndeployModelRequest.Builder, ObjectBuilder<UndeployModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return undeployModel(fn.apply(new UndeployModelRequest.Builder()).build(), type);
    }

    /**
     * Undeploys a model.
     */
    public final UndeployModelResponse undeployModel() throws IOException, OpenSearchException {
        return undeployModel(ApiType.OSS);
    }

    /**
     * Undeploys a model.
     *
     * @param type target OpenSearch API distribution
     */
    public final UndeployModelResponse undeployModel(ApiType type) throws IOException, OpenSearchException {
        return undeployModel(new UndeployModelRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.unload_model

    /**
     * Unloads a model.
     */
    @Deprecated
    public UnloadModelResponse unloadModel(UnloadModelRequest request) throws IOException, OpenSearchException {
        return unloadModel(request, ApiType.OSS);
    }

    /**
     * Unloads a model.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public UnloadModelResponse unloadModel(UnloadModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.unload_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UnloadModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Unloads a model.
     *
     * @param fn a function that initializes a builder to create the {@link UnloadModelRequest}
     */
    @Deprecated
    public final UnloadModelResponse unloadModel(Function<UnloadModelRequest.Builder, ObjectBuilder<UnloadModelRequest>> fn)
        throws IOException, OpenSearchException {
        return unloadModel(fn, ApiType.OSS);
    }

    /**
     * Unloads a model.
     *
     * @param fn   a function that initializes a builder to create the {@link UnloadModelRequest}
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final UnloadModelResponse unloadModel(Function<UnloadModelRequest.Builder, ObjectBuilder<UnloadModelRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return unloadModel(fn.apply(new UnloadModelRequest.Builder()).build(), type);
    }

    /**
     * Unloads a model.
     */
    @Deprecated
    public final UnloadModelResponse unloadModel() throws IOException, OpenSearchException {
        return unloadModel(ApiType.OSS);
    }

    /**
     * Unloads a model.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final UnloadModelResponse unloadModel(ApiType type) throws IOException, OpenSearchException {
        return unloadModel(new UnloadModelRequest.Builder().build(), type);
    }

    // ----- Endpoint: ml.update_agentic_memory

    /**
     * Update a specific memory by its type and ID.
     */
    public UpdateAgenticMemoryResponse updateAgenticMemory(UpdateAgenticMemoryRequest request) throws IOException, OpenSearchException {
        return updateAgenticMemory(request, ApiType.OSS);
    }

    /**
     * Update a specific memory by its type and ID.
     *
     * @param type target OpenSearch API distribution
     */
    public UpdateAgenticMemoryResponse updateAgenticMemory(UpdateAgenticMemoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.update_agentic_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UpdateAgenticMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Update a specific memory by its type and ID.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateAgenticMemoryRequest}
     */
    public final UpdateAgenticMemoryResponse updateAgenticMemory(
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
    public final UpdateAgenticMemoryResponse updateAgenticMemory(
        Function<UpdateAgenticMemoryRequest.Builder, ObjectBuilder<UpdateAgenticMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateAgenticMemory(fn.apply(new UpdateAgenticMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_connector

    /**
     * Updates a standalone connector.
     */
    public UpdateConnectorResponse updateConnector(UpdateConnectorRequest request) throws IOException, OpenSearchException {
        return updateConnector(request, ApiType.OSS);
    }

    /**
     * Updates a standalone connector.
     *
     * @param type target OpenSearch API distribution
     */
    public UpdateConnectorResponse updateConnector(UpdateConnectorRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.update_connector", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UpdateConnectorRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates a standalone connector.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateConnectorRequest}
     */
    public final UpdateConnectorResponse updateConnector(Function<UpdateConnectorRequest.Builder, ObjectBuilder<UpdateConnectorRequest>> fn)
        throws IOException, OpenSearchException {
        return updateConnector(fn, ApiType.OSS);
    }

    /**
     * Updates a standalone connector.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateConnectorRequest}
     * @param type target OpenSearch API distribution
     */
    public final UpdateConnectorResponse updateConnector(
        Function<UpdateConnectorRequest.Builder, ObjectBuilder<UpdateConnectorRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateConnector(fn.apply(new UpdateConnectorRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_controller

    /**
     * Updates a controller.
     */
    public UpdateControllerResponse updateController(UpdateControllerRequest request) throws IOException, OpenSearchException {
        return updateController(request, ApiType.OSS);
    }

    /**
     * Updates a controller.
     *
     * @param type target OpenSearch API distribution
     */
    public UpdateControllerResponse updateController(UpdateControllerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.update_controller", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UpdateControllerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates a controller.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateControllerRequest}
     */
    public final UpdateControllerResponse updateController(
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
    public final UpdateControllerResponse updateController(
        Function<UpdateControllerRequest.Builder, ObjectBuilder<UpdateControllerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateController(fn.apply(new UpdateControllerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_memory

    /**
     * Update a memory.
     */
    public UpdateMemoryResponse updateMemory(UpdateMemoryRequest request) throws IOException, OpenSearchException {
        return updateMemory(request, ApiType.OSS);
    }

    /**
     * Update a memory.
     *
     * @param type target OpenSearch API distribution
     */
    public UpdateMemoryResponse updateMemory(UpdateMemoryRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.update_memory", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UpdateMemoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Update a memory.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateMemoryRequest}
     */
    public final UpdateMemoryResponse updateMemory(Function<UpdateMemoryRequest.Builder, ObjectBuilder<UpdateMemoryRequest>> fn)
        throws IOException, OpenSearchException {
        return updateMemory(fn, ApiType.OSS);
    }

    /**
     * Update a memory.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateMemoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final UpdateMemoryResponse updateMemory(
        Function<UpdateMemoryRequest.Builder, ObjectBuilder<UpdateMemoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateMemory(fn.apply(new UpdateMemoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_memory_container

    /**
     * Update a memory container.
     */
    public UpdateMemoryContainerResponse updateMemoryContainer(UpdateMemoryContainerRequest request) throws IOException,
        OpenSearchException {
        return updateMemoryContainer(request, ApiType.OSS);
    }

    /**
     * Update a memory container.
     *
     * @param type target OpenSearch API distribution
     */
    public UpdateMemoryContainerResponse updateMemoryContainer(UpdateMemoryContainerRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.update_memory_container", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UpdateMemoryContainerRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Update a memory container.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateMemoryContainerRequest}
     */
    public final UpdateMemoryContainerResponse updateMemoryContainer(
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
    public final UpdateMemoryContainerResponse updateMemoryContainer(
        Function<UpdateMemoryContainerRequest.Builder, ObjectBuilder<UpdateMemoryContainerRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateMemoryContainer(fn.apply(new UpdateMemoryContainerRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_message

    /**
     * Update a message.
     */
    public UpdateMessageResponse updateMessage(UpdateMessageRequest request) throws IOException, OpenSearchException {
        return updateMessage(request, ApiType.OSS);
    }

    /**
     * Update a message.
     *
     * @param type target OpenSearch API distribution
     */
    public UpdateMessageResponse updateMessage(UpdateMessageRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.update_message", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UpdateMessageRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Update a message.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateMessageRequest}
     */
    public final UpdateMessageResponse updateMessage(Function<UpdateMessageRequest.Builder, ObjectBuilder<UpdateMessageRequest>> fn)
        throws IOException, OpenSearchException {
        return updateMessage(fn, ApiType.OSS);
    }

    /**
     * Update a message.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateMessageRequest}
     * @param type target OpenSearch API distribution
     */
    public final UpdateMessageResponse updateMessage(
        Function<UpdateMessageRequest.Builder, ObjectBuilder<UpdateMessageRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateMessage(fn.apply(new UpdateMessageRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_model

    /**
     * Updates a model.
     */
    public UpdateModelResponse updateModel(UpdateModelRequest request) throws IOException, OpenSearchException {
        return updateModel(request, ApiType.OSS);
    }

    /**
     * Updates a model.
     *
     * @param type target OpenSearch API distribution
     */
    public UpdateModelResponse updateModel(UpdateModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.update_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UpdateModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates a model.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateModelRequest}
     */
    public final UpdateModelResponse updateModel(Function<UpdateModelRequest.Builder, ObjectBuilder<UpdateModelRequest>> fn)
        throws IOException, OpenSearchException {
        return updateModel(fn, ApiType.OSS);
    }

    /**
     * Updates a model.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final UpdateModelResponse updateModel(Function<UpdateModelRequest.Builder, ObjectBuilder<UpdateModelRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return updateModel(fn.apply(new UpdateModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.update_model_group

    /**
     * Updates a model group.
     */
    public UpdateModelGroupResponse updateModelGroup(UpdateModelGroupRequest request) throws IOException, OpenSearchException {
        return updateModelGroup(request, ApiType.OSS);
    }

    /**
     * Updates a model group.
     *
     * @param type target OpenSearch API distribution
     */
    public UpdateModelGroupResponse updateModelGroup(UpdateModelGroupRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ml.update_model_group", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UpdateModelGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates a model group.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateModelGroupRequest}
     */
    public final UpdateModelGroupResponse updateModelGroup(
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
    public final UpdateModelGroupResponse updateModelGroup(
        Function<UpdateModelGroupRequest.Builder, ObjectBuilder<UpdateModelGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateModelGroup(fn.apply(new UpdateModelGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.upload_chunk

    /**
     * Uploads model chunk.
     */
    public UploadChunkResponse uploadChunk(UploadChunkRequest request) throws IOException, OpenSearchException {
        return uploadChunk(request, ApiType.OSS);
    }

    /**
     * Uploads model chunk.
     *
     * @param type target OpenSearch API distribution
     */
    public UploadChunkResponse uploadChunk(UploadChunkRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.upload_chunk", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UploadChunkRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Uploads model chunk.
     *
     * @param fn a function that initializes a builder to create the {@link UploadChunkRequest}
     */
    public final UploadChunkResponse uploadChunk(Function<UploadChunkRequest.Builder, ObjectBuilder<UploadChunkRequest>> fn)
        throws IOException, OpenSearchException {
        return uploadChunk(fn, ApiType.OSS);
    }

    /**
     * Uploads model chunk.
     *
     * @param fn   a function that initializes a builder to create the {@link UploadChunkRequest}
     * @param type target OpenSearch API distribution
     */
    public final UploadChunkResponse uploadChunk(Function<UploadChunkRequest.Builder, ObjectBuilder<UploadChunkRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return uploadChunk(fn.apply(new UploadChunkRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ml.upload_model

    /**
     * Registers a model.
     */
    @Deprecated
    public UploadModelResponse uploadModel(UploadModelRequest request) throws IOException, OpenSearchException {
        return uploadModel(request, ApiType.OSS);
    }

    /**
     * Registers a model.
     *
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public UploadModelResponse uploadModel(UploadModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ml.upload_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, UploadModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Registers a model.
     *
     * @param fn a function that initializes a builder to create the {@link UploadModelRequest}
     */
    @Deprecated
    public final UploadModelResponse uploadModel(Function<UploadModelRequest.Builder, ObjectBuilder<UploadModelRequest>> fn)
        throws IOException, OpenSearchException {
        return uploadModel(fn, ApiType.OSS);
    }

    /**
     * Registers a model.
     *
     * @param fn   a function that initializes a builder to create the {@link UploadModelRequest}
     * @param type target OpenSearch API distribution
     */
    @Deprecated
    public final UploadModelResponse uploadModel(Function<UploadModelRequest.Builder, ObjectBuilder<UploadModelRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return uploadModel(fn.apply(new UploadModelRequest.Builder()).build(), type);
    }
}
