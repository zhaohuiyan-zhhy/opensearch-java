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

import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.CopyableBuilder;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ToCopyableBuilder;

// typedef: ultrawarm.migrate_to_cold.Request

/**
 * Starts an asynchronous migration from UltraWarm to cold storage.
 */
@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public final class MigrateToColdRequest extends RequestBase
    implements
        PlainJsonSerializable,
        ToCopyableBuilder<MigrateToColdRequest.Builder, MigrateToColdRequest> {

    @Nullable
    private final String clusterManagerTimeout;

    @Nullable
    private final String endTime;

    @Nullable
    private final String ignore;

    @Nonnull
    private final String index;

    @Nullable
    private final String startTime;

    @Nullable
    private final String timestampField;

    // ---------------------------------------------------------------------------------------------

    private MigrateToColdRequest(Builder builder) {
        super(builder);
        this.clusterManagerTimeout = builder.clusterManagerTimeout;
        this.endTime = builder.endTime;
        this.ignore = builder.ignore;
        this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
        this.startTime = builder.startTime;
        this.timestampField = builder.timestampField;
    }

    public static MigrateToColdRequest of(Function<MigrateToColdRequest.Builder, ObjectBuilder<MigrateToColdRequest>> fn) {
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
     * End of the indexed data range as a date or epoch milliseconds.
     * <p>
     * API name: {@code end_time}
     * </p>
     */
    @Nullable
    public final String endTime() {
        return this.endTime;
    }

    /**
     * Set to timestamp to migrate without timestamp metadata.
     * <p>
     * API name: {@code ignore}
     * </p>
     */
    @Nullable
    public final String ignore() {
        return this.ignore;
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

    /**
     * Start of the indexed data range as a date or epoch milliseconds.
     * <p>
     * API name: {@code start_time}
     * </p>
     */
    @Nullable
    public final String startTime() {
        return this.startTime;
    }

    /**
     * Index field used to derive the data time range.
     * <p>
     * API name: {@code timestamp_field}
     * </p>
     */
    @Nullable
    public final String timestampField() {
        return this.timestampField;
    }

    /**
     * Serialize this object to JSON.
     */
    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartObject();
        serializeInternal(generator, mapper);
        generator.writeEnd();
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
        if (this.endTime != null) {
            generator.writeKey("end_time");
            generator.write(this.endTime);
        }

        if (this.startTime != null) {
            generator.writeKey("start_time");
            generator.write(this.startTime);
        }

        if (this.timestampField != null) {
            generator.writeKey("timestamp_field");
            generator.write(this.timestampField);
        }
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
     * Builder for {@link MigrateToColdRequest}.
     */
    public static class Builder extends RequestBase.AbstractBuilder<Builder> implements CopyableBuilder<Builder, MigrateToColdRequest> {
        @Nullable
        private String clusterManagerTimeout;
        @Nullable
        private String endTime;
        @Nullable
        private String ignore;
        private String index;
        @Nullable
        private String startTime;
        @Nullable
        private String timestampField;

        public Builder() {}

        private Builder(MigrateToColdRequest o) {
            super(o);
            this.clusterManagerTimeout = o.clusterManagerTimeout;
            this.endTime = o.endTime;
            this.ignore = o.ignore;
            this.index = o.index;
            this.startTime = o.startTime;
            this.timestampField = o.timestampField;
        }

        private Builder(Builder o) {
            super(o);
            this.clusterManagerTimeout = o.clusterManagerTimeout;
            this.endTime = o.endTime;
            this.ignore = o.ignore;
            this.index = o.index;
            this.startTime = o.startTime;
            this.timestampField = o.timestampField;
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
         * End of the indexed data range as a date or epoch milliseconds.
         * <p>
         * API name: {@code end_time}
         * </p>
         */
        @Nonnull
        public final Builder endTime(@Nullable String value) {
            this.endTime = value;
            return this;
        }

        /**
         * Set to timestamp to migrate without timestamp metadata.
         * <p>
         * API name: {@code ignore}
         * </p>
         */
        @Nonnull
        public final Builder ignore(@Nullable String value) {
            this.ignore = value;
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
         * Start of the indexed data range as a date or epoch milliseconds.
         * <p>
         * API name: {@code start_time}
         * </p>
         */
        @Nonnull
        public final Builder startTime(@Nullable String value) {
            this.startTime = value;
            return this;
        }

        /**
         * Index field used to derive the data time range.
         * <p>
         * API name: {@code timestamp_field}
         * </p>
         */
        @Nonnull
        public final Builder timestampField(@Nullable String value) {
            this.timestampField = value;
            return this;
        }

        /**
         * Builds a {@link MigrateToColdRequest}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        @Override
        @Nonnull
        public MigrateToColdRequest build() {
            _checkSingleUse();

            return new MigrateToColdRequest(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link MigrateToColdRequest}
     */
    public static final JsonpDeserializer<MigrateToColdRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        MigrateToColdRequest::setupMigrateToColdRequestDeserializer
    );

    protected static void setupMigrateToColdRequestDeserializer(ObjectDeserializer<MigrateToColdRequest.Builder> op) {
        op.add(Builder::endTime, JsonpDeserializer.stringDeserializer(), "end_time");
        op.add(Builder::startTime, JsonpDeserializer.stringDeserializer(), "start_time");
        op.add(Builder::timestampField, JsonpDeserializer.stringDeserializer(), "timestamp_field");
    }

    // ---------------------------------------------------------------------------------------------

    @Override
    protected void applyQueryParameters(@Nonnull Map<String, String> params) {
        super.applyQueryParameters(params);
        if (this.clusterManagerTimeout != null) {
            params.put("cluster_manager_timeout", this.clusterManagerTimeout);
        }
        if (this.ignore != null) {
            params.put("ignore", this.ignore);
        }
    }

    /**
     * Endpoint "{@code ultrawarm.migrate_to_cold}".
     */
    public static final Endpoint<MigrateToColdRequest, MigrateToColdResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
        // Request method
        request -> "POST",
        // Request path
        request -> {
            StringBuilder buf = new StringBuilder();
            buf.append("/_ultrawarm/migration/");
            SimpleEndpoint.pathEncode(request.index, buf);
            buf.append("/_cold");
            return buf.toString();
        },
        // Request parameters
        request -> {
            Map<String, String> params = new HashMap<>();
            request.applyQueryParameters(params);
            return params;
        },
        SimpleEndpoint.emptyMap(),
        true,
        MigrateToColdResponse._DESERIALIZER
    );

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this.clusterManagerTimeout);
        result = 31 * result + Objects.hashCode(this.endTime);
        result = 31 * result + Objects.hashCode(this.ignore);
        result = 31 * result + this.index.hashCode();
        result = 31 * result + Objects.hashCode(this.startTime);
        result = 31 * result + Objects.hashCode(this.timestampField);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        MigrateToColdRequest other = (MigrateToColdRequest) o;
        return Objects.equals(this.clusterManagerTimeout, other.clusterManagerTimeout)
            && Objects.equals(this.endTime, other.endTime)
            && Objects.equals(this.ignore, other.ignore)
            && this.index.equals(other.index)
            && Objects.equals(this.startTime, other.startTime)
            && Objects.equals(this.timestampField, other.timestampField);
    }
}
