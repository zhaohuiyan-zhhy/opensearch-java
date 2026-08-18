/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.compile.JavaCompile

val javaExtension = extensions.getByType<JavaPluginExtension>()
val sourceSets = extensions.getByType<SourceSetContainer>()
val awsClientSources = rootProject.layout.projectDirectory.dir("aws-client-codegen/java-client/src")
val aosClasses = layout.buildDirectory.dir("classes/java/aos")
val aosLiveTestClasses = layout.buildDirectory.dir("classes/java/aosLiveTest")
val aosJarTestClasses = layout.buildDirectory.dir("classes/java/aosJarTest")
val aossClasses = layout.buildDirectory.dir("classes/java/aoss")
val aossSurfaceTestClasses = layout.buildDirectory.dir("classes/java/aossSurfaceTest")
val aossLiveTestClasses = layout.buildDirectory.dir("classes/java/aossLiveTest")

tasks.register<JavaCompile>("compileAosJavaClient") {
    group = "verification"
    description = "Compiles the generated Amazon OpenSearch Service client with the hand-written client sources."
    source("src/main/java")
    source("src/generated-aos/java")
    classpath = sourceSets.named("main").get().compileClasspath
    destinationDirectory.set(aosClasses)
    sourceCompatibility = javaExtension.sourceCompatibility.toString()
    targetCompatibility = javaExtension.targetCompatibility.toString()
    options.encoding = "UTF-8"
}

tasks.register<JavaCompile>("compileAossJavaClient") {
    group = "verification"
    description = "Compiles the generated Amazon OpenSearch Serverless client with its compatible hand-written sources."
    source(fileTree("src/main/java") {
        exclude(
            "org/opensearch/client/opensearch/cat/OpenSearchCatAsyncClient.java",
            "org/opensearch/client/opensearch/cat/OpenSearchCatClient.java",
            "org/opensearch/client/opensearch/nodes/OpenSearchNodesAsyncClient.java",
            "org/opensearch/client/opensearch/nodes/OpenSearchNodesClient.java"
        )
    })
    source(awsClientSources.dir("aossMain/java"))
    source("src/generated-aoss/java")
    classpath = sourceSets.named("main").get().compileClasspath
    destinationDirectory.set(aossClasses)
    sourceCompatibility = javaExtension.sourceCompatibility.toString()
    targetCompatibility = javaExtension.targetCompatibility.toString()
    options.encoding = "UTF-8"
}

val aosJar = tasks.register<Jar>("aosJar") {
    group = "build"
    description = "Packages the generated Amazon OpenSearch Service client as a JAR."
    dependsOn("compileAosJavaClient", tasks.named("processResources"))
    archiveBaseName.set("opensearch-java-aos")
    from(aosClasses)
    from(sourceSets.named("main").get().output.resourcesDir)
}

tasks.register<Jar>("aossJar") {
    group = "build"
    description = "Packages the generated Amazon OpenSearch Serverless client as a JAR."
    dependsOn("compileAossJavaClient", tasks.named("processResources"))
    archiveBaseName.set("opensearch-java-aoss")
    from(aossClasses)
    from(sourceSets.named("main").get().output.resourcesDir)
}

tasks.register<JavaCompile>("compileAossSurfaceTest") {
    group = "verification"
    description = "Compiles checks for the generated AOSS API surface."
    dependsOn("compileAossJavaClient")
    source(awsClientSources.dir("aossTest/java"))
    classpath = files(aossClasses) + sourceSets.named("main").get().compileClasspath
    destinationDirectory.set(aossSurfaceTestClasses)
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
    options.encoding = "UTF-8"
}

tasks.register<JavaExec>("runAossSurfaceTest") {
    group = "verification"
    description = "Verifies supported and excluded generated AOSS APIs and snapshot fields."
    dependsOn("compileAossSurfaceTest")
    classpath = files(aossSurfaceTestClasses, aossClasses) + configurations.getByName("runtimeClasspath")
    mainClass.set("org.opensearch.client.opensearch.aoss.AossGeneratedSurfaceTest")
}

tasks.register<JavaCompile>("compileAossLiveTest") {
    group = "verification"
    description = "Compiles the SigV4 live smoke test against the generated AOSS client classes."
    dependsOn("compileAossJavaClient")
    source(awsClientSources.dir("aossLiveTest/java"))
    classpath = files(aossClasses) + sourceSets.named("test").get().compileClasspath
    destinationDirectory.set(aossLiveTestClasses)
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
    options.encoding = "UTF-8"
}

tasks.register<JavaExec>("runAossLiveTest") {
    group = "verification"
    description = "Runs a SigV4 smoke test against a real Amazon OpenSearch Serverless collection."
    dependsOn("compileAossLiveTest")
    classpath = files(aossLiveTestClasses, aossClasses) + sourceSets.named("test").get().runtimeClasspath
    mainClass.set("org.opensearch.client.opensearch.aoss.AossLiveSmokeTest")
}

tasks.register<JavaCompile>("compileAosJarTest") {
    group = "verification"
    description = "Compiles a real-domain smoke test against the packaged AOS JAR."
    dependsOn(aosJar)
    source(awsClientSources.dir("aosJarTest/java"))
    classpath = files(aosJar.flatMap { it.archiveFile }) + sourceSets.named("main").get().compileClasspath
    destinationDirectory.set(aosJarTestClasses)
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
    options.encoding = "UTF-8"
}

tasks.register<JavaExec>("runAosJarTest") {
    group = "verification"
    description = "Runs a real-domain smoke test using the packaged AOS JAR."
    dependsOn("compileAosJarTest")
    classpath = files(aosJarTestClasses, aosJar.flatMap { it.archiveFile }) + configurations.getByName("runtimeClasspath")
    mainClass.set("org.opensearch.client.opensearch.aos.AosJarSmokeTest")
}

tasks.register<JavaCompile>("compileAosLiveTest") {
    group = "verification"
    description = "Compiles the live smoke test against the generated AOS client classes."
    dependsOn("compileAosJavaClient")
    source(awsClientSources.dir("aosLiveTest/java"))
    classpath = files(aosClasses) + sourceSets.named("main").get().compileClasspath
    destinationDirectory.set(aosLiveTestClasses)
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
    options.encoding = "UTF-8"
}

tasks.register<JavaExec>("runAosLiveTest") {
    group = "verification"
    description = "Runs a smoke test against a real Amazon OpenSearch Service domain."
    dependsOn("compileAosLiveTest")
    classpath = files(aosLiveTestClasses, aosClasses) + configurations.getByName("runtimeClasspath")
    mainClass.set("org.opensearch.client.opensearch.aos.AosLiveSmokeTest")
}

tasks.register<JavaExec>("runAosUltrawarmLiveTest") {
    group = "verification"
    description = "Probes every generated UltraWarm endpoint against a real AOS domain."
    dependsOn("compileAosLiveTest")
    classpath = files(aosLiveTestClasses, aosClasses) + configurations.getByName("runtimeClasspath")
    mainClass.set("org.opensearch.client.opensearch.aos.AosUltrawarmLiveTest")
}

tasks.named("check") {
    dependsOn(
        "compileAosJavaClient",
        "compileAosJarTest",
        "compileAossJavaClient",
        "runAossSurfaceTest",
        ":java-codegen:checkAosGenerated",
        ":java-codegen:checkAossGenerated"
    )
}
