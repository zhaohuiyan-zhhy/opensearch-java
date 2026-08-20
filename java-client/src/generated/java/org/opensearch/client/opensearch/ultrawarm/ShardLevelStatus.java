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
import org.opensearch.client.util.CopyableBuilder;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import org.opensearch.client.util.ToCopyableBuilder;

// typedef: ultrawarm.ShardLevelStatus

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class ShardLevelStatus implements PlainJsonSerializable, ToCopyableBuilder<ShardLevelStatus.Builder, ShardLevelStatus> {

    @Nullable
    private final Integer failed;

    @Nullable
    private final Integer pending;

    @Nullable
    private final Integer running;

    @Nullable
    private final Integer succeeded;

    @Nullable
    private final Integer total;

    // ---------------------------------------------------------------------------------------------

    private ShardLevelStatus(Builder builder) {
        this.failed = builder.failed;
        this.pending = builder.pending;
        this.running = builder.running;
        this.succeeded = builder.succeeded;
        this.total = builder.total;
    }

    public static ShardLevelStatus of(Function<ShardLevelStatus.Builder, ObjectBuilder<ShardLevelStatus>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * API name: {@code failed}
     */
    @Nullable
    public final Integer failed() {
        return this.failed;
    }

    /**
     * API name: {@code pending}
     */
    @Nullable
    public final Integer pending() {
        return this.pending;
    }

    /**
     * API name: {@code running}
     */
    @Nullable
    public final Integer running() {
        return this.running;
    }

    /**
     * API name: {@code succeeded}
     */
    @Nullable
    public final Integer succeeded() {
        return this.succeeded;
    }

    /**
     * API name: {@code total}
     */
    @Nullable
    public final Integer total() {
        return this.total;
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
        if (this.failed != null) {
            generator.writeKey("failed");
            generator.write(this.failed);
        }

        if (this.pending != null) {
            generator.writeKey("pending");
            generator.write(this.pending);
        }

        if (this.running != null) {
            generator.writeKey("running");
            generator.write(this.running);
        }

        if (this.succeeded != null) {
            generator.writeKey("succeeded");
            generator.write(this.succeeded);
        }

        if (this.total != null) {
            generator.writeKey("total");
            generator.write(this.total);
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
     * Builder for {@link ShardLevelStatus}.
     */
    public static class Builder extends ObjectBuilderBase implements CopyableBuilder<Builder, ShardLevelStatus> {
        @Nullable
        private Integer failed;
        @Nullable
        private Integer pending;
        @Nullable
        private Integer running;
        @Nullable
        private Integer succeeded;
        @Nullable
        private Integer total;

        public Builder() {}

        private Builder(ShardLevelStatus o) {
            this.failed = o.failed;
            this.pending = o.pending;
            this.running = o.running;
            this.succeeded = o.succeeded;
            this.total = o.total;
        }

        private Builder(Builder o) {
            this.failed = o.failed;
            this.pending = o.pending;
            this.running = o.running;
            this.succeeded = o.succeeded;
            this.total = o.total;
        }

        @Override
        @Nonnull
        public Builder copy() {
            return new Builder(this);
        }

        /**
         * API name: {@code failed}
         */
        @Nonnull
        public final Builder failed(@Nullable Integer value) {
            this.failed = value;
            return this;
        }

        /**
         * API name: {@code pending}
         */
        @Nonnull
        public final Builder pending(@Nullable Integer value) {
            this.pending = value;
            return this;
        }

        /**
         * API name: {@code running}
         */
        @Nonnull
        public final Builder running(@Nullable Integer value) {
            this.running = value;
            return this;
        }

        /**
         * API name: {@code succeeded}
         */
        @Nonnull
        public final Builder succeeded(@Nullable Integer value) {
            this.succeeded = value;
            return this;
        }

        /**
         * API name: {@code total}
         */
        @Nonnull
        public final Builder total(@Nullable Integer value) {
            this.total = value;
            return this;
        }

        /**
         * Builds a {@link ShardLevelStatus}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        @Override
        @Nonnull
        public ShardLevelStatus build() {
            _checkSingleUse();

            return new ShardLevelStatus(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link ShardLevelStatus}
     */
    public static final JsonpDeserializer<ShardLevelStatus> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        ShardLevelStatus::setupShardLevelStatusDeserializer
    );

    protected static void setupShardLevelStatusDeserializer(ObjectDeserializer<ShardLevelStatus.Builder> op) {
        op.add(Builder::failed, JsonpDeserializer.integerDeserializer(), "failed");
        op.add(Builder::pending, JsonpDeserializer.integerDeserializer(), "pending");
        op.add(Builder::running, JsonpDeserializer.integerDeserializer(), "running");
        op.add(Builder::succeeded, JsonpDeserializer.integerDeserializer(), "succeeded");
        op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this.failed);
        result = 31 * result + Objects.hashCode(this.pending);
        result = 31 * result + Objects.hashCode(this.running);
        result = 31 * result + Objects.hashCode(this.succeeded);
        result = 31 * result + Objects.hashCode(this.total);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        ShardLevelStatus other = (ShardLevelStatus) o;
        return Objects.equals(this.failed, other.failed)
            && Objects.equals(this.pending, other.pending)
            && Objects.equals(this.running, other.running)
            && Objects.equals(this.succeeded, other.succeeded)
            && Objects.equals(this.total, other.total);
    }
}
