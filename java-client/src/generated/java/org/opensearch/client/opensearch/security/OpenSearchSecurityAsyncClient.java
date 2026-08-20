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

package org.opensearch.client.opensearch.security;

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
import org.opensearch.client.util.ObjectBuilder;

/**
 * Client for the security namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class OpenSearchSecurityAsyncClient extends ApiClient<OpenSearchTransport, OpenSearchSecurityAsyncClient> {
    public OpenSearchSecurityAsyncClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchSecurityAsyncClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchSecurityAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchSecurityAsyncClient(this.transport, transportOptions);
    }

    // ----- Endpoint: security.authinfo

    /**
     * Returns or updates authentication information for the currently authenticated user.
     */
    public CompletableFuture<AuthinfoResponse> authinfo(AuthinfoRequest request) throws IOException, OpenSearchException {
        return authinfo(request, ApiType.OSS);
    }

    /**
     * Returns or updates authentication information for the currently authenticated user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<AuthinfoResponse> authinfo(AuthinfoRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.authinfo", ApiType.OSS);
        return this.transport.performRequestAsync(request, AuthinfoRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns or updates authentication information for the currently authenticated user.
     *
     * @param fn a function that initializes a builder to create the {@link AuthinfoRequest}
     */
    public final CompletableFuture<AuthinfoResponse> authinfo(Function<AuthinfoRequest.Builder, ObjectBuilder<AuthinfoRequest>> fn)
        throws IOException, OpenSearchException {
        return authinfo(fn, ApiType.OSS);
    }

    /**
     * Returns or updates authentication information for the currently authenticated user.
     *
     * @param fn   a function that initializes a builder to create the {@link AuthinfoRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AuthinfoResponse> authinfo(
        Function<AuthinfoRequest.Builder, ObjectBuilder<AuthinfoRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return authinfo(fn.apply(new AuthinfoRequest.Builder()).build(), type);
    }

    /**
     * Returns or updates authentication information for the currently authenticated user.
     */
    public final CompletableFuture<AuthinfoResponse> authinfo() throws IOException, OpenSearchException {
        return authinfo(ApiType.OSS);
    }

    /**
     * Returns or updates authentication information for the currently authenticated user.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AuthinfoResponse> authinfo(ApiType type) throws IOException, OpenSearchException {
        return authinfo(new AuthinfoRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.authtoken

    /**
     * Returns the authorization token for the current user.
     */
    public CompletableFuture<AuthtokenResponse> authtoken(AuthtokenRequest request) throws IOException, OpenSearchException {
        return authtoken(request, ApiType.OSS);
    }

    /**
     * Returns the authorization token for the current user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<AuthtokenResponse> authtoken(AuthtokenRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.authtoken", ApiType.OSS);
        return this.transport.performRequestAsync(request, AuthtokenRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns the authorization token for the current user.
     *
     * @param fn a function that initializes a builder to create the {@link AuthtokenRequest}
     */
    public final CompletableFuture<AuthtokenResponse> authtoken(Function<AuthtokenRequest.Builder, ObjectBuilder<AuthtokenRequest>> fn)
        throws IOException, OpenSearchException {
        return authtoken(fn, ApiType.OSS);
    }

    /**
     * Returns the authorization token for the current user.
     *
     * @param fn   a function that initializes a builder to create the {@link AuthtokenRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AuthtokenResponse> authtoken(
        Function<AuthtokenRequest.Builder, ObjectBuilder<AuthtokenRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return authtoken(fn.apply(new AuthtokenRequest.Builder()).build(), type);
    }

    /**
     * Returns the authorization token for the current user.
     */
    public final CompletableFuture<AuthtokenResponse> authtoken() throws IOException, OpenSearchException {
        return authtoken(ApiType.OSS);
    }

    /**
     * Returns the authorization token for the current user.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AuthtokenResponse> authtoken(ApiType type) throws IOException, OpenSearchException {
        return authtoken(new AuthtokenRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.change_password

    /**
     * Changes the password for the current user.
     */
    public CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request) throws IOException, OpenSearchException {
        return changePassword(request, ApiType.OSS);
    }

    /**
     * Changes the password for the current user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.change_password", ApiType.OSS);
        return this.transport.performRequestAsync(request, ChangePasswordRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Changes the password for the current user.
     *
     * @param fn a function that initializes a builder to create the {@link ChangePasswordRequest}
     */
    public final CompletableFuture<ChangePasswordResponse> changePassword(
        Function<ChangePasswordRequest.Builder, ObjectBuilder<ChangePasswordRequest>> fn
    ) throws IOException, OpenSearchException {
        return changePassword(fn, ApiType.OSS);
    }

    /**
     * Changes the password for the current user.
     *
     * @param fn   a function that initializes a builder to create the {@link ChangePasswordRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ChangePasswordResponse> changePassword(
        Function<ChangePasswordRequest.Builder, ObjectBuilder<ChangePasswordRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return changePassword(fn.apply(new ChangePasswordRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.config_upgrade_check

    /**
     * Checks whether or not an upgrade can be performed and which security resources can be updated.
     */
    public CompletableFuture<ConfigUpgradeCheckResponse> configUpgradeCheck(ConfigUpgradeCheckRequest request) throws IOException,
        OpenSearchException {
        return configUpgradeCheck(request, ApiType.OSS);
    }

    /**
     * Checks whether or not an upgrade can be performed and which security resources can be updated.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ConfigUpgradeCheckResponse> configUpgradeCheck(ConfigUpgradeCheckRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.config_upgrade_check", ApiType.OSS);
        return this.transport.performRequestAsync(request, ConfigUpgradeCheckRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Checks whether or not an upgrade can be performed and which security resources can be updated.
     *
     * @param fn a function that initializes a builder to create the {@link ConfigUpgradeCheckRequest}
     */
    public final CompletableFuture<ConfigUpgradeCheckResponse> configUpgradeCheck(
        Function<ConfigUpgradeCheckRequest.Builder, ObjectBuilder<ConfigUpgradeCheckRequest>> fn
    ) throws IOException, OpenSearchException {
        return configUpgradeCheck(fn, ApiType.OSS);
    }

    /**
     * Checks whether or not an upgrade can be performed and which security resources can be updated.
     *
     * @param fn   a function that initializes a builder to create the {@link ConfigUpgradeCheckRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ConfigUpgradeCheckResponse> configUpgradeCheck(
        Function<ConfigUpgradeCheckRequest.Builder, ObjectBuilder<ConfigUpgradeCheckRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return configUpgradeCheck(fn.apply(new ConfigUpgradeCheckRequest.Builder()).build(), type);
    }

    /**
     * Checks whether or not an upgrade can be performed and which security resources can be updated.
     */
    public final CompletableFuture<ConfigUpgradeCheckResponse> configUpgradeCheck() throws IOException, OpenSearchException {
        return configUpgradeCheck(ApiType.OSS);
    }

    /**
     * Checks whether or not an upgrade can be performed and which security resources can be updated.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ConfigUpgradeCheckResponse> configUpgradeCheck(ApiType type) throws IOException, OpenSearchException {
        return configUpgradeCheck(new ConfigUpgradeCheckRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.config_upgrade_perform

    /**
     * Assists the cluster operator with upgrading missing default values and stale default definitions.
     */
    public CompletableFuture<ConfigUpgradePerformResponse> configUpgradePerform(ConfigUpgradePerformRequest request) throws IOException,
        OpenSearchException {
        return configUpgradePerform(request, ApiType.OSS);
    }

    /**
     * Assists the cluster operator with upgrading missing default values and stale default definitions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ConfigUpgradePerformResponse> configUpgradePerform(ConfigUpgradePerformRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.config_upgrade_perform", ApiType.OSS);
        return this.transport.performRequestAsync(request, ConfigUpgradePerformRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Assists the cluster operator with upgrading missing default values and stale default definitions.
     *
     * @param fn a function that initializes a builder to create the {@link ConfigUpgradePerformRequest}
     */
    public final CompletableFuture<ConfigUpgradePerformResponse> configUpgradePerform(
        Function<ConfigUpgradePerformRequest.Builder, ObjectBuilder<ConfigUpgradePerformRequest>> fn
    ) throws IOException, OpenSearchException {
        return configUpgradePerform(fn, ApiType.OSS);
    }

    /**
     * Assists the cluster operator with upgrading missing default values and stale default definitions.
     *
     * @param fn   a function that initializes a builder to create the {@link ConfigUpgradePerformRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ConfigUpgradePerformResponse> configUpgradePerform(
        Function<ConfigUpgradePerformRequest.Builder, ObjectBuilder<ConfigUpgradePerformRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return configUpgradePerform(fn.apply(new ConfigUpgradePerformRequest.Builder()).build(), type);
    }

    /**
     * Assists the cluster operator with upgrading missing default values and stale default definitions.
     */
    public final CompletableFuture<ConfigUpgradePerformResponse> configUpgradePerform() throws IOException, OpenSearchException {
        return configUpgradePerform(ApiType.OSS);
    }

    /**
     * Assists the cluster operator with upgrading missing default values and stale default definitions.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ConfigUpgradePerformResponse> configUpgradePerform(ApiType type) throws IOException,
        OpenSearchException {
        return configUpgradePerform(new ConfigUpgradePerformRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.create_action_group

    /**
     * Creates or replaces the specified action group.
     */
    public CompletableFuture<CreateActionGroupResponse> createActionGroup(CreateActionGroupRequest request) throws IOException,
        OpenSearchException {
        return createActionGroup(request, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified action group.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateActionGroupResponse> createActionGroup(CreateActionGroupRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.create_action_group", ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateActionGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or replaces the specified action group.
     *
     * @param fn a function that initializes a builder to create the {@link CreateActionGroupRequest}
     */
    public final CompletableFuture<CreateActionGroupResponse> createActionGroup(
        Function<CreateActionGroupRequest.Builder, ObjectBuilder<CreateActionGroupRequest>> fn
    ) throws IOException, OpenSearchException {
        return createActionGroup(fn, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified action group.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateActionGroupRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateActionGroupResponse> createActionGroup(
        Function<CreateActionGroupRequest.Builder, ObjectBuilder<CreateActionGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createActionGroup(fn.apply(new CreateActionGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.create_allowlist

    /**
     * Creates or replaces APIs permitted for users on the allow list. Requires a super admin certificate or REST API permissions.
     */
    public CompletableFuture<CreateAllowlistResponse> createAllowlist(CreateAllowlistRequest request) throws IOException,
        OpenSearchException {
        return createAllowlist(request, ApiType.OSS);
    }

    /**
     * Creates or replaces APIs permitted for users on the allow list. Requires a super admin certificate or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateAllowlistResponse> createAllowlist(CreateAllowlistRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.create_allowlist", ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateAllowlistRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or replaces APIs permitted for users on the allow list. Requires a super admin certificate or REST API permissions.
     *
     * @param fn a function that initializes a builder to create the {@link CreateAllowlistRequest}
     */
    public final CompletableFuture<CreateAllowlistResponse> createAllowlist(
        Function<CreateAllowlistRequest.Builder, ObjectBuilder<CreateAllowlistRequest>> fn
    ) throws IOException, OpenSearchException {
        return createAllowlist(fn, ApiType.OSS);
    }

    /**
     * Creates or replaces APIs permitted for users on the allow list. Requires a super admin certificate or REST API permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateAllowlistRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateAllowlistResponse> createAllowlist(
        Function<CreateAllowlistRequest.Builder, ObjectBuilder<CreateAllowlistRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createAllowlist(fn.apply(new CreateAllowlistRequest.Builder()).build(), type);
    }

    /**
     * Creates or replaces APIs permitted for users on the allow list. Requires a super admin certificate or REST API permissions.
     */
    public final CompletableFuture<CreateAllowlistResponse> createAllowlist() throws IOException, OpenSearchException {
        return createAllowlist(ApiType.OSS);
    }

    /**
     * Creates or replaces APIs permitted for users on the allow list. Requires a super admin certificate or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateAllowlistResponse> createAllowlist(ApiType type) throws IOException, OpenSearchException {
        return createAllowlist(new CreateAllowlistRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.create_role

    /**
     * Creates or replaces the specified role.
     */
    public CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request) throws IOException, OpenSearchException {
        return createRole(request, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified role.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.create_role", ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateRoleRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or replaces the specified role.
     *
     * @param fn a function that initializes a builder to create the {@link CreateRoleRequest}
     */
    public final CompletableFuture<CreateRoleResponse> createRole(Function<CreateRoleRequest.Builder, ObjectBuilder<CreateRoleRequest>> fn)
        throws IOException, OpenSearchException {
        return createRole(fn, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified role.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateRoleRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateRoleResponse> createRole(
        Function<CreateRoleRequest.Builder, ObjectBuilder<CreateRoleRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createRole(fn.apply(new CreateRoleRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.create_role_mapping

    /**
     * Creates or replaces the specified role mapping.
     */
    public CompletableFuture<CreateRoleMappingResponse> createRoleMapping(CreateRoleMappingRequest request) throws IOException,
        OpenSearchException {
        return createRoleMapping(request, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified role mapping.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateRoleMappingResponse> createRoleMapping(CreateRoleMappingRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.create_role_mapping", ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateRoleMappingRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or replaces the specified role mapping.
     *
     * @param fn a function that initializes a builder to create the {@link CreateRoleMappingRequest}
     */
    public final CompletableFuture<CreateRoleMappingResponse> createRoleMapping(
        Function<CreateRoleMappingRequest.Builder, ObjectBuilder<CreateRoleMappingRequest>> fn
    ) throws IOException, OpenSearchException {
        return createRoleMapping(fn, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified role mapping.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateRoleMappingRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateRoleMappingResponse> createRoleMapping(
        Function<CreateRoleMappingRequest.Builder, ObjectBuilder<CreateRoleMappingRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createRoleMapping(fn.apply(new CreateRoleMappingRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.create_tenant

    /**
     * Creates or replaces the specified tenant.
     */
    public CompletableFuture<CreateTenantResponse> createTenant(CreateTenantRequest request) throws IOException, OpenSearchException {
        return createTenant(request, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified tenant.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateTenantResponse> createTenant(CreateTenantRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.create_tenant", ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateTenantRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or replaces the specified tenant.
     *
     * @param fn a function that initializes a builder to create the {@link CreateTenantRequest}
     */
    public final CompletableFuture<CreateTenantResponse> createTenant(
        Function<CreateTenantRequest.Builder, ObjectBuilder<CreateTenantRequest>> fn
    ) throws IOException, OpenSearchException {
        return createTenant(fn, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified tenant.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateTenantRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateTenantResponse> createTenant(
        Function<CreateTenantRequest.Builder, ObjectBuilder<CreateTenantRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createTenant(fn.apply(new CreateTenantRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.create_update_tenancy_config

    /**
     * Creates or replaces the multi-tenancy configuration. Requires super admin or REST API permissions.
     */
    public CompletableFuture<CreateUpdateTenancyConfigResponse> createUpdateTenancyConfig(CreateUpdateTenancyConfigRequest request)
        throws IOException, OpenSearchException {
        return createUpdateTenancyConfig(request, ApiType.OSS);
    }

    /**
     * Creates or replaces the multi-tenancy configuration. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateUpdateTenancyConfigResponse> createUpdateTenancyConfig(
        CreateUpdateTenancyConfigRequest request,
        ApiType type
    ) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.create_update_tenancy_config", ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateUpdateTenancyConfigRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or replaces the multi-tenancy configuration. Requires super admin or REST API permissions.
     *
     * @param fn a function that initializes a builder to create the {@link CreateUpdateTenancyConfigRequest}
     */
    public final CompletableFuture<CreateUpdateTenancyConfigResponse> createUpdateTenancyConfig(
        Function<CreateUpdateTenancyConfigRequest.Builder, ObjectBuilder<CreateUpdateTenancyConfigRequest>> fn
    ) throws IOException, OpenSearchException {
        return createUpdateTenancyConfig(fn, ApiType.OSS);
    }

    /**
     * Creates or replaces the multi-tenancy configuration. Requires super admin or REST API permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateUpdateTenancyConfigRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateUpdateTenancyConfigResponse> createUpdateTenancyConfig(
        Function<CreateUpdateTenancyConfigRequest.Builder, ObjectBuilder<CreateUpdateTenancyConfigRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createUpdateTenancyConfig(fn.apply(new CreateUpdateTenancyConfigRequest.Builder()).build(), type);
    }

    /**
     * Creates or replaces the multi-tenancy configuration. Requires super admin or REST API permissions.
     */
    public final CompletableFuture<CreateUpdateTenancyConfigResponse> createUpdateTenancyConfig() throws IOException, OpenSearchException {
        return createUpdateTenancyConfig(ApiType.OSS);
    }

    /**
     * Creates or replaces the multi-tenancy configuration. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateUpdateTenancyConfigResponse> createUpdateTenancyConfig(ApiType type) throws IOException,
        OpenSearchException {
        return createUpdateTenancyConfig(new CreateUpdateTenancyConfigRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.create_user

    /**
     * Creates or replaces the specified user.
     */
    public CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request) throws IOException, OpenSearchException {
        return createUser(request, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.create_user", ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateUserRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or replaces the specified user.
     *
     * @param fn a function that initializes a builder to create the {@link CreateUserRequest}
     */
    public final CompletableFuture<CreateUserResponse> createUser(Function<CreateUserRequest.Builder, ObjectBuilder<CreateUserRequest>> fn)
        throws IOException, OpenSearchException {
        return createUser(fn, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified user.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateUserRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateUserResponse> createUser(
        Function<CreateUserRequest.Builder, ObjectBuilder<CreateUserRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createUser(fn.apply(new CreateUserRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.create_user_legacy

    /**
     * Creates or replaces the specified user. Legacy API.
     */
    public CompletableFuture<CreateUserLegacyResponse> createUserLegacy(CreateUserLegacyRequest request) throws IOException,
        OpenSearchException {
        return createUserLegacy(request, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified user. Legacy API.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateUserLegacyResponse> createUserLegacy(CreateUserLegacyRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.create_user_legacy", ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateUserLegacyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or replaces the specified user. Legacy API.
     *
     * @param fn a function that initializes a builder to create the {@link CreateUserLegacyRequest}
     */
    public final CompletableFuture<CreateUserLegacyResponse> createUserLegacy(
        Function<CreateUserLegacyRequest.Builder, ObjectBuilder<CreateUserLegacyRequest>> fn
    ) throws IOException, OpenSearchException {
        return createUserLegacy(fn, ApiType.OSS);
    }

    /**
     * Creates or replaces the specified user. Legacy API.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateUserLegacyRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateUserLegacyResponse> createUserLegacy(
        Function<CreateUserLegacyRequest.Builder, ObjectBuilder<CreateUserLegacyRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createUserLegacy(fn.apply(new CreateUserLegacyRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.delete_action_group

    /**
     * Deletes the specified action group.
     */
    public CompletableFuture<DeleteActionGroupResponse> deleteActionGroup(DeleteActionGroupRequest request) throws IOException,
        OpenSearchException {
        return deleteActionGroup(request, ApiType.OSS);
    }

    /**
     * Deletes the specified action group.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteActionGroupResponse> deleteActionGroup(DeleteActionGroupRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.delete_action_group", ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteActionGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes the specified action group.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteActionGroupRequest}
     */
    public final CompletableFuture<DeleteActionGroupResponse> deleteActionGroup(
        Function<DeleteActionGroupRequest.Builder, ObjectBuilder<DeleteActionGroupRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteActionGroup(fn, ApiType.OSS);
    }

    /**
     * Deletes the specified action group.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteActionGroupRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteActionGroupResponse> deleteActionGroup(
        Function<DeleteActionGroupRequest.Builder, ObjectBuilder<DeleteActionGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteActionGroup(fn.apply(new DeleteActionGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.delete_distinguished_name

    /**
     * Deletes all distinguished names in the specified cluster or node allowlist. Requires super admin or REST API permissions.
     */
    public CompletableFuture<DeleteDistinguishedNameResponse> deleteDistinguishedName(DeleteDistinguishedNameRequest request)
        throws IOException, OpenSearchException {
        return deleteDistinguishedName(request, ApiType.OSS);
    }

    /**
     * Deletes all distinguished names in the specified cluster or node allowlist. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteDistinguishedNameResponse> deleteDistinguishedName(DeleteDistinguishedNameRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.delete_distinguished_name", ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteDistinguishedNameRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes all distinguished names in the specified cluster or node allowlist. Requires super admin or REST API permissions.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteDistinguishedNameRequest}
     */
    public final CompletableFuture<DeleteDistinguishedNameResponse> deleteDistinguishedName(
        Function<DeleteDistinguishedNameRequest.Builder, ObjectBuilder<DeleteDistinguishedNameRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteDistinguishedName(fn, ApiType.OSS);
    }

    /**
     * Deletes all distinguished names in the specified cluster or node allowlist. Requires super admin or REST API permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteDistinguishedNameRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteDistinguishedNameResponse> deleteDistinguishedName(
        Function<DeleteDistinguishedNameRequest.Builder, ObjectBuilder<DeleteDistinguishedNameRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteDistinguishedName(fn.apply(new DeleteDistinguishedNameRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.delete_role

    /**
     * Deletes the specified role.
     */
    public CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request) throws IOException, OpenSearchException {
        return deleteRole(request, ApiType.OSS);
    }

    /**
     * Deletes the specified role.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.delete_role", ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteRoleRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes the specified role.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteRoleRequest}
     */
    public final CompletableFuture<DeleteRoleResponse> deleteRole(Function<DeleteRoleRequest.Builder, ObjectBuilder<DeleteRoleRequest>> fn)
        throws IOException, OpenSearchException {
        return deleteRole(fn, ApiType.OSS);
    }

    /**
     * Deletes the specified role.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteRoleRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteRoleResponse> deleteRole(
        Function<DeleteRoleRequest.Builder, ObjectBuilder<DeleteRoleRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteRole(fn.apply(new DeleteRoleRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.delete_role_mapping

    /**
     * Deletes the specified role mapping.
     */
    public CompletableFuture<DeleteRoleMappingResponse> deleteRoleMapping(DeleteRoleMappingRequest request) throws IOException,
        OpenSearchException {
        return deleteRoleMapping(request, ApiType.OSS);
    }

    /**
     * Deletes the specified role mapping.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteRoleMappingResponse> deleteRoleMapping(DeleteRoleMappingRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.delete_role_mapping", ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteRoleMappingRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes the specified role mapping.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteRoleMappingRequest}
     */
    public final CompletableFuture<DeleteRoleMappingResponse> deleteRoleMapping(
        Function<DeleteRoleMappingRequest.Builder, ObjectBuilder<DeleteRoleMappingRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteRoleMapping(fn, ApiType.OSS);
    }

    /**
     * Deletes the specified role mapping.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteRoleMappingRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteRoleMappingResponse> deleteRoleMapping(
        Function<DeleteRoleMappingRequest.Builder, ObjectBuilder<DeleteRoleMappingRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteRoleMapping(fn.apply(new DeleteRoleMappingRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.delete_tenant

    /**
     * Deletes the specified tenant.
     */
    public CompletableFuture<DeleteTenantResponse> deleteTenant(DeleteTenantRequest request) throws IOException, OpenSearchException {
        return deleteTenant(request, ApiType.OSS);
    }

    /**
     * Deletes the specified tenant.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteTenantResponse> deleteTenant(DeleteTenantRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.delete_tenant", ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteTenantRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes the specified tenant.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteTenantRequest}
     */
    public final CompletableFuture<DeleteTenantResponse> deleteTenant(
        Function<DeleteTenantRequest.Builder, ObjectBuilder<DeleteTenantRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteTenant(fn, ApiType.OSS);
    }

    /**
     * Deletes the specified tenant.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteTenantRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteTenantResponse> deleteTenant(
        Function<DeleteTenantRequest.Builder, ObjectBuilder<DeleteTenantRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteTenant(fn.apply(new DeleteTenantRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.delete_user

    /**
     * Deletes the specified internal user.
     */
    public CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request) throws IOException, OpenSearchException {
        return deleteUser(request, ApiType.OSS);
    }

    /**
     * Deletes the specified internal user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.delete_user", ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteUserRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes the specified internal user.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteUserRequest}
     */
    public final CompletableFuture<DeleteUserResponse> deleteUser(Function<DeleteUserRequest.Builder, ObjectBuilder<DeleteUserRequest>> fn)
        throws IOException, OpenSearchException {
        return deleteUser(fn, ApiType.OSS);
    }

    /**
     * Deletes the specified internal user.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteUserRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteUserResponse> deleteUser(
        Function<DeleteUserRequest.Builder, ObjectBuilder<DeleteUserRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteUser(fn.apply(new DeleteUserRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.delete_user_legacy

    /**
     * Delete the specified user. Legacy API.
     */
    public CompletableFuture<DeleteUserLegacyResponse> deleteUserLegacy(DeleteUserLegacyRequest request) throws IOException,
        OpenSearchException {
        return deleteUserLegacy(request, ApiType.OSS);
    }

    /**
     * Delete the specified user. Legacy API.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteUserLegacyResponse> deleteUserLegacy(DeleteUserLegacyRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.delete_user_legacy", ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteUserLegacyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete the specified user. Legacy API.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteUserLegacyRequest}
     */
    public final CompletableFuture<DeleteUserLegacyResponse> deleteUserLegacy(
        Function<DeleteUserLegacyRequest.Builder, ObjectBuilder<DeleteUserLegacyRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteUserLegacy(fn, ApiType.OSS);
    }

    /**
     * Delete the specified user. Legacy API.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteUserLegacyRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteUserLegacyResponse> deleteUserLegacy(
        Function<DeleteUserLegacyRequest.Builder, ObjectBuilder<DeleteUserLegacyRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteUserLegacy(fn.apply(new DeleteUserLegacyRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.flush_cache

    /**
     * Flushes the Security plugin's user, authentication, and authorization cache.
     */
    public CompletableFuture<FlushCacheResponse> flushCache(FlushCacheRequest request) throws IOException, OpenSearchException {
        return flushCache(request, ApiType.OSS);
    }

    /**
     * Flushes the Security plugin's user, authentication, and authorization cache.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<FlushCacheResponse> flushCache(FlushCacheRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.flush_cache", ApiType.OSS);
        return this.transport.performRequestAsync(request, FlushCacheRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Flushes the Security plugin's user, authentication, and authorization cache.
     *
     * @param fn a function that initializes a builder to create the {@link FlushCacheRequest}
     */
    public final CompletableFuture<FlushCacheResponse> flushCache(Function<FlushCacheRequest.Builder, ObjectBuilder<FlushCacheRequest>> fn)
        throws IOException, OpenSearchException {
        return flushCache(fn, ApiType.OSS);
    }

    /**
     * Flushes the Security plugin's user, authentication, and authorization cache.
     *
     * @param fn   a function that initializes a builder to create the {@link FlushCacheRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<FlushCacheResponse> flushCache(
        Function<FlushCacheRequest.Builder, ObjectBuilder<FlushCacheRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return flushCache(fn.apply(new FlushCacheRequest.Builder()).build(), type);
    }

    /**
     * Flushes the Security plugin's user, authentication, and authorization cache.
     */
    public final CompletableFuture<FlushCacheResponse> flushCache() throws IOException, OpenSearchException {
        return flushCache(ApiType.OSS);
    }

    /**
     * Flushes the Security plugin's user, authentication, and authorization cache.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<FlushCacheResponse> flushCache(ApiType type) throws IOException, OpenSearchException {
        return flushCache(new FlushCacheRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.generate_obo_token

    /**
     * Generates a <code>On-Behalf-Of</code> token for the current user.
     */
    public CompletableFuture<GenerateOboTokenResponse> generateOboToken(GenerateOboTokenRequest request) throws IOException,
        OpenSearchException {
        return generateOboToken(request, ApiType.OSS);
    }

    /**
     * Generates a <code>On-Behalf-Of</code> token for the current user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GenerateOboTokenResponse> generateOboToken(GenerateOboTokenRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.generate_obo_token", ApiType.OSS);
        return this.transport.performRequestAsync(request, GenerateOboTokenRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Generates a <code>On-Behalf-Of</code> token for the current user.
     *
     * @param fn a function that initializes a builder to create the {@link GenerateOboTokenRequest}
     */
    public final CompletableFuture<GenerateOboTokenResponse> generateOboToken(
        Function<GenerateOboTokenRequest.Builder, ObjectBuilder<GenerateOboTokenRequest>> fn
    ) throws IOException, OpenSearchException {
        return generateOboToken(fn, ApiType.OSS);
    }

    /**
     * Generates a <code>On-Behalf-Of</code> token for the current user.
     *
     * @param fn   a function that initializes a builder to create the {@link GenerateOboTokenRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GenerateOboTokenResponse> generateOboToken(
        Function<GenerateOboTokenRequest.Builder, ObjectBuilder<GenerateOboTokenRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return generateOboToken(fn.apply(new GenerateOboTokenRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.generate_user_token

    /**
     * Generates an authorization token for the specified user.
     */
    public CompletableFuture<GenerateUserTokenResponse> generateUserToken(GenerateUserTokenRequest request) throws IOException,
        OpenSearchException {
        return generateUserToken(request, ApiType.OSS);
    }

    /**
     * Generates an authorization token for the specified user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GenerateUserTokenResponse> generateUserToken(GenerateUserTokenRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.generate_user_token", ApiType.OSS);
        return this.transport.performRequestAsync(request, GenerateUserTokenRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Generates an authorization token for the specified user.
     *
     * @param fn a function that initializes a builder to create the {@link GenerateUserTokenRequest}
     */
    public final CompletableFuture<GenerateUserTokenResponse> generateUserToken(
        Function<GenerateUserTokenRequest.Builder, ObjectBuilder<GenerateUserTokenRequest>> fn
    ) throws IOException, OpenSearchException {
        return generateUserToken(fn, ApiType.OSS);
    }

    /**
     * Generates an authorization token for the specified user.
     *
     * @param fn   a function that initializes a builder to create the {@link GenerateUserTokenRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GenerateUserTokenResponse> generateUserToken(
        Function<GenerateUserTokenRequest.Builder, ObjectBuilder<GenerateUserTokenRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return generateUserToken(fn.apply(new GenerateUserTokenRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.generate_user_token_legacy

    /**
     * Generates authorization token for the given user. Legacy API. Not Implemented.
     */
    public CompletableFuture<BooleanResponse> generateUserTokenLegacy(GenerateUserTokenLegacyRequest request) throws IOException,
        OpenSearchException {
        return generateUserTokenLegacy(request, ApiType.OSS);
    }

    /**
     * Generates authorization token for the given user. Legacy API. Not Implemented.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<BooleanResponse> generateUserTokenLegacy(GenerateUserTokenLegacyRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.generate_user_token_legacy", ApiType.OSS);
        return this.transport.performRequestAsync(request, GenerateUserTokenLegacyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Generates authorization token for the given user. Legacy API. Not Implemented.
     *
     * @param fn a function that initializes a builder to create the {@link GenerateUserTokenLegacyRequest}
     */
    public final CompletableFuture<BooleanResponse> generateUserTokenLegacy(
        Function<GenerateUserTokenLegacyRequest.Builder, ObjectBuilder<GenerateUserTokenLegacyRequest>> fn
    ) throws IOException, OpenSearchException {
        return generateUserTokenLegacy(fn, ApiType.OSS);
    }

    /**
     * Generates authorization token for the given user. Legacy API. Not Implemented.
     *
     * @param fn   a function that initializes a builder to create the {@link GenerateUserTokenLegacyRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<BooleanResponse> generateUserTokenLegacy(
        Function<GenerateUserTokenLegacyRequest.Builder, ObjectBuilder<GenerateUserTokenLegacyRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return generateUserTokenLegacy(fn.apply(new GenerateUserTokenLegacyRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.get_account_details

    /**
     * Returns account information for the current user.
     */
    public CompletableFuture<GetAccountDetailsResponse> getAccountDetails(GetAccountDetailsRequest request) throws IOException,
        OpenSearchException {
        return getAccountDetails(request, ApiType.OSS);
    }

    /**
     * Returns account information for the current user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetAccountDetailsResponse> getAccountDetails(GetAccountDetailsRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_account_details", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetAccountDetailsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns account information for the current user.
     *
     * @param fn a function that initializes a builder to create the {@link GetAccountDetailsRequest}
     */
    public final CompletableFuture<GetAccountDetailsResponse> getAccountDetails(
        Function<GetAccountDetailsRequest.Builder, ObjectBuilder<GetAccountDetailsRequest>> fn
    ) throws IOException, OpenSearchException {
        return getAccountDetails(fn, ApiType.OSS);
    }

    /**
     * Returns account information for the current user.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAccountDetailsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAccountDetailsResponse> getAccountDetails(
        Function<GetAccountDetailsRequest.Builder, ObjectBuilder<GetAccountDetailsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAccountDetails(fn.apply(new GetAccountDetailsRequest.Builder()).build(), type);
    }

    /**
     * Returns account information for the current user.
     */
    public final CompletableFuture<GetAccountDetailsResponse> getAccountDetails() throws IOException, OpenSearchException {
        return getAccountDetails(ApiType.OSS);
    }

    /**
     * Returns account information for the current user.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAccountDetailsResponse> getAccountDetails(ApiType type) throws IOException, OpenSearchException {
        return getAccountDetails(new GetAccountDetailsRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_action_group

    /**
     * Retrieves one action group.
     */
    public CompletableFuture<GetActionGroupResponse> getActionGroup(GetActionGroupRequest request) throws IOException, OpenSearchException {
        return getActionGroup(request, ApiType.OSS);
    }

    /**
     * Retrieves one action group.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetActionGroupResponse> getActionGroup(GetActionGroupRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_action_group", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetActionGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves one action group.
     *
     * @param fn a function that initializes a builder to create the {@link GetActionGroupRequest}
     */
    public final CompletableFuture<GetActionGroupResponse> getActionGroup(
        Function<GetActionGroupRequest.Builder, ObjectBuilder<GetActionGroupRequest>> fn
    ) throws IOException, OpenSearchException {
        return getActionGroup(fn, ApiType.OSS);
    }

    /**
     * Retrieves one action group.
     *
     * @param fn   a function that initializes a builder to create the {@link GetActionGroupRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetActionGroupResponse> getActionGroup(
        Function<GetActionGroupRequest.Builder, ObjectBuilder<GetActionGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getActionGroup(fn.apply(new GetActionGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.get_action_groups

    /**
     * Retrieves all action groups.
     */
    public CompletableFuture<GetActionGroupsResponse> getActionGroups(GetActionGroupsRequest request) throws IOException,
        OpenSearchException {
        return getActionGroups(request, ApiType.OSS);
    }

    /**
     * Retrieves all action groups.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetActionGroupsResponse> getActionGroups(GetActionGroupsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_action_groups", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetActionGroupsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves all action groups.
     *
     * @param fn a function that initializes a builder to create the {@link GetActionGroupsRequest}
     */
    public final CompletableFuture<GetActionGroupsResponse> getActionGroups(
        Function<GetActionGroupsRequest.Builder, ObjectBuilder<GetActionGroupsRequest>> fn
    ) throws IOException, OpenSearchException {
        return getActionGroups(fn, ApiType.OSS);
    }

    /**
     * Retrieves all action groups.
     *
     * @param fn   a function that initializes a builder to create the {@link GetActionGroupsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetActionGroupsResponse> getActionGroups(
        Function<GetActionGroupsRequest.Builder, ObjectBuilder<GetActionGroupsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getActionGroups(fn.apply(new GetActionGroupsRequest.Builder()).build(), type);
    }

    /**
     * Retrieves all action groups.
     */
    public final CompletableFuture<GetActionGroupsResponse> getActionGroups() throws IOException, OpenSearchException {
        return getActionGroups(ApiType.OSS);
    }

    /**
     * Retrieves all action groups.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetActionGroupsResponse> getActionGroups(ApiType type) throws IOException, OpenSearchException {
        return getActionGroups(new GetActionGroupsRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_all_certificates

    /**
     * Retrieves the cluster security certificates.
     */
    public CompletableFuture<GetAllCertificatesResponse> getAllCertificates(GetAllCertificatesRequest request) throws IOException,
        OpenSearchException {
        return getAllCertificates(request, ApiType.OSS);
    }

    /**
     * Retrieves the cluster security certificates.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetAllCertificatesResponse> getAllCertificates(GetAllCertificatesRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_all_certificates", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetAllCertificatesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the cluster security certificates.
     *
     * @param fn a function that initializes a builder to create the {@link GetAllCertificatesRequest}
     */
    public final CompletableFuture<GetAllCertificatesResponse> getAllCertificates(
        Function<GetAllCertificatesRequest.Builder, ObjectBuilder<GetAllCertificatesRequest>> fn
    ) throws IOException, OpenSearchException {
        return getAllCertificates(fn, ApiType.OSS);
    }

    /**
     * Retrieves the cluster security certificates.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAllCertificatesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAllCertificatesResponse> getAllCertificates(
        Function<GetAllCertificatesRequest.Builder, ObjectBuilder<GetAllCertificatesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAllCertificates(fn.apply(new GetAllCertificatesRequest.Builder()).build(), type);
    }

    /**
     * Retrieves the cluster security certificates.
     */
    public final CompletableFuture<GetAllCertificatesResponse> getAllCertificates() throws IOException, OpenSearchException {
        return getAllCertificates(ApiType.OSS);
    }

    /**
     * Retrieves the cluster security certificates.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAllCertificatesResponse> getAllCertificates(ApiType type) throws IOException, OpenSearchException {
        return getAllCertificates(new GetAllCertificatesRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_allowlist

    /**
     * Retrieves the current list of allowed APIs accessible to a normal user.
     */
    public CompletableFuture<GetAllowlistResponse> getAllowlist(GetAllowlistRequest request) throws IOException, OpenSearchException {
        return getAllowlist(request, ApiType.OSS);
    }

    /**
     * Retrieves the current list of allowed APIs accessible to a normal user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetAllowlistResponse> getAllowlist(GetAllowlistRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_allowlist", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetAllowlistRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the current list of allowed APIs accessible to a normal user.
     *
     * @param fn a function that initializes a builder to create the {@link GetAllowlistRequest}
     */
    public final CompletableFuture<GetAllowlistResponse> getAllowlist(
        Function<GetAllowlistRequest.Builder, ObjectBuilder<GetAllowlistRequest>> fn
    ) throws IOException, OpenSearchException {
        return getAllowlist(fn, ApiType.OSS);
    }

    /**
     * Retrieves the current list of allowed APIs accessible to a normal user.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAllowlistRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAllowlistResponse> getAllowlist(
        Function<GetAllowlistRequest.Builder, ObjectBuilder<GetAllowlistRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAllowlist(fn.apply(new GetAllowlistRequest.Builder()).build(), type);
    }

    /**
     * Retrieves the current list of allowed APIs accessible to a normal user.
     */
    public final CompletableFuture<GetAllowlistResponse> getAllowlist() throws IOException, OpenSearchException {
        return getAllowlist(ApiType.OSS);
    }

    /**
     * Retrieves the current list of allowed APIs accessible to a normal user.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAllowlistResponse> getAllowlist(ApiType type) throws IOException, OpenSearchException {
        return getAllowlist(new GetAllowlistRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_audit_configuration

    /**
     * Retrieves the audit configuration.
     */
    public CompletableFuture<GetAuditConfigurationResponse> getAuditConfiguration(GetAuditConfigurationRequest request) throws IOException,
        OpenSearchException {
        return getAuditConfiguration(request, ApiType.OSS);
    }

    /**
     * Retrieves the audit configuration.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetAuditConfigurationResponse> getAuditConfiguration(GetAuditConfigurationRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_audit_configuration", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetAuditConfigurationRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the audit configuration.
     *
     * @param fn a function that initializes a builder to create the {@link GetAuditConfigurationRequest}
     */
    public final CompletableFuture<GetAuditConfigurationResponse> getAuditConfiguration(
        Function<GetAuditConfigurationRequest.Builder, ObjectBuilder<GetAuditConfigurationRequest>> fn
    ) throws IOException, OpenSearchException {
        return getAuditConfiguration(fn, ApiType.OSS);
    }

    /**
     * Retrieves the audit configuration.
     *
     * @param fn   a function that initializes a builder to create the {@link GetAuditConfigurationRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAuditConfigurationResponse> getAuditConfiguration(
        Function<GetAuditConfigurationRequest.Builder, ObjectBuilder<GetAuditConfigurationRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getAuditConfiguration(fn.apply(new GetAuditConfigurationRequest.Builder()).build(), type);
    }

    /**
     * Retrieves the audit configuration.
     */
    public final CompletableFuture<GetAuditConfigurationResponse> getAuditConfiguration() throws IOException, OpenSearchException {
        return getAuditConfiguration(ApiType.OSS);
    }

    /**
     * Retrieves the audit configuration.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetAuditConfigurationResponse> getAuditConfiguration(ApiType type) throws IOException,
        OpenSearchException {
        return getAuditConfiguration(new GetAuditConfigurationRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_certificates

    /**
     * Retrieves the cluster security certificates.
     */
    public CompletableFuture<GetCertificatesResponse> getCertificates(GetCertificatesRequest request) throws IOException,
        OpenSearchException {
        return getCertificates(request, ApiType.OSS);
    }

    /**
     * Retrieves the cluster security certificates.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetCertificatesResponse> getCertificates(GetCertificatesRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_certificates", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetCertificatesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the cluster security certificates.
     *
     * @param fn a function that initializes a builder to create the {@link GetCertificatesRequest}
     */
    public final CompletableFuture<GetCertificatesResponse> getCertificates(
        Function<GetCertificatesRequest.Builder, ObjectBuilder<GetCertificatesRequest>> fn
    ) throws IOException, OpenSearchException {
        return getCertificates(fn, ApiType.OSS);
    }

    /**
     * Retrieves the cluster security certificates.
     *
     * @param fn   a function that initializes a builder to create the {@link GetCertificatesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetCertificatesResponse> getCertificates(
        Function<GetCertificatesRequest.Builder, ObjectBuilder<GetCertificatesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getCertificates(fn.apply(new GetCertificatesRequest.Builder()).build(), type);
    }

    /**
     * Retrieves the cluster security certificates.
     */
    public final CompletableFuture<GetCertificatesResponse> getCertificates() throws IOException, OpenSearchException {
        return getCertificates(ApiType.OSS);
    }

    /**
     * Retrieves the cluster security certificates.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetCertificatesResponse> getCertificates(ApiType type) throws IOException, OpenSearchException {
        return getCertificates(new GetCertificatesRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_configuration

    /**
     * Returns the current Security plugin configuration in a JSON format.
     */
    public CompletableFuture<GetConfigurationResponse> getConfiguration(GetConfigurationRequest request) throws IOException,
        OpenSearchException {
        return getConfiguration(request, ApiType.OSS);
    }

    /**
     * Returns the current Security plugin configuration in a JSON format.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetConfigurationResponse> getConfiguration(GetConfigurationRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_configuration", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetConfigurationRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns the current Security plugin configuration in a JSON format.
     *
     * @param fn a function that initializes a builder to create the {@link GetConfigurationRequest}
     */
    public final CompletableFuture<GetConfigurationResponse> getConfiguration(
        Function<GetConfigurationRequest.Builder, ObjectBuilder<GetConfigurationRequest>> fn
    ) throws IOException, OpenSearchException {
        return getConfiguration(fn, ApiType.OSS);
    }

    /**
     * Returns the current Security plugin configuration in a JSON format.
     *
     * @param fn   a function that initializes a builder to create the {@link GetConfigurationRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetConfigurationResponse> getConfiguration(
        Function<GetConfigurationRequest.Builder, ObjectBuilder<GetConfigurationRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getConfiguration(fn.apply(new GetConfigurationRequest.Builder()).build(), type);
    }

    /**
     * Returns the current Security plugin configuration in a JSON format.
     */
    public final CompletableFuture<GetConfigurationResponse> getConfiguration() throws IOException, OpenSearchException {
        return getConfiguration(ApiType.OSS);
    }

    /**
     * Returns the current Security plugin configuration in a JSON format.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetConfigurationResponse> getConfiguration(ApiType type) throws IOException, OpenSearchException {
        return getConfiguration(new GetConfigurationRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_dashboards_info

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     */
    public CompletableFuture<GetDashboardsInfoResponse> getDashboardsInfo(GetDashboardsInfoRequest request) throws IOException,
        OpenSearchException {
        return getDashboardsInfo(request, ApiType.OSS);
    }

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetDashboardsInfoResponse> getDashboardsInfo(GetDashboardsInfoRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_dashboards_info", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetDashboardsInfoRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     *
     * @param fn a function that initializes a builder to create the {@link GetDashboardsInfoRequest}
     */
    public final CompletableFuture<GetDashboardsInfoResponse> getDashboardsInfo(
        Function<GetDashboardsInfoRequest.Builder, ObjectBuilder<GetDashboardsInfoRequest>> fn
    ) throws IOException, OpenSearchException {
        return getDashboardsInfo(fn, ApiType.OSS);
    }

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     *
     * @param fn   a function that initializes a builder to create the {@link GetDashboardsInfoRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetDashboardsInfoResponse> getDashboardsInfo(
        Function<GetDashboardsInfoRequest.Builder, ObjectBuilder<GetDashboardsInfoRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getDashboardsInfo(fn.apply(new GetDashboardsInfoRequest.Builder()).build(), type);
    }

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     */
    public final CompletableFuture<GetDashboardsInfoResponse> getDashboardsInfo() throws IOException, OpenSearchException {
        return getDashboardsInfo(ApiType.OSS);
    }

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetDashboardsInfoResponse> getDashboardsInfo(ApiType type) throws IOException, OpenSearchException {
        return getDashboardsInfo(new GetDashboardsInfoRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_distinguished_name

    /**
     * Retrieves all node distinguished names. Requires super admin or REST API permissions.
     */
    public CompletableFuture<GetDistinguishedNameResponse> getDistinguishedName(GetDistinguishedNameRequest request) throws IOException,
        OpenSearchException {
        return getDistinguishedName(request, ApiType.OSS);
    }

    /**
     * Retrieves all node distinguished names. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetDistinguishedNameResponse> getDistinguishedName(GetDistinguishedNameRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_distinguished_name", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetDistinguishedNameRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves all node distinguished names. Requires super admin or REST API permissions.
     *
     * @param fn a function that initializes a builder to create the {@link GetDistinguishedNameRequest}
     */
    public final CompletableFuture<GetDistinguishedNameResponse> getDistinguishedName(
        Function<GetDistinguishedNameRequest.Builder, ObjectBuilder<GetDistinguishedNameRequest>> fn
    ) throws IOException, OpenSearchException {
        return getDistinguishedName(fn, ApiType.OSS);
    }

    /**
     * Retrieves all node distinguished names. Requires super admin or REST API permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link GetDistinguishedNameRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetDistinguishedNameResponse> getDistinguishedName(
        Function<GetDistinguishedNameRequest.Builder, ObjectBuilder<GetDistinguishedNameRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getDistinguishedName(fn.apply(new GetDistinguishedNameRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.get_distinguished_names

    /**
     * Retrieves all node distinguished names. Requires super admin or REST API permissions.
     */
    public CompletableFuture<GetDistinguishedNamesResponse> getDistinguishedNames(GetDistinguishedNamesRequest request) throws IOException,
        OpenSearchException {
        return getDistinguishedNames(request, ApiType.OSS);
    }

    /**
     * Retrieves all node distinguished names. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetDistinguishedNamesResponse> getDistinguishedNames(GetDistinguishedNamesRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_distinguished_names", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetDistinguishedNamesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves all node distinguished names. Requires super admin or REST API permissions.
     *
     * @param fn a function that initializes a builder to create the {@link GetDistinguishedNamesRequest}
     */
    public final CompletableFuture<GetDistinguishedNamesResponse> getDistinguishedNames(
        Function<GetDistinguishedNamesRequest.Builder, ObjectBuilder<GetDistinguishedNamesRequest>> fn
    ) throws IOException, OpenSearchException {
        return getDistinguishedNames(fn, ApiType.OSS);
    }

    /**
     * Retrieves all node distinguished names. Requires super admin or REST API permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link GetDistinguishedNamesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetDistinguishedNamesResponse> getDistinguishedNames(
        Function<GetDistinguishedNamesRequest.Builder, ObjectBuilder<GetDistinguishedNamesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getDistinguishedNames(fn.apply(new GetDistinguishedNamesRequest.Builder()).build(), type);
    }

    /**
     * Retrieves all node distinguished names. Requires super admin or REST API permissions.
     */
    public final CompletableFuture<GetDistinguishedNamesResponse> getDistinguishedNames() throws IOException, OpenSearchException {
        return getDistinguishedNames(ApiType.OSS);
    }

    /**
     * Retrieves all node distinguished names. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetDistinguishedNamesResponse> getDistinguishedNames(ApiType type) throws IOException,
        OpenSearchException {
        return getDistinguishedNames(new GetDistinguishedNamesRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_node_certificates

    /**
     * Retrieves the specified node's security certificates.
     */
    public CompletableFuture<GetNodeCertificatesResponse> getNodeCertificates(GetNodeCertificatesRequest request) throws IOException,
        OpenSearchException {
        return getNodeCertificates(request, ApiType.OSS);
    }

    /**
     * Retrieves the specified node's security certificates.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetNodeCertificatesResponse> getNodeCertificates(GetNodeCertificatesRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_node_certificates", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetNodeCertificatesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the specified node's security certificates.
     *
     * @param fn a function that initializes a builder to create the {@link GetNodeCertificatesRequest}
     */
    public final CompletableFuture<GetNodeCertificatesResponse> getNodeCertificates(
        Function<GetNodeCertificatesRequest.Builder, ObjectBuilder<GetNodeCertificatesRequest>> fn
    ) throws IOException, OpenSearchException {
        return getNodeCertificates(fn, ApiType.OSS);
    }

    /**
     * Retrieves the specified node's security certificates.
     *
     * @param fn   a function that initializes a builder to create the {@link GetNodeCertificatesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetNodeCertificatesResponse> getNodeCertificates(
        Function<GetNodeCertificatesRequest.Builder, ObjectBuilder<GetNodeCertificatesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getNodeCertificates(fn.apply(new GetNodeCertificatesRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.get_permissions_info

    /**
     * Retrieves the evaluated REST API permissions for the currently logged in user.
     */
    public CompletableFuture<GetPermissionsInfoResponse> getPermissionsInfo(GetPermissionsInfoRequest request) throws IOException,
        OpenSearchException {
        return getPermissionsInfo(request, ApiType.OSS);
    }

    /**
     * Retrieves the evaluated REST API permissions for the currently logged in user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetPermissionsInfoResponse> getPermissionsInfo(GetPermissionsInfoRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_permissions_info", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetPermissionsInfoRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the evaluated REST API permissions for the currently logged in user.
     *
     * @param fn a function that initializes a builder to create the {@link GetPermissionsInfoRequest}
     */
    public final CompletableFuture<GetPermissionsInfoResponse> getPermissionsInfo(
        Function<GetPermissionsInfoRequest.Builder, ObjectBuilder<GetPermissionsInfoRequest>> fn
    ) throws IOException, OpenSearchException {
        return getPermissionsInfo(fn, ApiType.OSS);
    }

    /**
     * Retrieves the evaluated REST API permissions for the currently logged in user.
     *
     * @param fn   a function that initializes a builder to create the {@link GetPermissionsInfoRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetPermissionsInfoResponse> getPermissionsInfo(
        Function<GetPermissionsInfoRequest.Builder, ObjectBuilder<GetPermissionsInfoRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getPermissionsInfo(fn.apply(new GetPermissionsInfoRequest.Builder()).build(), type);
    }

    /**
     * Retrieves the evaluated REST API permissions for the currently logged in user.
     */
    public final CompletableFuture<GetPermissionsInfoResponse> getPermissionsInfo() throws IOException, OpenSearchException {
        return getPermissionsInfo(ApiType.OSS);
    }

    /**
     * Retrieves the evaluated REST API permissions for the currently logged in user.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetPermissionsInfoResponse> getPermissionsInfo(ApiType type) throws IOException, OpenSearchException {
        return getPermissionsInfo(new GetPermissionsInfoRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_role

    /**
     * Retrieves one role.
     */
    public CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request) throws IOException, OpenSearchException {
        return getRole(request, ApiType.OSS);
    }

    /**
     * Retrieves one role.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_role", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetRoleRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves one role.
     *
     * @param fn a function that initializes a builder to create the {@link GetRoleRequest}
     */
    public final CompletableFuture<GetRoleResponse> getRole(Function<GetRoleRequest.Builder, ObjectBuilder<GetRoleRequest>> fn)
        throws IOException, OpenSearchException {
        return getRole(fn, ApiType.OSS);
    }

    /**
     * Retrieves one role.
     *
     * @param fn   a function that initializes a builder to create the {@link GetRoleRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetRoleResponse> getRole(
        Function<GetRoleRequest.Builder, ObjectBuilder<GetRoleRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getRole(fn.apply(new GetRoleRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.get_role_mapping

    /**
     * Retrieves the specified role mapping.
     */
    public CompletableFuture<GetRoleMappingResponse> getRoleMapping(GetRoleMappingRequest request) throws IOException, OpenSearchException {
        return getRoleMapping(request, ApiType.OSS);
    }

    /**
     * Retrieves the specified role mapping.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetRoleMappingResponse> getRoleMapping(GetRoleMappingRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_role_mapping", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetRoleMappingRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the specified role mapping.
     *
     * @param fn a function that initializes a builder to create the {@link GetRoleMappingRequest}
     */
    public final CompletableFuture<GetRoleMappingResponse> getRoleMapping(
        Function<GetRoleMappingRequest.Builder, ObjectBuilder<GetRoleMappingRequest>> fn
    ) throws IOException, OpenSearchException {
        return getRoleMapping(fn, ApiType.OSS);
    }

    /**
     * Retrieves the specified role mapping.
     *
     * @param fn   a function that initializes a builder to create the {@link GetRoleMappingRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetRoleMappingResponse> getRoleMapping(
        Function<GetRoleMappingRequest.Builder, ObjectBuilder<GetRoleMappingRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getRoleMapping(fn.apply(new GetRoleMappingRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.get_role_mappings

    /**
     * Retrieves all role mappings.
     */
    public CompletableFuture<GetRoleMappingsResponse> getRoleMappings(GetRoleMappingsRequest request) throws IOException,
        OpenSearchException {
        return getRoleMappings(request, ApiType.OSS);
    }

    /**
     * Retrieves all role mappings.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetRoleMappingsResponse> getRoleMappings(GetRoleMappingsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_role_mappings", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetRoleMappingsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves all role mappings.
     *
     * @param fn a function that initializes a builder to create the {@link GetRoleMappingsRequest}
     */
    public final CompletableFuture<GetRoleMappingsResponse> getRoleMappings(
        Function<GetRoleMappingsRequest.Builder, ObjectBuilder<GetRoleMappingsRequest>> fn
    ) throws IOException, OpenSearchException {
        return getRoleMappings(fn, ApiType.OSS);
    }

    /**
     * Retrieves all role mappings.
     *
     * @param fn   a function that initializes a builder to create the {@link GetRoleMappingsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetRoleMappingsResponse> getRoleMappings(
        Function<GetRoleMappingsRequest.Builder, ObjectBuilder<GetRoleMappingsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getRoleMappings(fn.apply(new GetRoleMappingsRequest.Builder()).build(), type);
    }

    /**
     * Retrieves all role mappings.
     */
    public final CompletableFuture<GetRoleMappingsResponse> getRoleMappings() throws IOException, OpenSearchException {
        return getRoleMappings(ApiType.OSS);
    }

    /**
     * Retrieves all role mappings.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetRoleMappingsResponse> getRoleMappings(ApiType type) throws IOException, OpenSearchException {
        return getRoleMappings(new GetRoleMappingsRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_roles

    /**
     * Retrieves all roles.
     */
    public CompletableFuture<GetRolesResponse> getRoles(GetRolesRequest request) throws IOException, OpenSearchException {
        return getRoles(request, ApiType.OSS);
    }

    /**
     * Retrieves all roles.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetRolesResponse> getRoles(GetRolesRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_roles", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetRolesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves all roles.
     *
     * @param fn a function that initializes a builder to create the {@link GetRolesRequest}
     */
    public final CompletableFuture<GetRolesResponse> getRoles(Function<GetRolesRequest.Builder, ObjectBuilder<GetRolesRequest>> fn)
        throws IOException, OpenSearchException {
        return getRoles(fn, ApiType.OSS);
    }

    /**
     * Retrieves all roles.
     *
     * @param fn   a function that initializes a builder to create the {@link GetRolesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetRolesResponse> getRoles(
        Function<GetRolesRequest.Builder, ObjectBuilder<GetRolesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getRoles(fn.apply(new GetRolesRequest.Builder()).build(), type);
    }

    /**
     * Retrieves all roles.
     */
    public final CompletableFuture<GetRolesResponse> getRoles() throws IOException, OpenSearchException {
        return getRoles(ApiType.OSS);
    }

    /**
     * Retrieves all roles.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetRolesResponse> getRoles(ApiType type) throws IOException, OpenSearchException {
        return getRoles(new GetRolesRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_sslinfo

    /**
     * Retrieves information about the SSL configuration.
     */
    public CompletableFuture<GetSslinfoResponse> getSslinfo(GetSslinfoRequest request) throws IOException, OpenSearchException {
        return getSslinfo(request, ApiType.OSS);
    }

    /**
     * Retrieves information about the SSL configuration.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetSslinfoResponse> getSslinfo(GetSslinfoRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_sslinfo", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetSslinfoRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves information about the SSL configuration.
     *
     * @param fn a function that initializes a builder to create the {@link GetSslinfoRequest}
     */
    public final CompletableFuture<GetSslinfoResponse> getSslinfo(Function<GetSslinfoRequest.Builder, ObjectBuilder<GetSslinfoRequest>> fn)
        throws IOException, OpenSearchException {
        return getSslinfo(fn, ApiType.OSS);
    }

    /**
     * Retrieves information about the SSL configuration.
     *
     * @param fn   a function that initializes a builder to create the {@link GetSslinfoRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetSslinfoResponse> getSslinfo(
        Function<GetSslinfoRequest.Builder, ObjectBuilder<GetSslinfoRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getSslinfo(fn.apply(new GetSslinfoRequest.Builder()).build(), type);
    }

    /**
     * Retrieves information about the SSL configuration.
     */
    public final CompletableFuture<GetSslinfoResponse> getSslinfo() throws IOException, OpenSearchException {
        return getSslinfo(ApiType.OSS);
    }

    /**
     * Retrieves information about the SSL configuration.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetSslinfoResponse> getSslinfo(ApiType type) throws IOException, OpenSearchException {
        return getSslinfo(new GetSslinfoRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_tenancy_config

    /**
     * Retrieves the multi-tenancy configuration. Requires super admin or REST API permissions.
     */
    public CompletableFuture<GetTenancyConfigResponse> getTenancyConfig(GetTenancyConfigRequest request) throws IOException,
        OpenSearchException {
        return getTenancyConfig(request, ApiType.OSS);
    }

    /**
     * Retrieves the multi-tenancy configuration. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetTenancyConfigResponse> getTenancyConfig(GetTenancyConfigRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_tenancy_config", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetTenancyConfigRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the multi-tenancy configuration. Requires super admin or REST API permissions.
     *
     * @param fn a function that initializes a builder to create the {@link GetTenancyConfigRequest}
     */
    public final CompletableFuture<GetTenancyConfigResponse> getTenancyConfig(
        Function<GetTenancyConfigRequest.Builder, ObjectBuilder<GetTenancyConfigRequest>> fn
    ) throws IOException, OpenSearchException {
        return getTenancyConfig(fn, ApiType.OSS);
    }

    /**
     * Retrieves the multi-tenancy configuration. Requires super admin or REST API permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link GetTenancyConfigRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetTenancyConfigResponse> getTenancyConfig(
        Function<GetTenancyConfigRequest.Builder, ObjectBuilder<GetTenancyConfigRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getTenancyConfig(fn.apply(new GetTenancyConfigRequest.Builder()).build(), type);
    }

    /**
     * Retrieves the multi-tenancy configuration. Requires super admin or REST API permissions.
     */
    public final CompletableFuture<GetTenancyConfigResponse> getTenancyConfig() throws IOException, OpenSearchException {
        return getTenancyConfig(ApiType.OSS);
    }

    /**
     * Retrieves the multi-tenancy configuration. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetTenancyConfigResponse> getTenancyConfig(ApiType type) throws IOException, OpenSearchException {
        return getTenancyConfig(new GetTenancyConfigRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_tenant

    /**
     * Retrieves the specified tenant.
     */
    public CompletableFuture<GetTenantResponse> getTenant(GetTenantRequest request) throws IOException, OpenSearchException {
        return getTenant(request, ApiType.OSS);
    }

    /**
     * Retrieves the specified tenant.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetTenantResponse> getTenant(GetTenantRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_tenant", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetTenantRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the specified tenant.
     *
     * @param fn a function that initializes a builder to create the {@link GetTenantRequest}
     */
    public final CompletableFuture<GetTenantResponse> getTenant(Function<GetTenantRequest.Builder, ObjectBuilder<GetTenantRequest>> fn)
        throws IOException, OpenSearchException {
        return getTenant(fn, ApiType.OSS);
    }

    /**
     * Retrieves the specified tenant.
     *
     * @param fn   a function that initializes a builder to create the {@link GetTenantRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetTenantResponse> getTenant(
        Function<GetTenantRequest.Builder, ObjectBuilder<GetTenantRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getTenant(fn.apply(new GetTenantRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.get_tenants

    /**
     * Retrieves all tenants.
     */
    public CompletableFuture<GetTenantsResponse> getTenants(GetTenantsRequest request) throws IOException, OpenSearchException {
        return getTenants(request, ApiType.OSS);
    }

    /**
     * Retrieves all tenants.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetTenantsResponse> getTenants(GetTenantsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_tenants", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetTenantsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves all tenants.
     *
     * @param fn a function that initializes a builder to create the {@link GetTenantsRequest}
     */
    public final CompletableFuture<GetTenantsResponse> getTenants(Function<GetTenantsRequest.Builder, ObjectBuilder<GetTenantsRequest>> fn)
        throws IOException, OpenSearchException {
        return getTenants(fn, ApiType.OSS);
    }

    /**
     * Retrieves all tenants.
     *
     * @param fn   a function that initializes a builder to create the {@link GetTenantsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetTenantsResponse> getTenants(
        Function<GetTenantsRequest.Builder, ObjectBuilder<GetTenantsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getTenants(fn.apply(new GetTenantsRequest.Builder()).build(), type);
    }

    /**
     * Retrieves all tenants.
     */
    public final CompletableFuture<GetTenantsResponse> getTenants() throws IOException, OpenSearchException {
        return getTenants(ApiType.OSS);
    }

    /**
     * Retrieves all tenants.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetTenantsResponse> getTenants(ApiType type) throws IOException, OpenSearchException {
        return getTenants(new GetTenantsRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_user

    /**
     * Retrieve information about the specified internal user.
     */
    public CompletableFuture<GetUserResponse> getUser(GetUserRequest request) throws IOException, OpenSearchException {
        return getUser(request, ApiType.OSS);
    }

    /**
     * Retrieve information about the specified internal user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetUserResponse> getUser(GetUserRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_user", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetUserRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieve information about the specified internal user.
     *
     * @param fn a function that initializes a builder to create the {@link GetUserRequest}
     */
    public final CompletableFuture<GetUserResponse> getUser(Function<GetUserRequest.Builder, ObjectBuilder<GetUserRequest>> fn)
        throws IOException, OpenSearchException {
        return getUser(fn, ApiType.OSS);
    }

    /**
     * Retrieve information about the specified internal user.
     *
     * @param fn   a function that initializes a builder to create the {@link GetUserRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetUserResponse> getUser(
        Function<GetUserRequest.Builder, ObjectBuilder<GetUserRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getUser(fn.apply(new GetUserRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.get_user_legacy

    /**
     * Retrieve one user. Legacy API.
     */
    public CompletableFuture<GetUserLegacyResponse> getUserLegacy(GetUserLegacyRequest request) throws IOException, OpenSearchException {
        return getUserLegacy(request, ApiType.OSS);
    }

    /**
     * Retrieve one user. Legacy API.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetUserLegacyResponse> getUserLegacy(GetUserLegacyRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_user_legacy", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetUserLegacyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieve one user. Legacy API.
     *
     * @param fn a function that initializes a builder to create the {@link GetUserLegacyRequest}
     */
    public final CompletableFuture<GetUserLegacyResponse> getUserLegacy(
        Function<GetUserLegacyRequest.Builder, ObjectBuilder<GetUserLegacyRequest>> fn
    ) throws IOException, OpenSearchException {
        return getUserLegacy(fn, ApiType.OSS);
    }

    /**
     * Retrieve one user. Legacy API.
     *
     * @param fn   a function that initializes a builder to create the {@link GetUserLegacyRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetUserLegacyResponse> getUserLegacy(
        Function<GetUserLegacyRequest.Builder, ObjectBuilder<GetUserLegacyRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getUserLegacy(fn.apply(new GetUserLegacyRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.get_users

    /**
     * Retrieve all internal users.
     */
    public CompletableFuture<GetUsersResponse> getUsers(GetUsersRequest request) throws IOException, OpenSearchException {
        return getUsers(request, ApiType.OSS);
    }

    /**
     * Retrieve all internal users.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetUsersResponse> getUsers(GetUsersRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.get_users", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetUsersRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieve all internal users.
     *
     * @param fn a function that initializes a builder to create the {@link GetUsersRequest}
     */
    public final CompletableFuture<GetUsersResponse> getUsers(Function<GetUsersRequest.Builder, ObjectBuilder<GetUsersRequest>> fn)
        throws IOException, OpenSearchException {
        return getUsers(fn, ApiType.OSS);
    }

    /**
     * Retrieve all internal users.
     *
     * @param fn   a function that initializes a builder to create the {@link GetUsersRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetUsersResponse> getUsers(
        Function<GetUsersRequest.Builder, ObjectBuilder<GetUsersRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getUsers(fn.apply(new GetUsersRequest.Builder()).build(), type);
    }

    /**
     * Retrieve all internal users.
     */
    public final CompletableFuture<GetUsersResponse> getUsers() throws IOException, OpenSearchException {
        return getUsers(ApiType.OSS);
    }

    /**
     * Retrieve all internal users.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetUsersResponse> getUsers(ApiType type) throws IOException, OpenSearchException {
        return getUsers(new GetUsersRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.get_users_legacy

    /**
     * Retrieve all internal users. Legacy API.
     */
    public CompletableFuture<GetUsersLegacyResponse> getUsersLegacy(GetUsersLegacyRequest request) throws IOException, OpenSearchException {
        return getUsersLegacy(request, ApiType.OSS);
    }

    /**
     * Retrieve all internal users. Legacy API.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetUsersLegacyResponse> getUsersLegacy(GetUsersLegacyRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.get_users_legacy", ApiType.OSS);
        return this.transport.performRequestAsync(request, GetUsersLegacyRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieve all internal users. Legacy API.
     *
     * @param fn a function that initializes a builder to create the {@link GetUsersLegacyRequest}
     */
    public final CompletableFuture<GetUsersLegacyResponse> getUsersLegacy(
        Function<GetUsersLegacyRequest.Builder, ObjectBuilder<GetUsersLegacyRequest>> fn
    ) throws IOException, OpenSearchException {
        return getUsersLegacy(fn, ApiType.OSS);
    }

    /**
     * Retrieve all internal users. Legacy API.
     *
     * @param fn   a function that initializes a builder to create the {@link GetUsersLegacyRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetUsersLegacyResponse> getUsersLegacy(
        Function<GetUsersLegacyRequest.Builder, ObjectBuilder<GetUsersLegacyRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getUsersLegacy(fn.apply(new GetUsersLegacyRequest.Builder()).build(), type);
    }

    /**
     * Retrieve all internal users. Legacy API.
     */
    public final CompletableFuture<GetUsersLegacyResponse> getUsersLegacy() throws IOException, OpenSearchException {
        return getUsersLegacy(ApiType.OSS);
    }

    /**
     * Retrieve all internal users. Legacy API.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetUsersLegacyResponse> getUsersLegacy(ApiType type) throws IOException, OpenSearchException {
        return getUsersLegacy(new GetUsersLegacyRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.health

    /**
     * Checks to see if the Security plugin is running.
     */
    public CompletableFuture<HealthResponse> health(HealthRequest request) throws IOException, OpenSearchException {
        return health(request, ApiType.OSS);
    }

    /**
     * Checks to see if the Security plugin is running.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<HealthResponse> health(HealthRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.health", ApiType.OSS);
        return this.transport.performRequestAsync(request, HealthRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Checks to see if the Security plugin is running.
     *
     * @param fn a function that initializes a builder to create the {@link HealthRequest}
     */
    public final CompletableFuture<HealthResponse> health(Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn)
        throws IOException, OpenSearchException {
        return health(fn, ApiType.OSS);
    }

    /**
     * Checks to see if the Security plugin is running.
     *
     * @param fn   a function that initializes a builder to create the {@link HealthRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<HealthResponse> health(Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return health(fn.apply(new HealthRequest.Builder()).build(), type);
    }

    /**
     * Checks to see if the Security plugin is running.
     */
    public final CompletableFuture<HealthResponse> health() throws IOException, OpenSearchException {
        return health(ApiType.OSS);
    }

    /**
     * Checks to see if the Security plugin is running.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<HealthResponse> health(ApiType type) throws IOException, OpenSearchException {
        return health(new HealthRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.migrate

    /**
     * Migrates the security configuration from v6 to v7.
     */
    public CompletableFuture<MigrateResponse> migrate(MigrateRequest request) throws IOException, OpenSearchException {
        return migrate(request, ApiType.OSS);
    }

    /**
     * Migrates the security configuration from v6 to v7.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<MigrateResponse> migrate(MigrateRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.migrate", ApiType.OSS);
        return this.transport.performRequestAsync(request, MigrateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Migrates the security configuration from v6 to v7.
     *
     * @param fn a function that initializes a builder to create the {@link MigrateRequest}
     */
    public final CompletableFuture<MigrateResponse> migrate(Function<MigrateRequest.Builder, ObjectBuilder<MigrateRequest>> fn)
        throws IOException, OpenSearchException {
        return migrate(fn, ApiType.OSS);
    }

    /**
     * Migrates the security configuration from v6 to v7.
     *
     * @param fn   a function that initializes a builder to create the {@link MigrateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<MigrateResponse> migrate(
        Function<MigrateRequest.Builder, ObjectBuilder<MigrateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return migrate(fn.apply(new MigrateRequest.Builder()).build(), type);
    }

    /**
     * Migrates the security configuration from v6 to v7.
     */
    public final CompletableFuture<MigrateResponse> migrate() throws IOException, OpenSearchException {
        return migrate(ApiType.OSS);
    }

    /**
     * Migrates the security configuration from v6 to v7.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<MigrateResponse> migrate(ApiType type) throws IOException, OpenSearchException {
        return migrate(new MigrateRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.patch_action_group

    /**
     * Updates the individual attributes of an action group.
     */
    public CompletableFuture<PatchActionGroupResponse> patchActionGroup(PatchActionGroupRequest request) throws IOException,
        OpenSearchException {
        return patchActionGroup(request, ApiType.OSS);
    }

    /**
     * Updates the individual attributes of an action group.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchActionGroupResponse> patchActionGroup(PatchActionGroupRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.patch_action_group", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchActionGroupRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the individual attributes of an action group.
     *
     * @param fn a function that initializes a builder to create the {@link PatchActionGroupRequest}
     */
    public final CompletableFuture<PatchActionGroupResponse> patchActionGroup(
        Function<PatchActionGroupRequest.Builder, ObjectBuilder<PatchActionGroupRequest>> fn
    ) throws IOException, OpenSearchException {
        return patchActionGroup(fn, ApiType.OSS);
    }

    /**
     * Updates the individual attributes of an action group.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchActionGroupRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchActionGroupResponse> patchActionGroup(
        Function<PatchActionGroupRequest.Builder, ObjectBuilder<PatchActionGroupRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchActionGroup(fn.apply(new PatchActionGroupRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_action_groups

    /**
     * Creates, updates, or deletes multiple action groups in a single request.
     */
    public CompletableFuture<PatchActionGroupsResponse> patchActionGroups(PatchActionGroupsRequest request) throws IOException,
        OpenSearchException {
        return patchActionGroups(request, ApiType.OSS);
    }

    /**
     * Creates, updates, or deletes multiple action groups in a single request.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchActionGroupsResponse> patchActionGroups(PatchActionGroupsRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.patch_action_groups", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchActionGroupsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates, updates, or deletes multiple action groups in a single request.
     *
     * @param fn a function that initializes a builder to create the {@link PatchActionGroupsRequest}
     */
    public final CompletableFuture<PatchActionGroupsResponse> patchActionGroups(
        Function<PatchActionGroupsRequest.Builder, ObjectBuilder<PatchActionGroupsRequest>> fn
    ) throws IOException, OpenSearchException {
        return patchActionGroups(fn, ApiType.OSS);
    }

    /**
     * Creates, updates, or deletes multiple action groups in a single request.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchActionGroupsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchActionGroupsResponse> patchActionGroups(
        Function<PatchActionGroupsRequest.Builder, ObjectBuilder<PatchActionGroupsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchActionGroups(fn.apply(new PatchActionGroupsRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_allowlist

    /**
     * Updates the current list of APIs accessible for users on the allow list.
     */
    public CompletableFuture<PatchAllowlistResponse> patchAllowlist(PatchAllowlistRequest request) throws IOException, OpenSearchException {
        return patchAllowlist(request, ApiType.OSS);
    }

    /**
     * Updates the current list of APIs accessible for users on the allow list.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchAllowlistResponse> patchAllowlist(PatchAllowlistRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.patch_allowlist", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchAllowlistRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the current list of APIs accessible for users on the allow list.
     *
     * @param fn a function that initializes a builder to create the {@link PatchAllowlistRequest}
     */
    public final CompletableFuture<PatchAllowlistResponse> patchAllowlist(
        Function<PatchAllowlistRequest.Builder, ObjectBuilder<PatchAllowlistRequest>> fn
    ) throws IOException, OpenSearchException {
        return patchAllowlist(fn, ApiType.OSS);
    }

    /**
     * Updates the current list of APIs accessible for users on the allow list.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchAllowlistRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchAllowlistResponse> patchAllowlist(
        Function<PatchAllowlistRequest.Builder, ObjectBuilder<PatchAllowlistRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchAllowlist(fn.apply(new PatchAllowlistRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_audit_configuration

    /**
     * Updates the specified fields in the audit configuration.
     */
    public CompletableFuture<PatchAuditConfigurationResponse> patchAuditConfiguration(PatchAuditConfigurationRequest request)
        throws IOException, OpenSearchException {
        return patchAuditConfiguration(request, ApiType.OSS);
    }

    /**
     * Updates the specified fields in the audit configuration.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchAuditConfigurationResponse> patchAuditConfiguration(PatchAuditConfigurationRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.patch_audit_configuration", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchAuditConfigurationRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the specified fields in the audit configuration.
     *
     * @param fn a function that initializes a builder to create the {@link PatchAuditConfigurationRequest}
     */
    public final CompletableFuture<PatchAuditConfigurationResponse> patchAuditConfiguration(
        Function<PatchAuditConfigurationRequest.Builder, ObjectBuilder<PatchAuditConfigurationRequest>> fn
    ) throws IOException, OpenSearchException {
        return patchAuditConfiguration(fn, ApiType.OSS);
    }

    /**
     * Updates the specified fields in the audit configuration.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchAuditConfigurationRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchAuditConfigurationResponse> patchAuditConfiguration(
        Function<PatchAuditConfigurationRequest.Builder, ObjectBuilder<PatchAuditConfigurationRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchAuditConfiguration(fn.apply(new PatchAuditConfigurationRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_configuration

    /**
     * Updates the existing security configuration using the REST API. Requires super admin or REST API permissions.
     */
    public CompletableFuture<PatchConfigurationResponse> patchConfiguration(PatchConfigurationRequest request) throws IOException,
        OpenSearchException {
        return patchConfiguration(request, ApiType.OSS);
    }

    /**
     * Updates the existing security configuration using the REST API. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchConfigurationResponse> patchConfiguration(PatchConfigurationRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.patch_configuration", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchConfigurationRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the existing security configuration using the REST API. Requires super admin or REST API permissions.
     *
     * @param fn a function that initializes a builder to create the {@link PatchConfigurationRequest}
     */
    public final CompletableFuture<PatchConfigurationResponse> patchConfiguration(
        Function<PatchConfigurationRequest.Builder, ObjectBuilder<PatchConfigurationRequest>> fn
    ) throws IOException, OpenSearchException {
        return patchConfiguration(fn, ApiType.OSS);
    }

    /**
     * Updates the existing security configuration using the REST API. Requires super admin or REST API permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchConfigurationRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchConfigurationResponse> patchConfiguration(
        Function<PatchConfigurationRequest.Builder, ObjectBuilder<PatchConfigurationRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchConfiguration(fn.apply(new PatchConfigurationRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_distinguished_name

    /**
     * Updates the distinguished cluster name for the specified cluster. Requires super admin or REST API permissions.
     */
    public CompletableFuture<PatchDistinguishedNameResponse> patchDistinguishedName(PatchDistinguishedNameRequest request)
        throws IOException, OpenSearchException {
        return patchDistinguishedName(request, ApiType.OSS);
    }

    /**
     * Updates the distinguished cluster name for the specified cluster. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchDistinguishedNameResponse> patchDistinguishedName(PatchDistinguishedNameRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.patch_distinguished_name", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchDistinguishedNameRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the distinguished cluster name for the specified cluster. Requires super admin or REST API permissions.
     *
     * @param fn a function that initializes a builder to create the {@link PatchDistinguishedNameRequest}
     */
    public final CompletableFuture<PatchDistinguishedNameResponse> patchDistinguishedName(
        Function<PatchDistinguishedNameRequest.Builder, ObjectBuilder<PatchDistinguishedNameRequest>> fn
    ) throws IOException, OpenSearchException {
        return patchDistinguishedName(fn, ApiType.OSS);
    }

    /**
     * Updates the distinguished cluster name for the specified cluster. Requires super admin or REST API permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchDistinguishedNameRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchDistinguishedNameResponse> patchDistinguishedName(
        Function<PatchDistinguishedNameRequest.Builder, ObjectBuilder<PatchDistinguishedNameRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchDistinguishedName(fn.apply(new PatchDistinguishedNameRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_distinguished_names

    /**
     * Bulk updates specified node distinguished names. Requires super admin or REST API permissions.
     */
    public CompletableFuture<PatchDistinguishedNamesResponse> patchDistinguishedNames(PatchDistinguishedNamesRequest request)
        throws IOException, OpenSearchException {
        return patchDistinguishedNames(request, ApiType.OSS);
    }

    /**
     * Bulk updates specified node distinguished names. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchDistinguishedNamesResponse> patchDistinguishedNames(PatchDistinguishedNamesRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.patch_distinguished_names", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchDistinguishedNamesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Bulk updates specified node distinguished names. Requires super admin or REST API permissions.
     *
     * @param fn a function that initializes a builder to create the {@link PatchDistinguishedNamesRequest}
     */
    public final CompletableFuture<PatchDistinguishedNamesResponse> patchDistinguishedNames(
        Function<PatchDistinguishedNamesRequest.Builder, ObjectBuilder<PatchDistinguishedNamesRequest>> fn
    ) throws IOException, OpenSearchException {
        return patchDistinguishedNames(fn, ApiType.OSS);
    }

    /**
     * Bulk updates specified node distinguished names. Requires super admin or REST API permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchDistinguishedNamesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchDistinguishedNamesResponse> patchDistinguishedNames(
        Function<PatchDistinguishedNamesRequest.Builder, ObjectBuilder<PatchDistinguishedNamesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchDistinguishedNames(fn.apply(new PatchDistinguishedNamesRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_role

    /**
     * Updates the individual attributes of a role.
     */
    public CompletableFuture<PatchRoleResponse> patchRole(PatchRoleRequest request) throws IOException, OpenSearchException {
        return patchRole(request, ApiType.OSS);
    }

    /**
     * Updates the individual attributes of a role.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchRoleResponse> patchRole(PatchRoleRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.patch_role", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchRoleRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the individual attributes of a role.
     *
     * @param fn a function that initializes a builder to create the {@link PatchRoleRequest}
     */
    public final CompletableFuture<PatchRoleResponse> patchRole(Function<PatchRoleRequest.Builder, ObjectBuilder<PatchRoleRequest>> fn)
        throws IOException, OpenSearchException {
        return patchRole(fn, ApiType.OSS);
    }

    /**
     * Updates the individual attributes of a role.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchRoleRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchRoleResponse> patchRole(
        Function<PatchRoleRequest.Builder, ObjectBuilder<PatchRoleRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchRole(fn.apply(new PatchRoleRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_role_mapping

    /**
     * Updates the individual attributes of a role mapping.
     */
    public CompletableFuture<PatchRoleMappingResponse> patchRoleMapping(PatchRoleMappingRequest request) throws IOException,
        OpenSearchException {
        return patchRoleMapping(request, ApiType.OSS);
    }

    /**
     * Updates the individual attributes of a role mapping.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchRoleMappingResponse> patchRoleMapping(PatchRoleMappingRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.patch_role_mapping", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchRoleMappingRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the individual attributes of a role mapping.
     *
     * @param fn a function that initializes a builder to create the {@link PatchRoleMappingRequest}
     */
    public final CompletableFuture<PatchRoleMappingResponse> patchRoleMapping(
        Function<PatchRoleMappingRequest.Builder, ObjectBuilder<PatchRoleMappingRequest>> fn
    ) throws IOException, OpenSearchException {
        return patchRoleMapping(fn, ApiType.OSS);
    }

    /**
     * Updates the individual attributes of a role mapping.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchRoleMappingRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchRoleMappingResponse> patchRoleMapping(
        Function<PatchRoleMappingRequest.Builder, ObjectBuilder<PatchRoleMappingRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchRoleMapping(fn.apply(new PatchRoleMappingRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_role_mappings

    /**
     * Creates or updates multiple role mappings in a single request.
     */
    public CompletableFuture<PatchRoleMappingsResponse> patchRoleMappings(PatchRoleMappingsRequest request) throws IOException,
        OpenSearchException {
        return patchRoleMappings(request, ApiType.OSS);
    }

    /**
     * Creates or updates multiple role mappings in a single request.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchRoleMappingsResponse> patchRoleMappings(PatchRoleMappingsRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.patch_role_mappings", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchRoleMappingsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates multiple role mappings in a single request.
     *
     * @param fn a function that initializes a builder to create the {@link PatchRoleMappingsRequest}
     */
    public final CompletableFuture<PatchRoleMappingsResponse> patchRoleMappings(
        Function<PatchRoleMappingsRequest.Builder, ObjectBuilder<PatchRoleMappingsRequest>> fn
    ) throws IOException, OpenSearchException {
        return patchRoleMappings(fn, ApiType.OSS);
    }

    /**
     * Creates or updates multiple role mappings in a single request.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchRoleMappingsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchRoleMappingsResponse> patchRoleMappings(
        Function<PatchRoleMappingsRequest.Builder, ObjectBuilder<PatchRoleMappingsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchRoleMappings(fn.apply(new PatchRoleMappingsRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_roles

    /**
     * Creates, updates, or deletes multiple roles in a single call.
     */
    public CompletableFuture<PatchRolesResponse> patchRoles(PatchRolesRequest request) throws IOException, OpenSearchException {
        return patchRoles(request, ApiType.OSS);
    }

    /**
     * Creates, updates, or deletes multiple roles in a single call.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchRolesResponse> patchRoles(PatchRolesRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.patch_roles", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchRolesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates, updates, or deletes multiple roles in a single call.
     *
     * @param fn a function that initializes a builder to create the {@link PatchRolesRequest}
     */
    public final CompletableFuture<PatchRolesResponse> patchRoles(Function<PatchRolesRequest.Builder, ObjectBuilder<PatchRolesRequest>> fn)
        throws IOException, OpenSearchException {
        return patchRoles(fn, ApiType.OSS);
    }

    /**
     * Creates, updates, or deletes multiple roles in a single call.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchRolesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchRolesResponse> patchRoles(
        Function<PatchRolesRequest.Builder, ObjectBuilder<PatchRolesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchRoles(fn.apply(new PatchRolesRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_tenant

    /**
     * Adds, deletes, or modifies a single tenant.
     */
    public CompletableFuture<PatchTenantResponse> patchTenant(PatchTenantRequest request) throws IOException, OpenSearchException {
        return patchTenant(request, ApiType.OSS);
    }

    /**
     * Adds, deletes, or modifies a single tenant.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchTenantResponse> patchTenant(PatchTenantRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.patch_tenant", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchTenantRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Adds, deletes, or modifies a single tenant.
     *
     * @param fn a function that initializes a builder to create the {@link PatchTenantRequest}
     */
    public final CompletableFuture<PatchTenantResponse> patchTenant(
        Function<PatchTenantRequest.Builder, ObjectBuilder<PatchTenantRequest>> fn
    ) throws IOException, OpenSearchException {
        return patchTenant(fn, ApiType.OSS);
    }

    /**
     * Adds, deletes, or modifies a single tenant.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchTenantRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchTenantResponse> patchTenant(
        Function<PatchTenantRequest.Builder, ObjectBuilder<PatchTenantRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchTenant(fn.apply(new PatchTenantRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_tenants

    /**
     * Adds, deletes, or modifies multiple tenants in a single request.
     */
    public CompletableFuture<PatchTenantsResponse> patchTenants(PatchTenantsRequest request) throws IOException, OpenSearchException {
        return patchTenants(request, ApiType.OSS);
    }

    /**
     * Adds, deletes, or modifies multiple tenants in a single request.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchTenantsResponse> patchTenants(PatchTenantsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.patch_tenants", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchTenantsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Adds, deletes, or modifies multiple tenants in a single request.
     *
     * @param fn a function that initializes a builder to create the {@link PatchTenantsRequest}
     */
    public final CompletableFuture<PatchTenantsResponse> patchTenants(
        Function<PatchTenantsRequest.Builder, ObjectBuilder<PatchTenantsRequest>> fn
    ) throws IOException, OpenSearchException {
        return patchTenants(fn, ApiType.OSS);
    }

    /**
     * Adds, deletes, or modifies multiple tenants in a single request.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchTenantsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchTenantsResponse> patchTenants(
        Function<PatchTenantsRequest.Builder, ObjectBuilder<PatchTenantsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchTenants(fn.apply(new PatchTenantsRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_user

    /**
     * Updates individual attributes for an internal user.
     */
    public CompletableFuture<PatchUserResponse> patchUser(PatchUserRequest request) throws IOException, OpenSearchException {
        return patchUser(request, ApiType.OSS);
    }

    /**
     * Updates individual attributes for an internal user.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchUserResponse> patchUser(PatchUserRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.patch_user", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchUserRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates individual attributes for an internal user.
     *
     * @param fn a function that initializes a builder to create the {@link PatchUserRequest}
     */
    public final CompletableFuture<PatchUserResponse> patchUser(Function<PatchUserRequest.Builder, ObjectBuilder<PatchUserRequest>> fn)
        throws IOException, OpenSearchException {
        return patchUser(fn, ApiType.OSS);
    }

    /**
     * Updates individual attributes for an internal user.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchUserRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchUserResponse> patchUser(
        Function<PatchUserRequest.Builder, ObjectBuilder<PatchUserRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchUser(fn.apply(new PatchUserRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.patch_users

    /**
     * Creates, updates, or deletes multiple internal users in a single request.
     */
    public CompletableFuture<PatchUsersResponse> patchUsers(PatchUsersRequest request) throws IOException, OpenSearchException {
        return patchUsers(request, ApiType.OSS);
    }

    /**
     * Creates, updates, or deletes multiple internal users in a single request.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PatchUsersResponse> patchUsers(PatchUsersRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.patch_users", ApiType.OSS);
        return this.transport.performRequestAsync(request, PatchUsersRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates, updates, or deletes multiple internal users in a single request.
     *
     * @param fn a function that initializes a builder to create the {@link PatchUsersRequest}
     */
    public final CompletableFuture<PatchUsersResponse> patchUsers(Function<PatchUsersRequest.Builder, ObjectBuilder<PatchUsersRequest>> fn)
        throws IOException, OpenSearchException {
        return patchUsers(fn, ApiType.OSS);
    }

    /**
     * Creates, updates, or deletes multiple internal users in a single request.
     *
     * @param fn   a function that initializes a builder to create the {@link PatchUsersRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PatchUsersResponse> patchUsers(
        Function<PatchUsersRequest.Builder, ObjectBuilder<PatchUsersRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return patchUsers(fn.apply(new PatchUsersRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.post_dashboards_info

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     */
    public CompletableFuture<PostDashboardsInfoResponse> postDashboardsInfo(PostDashboardsInfoRequest request) throws IOException,
        OpenSearchException {
        return postDashboardsInfo(request, ApiType.OSS);
    }

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<PostDashboardsInfoResponse> postDashboardsInfo(PostDashboardsInfoRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.post_dashboards_info", ApiType.OSS);
        return this.transport.performRequestAsync(request, PostDashboardsInfoRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     *
     * @param fn a function that initializes a builder to create the {@link PostDashboardsInfoRequest}
     */
    public final CompletableFuture<PostDashboardsInfoResponse> postDashboardsInfo(
        Function<PostDashboardsInfoRequest.Builder, ObjectBuilder<PostDashboardsInfoRequest>> fn
    ) throws IOException, OpenSearchException {
        return postDashboardsInfo(fn, ApiType.OSS);
    }

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     *
     * @param fn   a function that initializes a builder to create the {@link PostDashboardsInfoRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PostDashboardsInfoResponse> postDashboardsInfo(
        Function<PostDashboardsInfoRequest.Builder, ObjectBuilder<PostDashboardsInfoRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return postDashboardsInfo(fn.apply(new PostDashboardsInfoRequest.Builder()).build(), type);
    }

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     */
    public final CompletableFuture<PostDashboardsInfoResponse> postDashboardsInfo() throws IOException, OpenSearchException {
        return postDashboardsInfo(ApiType.OSS);
    }

    /**
     * Retrieves the current values for dynamic security settings for OpenSearch Dashboards.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<PostDashboardsInfoResponse> postDashboardsInfo(ApiType type) throws IOException, OpenSearchException {
        return postDashboardsInfo(new PostDashboardsInfoRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.reload_http_certificates

    /**
     * Reloads the HTTP communication certificates.
     */
    public CompletableFuture<ReloadHttpCertificatesResponse> reloadHttpCertificates(ReloadHttpCertificatesRequest request)
        throws IOException, OpenSearchException {
        return reloadHttpCertificates(request, ApiType.OSS);
    }

    /**
     * Reloads the HTTP communication certificates.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ReloadHttpCertificatesResponse> reloadHttpCertificates(ReloadHttpCertificatesRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.reload_http_certificates", ApiType.OSS);
        return this.transport.performRequestAsync(request, ReloadHttpCertificatesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Reloads the HTTP communication certificates.
     *
     * @param fn a function that initializes a builder to create the {@link ReloadHttpCertificatesRequest}
     */
    public final CompletableFuture<ReloadHttpCertificatesResponse> reloadHttpCertificates(
        Function<ReloadHttpCertificatesRequest.Builder, ObjectBuilder<ReloadHttpCertificatesRequest>> fn
    ) throws IOException, OpenSearchException {
        return reloadHttpCertificates(fn, ApiType.OSS);
    }

    /**
     * Reloads the HTTP communication certificates.
     *
     * @param fn   a function that initializes a builder to create the {@link ReloadHttpCertificatesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ReloadHttpCertificatesResponse> reloadHttpCertificates(
        Function<ReloadHttpCertificatesRequest.Builder, ObjectBuilder<ReloadHttpCertificatesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return reloadHttpCertificates(fn.apply(new ReloadHttpCertificatesRequest.Builder()).build(), type);
    }

    /**
     * Reloads the HTTP communication certificates.
     */
    public final CompletableFuture<ReloadHttpCertificatesResponse> reloadHttpCertificates() throws IOException, OpenSearchException {
        return reloadHttpCertificates(ApiType.OSS);
    }

    /**
     * Reloads the HTTP communication certificates.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ReloadHttpCertificatesResponse> reloadHttpCertificates(ApiType type) throws IOException,
        OpenSearchException {
        return reloadHttpCertificates(new ReloadHttpCertificatesRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.reload_transport_certificates

    /**
     * Reloads the transport communication certificates.
     */
    public CompletableFuture<ReloadTransportCertificatesResponse> reloadTransportCertificates(ReloadTransportCertificatesRequest request)
        throws IOException, OpenSearchException {
        return reloadTransportCertificates(request, ApiType.OSS);
    }

    /**
     * Reloads the transport communication certificates.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ReloadTransportCertificatesResponse> reloadTransportCertificates(
        ReloadTransportCertificatesRequest request,
        ApiType type
    ) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.reload_transport_certificates", ApiType.OSS);
        return this.transport.performRequestAsync(request, ReloadTransportCertificatesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Reloads the transport communication certificates.
     *
     * @param fn a function that initializes a builder to create the {@link ReloadTransportCertificatesRequest}
     */
    public final CompletableFuture<ReloadTransportCertificatesResponse> reloadTransportCertificates(
        Function<ReloadTransportCertificatesRequest.Builder, ObjectBuilder<ReloadTransportCertificatesRequest>> fn
    ) throws IOException, OpenSearchException {
        return reloadTransportCertificates(fn, ApiType.OSS);
    }

    /**
     * Reloads the transport communication certificates.
     *
     * @param fn   a function that initializes a builder to create the {@link ReloadTransportCertificatesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ReloadTransportCertificatesResponse> reloadTransportCertificates(
        Function<ReloadTransportCertificatesRequest.Builder, ObjectBuilder<ReloadTransportCertificatesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return reloadTransportCertificates(fn.apply(new ReloadTransportCertificatesRequest.Builder()).build(), type);
    }

    /**
     * Reloads the transport communication certificates.
     */
    public final CompletableFuture<ReloadTransportCertificatesResponse> reloadTransportCertificates() throws IOException,
        OpenSearchException {
        return reloadTransportCertificates(ApiType.OSS);
    }

    /**
     * Reloads the transport communication certificates.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ReloadTransportCertificatesResponse> reloadTransportCertificates(ApiType type) throws IOException,
        OpenSearchException {
        return reloadTransportCertificates(new ReloadTransportCertificatesRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.tenant_info

    /**
     * Retrieves the names of current tenants. Requires super admin or <code>kibanaserver</code> permissions.
     */
    public CompletableFuture<TenantInfoResponse> tenantInfo(TenantInfoRequest request) throws IOException, OpenSearchException {
        return tenantInfo(request, ApiType.OSS);
    }

    /**
     * Retrieves the names of current tenants. Requires super admin or <code>kibanaserver</code> permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<TenantInfoResponse> tenantInfo(TenantInfoRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.tenant_info", ApiType.OSS);
        return this.transport.performRequestAsync(request, TenantInfoRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves the names of current tenants. Requires super admin or <code>kibanaserver</code> permissions.
     *
     * @param fn a function that initializes a builder to create the {@link TenantInfoRequest}
     */
    public final CompletableFuture<TenantInfoResponse> tenantInfo(Function<TenantInfoRequest.Builder, ObjectBuilder<TenantInfoRequest>> fn)
        throws IOException, OpenSearchException {
        return tenantInfo(fn, ApiType.OSS);
    }

    /**
     * Retrieves the names of current tenants. Requires super admin or <code>kibanaserver</code> permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link TenantInfoRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<TenantInfoResponse> tenantInfo(
        Function<TenantInfoRequest.Builder, ObjectBuilder<TenantInfoRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return tenantInfo(fn.apply(new TenantInfoRequest.Builder()).build(), type);
    }

    /**
     * Retrieves the names of current tenants. Requires super admin or <code>kibanaserver</code> permissions.
     */
    public final CompletableFuture<TenantInfoResponse> tenantInfo() throws IOException, OpenSearchException {
        return tenantInfo(ApiType.OSS);
    }

    /**
     * Retrieves the names of current tenants. Requires super admin or <code>kibanaserver</code> permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<TenantInfoResponse> tenantInfo(ApiType type) throws IOException, OpenSearchException {
        return tenantInfo(new TenantInfoRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.update_audit_configuration

    /**
     * Updates the audit configuration.
     */
    public CompletableFuture<UpdateAuditConfigurationResponse> updateAuditConfiguration(UpdateAuditConfigurationRequest request)
        throws IOException, OpenSearchException {
        return updateAuditConfiguration(request, ApiType.OSS);
    }

    /**
     * Updates the audit configuration.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateAuditConfigurationResponse> updateAuditConfiguration(
        UpdateAuditConfigurationRequest request,
        ApiType type
    ) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.update_audit_configuration", ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateAuditConfigurationRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the audit configuration.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateAuditConfigurationRequest}
     */
    public final CompletableFuture<UpdateAuditConfigurationResponse> updateAuditConfiguration(
        Function<UpdateAuditConfigurationRequest.Builder, ObjectBuilder<UpdateAuditConfigurationRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateAuditConfiguration(fn, ApiType.OSS);
    }

    /**
     * Updates the audit configuration.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateAuditConfigurationRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateAuditConfigurationResponse> updateAuditConfiguration(
        Function<UpdateAuditConfigurationRequest.Builder, ObjectBuilder<UpdateAuditConfigurationRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateAuditConfiguration(fn.apply(new UpdateAuditConfigurationRequest.Builder()).build(), type);
    }

    /**
     * Updates the audit configuration.
     */
    public final CompletableFuture<UpdateAuditConfigurationResponse> updateAuditConfiguration() throws IOException, OpenSearchException {
        return updateAuditConfiguration(ApiType.OSS);
    }

    /**
     * Updates the audit configuration.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateAuditConfigurationResponse> updateAuditConfiguration(ApiType type) throws IOException,
        OpenSearchException {
        return updateAuditConfiguration(new UpdateAuditConfigurationRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.update_configuration

    /**
     * Updates the settings for an existing security configuration. Requires super admin or REST API permissions.
     */
    public CompletableFuture<UpdateConfigurationResponse> updateConfiguration(UpdateConfigurationRequest request) throws IOException,
        OpenSearchException {
        return updateConfiguration(request, ApiType.OSS);
    }

    /**
     * Updates the settings for an existing security configuration. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateConfigurationResponse> updateConfiguration(UpdateConfigurationRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.update_configuration", ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateConfigurationRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Updates the settings for an existing security configuration. Requires super admin or REST API permissions.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateConfigurationRequest}
     */
    public final CompletableFuture<UpdateConfigurationResponse> updateConfiguration(
        Function<UpdateConfigurationRequest.Builder, ObjectBuilder<UpdateConfigurationRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateConfiguration(fn, ApiType.OSS);
    }

    /**
     * Updates the settings for an existing security configuration. Requires super admin or REST API permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateConfigurationRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateConfigurationResponse> updateConfiguration(
        Function<UpdateConfigurationRequest.Builder, ObjectBuilder<UpdateConfigurationRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateConfiguration(fn.apply(new UpdateConfigurationRequest.Builder()).build(), type);
    }

    /**
     * Updates the settings for an existing security configuration. Requires super admin or REST API permissions.
     */
    public final CompletableFuture<UpdateConfigurationResponse> updateConfiguration() throws IOException, OpenSearchException {
        return updateConfiguration(ApiType.OSS);
    }

    /**
     * Updates the settings for an existing security configuration. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateConfigurationResponse> updateConfiguration(ApiType type) throws IOException, OpenSearchException {
        return updateConfiguration(new UpdateConfigurationRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.update_distinguished_name

    /**
     * Adds or updates the specified distinguished names in the cluster or node allowlist. Requires super admin or REST API permissions.
     */
    public CompletableFuture<UpdateDistinguishedNameResponse> updateDistinguishedName(UpdateDistinguishedNameRequest request)
        throws IOException, OpenSearchException {
        return updateDistinguishedName(request, ApiType.OSS);
    }

    /**
     * Adds or updates the specified distinguished names in the cluster or node allowlist. Requires super admin or REST API permissions.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateDistinguishedNameResponse> updateDistinguishedName(UpdateDistinguishedNameRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.update_distinguished_name", ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateDistinguishedNameRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Adds or updates the specified distinguished names in the cluster or node allowlist. Requires super admin or REST API permissions.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateDistinguishedNameRequest}
     */
    public final CompletableFuture<UpdateDistinguishedNameResponse> updateDistinguishedName(
        Function<UpdateDistinguishedNameRequest.Builder, ObjectBuilder<UpdateDistinguishedNameRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateDistinguishedName(fn, ApiType.OSS);
    }

    /**
     * Adds or updates the specified distinguished names in the cluster or node allowlist. Requires super admin or REST API permissions.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateDistinguishedNameRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateDistinguishedNameResponse> updateDistinguishedName(
        Function<UpdateDistinguishedNameRequest.Builder, ObjectBuilder<UpdateDistinguishedNameRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateDistinguishedName(fn.apply(new UpdateDistinguishedNameRequest.Builder()).build(), type);
    }

    // ----- Endpoint: security.validate

    /**
     * Checks whether the v6 security configuration is valid and ready to be migrated to v7.
     */
    public CompletableFuture<ValidateResponse> validate(ValidateRequest request) throws IOException, OpenSearchException {
        return validate(request, ApiType.OSS);
    }

    /**
     * Checks whether the v6 security configuration is valid and ready to be migrated to v7.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ValidateResponse> validate(ValidateRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.validate", ApiType.OSS);
        return this.transport.performRequestAsync(request, ValidateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Checks whether the v6 security configuration is valid and ready to be migrated to v7.
     *
     * @param fn a function that initializes a builder to create the {@link ValidateRequest}
     */
    public final CompletableFuture<ValidateResponse> validate(Function<ValidateRequest.Builder, ObjectBuilder<ValidateRequest>> fn)
        throws IOException, OpenSearchException {
        return validate(fn, ApiType.OSS);
    }

    /**
     * Checks whether the v6 security configuration is valid and ready to be migrated to v7.
     *
     * @param fn   a function that initializes a builder to create the {@link ValidateRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ValidateResponse> validate(
        Function<ValidateRequest.Builder, ObjectBuilder<ValidateRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return validate(fn.apply(new ValidateRequest.Builder()).build(), type);
    }

    /**
     * Checks whether the v6 security configuration is valid and ready to be migrated to v7.
     */
    public final CompletableFuture<ValidateResponse> validate() throws IOException, OpenSearchException {
        return validate(ApiType.OSS);
    }

    /**
     * Checks whether the v6 security configuration is valid and ready to be migrated to v7.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ValidateResponse> validate(ApiType type) throws IOException, OpenSearchException {
        return validate(new ValidateRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.who_am_i

    /**
     * Gets the identity information for the user currently logged in.
     */
    public CompletableFuture<WhoAmIResponse> whoAmI(WhoAmIRequest request) throws IOException, OpenSearchException {
        return whoAmI(request, ApiType.OSS);
    }

    /**
     * Gets the identity information for the user currently logged in.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<WhoAmIResponse> whoAmI(WhoAmIRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "security.who_am_i", ApiType.OSS);
        return this.transport.performRequestAsync(request, WhoAmIRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Gets the identity information for the user currently logged in.
     *
     * @param fn a function that initializes a builder to create the {@link WhoAmIRequest}
     */
    public final CompletableFuture<WhoAmIResponse> whoAmI(Function<WhoAmIRequest.Builder, ObjectBuilder<WhoAmIRequest>> fn)
        throws IOException, OpenSearchException {
        return whoAmI(fn, ApiType.OSS);
    }

    /**
     * Gets the identity information for the user currently logged in.
     *
     * @param fn   a function that initializes a builder to create the {@link WhoAmIRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<WhoAmIResponse> whoAmI(Function<WhoAmIRequest.Builder, ObjectBuilder<WhoAmIRequest>> fn, ApiType type)
        throws IOException, OpenSearchException {
        return whoAmI(fn.apply(new WhoAmIRequest.Builder()).build(), type);
    }

    /**
     * Gets the identity information for the user currently logged in.
     */
    public final CompletableFuture<WhoAmIResponse> whoAmI() throws IOException, OpenSearchException {
        return whoAmI(ApiType.OSS);
    }

    /**
     * Gets the identity information for the user currently logged in.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<WhoAmIResponse> whoAmI(ApiType type) throws IOException, OpenSearchException {
        return whoAmI(new WhoAmIRequest.Builder().build(), type);
    }

    // ----- Endpoint: security.who_am_i_protected

    /**
     * Gets the identity information for the user currently logged in. To use this operation, you must have access to this endpoint when
     * authorization at REST layer is enabled.
     */
    public CompletableFuture<WhoAmIProtectedResponse> whoAmIProtected(WhoAmIProtectedRequest request) throws IOException,
        OpenSearchException {
        return whoAmIProtected(request, ApiType.OSS);
    }

    /**
     * Gets the identity information for the user currently logged in. To use this operation, you must have access to this endpoint when
     * authorization at REST layer is enabled.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<WhoAmIProtectedResponse> whoAmIProtected(WhoAmIProtectedRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "security.who_am_i_protected", ApiType.OSS);
        return this.transport.performRequestAsync(request, WhoAmIProtectedRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Gets the identity information for the user currently logged in. To use this operation, you must have access to this endpoint when
     * authorization at REST layer is enabled.
     *
     * @param fn a function that initializes a builder to create the {@link WhoAmIProtectedRequest}
     */
    public final CompletableFuture<WhoAmIProtectedResponse> whoAmIProtected(
        Function<WhoAmIProtectedRequest.Builder, ObjectBuilder<WhoAmIProtectedRequest>> fn
    ) throws IOException, OpenSearchException {
        return whoAmIProtected(fn, ApiType.OSS);
    }

    /**
     * Gets the identity information for the user currently logged in. To use this operation, you must have access to this endpoint when
     * authorization at REST layer is enabled.
     *
     * @param fn   a function that initializes a builder to create the {@link WhoAmIProtectedRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<WhoAmIProtectedResponse> whoAmIProtected(
        Function<WhoAmIProtectedRequest.Builder, ObjectBuilder<WhoAmIProtectedRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return whoAmIProtected(fn.apply(new WhoAmIProtectedRequest.Builder()).build(), type);
    }

    /**
     * Gets the identity information for the user currently logged in. To use this operation, you must have access to this endpoint when
     * authorization at REST layer is enabled.
     */
    public final CompletableFuture<WhoAmIProtectedResponse> whoAmIProtected() throws IOException, OpenSearchException {
        return whoAmIProtected(ApiType.OSS);
    }

    /**
     * Gets the identity information for the user currently logged in. To use this operation, you must have access to this endpoint when
     * authorization at REST layer is enabled.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<WhoAmIProtectedResponse> whoAmIProtected(ApiType type) throws IOException, OpenSearchException {
        return whoAmIProtected(new WhoAmIProtectedRequest.Builder().build(), type);
    }
}
