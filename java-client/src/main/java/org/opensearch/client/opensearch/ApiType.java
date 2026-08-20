/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.opensearch;

import java.util.Objects;
import java.util.StringJoiner;

/** Identifies the OpenSearch API distribution targeted by a client call. */
public enum ApiType {
    AOS,
    AOSS,
    OSS;

    public static ApiType require(ApiType type) {
        return Objects.requireNonNull(type, "type must not be null");
    }

    public static ApiType requireSupported(ApiType type, String operation, ApiType... supportedTypes) {
        require(type);
        Objects.requireNonNull(operation, "operation must not be null");
        Objects.requireNonNull(supportedTypes, "supportedTypes must not be null");
        if (supportedTypes.length == 0) {
            return type;
        }
        StringJoiner supported = new StringJoiner(", ");
        for (ApiType supportedType : supportedTypes) {
            if (type == supportedType) {
                return type;
            }
            supported.add(supportedType.name());
        }
        throw new IllegalArgumentException("Operation " + operation + " does not support " + type + "; supported API types: " + supported);
    }

    public static void requirePathSupported(
        ApiType type,
        ApiType constrainedType,
        String operation,
        int currentPathMask,
        int... supportedPathMasks
    ) {
        require(type);
        Objects.requireNonNull(constrainedType, "constrainedType must not be null");
        Objects.requireNonNull(operation, "operation must not be null");
        Objects.requireNonNull(supportedPathMasks, "supportedPathMasks must not be null");
        if (type != constrainedType) {
            return;
        }
        for (int supportedPathMask : supportedPathMasks) {
            if (currentPathMask == supportedPathMask) {
                return;
            }
        }
        throw new IllegalArgumentException(
            "Operation " + operation + " does not support the provided path parameter combination for API type " + type
        );
    }

    public static void requireFieldSupported(
        ApiType type,
        String operation,
        String field,
        boolean fieldPresent,
        ApiType... supportedTypes
    ) {
        if (fieldPresent) {
            requireSupported(type, operation + " field " + field, supportedTypes);
        }
    }
}
