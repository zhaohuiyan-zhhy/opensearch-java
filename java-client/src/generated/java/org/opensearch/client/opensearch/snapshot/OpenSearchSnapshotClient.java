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

package org.opensearch.client.opensearch.snapshot;

import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch.ApiType;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;

/**
 * Client for the snapshot namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class OpenSearchSnapshotClient extends ApiClient<OpenSearchTransport, OpenSearchSnapshotClient> {
    public OpenSearchSnapshotClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchSnapshotClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchSnapshotClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchSnapshotClient(this.transport, transportOptions);
    }

    // ----- Endpoint: snapshot.cleanup_repository

    /**
     * Removes any stale data from a snapshot repository.
     */
    public CleanupRepositoryResponse cleanupRepository(CleanupRepositoryRequest request) throws IOException, OpenSearchException {
        return cleanupRepository(request, ApiType.OSS);
    }

    /**
     * Removes any stale data from a snapshot repository.
     *
     * @param type target OpenSearch API distribution
     */
    public CleanupRepositoryResponse cleanupRepository(CleanupRepositoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "snapshot.cleanup_repository", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, CleanupRepositoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Removes any stale data from a snapshot repository.
     *
     * @param fn a function that initializes a builder to create the {@link CleanupRepositoryRequest}
     */
    public final CleanupRepositoryResponse cleanupRepository(
        Function<CleanupRepositoryRequest.Builder, ObjectBuilder<CleanupRepositoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return cleanupRepository(fn, ApiType.OSS);
    }

    /**
     * Removes any stale data from a snapshot repository.
     *
     * @param fn   a function that initializes a builder to create the {@link CleanupRepositoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CleanupRepositoryResponse cleanupRepository(
        Function<CleanupRepositoryRequest.Builder, ObjectBuilder<CleanupRepositoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return cleanupRepository(fn.apply(new CleanupRepositoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: snapshot.clone

    /**
     * Creates a clone of all or part of a snapshot in the same repository as the original snapshot.
     */
    public CloneSnapshotResponse clone(CloneSnapshotRequest request) throws IOException, OpenSearchException {
        return clone(request, ApiType.OSS);
    }

    /**
     * Creates a clone of all or part of a snapshot in the same repository as the original snapshot.
     *
     * @param type target OpenSearch API distribution
     */
    public CloneSnapshotResponse clone(CloneSnapshotRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "snapshot.clone", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, CloneSnapshotRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates a clone of all or part of a snapshot in the same repository as the original snapshot.
     *
     * @param fn a function that initializes a builder to create the {@link CloneSnapshotRequest}
     */
    public final CloneSnapshotResponse clone(Function<CloneSnapshotRequest.Builder, ObjectBuilder<CloneSnapshotRequest>> fn)
        throws IOException, OpenSearchException {
        return clone(fn, ApiType.OSS);
    }

    /**
     * Creates a clone of all or part of a snapshot in the same repository as the original snapshot.
     *
     * @param fn   a function that initializes a builder to create the {@link CloneSnapshotRequest}
     * @param type target OpenSearch API distribution
     */
    public final CloneSnapshotResponse clone(Function<CloneSnapshotRequest.Builder, ObjectBuilder<CloneSnapshotRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return clone(fn.apply(new CloneSnapshotRequest.Builder()).build(), type);
    }

    // ----- Endpoint: snapshot.create

    /**
     * Creates a snapshot within an existing repository.
     */
    public CreateSnapshotResponse create(CreateSnapshotRequest request) throws IOException, OpenSearchException {
        return create(request, ApiType.OSS);
    }

    /**
     * Creates a snapshot within an existing repository.
     *
     * @param type target OpenSearch API distribution
     */
    public CreateSnapshotResponse create(CreateSnapshotRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "snapshot.create", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, CreateSnapshotRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates a snapshot within an existing repository.
     *
     * @param fn a function that initializes a builder to create the {@link CreateSnapshotRequest}
     */
    public final CreateSnapshotResponse create(Function<CreateSnapshotRequest.Builder, ObjectBuilder<CreateSnapshotRequest>> fn)
        throws IOException, OpenSearchException {
        return create(fn, ApiType.OSS);
    }

    /**
     * Creates a snapshot within an existing repository.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateSnapshotRequest}
     * @param type target OpenSearch API distribution
     */
    public final CreateSnapshotResponse create(
        Function<CreateSnapshotRequest.Builder, ObjectBuilder<CreateSnapshotRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return create(fn.apply(new CreateSnapshotRequest.Builder()).build(), type);
    }

    // ----- Endpoint: snapshot.create_repository

    /**
     * Creates a snapshot repository.
     */
    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) throws IOException, OpenSearchException {
        return createRepository(request, ApiType.OSS);
    }

    /**
     * Creates a snapshot repository.
     *
     * @param type target OpenSearch API distribution
     */
    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "snapshot.create_repository", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        ApiType.requireFieldSupported(
            type,
            "snapshot.create_repository",
            "crypto_settings",
            ApiTypeHelper.isDefined(request.cryptoSettings()),
            ApiType.AOSS
        );
        return this.transport.performRequest(request, CreateRepositoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates a snapshot repository.
     *
     * @param fn a function that initializes a builder to create the {@link CreateRepositoryRequest}
     */
    public final CreateRepositoryResponse createRepository(
        Function<CreateRepositoryRequest.Builder, ObjectBuilder<CreateRepositoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return createRepository(fn, ApiType.OSS);
    }

    /**
     * Creates a snapshot repository.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateRepositoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CreateRepositoryResponse createRepository(
        Function<CreateRepositoryRequest.Builder, ObjectBuilder<CreateRepositoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createRepository(fn.apply(new CreateRepositoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: snapshot.delete

    /**
     * Deletes a snapshot.
     */
    public DeleteSnapshotResponse delete(DeleteSnapshotRequest request) throws IOException, OpenSearchException {
        return delete(request, ApiType.OSS);
    }

    /**
     * Deletes a snapshot.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteSnapshotResponse delete(DeleteSnapshotRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "snapshot.delete", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteSnapshotRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a snapshot.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteSnapshotRequest}
     */
    public final DeleteSnapshotResponse delete(Function<DeleteSnapshotRequest.Builder, ObjectBuilder<DeleteSnapshotRequest>> fn)
        throws IOException, OpenSearchException {
        return delete(fn, ApiType.OSS);
    }

    /**
     * Deletes a snapshot.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteSnapshotRequest}
     * @param type target OpenSearch API distribution
     */
    public final DeleteSnapshotResponse delete(
        Function<DeleteSnapshotRequest.Builder, ObjectBuilder<DeleteSnapshotRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return delete(fn.apply(new DeleteSnapshotRequest.Builder()).build(), type);
    }

    // ----- Endpoint: snapshot.delete_repository

    /**
     * Deletes a snapshot repository.
     */
    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) throws IOException, OpenSearchException {
        return deleteRepository(request, ApiType.OSS);
    }

    /**
     * Deletes a snapshot repository.
     *
     * @param type target OpenSearch API distribution
     */
    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "snapshot.delete_repository", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeleteRepositoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a snapshot repository.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteRepositoryRequest}
     */
    public final DeleteRepositoryResponse deleteRepository(
        Function<DeleteRepositoryRequest.Builder, ObjectBuilder<DeleteRepositoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteRepository(fn, ApiType.OSS);
    }

    /**
     * Deletes a snapshot repository.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteRepositoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final DeleteRepositoryResponse deleteRepository(
        Function<DeleteRepositoryRequest.Builder, ObjectBuilder<DeleteRepositoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteRepository(fn.apply(new DeleteRepositoryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: snapshot.get

    /**
     * Returns information about a snapshot.
     */
    public GetSnapshotResponse get(GetSnapshotRequest request) throws IOException, OpenSearchException {
        return get(request, ApiType.OSS);
    }

    /**
     * Returns information about a snapshot.
     *
     * @param type target OpenSearch API distribution
     */
    public GetSnapshotResponse get(GetSnapshotRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "snapshot.get", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        ApiType.requireFieldSupported(type, "snapshot.get", "sourceCollectionId", request.sourceCollectionId() != null, ApiType.AOSS);
        return this.transport.performRequest(request, GetSnapshotRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about a snapshot.
     *
     * @param fn a function that initializes a builder to create the {@link GetSnapshotRequest}
     */
    public final GetSnapshotResponse get(Function<GetSnapshotRequest.Builder, ObjectBuilder<GetSnapshotRequest>> fn) throws IOException,
        OpenSearchException {
        return get(fn, ApiType.OSS);
    }

    /**
     * Returns information about a snapshot.
     *
     * @param fn   a function that initializes a builder to create the {@link GetSnapshotRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetSnapshotResponse get(Function<GetSnapshotRequest.Builder, ObjectBuilder<GetSnapshotRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return get(fn.apply(new GetSnapshotRequest.Builder()).build(), type);
    }

    // ----- Endpoint: snapshot.get_repository

    /**
     * Returns information about a snapshot repository.
     */
    public GetRepositoryResponse getRepository(GetRepositoryRequest request) throws IOException, OpenSearchException {
        return getRepository(request, ApiType.OSS);
    }

    /**
     * Returns information about a snapshot repository.
     *
     * @param type target OpenSearch API distribution
     */
    public GetRepositoryResponse getRepository(GetRepositoryRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "snapshot.get_repository", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetRepositoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about a snapshot repository.
     *
     * @param fn a function that initializes a builder to create the {@link GetRepositoryRequest}
     */
    public final GetRepositoryResponse getRepository(Function<GetRepositoryRequest.Builder, ObjectBuilder<GetRepositoryRequest>> fn)
        throws IOException, OpenSearchException {
        return getRepository(fn, ApiType.OSS);
    }

    /**
     * Returns information about a snapshot repository.
     *
     * @param fn   a function that initializes a builder to create the {@link GetRepositoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetRepositoryResponse getRepository(
        Function<GetRepositoryRequest.Builder, ObjectBuilder<GetRepositoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getRepository(fn.apply(new GetRepositoryRequest.Builder()).build(), type);
    }

    /**
     * Returns information about a snapshot repository.
     */
    public final GetRepositoryResponse getRepository() throws IOException, OpenSearchException {
        return getRepository(ApiType.OSS);
    }

    /**
     * Returns information about a snapshot repository.
     *
     * @param type target OpenSearch API distribution
     */
    public final GetRepositoryResponse getRepository(ApiType type) throws IOException, OpenSearchException {
        return getRepository(new GetRepositoryRequest.Builder().build(), type);
    }

    // ----- Endpoint: snapshot.restore

    /**
     * Restores a snapshot.
     */
    public RestoreSnapshotResponse restore(RestoreSnapshotRequest request) throws IOException, OpenSearchException {
        return restore(request, ApiType.OSS);
    }

    /**
     * Restores a snapshot.
     *
     * @param type target OpenSearch API distribution
     */
    public RestoreSnapshotResponse restore(RestoreSnapshotRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "snapshot.restore", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        ApiType.requireFieldSupported(type, "snapshot.restore", "allow_regex", request.allowRegex() != null, ApiType.AOSS);
        ApiType.requireFieldSupported(type, "snapshot.restore", "sourceCollectionId", request.sourceCollectionId() != null, ApiType.AOSS);
        return this.transport.performRequest(request, RestoreSnapshotRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Restores a snapshot.
     *
     * @param fn a function that initializes a builder to create the {@link RestoreSnapshotRequest}
     */
    public final RestoreSnapshotResponse restore(Function<RestoreSnapshotRequest.Builder, ObjectBuilder<RestoreSnapshotRequest>> fn)
        throws IOException, OpenSearchException {
        return restore(fn, ApiType.OSS);
    }

    /**
     * Restores a snapshot.
     *
     * @param fn   a function that initializes a builder to create the {@link RestoreSnapshotRequest}
     * @param type target OpenSearch API distribution
     */
    public final RestoreSnapshotResponse restore(
        Function<RestoreSnapshotRequest.Builder, ObjectBuilder<RestoreSnapshotRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return restore(fn.apply(new RestoreSnapshotRequest.Builder()).build(), type);
    }

    // ----- Endpoint: snapshot.status

    /**
     * Returns information about the status of a snapshot.
     */
    public SnapshotStatusResponse status(SnapshotStatusRequest request) throws IOException, OpenSearchException {
        return status(request, ApiType.OSS);
    }

    /**
     * Returns information about the status of a snapshot.
     *
     * @param type target OpenSearch API distribution
     */
    public SnapshotStatusResponse status(SnapshotStatusRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "snapshot.status", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, SnapshotStatusRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about the status of a snapshot.
     *
     * @param fn a function that initializes a builder to create the {@link SnapshotStatusRequest}
     */
    public final SnapshotStatusResponse status(Function<SnapshotStatusRequest.Builder, ObjectBuilder<SnapshotStatusRequest>> fn)
        throws IOException, OpenSearchException {
        return status(fn, ApiType.OSS);
    }

    /**
     * Returns information about the status of a snapshot.
     *
     * @param fn   a function that initializes a builder to create the {@link SnapshotStatusRequest}
     * @param type target OpenSearch API distribution
     */
    public final SnapshotStatusResponse status(
        Function<SnapshotStatusRequest.Builder, ObjectBuilder<SnapshotStatusRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return status(fn.apply(new SnapshotStatusRequest.Builder()).build(), type);
    }

    /**
     * Returns information about the status of a snapshot.
     */
    public final SnapshotStatusResponse status() throws IOException, OpenSearchException {
        return status(ApiType.OSS);
    }

    /**
     * Returns information about the status of a snapshot.
     *
     * @param type target OpenSearch API distribution
     */
    public final SnapshotStatusResponse status(ApiType type) throws IOException, OpenSearchException {
        return status(new SnapshotStatusRequest.Builder().build(), type);
    }

    // ----- Endpoint: snapshot.verify_repository

    /**
     * Verifies a repository.
     */
    public VerifyRepositoryResponse verifyRepository(VerifyRepositoryRequest request) throws IOException, OpenSearchException {
        return verifyRepository(request, ApiType.OSS);
    }

    /**
     * Verifies a repository.
     *
     * @param type target OpenSearch API distribution
     */
    public VerifyRepositoryResponse verifyRepository(VerifyRepositoryRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "snapshot.verify_repository", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, VerifyRepositoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Verifies a repository.
     *
     * @param fn a function that initializes a builder to create the {@link VerifyRepositoryRequest}
     */
    public final VerifyRepositoryResponse verifyRepository(
        Function<VerifyRepositoryRequest.Builder, ObjectBuilder<VerifyRepositoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return verifyRepository(fn, ApiType.OSS);
    }

    /**
     * Verifies a repository.
     *
     * @param fn   a function that initializes a builder to create the {@link VerifyRepositoryRequest}
     * @param type target OpenSearch API distribution
     */
    public final VerifyRepositoryResponse verifyRepository(
        Function<VerifyRepositoryRequest.Builder, ObjectBuilder<VerifyRepositoryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return verifyRepository(fn.apply(new VerifyRepositoryRequest.Builder()).build(), type);
    }
}
