# AOS/AOSS Java Client Code Generation

This directory contains the hand-written AOS and AOSS code-generation
implementation. The existing `java-codegen` and `java-client` modules only
apply the Gradle scripts in `gradle/`; checked-in generated sources remain in
`java-client/src/generated-aos` and `java-client/src/generated-aoss`.

## Review Layout

- `gradle/`: task registration injected into `java-codegen` and `java-client`.
- `overlays/`: AOS and AOSS OpenAPI overlays.
- `src/`: overlay/distribution processor and its unit tests.
- `java-client/src/`: compatibility wrappers, surface tests, and credentialed
  live tests.
- `run-aos-jar-test.sh`: optional one-command AOS JAR live test.

Outside this directory, the only AWS-specific hand-written changes are the
small `apply(from = ...)` hooks in the two existing Gradle files, the
compatibility README link, and the root script wrapper. Reviewers can ignore
`java-client/src/generated-aos` and `java-client/src/generated-aoss` when
reviewing the hand-written implementation.

The default generator reads `opensearch-openapi.yaml` and writes the OpenSearch client sources to `java-client/src/generated/java`:

```shell
./gradlew :java-codegen:run
```

## Amazon OpenSearch Service

The AOS generation flow applies the checked-in Amazon managed overlay and the `amazon-managed` distribution filter before invoking the existing Java generator:

```shell
./gradlew :java-codegen:generateAosClient
```

The task uses fixed project-local inputs and writes build artifacts to:

- Merged AOS specification: `java-codegen/build/generated-specs/opensearch-amazon-managed.yaml`
- Generated AOS client sources: `java-client/src/generated-aos/java`

Verify that the checked-in sources still match a clean generation with:

```shell
./gradlew :java-codegen:checkAosGenerated
```

The normal `java-client:check` lifecycle also runs this drift check and compiles
the generated AOS sources and the isolated JAR smoke test. It does not run the
credentialed live tests.

Compile the generated sources together with the hand-written transport and special endpoint implementations with:

```shell
./gradlew :java-client:compileAosJavaClient
```

Package those classes as a thin JAR with:

```shell
./gradlew :java-client:aosJar
```

The JAR is written to `java-client/build/libs/opensearch-java-aos-<version>.jar`. Its runtime dependencies are not bundled.

The generated API surface is AOS-specific, but the current generator still uses the existing `org.opensearch.client.opensearch` package and `OpenSearchClient` class names. A separately published AOS artifact requires configurable package and client names.

## Amazon OpenSearch Serverless

The AOSS generation flow applies `overlays/amazon-serverless.overlay.yaml` and
the `amazon-serverless` distribution filter:

```shell
./gradlew :java-codegen:generateAossClient
```

It writes the merged specification and generated sources to:

- `java-codegen/build/generated-specs/opensearch-amazon-serverless.yaml`
- `java-client/src/generated-aoss/java`

Verify deterministic generation, compile the isolated source tree, and package
the thin JAR with:

```shell
./gradlew :java-codegen:checkAossGenerated
./gradlew :java-client:runAossSurfaceTest
./gradlew :java-client:compileAossJavaClient
./gradlew :java-client:aossJar
```

The JAR is written to
`java-client/build/libs/opensearch-java-aoss-<version>.jar`. The surface test
checks both sides of the generated contract: supported CAT and component-template
methods remain available, while node, cluster-management, remote-cluster, and
unsupported CAT methods are absent. It also constructs and serializes the AOSS
snapshot extensions without network access.

The overlay exclusions follow the public AOSS supported-operation list at
<https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-genref.html>.
Because the OSS client has hand-written CAT help and node extensions, the AOSS
compile task excludes those OSS-only classes and substitutes the compatible CAT
wrappers in `aws-client-codegen/java-client/src/aossMain/java`. Generated
sources remain untouched.

The generated restore and snapshot-get requests expose `sourceCollectionId`,
and restore also exposes `allowRegex`. The existing Java generator maps the
overlay's anonymous `crypto_settings` object to `Map<String, JsonData>` rather
than a dedicated model.

Like the current AOS output, this source tree still uses the existing package
and client class names. It is suitable for isolated generation and validation,
but requires configurable packages or a separate module before it can be used
on the same classpath as the OSS or AOS generated tree.

### AOSS Live Smoke Test

The credentialed live test uses standard AWS credential environment variables and
SigV4 service name `aoss`. The selected IAM principal must be allowed by the
collection's data access policy:

```shell
eval "$(aws configure export-credentials --profile example --format env)"
AOSS_ENDPOINT=https://collection-id.aoss.us-east-1.on.aws \
AOSS_REGION=us-east-1 \
./gradlew :java-client:runAossLiveTest
```

It verifies temporary index creation, document indexing and retrieval, and
cleanup. It is intentionally not part of the normal `check`
lifecycle.

## AOS Live Smoke Test

Set the domain connection values in the environment and run the isolated AOS client output against a real domain:

```shell
AOS_ENDPOINT=https://example.us-east-1.es.amazonaws.com \
AOS_USERNAME=example \
AOS_PASSWORD=example \
./gradlew :java-client:runAosLiveTest
```

To probe every generated UltraWarm endpoint on a domain where UltraWarm and Cold Storage are disabled, run:

```shell
AOS_ENDPOINT=https://example.us-east-1.es.amazonaws.com \
AOS_USERNAME=example \
AOS_PASSWORD=example \
AOS_EXPECT_ULTRAWARM_DISABLED=true \
./gradlew :java-client:runAosUltrawarmLiveTest
```

The probe creates and removes a temporary hot index. It requires `list_migration_status` to succeed and verifies that migration operations either return a valid success response or reach the service and receive the expected capacity or index-state rejection. Do not set `AOS_EXPECT_ULTRAWARM_DISABLED=true` for a domain with UltraWarm or Cold Storage enabled.

To generate the client, package the JAR, and verify it against the configured real domain in one step, run:

```shell
./run-aos-jar-test.sh
```

The script prompts for the endpoint, username, and password when they are not already set. The password input is hidden. To invoke the Gradle task directly, set all three environment variables and run `./gradlew :java-client:runAosJarTest`.

The JAR test compiles with the packaged JAR as its only source of client classes and checks info, index creation, document indexing and retrieval, the AOS UltraWarm API, and cleanup.

The broader live test covers synchronous and asynchronous connectivity, cluster and node reads, CAT APIs, index metadata, document writes and reads, aliases, `field_caps`, `search_shards`, and the read-only `ultrawarm.list_migration_status` endpoint. It creates uniquely named temporary indexes and verifies their removal in a `finally` block.

On Optimized Engine domains, append-only restrictions are detected from the document delete response. Unsupported document deletion, count, and search checks are reported as `SKIP`; unexpected responses remain failures. APIs that require external infrastructure or change domain-wide state are also explicitly skipped. Credentials are read only from the environment and are not stored by the project.
