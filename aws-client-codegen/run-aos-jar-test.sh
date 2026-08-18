#!/usr/bin/env bash

set -euo pipefail

PACKAGE_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
ROOT_DIR="$(cd "$PACKAGE_DIR/.." && pwd)"
cd "$ROOT_DIR"

if [[ -z "${AOS_ENDPOINT:-}" ]]; then
    if [[ ! -t 0 ]]; then
        echo "AOS_ENDPOINT is required when the script is run non-interactively." >&2
        exit 1
    fi
    read -r -p "AOS endpoint: " AOS_ENDPOINT
    if [[ -z "$AOS_ENDPOINT" ]]; then
        echo "AOS endpoint cannot be empty." >&2
        exit 1
    fi
    export AOS_ENDPOINT
fi

if [[ -z "${AOS_USERNAME:-}" ]]; then
    if [[ ! -t 0 ]]; then
        echo "AOS_USERNAME is required when the script is run non-interactively." >&2
        exit 1
    fi
    read -r -p "AOS username: " AOS_USERNAME
    if [[ -z "$AOS_USERNAME" ]]; then
        echo "AOS username cannot be empty." >&2
        exit 1
    fi
    export AOS_USERNAME
fi

if [[ -z "${AOS_PASSWORD:-}" ]]; then
    if [[ ! -t 0 ]]; then
        echo "AOS_PASSWORD is required when the script is run non-interactively." >&2
        exit 1
    fi

    read -r -s -p "AOS password for ${AOS_USERNAME}: " AOS_PASSWORD
    echo
    if [[ -z "$AOS_PASSWORD" ]]; then
        echo "AOS password cannot be empty." >&2
        exit 1
    fi
    export AOS_PASSWORD
fi

echo "AOS endpoint: $AOS_ENDPOINT"
echo "AOS username: $AOS_USERNAME"
echo "Generating the AOS client..."
./gradlew :java-codegen:generateAosClient

echo "Packaging the JAR and running the real-domain test..."
./gradlew :java-client:runAosJarTest

JAR_PATH="$(find java-client/build/libs -maxdepth 1 -name 'opensearch-java-aos-*.jar' -type f | sort | tail -n 1)"
if [[ -z "$JAR_PATH" ]]; then
    echo "The AOS JAR was not found after a successful build." >&2
    exit 1
fi

echo
echo "AOS JAR test passed."
echo "JAR: $ROOT_DIR/$JAR_PATH"
