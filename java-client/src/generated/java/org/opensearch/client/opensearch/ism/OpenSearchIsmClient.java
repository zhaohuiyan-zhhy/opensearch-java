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

package org.opensearch.client.opensearch.ism;

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
 * Client for the ism namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class OpenSearchIsmClient extends ApiClient<OpenSearchTransport, OpenSearchIsmClient> {
    public OpenSearchIsmClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchIsmClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchIsmClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchIsmClient(this.transport, transportOptions);
    }

    // ----- Endpoint: ism.add_policy

    /**
     * Adds a policy to an index.
     */
    public AddPolicyResponse addPolicy(AddPolicyRequest request) throws IOException, OpenSearchException {
        return addPolicy(request, ApiType.OSS);
    }

    /**
     * Adds a policy to an index.
     *
     * @param type target OpenSearch API distribution
     */
    public AddPolicyResponse addPolicy(AddPolicyRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ism.add_policy", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, AddPolicyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Adds a policy to an index.
     *
     * @param fn a function that initializes a builder to create the {@link AddPolicyRequest}
     */
    public final AddPolicyResponse addPolicy(Function<AddPolicyRequest.Builder, ObjectBuilder<AddPolicyRequest>> fn) throws IOException,
        OpenSearchException {
        return addPolicy(fn, ApiType.OSS);
    }

    /**
     * Adds a policy to an index.
     *
     * @param fn   a function that initializes a builder to create the {@link AddPolicyRequest}
     * @param type target OpenSearch API distribution
     */
    public final AddPolicyResponse addPolicy(Function<AddPolicyRequest.Builder, ObjectBuilder<AddPolicyRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return addPolicy(fn.apply(new AddPolicyRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ism.change_policy

    /**
     * Updates the managed index policy to a new policy.
     */
    public ChangePolicyResponse changePolicy(ChangePolicyRequest request) throws IOException, OpenSearchException {
        return changePolicy(request, ApiType.OSS);
    }

    /**
     * Updates the managed index policy to a new policy.
     *
     * @param type target OpenSearch API distribution
     */
    public ChangePolicyResponse changePolicy(ChangePolicyRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ism.change_policy", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, ChangePolicyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the managed index policy to a new policy.
     *
     * @param fn a function that initializes a builder to create the {@link ChangePolicyRequest}
     */
    public final ChangePolicyResponse changePolicy(Function<ChangePolicyRequest.Builder, ObjectBuilder<ChangePolicyRequest>> fn)
        throws IOException, OpenSearchException {
        return changePolicy(fn, ApiType.OSS);
    }

    /**
     * Updates the managed index policy to a new policy.
     *
     * @param fn   a function that initializes a builder to create the {@link ChangePolicyRequest}
     * @param type target OpenSearch API distribution
     */
    public final ChangePolicyResponse changePolicy(
        Function<ChangePolicyRequest.Builder, ObjectBuilder<ChangePolicyRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return changePolicy(fn.apply(new ChangePolicyRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ism.delete_policy

    /**
     * Deletes a policy.
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws IOException, OpenSearchException {
        return deletePolicy(request, ApiType.OSS);
    }

    /**
     * Deletes a policy.
     *
     * @param type target OpenSearch API distribution
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ism.delete_policy", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, DeletePolicyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a policy.
     *
     * @param fn a function that initializes a builder to create the {@link DeletePolicyRequest}
     */
    public final DeletePolicyResponse deletePolicy(Function<DeletePolicyRequest.Builder, ObjectBuilder<DeletePolicyRequest>> fn)
        throws IOException, OpenSearchException {
        return deletePolicy(fn, ApiType.OSS);
    }

    /**
     * Deletes a policy.
     *
     * @param fn   a function that initializes a builder to create the {@link DeletePolicyRequest}
     * @param type target OpenSearch API distribution
     */
    public final DeletePolicyResponse deletePolicy(
        Function<DeletePolicyRequest.Builder, ObjectBuilder<DeletePolicyRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deletePolicy(fn.apply(new DeletePolicyRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ism.exists_policy

    /**
     * Checks for the existence of a policy.
     */
    public ExistsPolicyResponse existsPolicy(ExistsPolicyRequest request) throws IOException, OpenSearchException {
        return existsPolicy(request, ApiType.OSS);
    }

    /**
     * Checks for the existence of a policy.
     *
     * @param type target OpenSearch API distribution
     */
    public ExistsPolicyResponse existsPolicy(ExistsPolicyRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ism.exists_policy", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, ExistsPolicyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Checks for the existence of a policy.
     *
     * @param fn a function that initializes a builder to create the {@link ExistsPolicyRequest}
     */
    public final ExistsPolicyResponse existsPolicy(Function<ExistsPolicyRequest.Builder, ObjectBuilder<ExistsPolicyRequest>> fn)
        throws IOException, OpenSearchException {
        return existsPolicy(fn, ApiType.OSS);
    }

    /**
     * Checks for the existence of a policy.
     *
     * @param fn   a function that initializes a builder to create the {@link ExistsPolicyRequest}
     * @param type target OpenSearch API distribution
     */
    public final ExistsPolicyResponse existsPolicy(
        Function<ExistsPolicyRequest.Builder, ObjectBuilder<ExistsPolicyRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return existsPolicy(fn.apply(new ExistsPolicyRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ism.explain_policy

    /**
     * Retrieves the currently applied policy on the specified indexes.
     */
    public ExplainPolicyResponse explainPolicy(ExplainPolicyRequest request) throws IOException, OpenSearchException {
        return explainPolicy(request, ApiType.OSS);
    }

    /**
     * Retrieves the currently applied policy on the specified indexes.
     *
     * @param type target OpenSearch API distribution
     */
    public ExplainPolicyResponse explainPolicy(ExplainPolicyRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ism.explain_policy", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, ExplainPolicyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the currently applied policy on the specified indexes.
     *
     * @param fn a function that initializes a builder to create the {@link ExplainPolicyRequest}
     */
    public final ExplainPolicyResponse explainPolicy(Function<ExplainPolicyRequest.Builder, ObjectBuilder<ExplainPolicyRequest>> fn)
        throws IOException, OpenSearchException {
        return explainPolicy(fn, ApiType.OSS);
    }

    /**
     * Retrieves the currently applied policy on the specified indexes.
     *
     * @param fn   a function that initializes a builder to create the {@link ExplainPolicyRequest}
     * @param type target OpenSearch API distribution
     */
    public final ExplainPolicyResponse explainPolicy(
        Function<ExplainPolicyRequest.Builder, ObjectBuilder<ExplainPolicyRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return explainPolicy(fn.apply(new ExplainPolicyRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ism.get_policies

    /**
     * Retrieves the policies.
     */
    public GetPoliciesResponse getPolicies(GetPoliciesRequest request) throws IOException, OpenSearchException {
        return getPolicies(request, ApiType.OSS);
    }

    /**
     * Retrieves the policies.
     *
     * @param type target OpenSearch API distribution
     */
    public GetPoliciesResponse getPolicies(GetPoliciesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ism.get_policies", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetPoliciesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the policies.
     *
     * @param fn a function that initializes a builder to create the {@link GetPoliciesRequest}
     */
    public final GetPoliciesResponse getPolicies(Function<GetPoliciesRequest.Builder, ObjectBuilder<GetPoliciesRequest>> fn)
        throws IOException, OpenSearchException {
        return getPolicies(fn, ApiType.OSS);
    }

    /**
     * Retrieves the policies.
     *
     * @param fn   a function that initializes a builder to create the {@link GetPoliciesRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetPoliciesResponse getPolicies(Function<GetPoliciesRequest.Builder, ObjectBuilder<GetPoliciesRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getPolicies(fn.apply(new GetPoliciesRequest.Builder()).build(), type);
    }

    /**
     * Retrieves the policies.
     */
    public final GetPoliciesResponse getPolicies() throws IOException, OpenSearchException {
        return getPolicies(ApiType.OSS);
    }

    /**
     * Retrieves the policies.
     *
     * @param type target OpenSearch API distribution
     */
    public final GetPoliciesResponse getPolicies(ApiType type) throws IOException, OpenSearchException {
        return getPolicies(new GetPoliciesRequest.Builder().build(), type);
    }

    // ----- Endpoint: ism.get_policy

    /**
     * Retrieves a specific policy.
     */
    public GetPolicyResponse getPolicy(GetPolicyRequest request) throws IOException, OpenSearchException {
        return getPolicy(request, ApiType.OSS);
    }

    /**
     * Retrieves a specific policy.
     *
     * @param type target OpenSearch API distribution
     */
    public GetPolicyResponse getPolicy(GetPolicyRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ism.get_policy", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, GetPolicyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves a specific policy.
     *
     * @param fn a function that initializes a builder to create the {@link GetPolicyRequest}
     */
    public final GetPolicyResponse getPolicy(Function<GetPolicyRequest.Builder, ObjectBuilder<GetPolicyRequest>> fn) throws IOException,
        OpenSearchException {
        return getPolicy(fn, ApiType.OSS);
    }

    /**
     * Retrieves a specific policy.
     *
     * @param fn   a function that initializes a builder to create the {@link GetPolicyRequest}
     * @param type target OpenSearch API distribution
     */
    public final GetPolicyResponse getPolicy(Function<GetPolicyRequest.Builder, ObjectBuilder<GetPolicyRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return getPolicy(fn.apply(new GetPolicyRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ism.put_policies

    /**
     * Creates or updates policies.
     */
    public PutPoliciesResponse putPolicies(PutPoliciesRequest request) throws IOException, OpenSearchException {
        return putPolicies(request, ApiType.OSS);
    }

    /**
     * Creates or updates policies.
     *
     * @param type target OpenSearch API distribution
     */
    public PutPoliciesResponse putPolicies(PutPoliciesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ism.put_policies", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, PutPoliciesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates policies.
     *
     * @param fn a function that initializes a builder to create the {@link PutPoliciesRequest}
     */
    public final PutPoliciesResponse putPolicies(Function<PutPoliciesRequest.Builder, ObjectBuilder<PutPoliciesRequest>> fn)
        throws IOException, OpenSearchException {
        return putPolicies(fn, ApiType.OSS);
    }

    /**
     * Creates or updates policies.
     *
     * @param fn   a function that initializes a builder to create the {@link PutPoliciesRequest}
     * @param type target OpenSearch API distribution
     */
    public final PutPoliciesResponse putPolicies(Function<PutPoliciesRequest.Builder, ObjectBuilder<PutPoliciesRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return putPolicies(fn.apply(new PutPoliciesRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ism.put_policy

    /**
     * Creates or updates a policy.
     */
    public PutPolicyResponse putPolicy(PutPolicyRequest request) throws IOException, OpenSearchException {
        return putPolicy(request, ApiType.OSS);
    }

    /**
     * Creates or updates a policy.
     *
     * @param type target OpenSearch API distribution
     */
    public PutPolicyResponse putPolicy(PutPolicyRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ism.put_policy", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, PutPolicyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates a policy.
     *
     * @param fn a function that initializes a builder to create the {@link PutPolicyRequest}
     */
    public final PutPolicyResponse putPolicy(Function<PutPolicyRequest.Builder, ObjectBuilder<PutPolicyRequest>> fn) throws IOException,
        OpenSearchException {
        return putPolicy(fn, ApiType.OSS);
    }

    /**
     * Creates or updates a policy.
     *
     * @param fn   a function that initializes a builder to create the {@link PutPolicyRequest}
     * @param type target OpenSearch API distribution
     */
    public final PutPolicyResponse putPolicy(Function<PutPolicyRequest.Builder, ObjectBuilder<PutPolicyRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return putPolicy(fn.apply(new PutPolicyRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ism.refresh_search_analyzers

    /**
     * Refreshes search analyzers in real time.
     */
    public RefreshSearchAnalyzersResponse refreshSearchAnalyzers(RefreshSearchAnalyzersRequest request) throws IOException,
        OpenSearchException {
        return refreshSearchAnalyzers(request, ApiType.OSS);
    }

    /**
     * Refreshes search analyzers in real time.
     *
     * @param type target OpenSearch API distribution
     */
    public RefreshSearchAnalyzersResponse refreshSearchAnalyzers(RefreshSearchAnalyzersRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ism.refresh_search_analyzers", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, RefreshSearchAnalyzersRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Refreshes search analyzers in real time.
     *
     * @param fn a function that initializes a builder to create the {@link RefreshSearchAnalyzersRequest}
     */
    public final RefreshSearchAnalyzersResponse refreshSearchAnalyzers(
        Function<RefreshSearchAnalyzersRequest.Builder, ObjectBuilder<RefreshSearchAnalyzersRequest>> fn
    ) throws IOException, OpenSearchException {
        return refreshSearchAnalyzers(fn, ApiType.OSS);
    }

    /**
     * Refreshes search analyzers in real time.
     *
     * @param fn   a function that initializes a builder to create the {@link RefreshSearchAnalyzersRequest}
     * @param type target OpenSearch API distribution
     */
    public final RefreshSearchAnalyzersResponse refreshSearchAnalyzers(
        Function<RefreshSearchAnalyzersRequest.Builder, ObjectBuilder<RefreshSearchAnalyzersRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return refreshSearchAnalyzers(fn.apply(new RefreshSearchAnalyzersRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ism.remove_policy

    /**
     * Removes a policy from an index.
     */
    public RemovePolicyResponse removePolicy(RemovePolicyRequest request) throws IOException, OpenSearchException {
        return removePolicy(request, ApiType.OSS);
    }

    /**
     * Removes a policy from an index.
     *
     * @param type target OpenSearch API distribution
     */
    public RemovePolicyResponse removePolicy(RemovePolicyRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ism.remove_policy", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, RemovePolicyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Removes a policy from an index.
     *
     * @param fn a function that initializes a builder to create the {@link RemovePolicyRequest}
     */
    public final RemovePolicyResponse removePolicy(Function<RemovePolicyRequest.Builder, ObjectBuilder<RemovePolicyRequest>> fn)
        throws IOException, OpenSearchException {
        return removePolicy(fn, ApiType.OSS);
    }

    /**
     * Removes a policy from an index.
     *
     * @param fn   a function that initializes a builder to create the {@link RemovePolicyRequest}
     * @param type target OpenSearch API distribution
     */
    public final RemovePolicyResponse removePolicy(
        Function<RemovePolicyRequest.Builder, ObjectBuilder<RemovePolicyRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return removePolicy(fn.apply(new RemovePolicyRequest.Builder()).build(), type);
    }

    /**
     * Removes a policy from an index.
     */
    public final RemovePolicyResponse removePolicy() throws IOException, OpenSearchException {
        return removePolicy(ApiType.OSS);
    }

    /**
     * Removes a policy from an index.
     *
     * @param type target OpenSearch API distribution
     */
    public final RemovePolicyResponse removePolicy(ApiType type) throws IOException, OpenSearchException {
        return removePolicy(new RemovePolicyRequest.Builder().build(), type);
    }

    // ----- Endpoint: ism.retry_index

    /**
     * Retries the failed action for an index.
     */
    public RetryIndexResponse retryIndex(RetryIndexRequest request) throws IOException, OpenSearchException {
        return retryIndex(request, ApiType.OSS);
    }

    /**
     * Retries the failed action for an index.
     *
     * @param type target OpenSearch API distribution
     */
    public RetryIndexResponse retryIndex(RetryIndexRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ism.retry_index", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequest(request, RetryIndexRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retries the failed action for an index.
     *
     * @param fn a function that initializes a builder to create the {@link RetryIndexRequest}
     */
    public final RetryIndexResponse retryIndex(Function<RetryIndexRequest.Builder, ObjectBuilder<RetryIndexRequest>> fn) throws IOException,
        OpenSearchException {
        return retryIndex(fn, ApiType.OSS);
    }

    /**
     * Retries the failed action for an index.
     *
     * @param fn   a function that initializes a builder to create the {@link RetryIndexRequest}
     * @param type target OpenSearch API distribution
     */
    public final RetryIndexResponse retryIndex(Function<RetryIndexRequest.Builder, ObjectBuilder<RetryIndexRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return retryIndex(fn.apply(new RetryIndexRequest.Builder()).build(), type);
    }
}
