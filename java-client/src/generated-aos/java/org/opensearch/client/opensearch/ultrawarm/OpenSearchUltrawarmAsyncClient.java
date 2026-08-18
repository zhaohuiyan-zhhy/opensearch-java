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

package org.opensearch.client.opensearch.ultrawarm;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.util.ObjectBuilder;

/**
 * Client for the ultrawarm namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class OpenSearchUltrawarmAsyncClient extends ApiClient<OpenSearchTransport, OpenSearchUltrawarmAsyncClient> {
    public OpenSearchUltrawarmAsyncClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchUltrawarmAsyncClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchUltrawarmAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchUltrawarmAsyncClient(this.transport, transportOptions);
    }

    // ----- Endpoint: ultrawarm.cancel_migration

    /**
     * Cancels an in-progress UltraWarm migration.
     */
    public CompletableFuture<CancelMigrationResponse> cancelMigration(CancelMigrationRequest request) throws IOException,
        OpenSearchException {
        return this.transport.performRequestAsync(request, CancelMigrationRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Cancels an in-progress UltraWarm migration.
     *
     * @param fn a function that initializes a builder to create the {@link CancelMigrationRequest}
     */
    public final CompletableFuture<CancelMigrationResponse> cancelMigration(
        Function<CancelMigrationRequest.Builder, ObjectBuilder<CancelMigrationRequest>> fn
    ) throws IOException, OpenSearchException {
        return cancelMigration(fn.apply(new CancelMigrationRequest.Builder()).build());
    }

    // ----- Endpoint: ultrawarm.get_migration_status

    /**
     * Returns migration status for an index.
     */
    public CompletableFuture<GetMigrationStatusResponse> getMigrationStatus(GetMigrationStatusRequest request) throws IOException,
        OpenSearchException {
        return this.transport.performRequestAsync(request, GetMigrationStatusRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns migration status for an index.
     *
     * @param fn a function that initializes a builder to create the {@link GetMigrationStatusRequest}
     */
    public final CompletableFuture<GetMigrationStatusResponse> getMigrationStatus(
        Function<GetMigrationStatusRequest.Builder, ObjectBuilder<GetMigrationStatusRequest>> fn
    ) throws IOException, OpenSearchException {
        return getMigrationStatus(fn.apply(new GetMigrationStatusRequest.Builder()).build());
    }

    // ----- Endpoint: ultrawarm.list_migration_status

    /**
     * Lists active UltraWarm migrations.
     */
    public CompletableFuture<ListMigrationStatusResponse> listMigrationStatus(ListMigrationStatusRequest request) throws IOException,
        OpenSearchException {
        return this.transport.performRequestAsync(request, ListMigrationStatusRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists active UltraWarm migrations.
     *
     * @param fn a function that initializes a builder to create the {@link ListMigrationStatusRequest}
     */
    public final CompletableFuture<ListMigrationStatusResponse> listMigrationStatus(
        Function<ListMigrationStatusRequest.Builder, ObjectBuilder<ListMigrationStatusRequest>> fn
    ) throws IOException, OpenSearchException {
        return listMigrationStatus(fn.apply(new ListMigrationStatusRequest.Builder()).build());
    }

    /**
     * Lists active UltraWarm migrations.
     */
    public final CompletableFuture<ListMigrationStatusResponse> listMigrationStatus() throws IOException, OpenSearchException {
        return listMigrationStatus(new ListMigrationStatusRequest.Builder().build());
    }

    // ----- Endpoint: ultrawarm.migrate_to_cold

    /**
     * Starts an asynchronous migration from UltraWarm to cold storage.
     */
    public CompletableFuture<MigrateToColdResponse> migrateToCold(MigrateToColdRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(request, MigrateToColdRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Starts an asynchronous migration from UltraWarm to cold storage.
     *
     * @param fn a function that initializes a builder to create the {@link MigrateToColdRequest}
     */
    public final CompletableFuture<MigrateToColdResponse> migrateToCold(
        Function<MigrateToColdRequest.Builder, ObjectBuilder<MigrateToColdRequest>> fn
    ) throws IOException, OpenSearchException {
        return migrateToCold(fn.apply(new MigrateToColdRequest.Builder()).build());
    }

    // ----- Endpoint: ultrawarm.migrate_to_hot

    /**
     * Starts an asynchronous migration from UltraWarm to hot storage.
     */
    public CompletableFuture<MigrateToHotResponse> migrateToHot(MigrateToHotRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(request, MigrateToHotRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Starts an asynchronous migration from UltraWarm to hot storage.
     *
     * @param fn a function that initializes a builder to create the {@link MigrateToHotRequest}
     */
    public final CompletableFuture<MigrateToHotResponse> migrateToHot(
        Function<MigrateToHotRequest.Builder, ObjectBuilder<MigrateToHotRequest>> fn
    ) throws IOException, OpenSearchException {
        return migrateToHot(fn.apply(new MigrateToHotRequest.Builder()).build());
    }

    // ----- Endpoint: ultrawarm.migrate_to_warm

    /**
     * Starts an asynchronous migration from hot storage to UltraWarm.
     */
    public CompletableFuture<MigrateToWarmResponse> migrateToWarm(MigrateToWarmRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(request, MigrateToWarmRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Starts an asynchronous migration from hot storage to UltraWarm.
     *
     * @param fn a function that initializes a builder to create the {@link MigrateToWarmRequest}
     */
    public final CompletableFuture<MigrateToWarmResponse> migrateToWarm(
        Function<MigrateToWarmRequest.Builder, ObjectBuilder<MigrateToWarmRequest>> fn
    ) throws IOException, OpenSearchException {
        return migrateToWarm(fn.apply(new MigrateToWarmRequest.Builder()).build());
    }
}
