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

package org.opensearch.client.opensearch.ltr;

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
 * Client for the ltr namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class OpenSearchLtrAsyncClient extends ApiClient<OpenSearchTransport, OpenSearchLtrAsyncClient> {
    public OpenSearchLtrAsyncClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchLtrAsyncClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchLtrAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchLtrAsyncClient(this.transport, transportOptions);
    }

    // ----- Endpoint: ltr.add_features_to_set

    /**
     * Add features to an existing feature set in the default feature store.
     */
    public CompletableFuture<AddFeaturesToSetResponse> addFeaturesToSet(AddFeaturesToSetRequest request) throws IOException,
        OpenSearchException {
        return addFeaturesToSet(request, ApiType.OSS);
    }

    /**
     * Add features to an existing feature set in the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<AddFeaturesToSetResponse> addFeaturesToSet(AddFeaturesToSetRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.add_features_to_set", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, AddFeaturesToSetRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Add features to an existing feature set in the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link AddFeaturesToSetRequest}
     */
    public final CompletableFuture<AddFeaturesToSetResponse> addFeaturesToSet(
        Function<AddFeaturesToSetRequest.Builder, ObjectBuilder<AddFeaturesToSetRequest>> fn
    ) throws IOException, OpenSearchException {
        return addFeaturesToSet(fn, ApiType.OSS);
    }

    /**
     * Add features to an existing feature set in the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link AddFeaturesToSetRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AddFeaturesToSetResponse> addFeaturesToSet(
        Function<AddFeaturesToSetRequest.Builder, ObjectBuilder<AddFeaturesToSetRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return addFeaturesToSet(fn.apply(new AddFeaturesToSetRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.add_features_to_set_by_query

    /**
     * Add features to an existing feature set in the default feature store.
     */
    public CompletableFuture<AddFeaturesToSetByQueryResponse> addFeaturesToSetByQuery(AddFeaturesToSetByQueryRequest request)
        throws IOException, OpenSearchException {
        return addFeaturesToSetByQuery(request, ApiType.OSS);
    }

    /**
     * Add features to an existing feature set in the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<AddFeaturesToSetByQueryResponse> addFeaturesToSetByQuery(AddFeaturesToSetByQueryRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ltr.add_features_to_set_by_query", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, AddFeaturesToSetByQueryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Add features to an existing feature set in the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link AddFeaturesToSetByQueryRequest}
     */
    public final CompletableFuture<AddFeaturesToSetByQueryResponse> addFeaturesToSetByQuery(
        Function<AddFeaturesToSetByQueryRequest.Builder, ObjectBuilder<AddFeaturesToSetByQueryRequest>> fn
    ) throws IOException, OpenSearchException {
        return addFeaturesToSetByQuery(fn, ApiType.OSS);
    }

    /**
     * Add features to an existing feature set in the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link AddFeaturesToSetByQueryRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<AddFeaturesToSetByQueryResponse> addFeaturesToSetByQuery(
        Function<AddFeaturesToSetByQueryRequest.Builder, ObjectBuilder<AddFeaturesToSetByQueryRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return addFeaturesToSetByQuery(fn.apply(new AddFeaturesToSetByQueryRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.cache_stats

    /**
     * Retrieves cache statistics for all feature stores.
     */
    public CompletableFuture<CacheStatsResponse> cacheStats(CacheStatsRequest request) throws IOException, OpenSearchException {
        return cacheStats(request, ApiType.OSS);
    }

    /**
     * Retrieves cache statistics for all feature stores.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CacheStatsResponse> cacheStats(CacheStatsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.cache_stats", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CacheStatsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Retrieves cache statistics for all feature stores.
     *
     * @param fn a function that initializes a builder to create the {@link CacheStatsRequest}
     */
    public final CompletableFuture<CacheStatsResponse> cacheStats(Function<CacheStatsRequest.Builder, ObjectBuilder<CacheStatsRequest>> fn)
        throws IOException, OpenSearchException {
        return cacheStats(fn, ApiType.OSS);
    }

    /**
     * Retrieves cache statistics for all feature stores.
     *
     * @param fn   a function that initializes a builder to create the {@link CacheStatsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CacheStatsResponse> cacheStats(
        Function<CacheStatsRequest.Builder, ObjectBuilder<CacheStatsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return cacheStats(fn.apply(new CacheStatsRequest.Builder()).build(), type);
    }

    /**
     * Retrieves cache statistics for all feature stores.
     */
    public final CompletableFuture<CacheStatsResponse> cacheStats() throws IOException, OpenSearchException {
        return cacheStats(ApiType.OSS);
    }

    /**
     * Retrieves cache statistics for all feature stores.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CacheStatsResponse> cacheStats(ApiType type) throws IOException, OpenSearchException {
        return cacheStats(new CacheStatsRequest.Builder().build(), type);
    }

    // ----- Endpoint: ltr.clear_cache

    /**
     * Clears the store caches.
     */
    public CompletableFuture<ClearCacheResponse> clearCache(ClearCacheRequest request) throws IOException, OpenSearchException {
        return clearCache(request, ApiType.OSS);
    }

    /**
     * Clears the store caches.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ClearCacheResponse> clearCache(ClearCacheRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.clear_cache", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ClearCacheRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Clears the store caches.
     *
     * @param fn a function that initializes a builder to create the {@link ClearCacheRequest}
     */
    public final CompletableFuture<ClearCacheResponse> clearCache(Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn)
        throws IOException, OpenSearchException {
        return clearCache(fn, ApiType.OSS);
    }

    /**
     * Clears the store caches.
     *
     * @param fn   a function that initializes a builder to create the {@link ClearCacheRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ClearCacheResponse> clearCache(
        Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return clearCache(fn.apply(new ClearCacheRequest.Builder()).build(), type);
    }

    /**
     * Clears the store caches.
     */
    public final CompletableFuture<ClearCacheResponse> clearCache() throws IOException, OpenSearchException {
        return clearCache(ApiType.OSS);
    }

    /**
     * Clears the store caches.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ClearCacheResponse> clearCache(ApiType type) throws IOException, OpenSearchException {
        return clearCache(new ClearCacheRequest.Builder().build(), type);
    }

    // ----- Endpoint: ltr.create_default_store

    /**
     * Creates the default feature store.
     */
    public CompletableFuture<CreateDefaultStoreResponse> createDefaultStore(CreateDefaultStoreRequest request) throws IOException,
        OpenSearchException {
        return createDefaultStore(request, ApiType.OSS);
    }

    /**
     * Creates the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateDefaultStoreResponse> createDefaultStore(CreateDefaultStoreRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ltr.create_default_store", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateDefaultStoreRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link CreateDefaultStoreRequest}
     */
    public final CompletableFuture<CreateDefaultStoreResponse> createDefaultStore(
        Function<CreateDefaultStoreRequest.Builder, ObjectBuilder<CreateDefaultStoreRequest>> fn
    ) throws IOException, OpenSearchException {
        return createDefaultStore(fn, ApiType.OSS);
    }

    /**
     * Creates the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateDefaultStoreRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateDefaultStoreResponse> createDefaultStore(
        Function<CreateDefaultStoreRequest.Builder, ObjectBuilder<CreateDefaultStoreRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createDefaultStore(fn.apply(new CreateDefaultStoreRequest.Builder()).build(), type);
    }

    /**
     * Creates the default feature store.
     */
    public final CompletableFuture<CreateDefaultStoreResponse> createDefaultStore() throws IOException, OpenSearchException {
        return createDefaultStore(ApiType.OSS);
    }

    /**
     * Creates the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateDefaultStoreResponse> createDefaultStore(ApiType type) throws IOException, OpenSearchException {
        return createDefaultStore(new CreateDefaultStoreRequest.Builder().build(), type);
    }

    // ----- Endpoint: ltr.create_feature

    /**
     * Create or update a feature in the default feature store.
     */
    public CompletableFuture<CreateFeatureResponse> createFeature(CreateFeatureRequest request) throws IOException, OpenSearchException {
        return createFeature(request, ApiType.OSS);
    }

    /**
     * Create or update a feature in the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateFeatureResponse> createFeature(CreateFeatureRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.create_feature", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateFeatureRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create or update a feature in the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link CreateFeatureRequest}
     */
    public final CompletableFuture<CreateFeatureResponse> createFeature(
        Function<CreateFeatureRequest.Builder, ObjectBuilder<CreateFeatureRequest>> fn
    ) throws IOException, OpenSearchException {
        return createFeature(fn, ApiType.OSS);
    }

    /**
     * Create or update a feature in the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateFeatureRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateFeatureResponse> createFeature(
        Function<CreateFeatureRequest.Builder, ObjectBuilder<CreateFeatureRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createFeature(fn.apply(new CreateFeatureRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.create_featureset

    /**
     * Create or update a feature set in the default feature store.
     */
    public CompletableFuture<CreateFeaturesetResponse> createFeatureset(CreateFeaturesetRequest request) throws IOException,
        OpenSearchException {
        return createFeatureset(request, ApiType.OSS);
    }

    /**
     * Create or update a feature set in the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateFeaturesetResponse> createFeatureset(CreateFeaturesetRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.create_featureset", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateFeaturesetRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create or update a feature set in the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link CreateFeaturesetRequest}
     */
    public final CompletableFuture<CreateFeaturesetResponse> createFeatureset(
        Function<CreateFeaturesetRequest.Builder, ObjectBuilder<CreateFeaturesetRequest>> fn
    ) throws IOException, OpenSearchException {
        return createFeatureset(fn, ApiType.OSS);
    }

    /**
     * Create or update a feature set in the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateFeaturesetRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateFeaturesetResponse> createFeatureset(
        Function<CreateFeaturesetRequest.Builder, ObjectBuilder<CreateFeaturesetRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createFeatureset(fn.apply(new CreateFeaturesetRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.create_model

    /**
     * Create or update a model in the default feature store.
     */
    public CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request) throws IOException, OpenSearchException {
        return createModel(request, ApiType.OSS);
    }

    /**
     * Create or update a model in the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.create_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create or update a model in the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link CreateModelRequest}
     */
    public final CompletableFuture<CreateModelResponse> createModel(
        Function<CreateModelRequest.Builder, ObjectBuilder<CreateModelRequest>> fn
    ) throws IOException, OpenSearchException {
        return createModel(fn, ApiType.OSS);
    }

    /**
     * Create or update a model in the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateModelRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateModelResponse> createModel(
        Function<CreateModelRequest.Builder, ObjectBuilder<CreateModelRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createModel(fn.apply(new CreateModelRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.create_model_from_set

    /**
     * Create a model from an existing feature set in the default feature store.
     */
    public CompletableFuture<CreateModelFromSetResponse> createModelFromSet(CreateModelFromSetRequest request) throws IOException,
        OpenSearchException {
        return createModelFromSet(request, ApiType.OSS);
    }

    /**
     * Create a model from an existing feature set in the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateModelFromSetResponse> createModelFromSet(CreateModelFromSetRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ltr.create_model_from_set", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateModelFromSetRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Create a model from an existing feature set in the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link CreateModelFromSetRequest}
     */
    public final CompletableFuture<CreateModelFromSetResponse> createModelFromSet(
        Function<CreateModelFromSetRequest.Builder, ObjectBuilder<CreateModelFromSetRequest>> fn
    ) throws IOException, OpenSearchException {
        return createModelFromSet(fn, ApiType.OSS);
    }

    /**
     * Create a model from an existing feature set in the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateModelFromSetRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateModelFromSetResponse> createModelFromSet(
        Function<CreateModelFromSetRequest.Builder, ObjectBuilder<CreateModelFromSetRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createModelFromSet(fn.apply(new CreateModelFromSetRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.create_store

    /**
     * Creates a new feature store with the specified name.
     */
    public CompletableFuture<CreateStoreResponse> createStore(CreateStoreRequest request) throws IOException, OpenSearchException {
        return createStore(request, ApiType.OSS);
    }

    /**
     * Creates a new feature store with the specified name.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<CreateStoreResponse> createStore(CreateStoreRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.create_store", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, CreateStoreRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates a new feature store with the specified name.
     *
     * @param fn a function that initializes a builder to create the {@link CreateStoreRequest}
     */
    public final CompletableFuture<CreateStoreResponse> createStore(
        Function<CreateStoreRequest.Builder, ObjectBuilder<CreateStoreRequest>> fn
    ) throws IOException, OpenSearchException {
        return createStore(fn, ApiType.OSS);
    }

    /**
     * Creates a new feature store with the specified name.
     *
     * @param fn   a function that initializes a builder to create the {@link CreateStoreRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<CreateStoreResponse> createStore(
        Function<CreateStoreRequest.Builder, ObjectBuilder<CreateStoreRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return createStore(fn.apply(new CreateStoreRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.delete_default_store

    /**
     * Deletes the default feature store.
     */
    public CompletableFuture<DeleteDefaultStoreResponse> deleteDefaultStore(DeleteDefaultStoreRequest request) throws IOException,
        OpenSearchException {
        return deleteDefaultStore(request, ApiType.OSS);
    }

    /**
     * Deletes the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteDefaultStoreResponse> deleteDefaultStore(DeleteDefaultStoreRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ltr.delete_default_store", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteDefaultStoreRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteDefaultStoreRequest}
     */
    public final CompletableFuture<DeleteDefaultStoreResponse> deleteDefaultStore(
        Function<DeleteDefaultStoreRequest.Builder, ObjectBuilder<DeleteDefaultStoreRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteDefaultStore(fn, ApiType.OSS);
    }

    /**
     * Deletes the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteDefaultStoreRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteDefaultStoreResponse> deleteDefaultStore(
        Function<DeleteDefaultStoreRequest.Builder, ObjectBuilder<DeleteDefaultStoreRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteDefaultStore(fn.apply(new DeleteDefaultStoreRequest.Builder()).build(), type);
    }

    /**
     * Deletes the default feature store.
     */
    public final CompletableFuture<DeleteDefaultStoreResponse> deleteDefaultStore() throws IOException, OpenSearchException {
        return deleteDefaultStore(ApiType.OSS);
    }

    /**
     * Deletes the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteDefaultStoreResponse> deleteDefaultStore(ApiType type) throws IOException, OpenSearchException {
        return deleteDefaultStore(new DeleteDefaultStoreRequest.Builder().build(), type);
    }

    // ----- Endpoint: ltr.delete_feature

    /**
     * Delete a feature from the default feature store.
     */
    public CompletableFuture<DeleteFeatureResponse> deleteFeature(DeleteFeatureRequest request) throws IOException, OpenSearchException {
        return deleteFeature(request, ApiType.OSS);
    }

    /**
     * Delete a feature from the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteFeatureResponse> deleteFeature(DeleteFeatureRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.delete_feature", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteFeatureRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete a feature from the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteFeatureRequest}
     */
    public final CompletableFuture<DeleteFeatureResponse> deleteFeature(
        Function<DeleteFeatureRequest.Builder, ObjectBuilder<DeleteFeatureRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteFeature(fn, ApiType.OSS);
    }

    /**
     * Delete a feature from the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteFeatureRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteFeatureResponse> deleteFeature(
        Function<DeleteFeatureRequest.Builder, ObjectBuilder<DeleteFeatureRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteFeature(fn.apply(new DeleteFeatureRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.delete_featureset

    /**
     * Delete a feature set from the default feature store.
     */
    public CompletableFuture<DeleteFeaturesetResponse> deleteFeatureset(DeleteFeaturesetRequest request) throws IOException,
        OpenSearchException {
        return deleteFeatureset(request, ApiType.OSS);
    }

    /**
     * Delete a feature set from the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteFeaturesetResponse> deleteFeatureset(DeleteFeaturesetRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.delete_featureset", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteFeaturesetRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete a feature set from the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteFeaturesetRequest}
     */
    public final CompletableFuture<DeleteFeaturesetResponse> deleteFeatureset(
        Function<DeleteFeaturesetRequest.Builder, ObjectBuilder<DeleteFeaturesetRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteFeatureset(fn, ApiType.OSS);
    }

    /**
     * Delete a feature set from the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteFeaturesetRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteFeaturesetResponse> deleteFeatureset(
        Function<DeleteFeaturesetRequest.Builder, ObjectBuilder<DeleteFeaturesetRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteFeatureset(fn.apply(new DeleteFeaturesetRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.delete_model

    /**
     * Delete a model from the default feature store.
     */
    public CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request) throws IOException, OpenSearchException {
        return deleteModel(request, ApiType.OSS);
    }

    /**
     * Delete a model from the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.delete_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Delete a model from the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteModelRequest}
     */
    public final CompletableFuture<DeleteModelResponse> deleteModel(
        Function<DeleteModelRequest.Builder, ObjectBuilder<DeleteModelRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteModel(fn, ApiType.OSS);
    }

    /**
     * Delete a model from the default feature store.
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

    // ----- Endpoint: ltr.delete_store

    /**
     * Deletes a feature store with the specified name.
     */
    public CompletableFuture<DeleteStoreResponse> deleteStore(DeleteStoreRequest request) throws IOException, OpenSearchException {
        return deleteStore(request, ApiType.OSS);
    }

    /**
     * Deletes a feature store with the specified name.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<DeleteStoreResponse> deleteStore(DeleteStoreRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.delete_store", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, DeleteStoreRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a feature store with the specified name.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteStoreRequest}
     */
    public final CompletableFuture<DeleteStoreResponse> deleteStore(
        Function<DeleteStoreRequest.Builder, ObjectBuilder<DeleteStoreRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteStore(fn, ApiType.OSS);
    }

    /**
     * Deletes a feature store with the specified name.
     *
     * @param fn   a function that initializes a builder to create the {@link DeleteStoreRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<DeleteStoreResponse> deleteStore(
        Function<DeleteStoreRequest.Builder, ObjectBuilder<DeleteStoreRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return deleteStore(fn.apply(new DeleteStoreRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.get_feature

    /**
     * Get a feature from the default feature store.
     */
    public CompletableFuture<GetFeatureResponse> getFeature(GetFeatureRequest request) throws IOException, OpenSearchException {
        return getFeature(request, ApiType.OSS);
    }

    /**
     * Get a feature from the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetFeatureResponse> getFeature(GetFeatureRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.get_feature", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetFeatureRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a feature from the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link GetFeatureRequest}
     */
    public final CompletableFuture<GetFeatureResponse> getFeature(Function<GetFeatureRequest.Builder, ObjectBuilder<GetFeatureRequest>> fn)
        throws IOException, OpenSearchException {
        return getFeature(fn, ApiType.OSS);
    }

    /**
     * Get a feature from the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link GetFeatureRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetFeatureResponse> getFeature(
        Function<GetFeatureRequest.Builder, ObjectBuilder<GetFeatureRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getFeature(fn.apply(new GetFeatureRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.get_featureset

    /**
     * Get a feature set from the default feature store.
     */
    public CompletableFuture<GetFeaturesetResponse> getFeatureset(GetFeaturesetRequest request) throws IOException, OpenSearchException {
        return getFeatureset(request, ApiType.OSS);
    }

    /**
     * Get a feature set from the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetFeaturesetResponse> getFeatureset(GetFeaturesetRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.get_featureset", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetFeaturesetRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a feature set from the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link GetFeaturesetRequest}
     */
    public final CompletableFuture<GetFeaturesetResponse> getFeatureset(
        Function<GetFeaturesetRequest.Builder, ObjectBuilder<GetFeaturesetRequest>> fn
    ) throws IOException, OpenSearchException {
        return getFeatureset(fn, ApiType.OSS);
    }

    /**
     * Get a feature set from the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link GetFeaturesetRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetFeaturesetResponse> getFeatureset(
        Function<GetFeaturesetRequest.Builder, ObjectBuilder<GetFeaturesetRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getFeatureset(fn.apply(new GetFeaturesetRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.get_model

    /**
     * Get a model from the default feature store.
     */
    public CompletableFuture<GetModelResponse> getModel(GetModelRequest request) throws IOException, OpenSearchException {
        return getModel(request, ApiType.OSS);
    }

    /**
     * Get a model from the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetModelResponse> getModel(GetModelRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ltr.get_model", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetModelRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Get a model from the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link GetModelRequest}
     */
    public final CompletableFuture<GetModelResponse> getModel(Function<GetModelRequest.Builder, ObjectBuilder<GetModelRequest>> fn)
        throws IOException, OpenSearchException {
        return getModel(fn, ApiType.OSS);
    }

    /**
     * Get a model from the default feature store.
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

    // ----- Endpoint: ltr.get_store

    /**
     * Checks if a store exists.
     */
    public CompletableFuture<GetStoreResponse> getStore(GetStoreRequest request) throws IOException, OpenSearchException {
        return getStore(request, ApiType.OSS);
    }

    /**
     * Checks if a store exists.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<GetStoreResponse> getStore(GetStoreRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ltr.get_store", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, GetStoreRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Checks if a store exists.
     *
     * @param fn a function that initializes a builder to create the {@link GetStoreRequest}
     */
    public final CompletableFuture<GetStoreResponse> getStore(Function<GetStoreRequest.Builder, ObjectBuilder<GetStoreRequest>> fn)
        throws IOException, OpenSearchException {
        return getStore(fn, ApiType.OSS);
    }

    /**
     * Checks if a store exists.
     *
     * @param fn   a function that initializes a builder to create the {@link GetStoreRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<GetStoreResponse> getStore(
        Function<GetStoreRequest.Builder, ObjectBuilder<GetStoreRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return getStore(fn.apply(new GetStoreRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.list_stores

    /**
     * Lists all available feature stores.
     */
    public CompletableFuture<ListStoresResponse> listStores(ListStoresRequest request) throws IOException, OpenSearchException {
        return listStores(request, ApiType.OSS);
    }

    /**
     * Lists all available feature stores.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<ListStoresResponse> listStores(ListStoresRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.list_stores", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, ListStoresRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Lists all available feature stores.
     *
     * @param fn a function that initializes a builder to create the {@link ListStoresRequest}
     */
    public final CompletableFuture<ListStoresResponse> listStores(Function<ListStoresRequest.Builder, ObjectBuilder<ListStoresRequest>> fn)
        throws IOException, OpenSearchException {
        return listStores(fn, ApiType.OSS);
    }

    /**
     * Lists all available feature stores.
     *
     * @param fn   a function that initializes a builder to create the {@link ListStoresRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ListStoresResponse> listStores(
        Function<ListStoresRequest.Builder, ObjectBuilder<ListStoresRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return listStores(fn.apply(new ListStoresRequest.Builder()).build(), type);
    }

    /**
     * Lists all available feature stores.
     */
    public final CompletableFuture<ListStoresResponse> listStores() throws IOException, OpenSearchException {
        return listStores(ApiType.OSS);
    }

    /**
     * Lists all available feature stores.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<ListStoresResponse> listStores(ApiType type) throws IOException, OpenSearchException {
        return listStores(new ListStoresRequest.Builder().build(), type);
    }

    // ----- Endpoint: ltr.search_features

    /**
     * Search for features in a feature store.
     */
    public CompletableFuture<SearchFeaturesResponse> searchFeatures(SearchFeaturesRequest request) throws IOException, OpenSearchException {
        return searchFeatures(request, ApiType.OSS);
    }

    /**
     * Search for features in a feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<SearchFeaturesResponse> searchFeatures(SearchFeaturesRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.search_features", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, SearchFeaturesRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Search for features in a feature store.
     *
     * @param fn a function that initializes a builder to create the {@link SearchFeaturesRequest}
     */
    public final CompletableFuture<SearchFeaturesResponse> searchFeatures(
        Function<SearchFeaturesRequest.Builder, ObjectBuilder<SearchFeaturesRequest>> fn
    ) throws IOException, OpenSearchException {
        return searchFeatures(fn, ApiType.OSS);
    }

    /**
     * Search for features in a feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link SearchFeaturesRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SearchFeaturesResponse> searchFeatures(
        Function<SearchFeaturesRequest.Builder, ObjectBuilder<SearchFeaturesRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return searchFeatures(fn.apply(new SearchFeaturesRequest.Builder()).build(), type);
    }

    /**
     * Search for features in a feature store.
     */
    public final CompletableFuture<SearchFeaturesResponse> searchFeatures() throws IOException, OpenSearchException {
        return searchFeatures(ApiType.OSS);
    }

    /**
     * Search for features in a feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SearchFeaturesResponse> searchFeatures(ApiType type) throws IOException, OpenSearchException {
        return searchFeatures(new SearchFeaturesRequest.Builder().build(), type);
    }

    // ----- Endpoint: ltr.search_featuresets

    /**
     * Search for feature sets in a feature store.
     */
    public CompletableFuture<SearchFeaturesetsResponse> searchFeaturesets(SearchFeaturesetsRequest request) throws IOException,
        OpenSearchException {
        return searchFeaturesets(request, ApiType.OSS);
    }

    /**
     * Search for feature sets in a feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<SearchFeaturesetsResponse> searchFeaturesets(SearchFeaturesetsRequest request, ApiType type)
        throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ltr.search_featuresets", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, SearchFeaturesetsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Search for feature sets in a feature store.
     *
     * @param fn a function that initializes a builder to create the {@link SearchFeaturesetsRequest}
     */
    public final CompletableFuture<SearchFeaturesetsResponse> searchFeaturesets(
        Function<SearchFeaturesetsRequest.Builder, ObjectBuilder<SearchFeaturesetsRequest>> fn
    ) throws IOException, OpenSearchException {
        return searchFeaturesets(fn, ApiType.OSS);
    }

    /**
     * Search for feature sets in a feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link SearchFeaturesetsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SearchFeaturesetsResponse> searchFeaturesets(
        Function<SearchFeaturesetsRequest.Builder, ObjectBuilder<SearchFeaturesetsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return searchFeaturesets(fn.apply(new SearchFeaturesetsRequest.Builder()).build(), type);
    }

    /**
     * Search for feature sets in a feature store.
     */
    public final CompletableFuture<SearchFeaturesetsResponse> searchFeaturesets() throws IOException, OpenSearchException {
        return searchFeaturesets(ApiType.OSS);
    }

    /**
     * Search for feature sets in a feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SearchFeaturesetsResponse> searchFeaturesets(ApiType type) throws IOException, OpenSearchException {
        return searchFeaturesets(new SearchFeaturesetsRequest.Builder().build(), type);
    }

    // ----- Endpoint: ltr.search_models

    /**
     * Search for models in a feature store.
     */
    public CompletableFuture<SearchModelsResponse> searchModels(SearchModelsRequest request) throws IOException, OpenSearchException {
        return searchModels(request, ApiType.OSS);
    }

    /**
     * Search for models in a feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<SearchModelsResponse> searchModels(SearchModelsRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.search_models", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, SearchModelsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Search for models in a feature store.
     *
     * @param fn a function that initializes a builder to create the {@link SearchModelsRequest}
     */
    public final CompletableFuture<SearchModelsResponse> searchModels(
        Function<SearchModelsRequest.Builder, ObjectBuilder<SearchModelsRequest>> fn
    ) throws IOException, OpenSearchException {
        return searchModels(fn, ApiType.OSS);
    }

    /**
     * Search for models in a feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link SearchModelsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SearchModelsResponse> searchModels(
        Function<SearchModelsRequest.Builder, ObjectBuilder<SearchModelsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return searchModels(fn.apply(new SearchModelsRequest.Builder()).build(), type);
    }

    /**
     * Search for models in a feature store.
     */
    public final CompletableFuture<SearchModelsResponse> searchModels() throws IOException, OpenSearchException {
        return searchModels(ApiType.OSS);
    }

    /**
     * Search for models in a feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<SearchModelsResponse> searchModels(ApiType type) throws IOException, OpenSearchException {
        return searchModels(new SearchModelsRequest.Builder().build(), type);
    }

    // ----- Endpoint: ltr.stats

    /**
     * Provides information about the current status of the LTR plugin.
     */
    public CompletableFuture<LtrStatsResponse> stats(LtrStatsRequest request) throws IOException, OpenSearchException {
        return stats(request, ApiType.OSS);
    }

    /**
     * Provides information about the current status of the LTR plugin.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<LtrStatsResponse> stats(LtrStatsRequest request, ApiType type) throws IOException, OpenSearchException {
        ApiType.requireSupported(type, "ltr.stats", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, LtrStatsRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides information about the current status of the LTR plugin.
     *
     * @param fn a function that initializes a builder to create the {@link LtrStatsRequest}
     */
    public final CompletableFuture<LtrStatsResponse> stats(Function<LtrStatsRequest.Builder, ObjectBuilder<LtrStatsRequest>> fn)
        throws IOException, OpenSearchException {
        return stats(fn, ApiType.OSS);
    }

    /**
     * Provides information about the current status of the LTR plugin.
     *
     * @param fn   a function that initializes a builder to create the {@link LtrStatsRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<LtrStatsResponse> stats(
        Function<LtrStatsRequest.Builder, ObjectBuilder<LtrStatsRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return stats(fn.apply(new LtrStatsRequest.Builder()).build(), type);
    }

    /**
     * Provides information about the current status of the LTR plugin.
     */
    public final CompletableFuture<LtrStatsResponse> stats() throws IOException, OpenSearchException {
        return stats(ApiType.OSS);
    }

    /**
     * Provides information about the current status of the LTR plugin.
     *
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<LtrStatsResponse> stats(ApiType type) throws IOException, OpenSearchException {
        return stats(new LtrStatsRequest.Builder().build(), type);
    }

    // ----- Endpoint: ltr.update_feature

    /**
     * Update a feature in the default feature store.
     */
    public CompletableFuture<UpdateFeatureResponse> updateFeature(UpdateFeatureRequest request) throws IOException, OpenSearchException {
        return updateFeature(request, ApiType.OSS);
    }

    /**
     * Update a feature in the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateFeatureResponse> updateFeature(UpdateFeatureRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.update_feature", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateFeatureRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Update a feature in the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateFeatureRequest}
     */
    public final CompletableFuture<UpdateFeatureResponse> updateFeature(
        Function<UpdateFeatureRequest.Builder, ObjectBuilder<UpdateFeatureRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateFeature(fn, ApiType.OSS);
    }

    /**
     * Update a feature in the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateFeatureRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateFeatureResponse> updateFeature(
        Function<UpdateFeatureRequest.Builder, ObjectBuilder<UpdateFeatureRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateFeature(fn.apply(new UpdateFeatureRequest.Builder()).build(), type);
    }

    // ----- Endpoint: ltr.update_featureset

    /**
     * Update a feature set in the default feature store.
     */
    public CompletableFuture<UpdateFeaturesetResponse> updateFeatureset(UpdateFeaturesetRequest request) throws IOException,
        OpenSearchException {
        return updateFeatureset(request, ApiType.OSS);
    }

    /**
     * Update a feature set in the default feature store.
     *
     * @param type target OpenSearch API distribution
     */
    public CompletableFuture<UpdateFeaturesetResponse> updateFeatureset(UpdateFeaturesetRequest request, ApiType type) throws IOException,
        OpenSearchException {
        ApiType.requireSupported(type, "ltr.update_featureset", ApiType.AOS, ApiType.AOSS, ApiType.OSS);
        return this.transport.performRequestAsync(request, UpdateFeaturesetRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Update a feature set in the default feature store.
     *
     * @param fn a function that initializes a builder to create the {@link UpdateFeaturesetRequest}
     */
    public final CompletableFuture<UpdateFeaturesetResponse> updateFeatureset(
        Function<UpdateFeaturesetRequest.Builder, ObjectBuilder<UpdateFeaturesetRequest>> fn
    ) throws IOException, OpenSearchException {
        return updateFeatureset(fn, ApiType.OSS);
    }

    /**
     * Update a feature set in the default feature store.
     *
     * @param fn   a function that initializes a builder to create the {@link UpdateFeaturesetRequest}
     * @param type target OpenSearch API distribution
     */
    public final CompletableFuture<UpdateFeaturesetResponse> updateFeatureset(
        Function<UpdateFeaturesetRequest.Builder, ObjectBuilder<UpdateFeaturesetRequest>> fn,
        ApiType type
    ) throws IOException, OpenSearchException {
        return updateFeatureset(fn.apply(new UpdateFeaturesetRequest.Builder()).build(), type);
    }
}
