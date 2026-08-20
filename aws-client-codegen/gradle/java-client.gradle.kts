/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.compile.JavaCompile

val sourceSets = extensions.getByType<SourceSetContainer>()
val awsClientSources = rootProject.layout.projectDirectory.dir("aws-client-codegen/java-client/src")
val aosJarTestClasses = layout.buildDirectory.dir("classes/java/aosJarTest")
val aosLiveTestClasses = layout.buildDirectory.dir("classes/java/aosLiveTest")
val aossLiveTestClasses = layout.buildDirectory.dir("classes/java/aossLiveTest")
val clientJar = tasks.named<Jar>("jar")

tasks.register<JavaCompile>("compileAosJarTest") {
    group = "verification"
    description = "Compiles the AOS smoke test against the packaged unified client JAR."
    dependsOn(clientJar)
    source(awsClientSources.dir("aosJarTest/java"))
    classpath = files(clientJar.flatMap { it.archiveFile }) + sourceSets.named("main").get().compileClasspath
    destinationDirectory.set(aosJarTestClasses)
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
    options.encoding = "UTF-8"
}

tasks.register<JavaExec>("runAosJarTest") {
    group = "verification"
    description = "Runs the packaged unified client against a real Amazon OpenSearch Service domain."
    dependsOn("compileAosJarTest")
    classpath = files(aosJarTestClasses, clientJar.flatMap { it.archiveFile }) + configurations.getByName("runtimeClasspath")
    mainClass.set("org.opensearch.client.opensearch.aos.AosJarSmokeTest")
}

tasks.register<JavaCompile>("compileAosLiveTest") {
    group = "verification"
    description = "Compiles the broad AOS live tests against the packaged unified client JAR."
    dependsOn(clientJar)
    source(awsClientSources.dir("aosLiveTest/java"))
    classpath = files(clientJar.flatMap { it.archiveFile }) + configurations.getByName("testCompileClasspath")
    destinationDirectory.set(aosLiveTestClasses)
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
    options.encoding = "UTF-8"
}

tasks.register<JavaExec>("runAosLiveTest") {
    group = "verification"
    description = "Runs broad data-plane coverage against a real Amazon OpenSearch Service domain."
    dependsOn("compileAosLiveTest")
    classpath = files(aosLiveTestClasses, clientJar.flatMap { it.archiveFile }) + configurations.getByName("testRuntimeClasspath")
    mainClass.set("org.opensearch.client.opensearch.aos.AosLiveSmokeTest")
}

tasks.register<JavaExec>("runAosUltrawarmLiveTest") {
    group = "verification"
    description = "Probes all AOS UltraWarm endpoints against a domain without UltraWarm capacity."
    dependsOn("compileAosLiveTest")
    classpath = files(aosLiveTestClasses, clientJar.flatMap { it.archiveFile }) + configurations.getByName("testRuntimeClasspath")
    mainClass.set("org.opensearch.client.opensearch.aos.AosUltrawarmLiveTest")
}

tasks.register<JavaCompile>("compileAossLiveTest") {
    group = "verification"
    description = "Compiles the AOSS live coverage test against the packaged unified client JAR."
    dependsOn(clientJar)
    source(awsClientSources.dir("aossLiveTest/java"))
    classpath = files(clientJar.flatMap { it.archiveFile }) + configurations.getByName("testCompileClasspath")
    destinationDirectory.set(aossLiveTestClasses)
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
    options.encoding = "UTF-8"
}

tasks.register<JavaExec>("runAossLiveTest") {
    group = "verification"
    description = "Runs broad data-plane coverage against a real Amazon OpenSearch Serverless collection."
    dependsOn("compileAossLiveTest")
    classpath = files(aossLiveTestClasses, clientJar.flatMap { it.archiveFile }) + configurations.getByName("testRuntimeClasspath")
    mainClass.set("org.opensearch.client.opensearch.aoss.AossLiveSmokeTest")
}

// The standard java-client source set and JAR now contain the unified
// OSS/AOS/AOSS client. Keep checked-in generated sources in sync in CI.
tasks.named("check") {
    dependsOn("compileAosJarTest", "compileAosLiveTest", "compileAossLiveTest", ":java-codegen:checkUnifiedGenerated")
}
