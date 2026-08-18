# Java Client Code Generation

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

### Live smoke test

Set the domain connection values in the environment and run the isolated AOS client output against a real domain:

```shell
AOS_ENDPOINT=https://example.us-east-1.es.amazonaws.com \
AOS_USERNAME=example \
AOS_PASSWORD=example \
./gradlew :java-client:runAosLiveTest
```

To generate the client, package the JAR, and verify it against the configured real domain in one step, run:

```shell
./run-aos-jar-test.sh
```

The script prompts for the endpoint, username, and password when they are not already set. The password input is hidden. To invoke the Gradle task directly, set all three environment variables and run `./gradlew :java-client:runAosJarTest`.

The JAR test compiles with the packaged JAR as its only source of client classes and checks info, index creation, document indexing and retrieval, the AOS UltraWarm API, and cleanup.

The broader live test covers synchronous and asynchronous connectivity, cluster and node reads, CAT APIs, index metadata, document writes and reads, aliases, `field_caps`, `search_shards`, and the read-only `ultrawarm.list_migration_status` endpoint. It creates uniquely named temporary indexes and verifies their removal in a `finally` block.

On Optimized Engine domains, append-only restrictions are detected from the document delete response. Unsupported document deletion, count, and search checks are reported as `SKIP`; unexpected responses remain failures. APIs that require external infrastructure or change domain-wide state are also explicitly skipped. Credentials are read only from the environment and are not stored by the project.
