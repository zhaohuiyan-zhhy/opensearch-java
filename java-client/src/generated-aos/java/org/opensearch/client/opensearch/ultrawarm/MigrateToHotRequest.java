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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.CopyableBuilder;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ToCopyableBuilder;

// typedef: ultrawarm.migrate_to_hot.Request

/**
 * Starts an asynchronous migration from UltraWarm to hot storage.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public final class MigrateToHotRequest extends RequestBase implements ToCopyableBuilder<MigrateToHotRequest.Builder, MigrateToHotRequest> {

    @Nullable
    private final String clusterManagerTimeout;

    @Nonnull
    private final String index;

    // ---------------------------------------------------------------------------------------------

    private MigrateToHotRequest(Builder builder) {
        super(builder);
        this.clusterManagerTimeout = builder.clusterManagerTimeout;
        this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
    }

    public static MigrateToHotRequest of(Function<MigrateToHotRequest.Builder, ObjectBuilder<MigrateToHotRequest>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Time to wait for a response from the cluster manager node.
     * <p>
     * API name: {@code cluster_manager_timeout}
     * </p>
     */
    @Nullable
    public final String clusterManagerTimeout() {
        return this.clusterManagerTimeout;
    }

    /**
     * Required - The name of the index to migrate.
     * <p>
     * API name: {@code index}
     * </p>
     */
    @Nonnull
    public final String index() {
        return this.index;
    }

    // ---------------------------------------------------------------------------------------------

    @Override
    @Nonnull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Nonnull
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for {@link MigrateToHotRequest}.
     */
    public static class Builder extends RequestBase.AbstractBuilder<Builder> implements CopyableBuilder<Builder, MigrateToHotRequest> {
        @Nullable
        private String clusterManagerTimeout;
        private String index;

        public Builder() {}

        private Builder(MigrateToHotRequest o) {
            super(o);
            this.clusterManagerTimeout = o.clusterManagerTimeout;
            this.index = o.index;
        }

        private Builder(Builder o) {
            super(o);
            this.clusterManagerTimeout = o.clusterManagerTimeout;
            this.index = o.index;
        }

        @Override
        @Nonnull
        public Builder copy() {
            return new Builder(this);
        }

        @Override
        @Nonnull
        protected Builder self() {
            return this;
        }

        /**
         * Time to wait for a response from the cluster manager node.
         * <p>
         * API name: {@code cluster_manager_timeout}
         * </p>
         */
        @Nonnull
        public final Builder clusterManagerTimeout(@Nullable String value) {
            this.clusterManagerTimeout = value;
            return this;
        }

        /**
         * Required - The name of the index to migrate.
         * <p>
         * API name: {@code index}
         * </p>
         */
        @Nonnull
        public final Builder index(String value) {
            this.index = value;
            return this;
        }

        /**
         * Builds a {@link MigrateToHotRequest}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        @Override
        @Nonnull
        public MigrateToHotRequest build() {
            _checkSingleUse();

            return new MigrateToHotRequest(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    @Override
    protected void applyQueryParameters(@Nonnull Map<String, String> params) {
        super.applyQueryParameters(params);
        if (this.clusterManagerTimeout != null) {
            params.put("cluster_manager_timeout", this.clusterManagerTimeout);
        }
    }

    /**
     * Endpoint "{@code ultrawarm.migrate_to_hot}".
     */
    public static final Endpoint<MigrateToHotRequest, MigrateToHotResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
        // Request method
        request -> "POST",
        // Request path
        request -> {
            StringBuilder buf = new StringBuilder();
            buf.append("/_ultrawarm/migration/");
            SimpleEndpoint.pathEncode(request.index, buf);
            buf.append("/_hot");
            return buf.toString();
        },
        // Request parameters
        request -> {
            Map<String, String> params = new HashMap<>();
            request.applyQueryParameters(params);
            return params;
        },
        SimpleEndpoint.emptyMap(),
        false,
        MigrateToHotResponse._DESERIALIZER
    );

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this.clusterManagerTimeout);
        result = 31 * result + this.index.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        MigrateToHotRequest other = (MigrateToHotRequest) o;
        return Objects.equals(this.clusterManagerTimeout, other.clusterManagerTimeout) && this.index.equals(other.index);
    }
}
