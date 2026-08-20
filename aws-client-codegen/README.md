# Unified OSS/AOS/AOSS Java Client Code Generation

This directory contains the OpenAPI overlay processing used to generate one
Java client for OSS OpenSearch, Amazon OpenSearch Service (AOS), and Amazon
OpenSearch Serverless (AOSS).

The generated source remains in the standard location:

```text
java-client/src/generated/java
```

## Generate

Run the existing Java generator:

```shell
./gradlew :java-codegen:run
```

The task:

1. Reads `java-codegen/opensearch-openapi.yaml`.
2. Applies `overlays/amazon-managed.overlay.yaml` and the
   `amazon-managed` distribution filter.
3. Applies `overlays/amazon-serverless.overlay.yaml` and the
   `amazon-serverless` distribution filter.
4. Builds the union spec at
   `java-codegen/build/generated-specs/opensearch-unified.yaml`.
5. Generates the single client into `java-client/src/generated/java`.

The AOS-only and AOSS-only filtered specifications can still be generated for
diagnostics:

```shell
./gradlew :java-codegen:generateAosSpec
./gradlew :java-codegen:generateAossSpec
```

## Use

Every client API call takes a final `ApiType` argument:

```java
client.indices().create(request -> request.index("example"), ApiType.AOSS);
client.info(ApiType.AOS);
client.search(request -> request.index("example"), Map.class, ApiType.OSS);
```

Generated validation rejects unsupported combinations before transport:

- APIs removed from a distribution.
- Path variants unavailable to a distribution.
- Distribution-specific request fields.

The union response model uses relaxed required-field constraints when AOS or
AOSS can omit an OSS-required response field.

## Verify

Run focused generation and client tests:

```shell
./gradlew :java-codegen:test
./gradlew :java-client:test
```

Check that committed generated sources match a fresh generation:

```shell
./gradlew :java-codegen:checkUnifiedGenerated
```

The normal `check` lifecycle includes this drift check and compiles the
packaged-JAR and live coverage tests without connecting to AWS:

```shell
./gradlew check
```

## Package And AOS Live Test

The normal `java-client` JAR contains the unified client:

```shell
./gradlew :java-client:jar
```

To generate, package, and test it against a real AOS domain:

```shell
AOS_ENDPOINT=https://example.us-east-1.es.amazonaws.com \
AOS_USERNAME=example \
AOS_PASSWORD=example \
./aws-client-codegen/run-aos-jar-test.sh
```

The script prompts for missing values in an interactive terminal. Credentials
are read only from the environment and are not stored by the project.

Run the broader AOS coverage test directly:

```shell
AOS_ENDPOINT=https://example.us-east-1.es.amazonaws.com \
AOS_USERNAME=example \
AOS_PASSWORD=example \
./gradlew :java-client:runAosLiveTest
```

The UltraWarm routing probe requires a domain without UltraWarm capacity:

```shell
AOS_ENDPOINT=https://example.us-east-1.es.amazonaws.com \
AOS_USERNAME=example \
AOS_PASSWORD=example \
AOS_EXPECT_ULTRAWARM_DISABLED=true \
./gradlew :java-client:runAosUltrawarmLiveTest
```

Run the broad AOSS SigV4 coverage test with temporary credentials in the
environment:

```shell
eval "$(aws configure export-credentials --profile example --format env)"
AOSS_ENDPOINT=https://collection-id.aoss.us-east-1.amazonaws.com \
AOSS_REGION=us-east-1 \
./gradlew :java-client:runAossLiveTest
```
