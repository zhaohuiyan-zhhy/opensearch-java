/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen.openapi;

import io.swagger.v3.oas.models.parameters.RequestBody;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.opensearch.client.codegen.utils.builder.ToBuilder;
import org.opensearch.client.codegen.utils.json.JsonGenerator;

public final class OpenApiRequestBody extends OpenApiOperationBodyElement<OpenApiRequestBody>
    implements
        ToBuilder<OpenApiRequestBody.Builder> {
    @Nullable
    private final Boolean required;

    private OpenApiRequestBody(@Nonnull OpenApiRequestBody.Builder builder) {
        super(builder, OpenApiRequestBody.class);
        required = builder.required;
    }

    OpenApiRequestBody(@Nonnull RequestBody requestBody) {
        super(requestBody.get$ref(), requestBody.getContent(), OpenApiRequestBody.class);
        required = requestBody.getRequired();
    }

    public boolean getRequired() {
        return Boolean.TRUE.equals(required);
    }

    @Override
    protected void toJsonInner(JsonGenerator generator) {
        super.toJsonInner(generator);
        if (required != null) {
            generator.writeField("required", required);
        }
    }

    @Override
    public @Nonnull OpenApiRequestBody clone() {
        return toBuilder().build();
    }

    @Override
    public @Nonnull Builder toBuilder() {
        return super.toBuilder(builder()).withRequired(required);
    }

    public static @Nonnull Builder builder() {
        return new Builder();
    }

    public static final class Builder extends OpenApiOperationBodyElement.AbstractBuilder<OpenApiRequestBody, Builder> {
        @Nullable
        private Boolean required;

        private Builder() {}

        @Nonnull
        public Builder withRequired(@Nullable Boolean required) {
            this.required = required;
            return this;
        }

        @Nonnull
        @Override
        public OpenApiRequestBody construct() {
            return new OpenApiRequestBody(this);
        }
    }
}
