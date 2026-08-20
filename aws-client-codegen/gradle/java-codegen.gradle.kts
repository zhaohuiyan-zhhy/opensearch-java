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
val awsCodegenRoot = rootProject.layout.projectDirectory.dir("aws-client-codegen")
val localSpecification = layout.projectDirectory.file("opensearch-openapi.yaml")
val aosOverlay = awsCodegenRoot.file("overlays/amazon-managed.overlay.yaml")
val aossOverlay = awsCodegenRoot.file("overlays/amazon-serverless.overlay.yaml")
val generatedAosSpecification = layout.buildDirectory.file("generated-specs/opensearch-amazon-managed.yaml")
val generatedAossSpecification = layout.buildDirectory.file("generated-specs/opensearch-amazon-serverless.yaml")
val generatedUnifiedSpecification = layout.buildDirectory.file("generated-specs/opensearch-unified.yaml")
val generatedUnifiedSources = project(":java-client").layout.projectDirectory.dir("src/generated/java")
val generatedUnifiedCheckSources = layout.buildDirectory.dir("generated-sources/unified-check/java")

sourceSets.named("main") {
    java.srcDir(awsCodegenRoot.dir("src/main/java"))
}
sourceSets.named("test") {
    java.srcDir(awsCodegenRoot.dir("src/test/java"))
}

dependencies.add(
    "implementation",
    "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.17.1"
)

fun registerDistributionSpecTask(
    taskName: String,
    descriptionText: String,
    overlay: org.gradle.api.file.RegularFile,
    distribution: String,
    output: org.gradle.api.provider.Provider<org.gradle.api.file.RegularFile>
) = tasks.register<JavaExec>(taskName) {
    group = "code generation"
    description = descriptionText
    dependsOn(tasks.named("classes"))
    classpath = sourceSets.named("main").get().runtimeClasspath
    mainClass.set("org.opensearch.client.codegen.aws.DistributionSpecGenerator")

    inputs.file(localSpecification)
    inputs.file(overlay)
    outputs.file(output)

    doFirst {
        args = listOf(
            "--input", localSpecification.asFile.absolutePath,
            "--overlay", overlay.asFile.absolutePath,
            "--distribution", distribution,
            "--output", output.get().asFile.absolutePath
        )
    }
}

fun registerClientGenerationTask(
    taskName: String,
    groupName: String,
    descriptionText: String,
    specTask: TaskProvider<JavaExec>,
    specification: org.gradle.api.provider.Provider<org.gradle.api.file.RegularFile>,
    output: org.gradle.api.file.Directory
) = tasks.register<JavaExec>(taskName) {
    group = groupName
    description = descriptionText
    dependsOn(specTask, tasks.named("classes"))
    classpath = sourceSets.named("main").get().runtimeClasspath
    mainClass.set("org.opensearch.client.codegen.CodeGenerator")

    inputs.file(specification)
    outputs.dir(output)

    doFirst {
        args = listOf(
            "--input", specification.get().asFile.toURI().toString(),
            "--eclipse-config", "$rootDir/buildSrc/formatterConfig-generated.xml",
            "--output", output.asFile.absolutePath
        )
    }
}

fun registerGeneratedDriftCheck(
    taskName: String,
    label: String,
    generationTask: TaskProvider<JavaExec>,
    checkedSources: org.gradle.api.file.Directory,
    freshSources: org.gradle.api.provider.Provider<org.gradle.api.file.Directory>,
    regenerationTask: String
) = tasks.register(taskName) {
    group = "verification"
    description = "Fails when checked-in $label client sources differ from fresh generation."
    dependsOn(generationTask)
    inputs.dir(checkedSources)
    inputs.dir(freshSources)

    doLast {
        val checkedRoot = checkedSources.asFile
        val freshRoot = freshSources.get().asFile
        if (!checkedRoot.isDirectory) {
            throw GradleException("Checked-in $label client directory does not exist: $checkedRoot")
        }

        fun javaFiles(root: File): Map<String, File> = root.walkTopDown()
            .filter { it.isFile && it.extension == "java" }
            .associateBy { it.relativeTo(root).invariantSeparatorsPath }

        val checkedFiles = javaFiles(checkedRoot)
        val freshFiles = javaFiles(freshRoot)
        val differences = mutableListOf<String>()
        differences += (freshFiles.keys - checkedFiles.keys).sorted().map { "missing checked-in file: $it" }
        differences += (checkedFiles.keys - freshFiles.keys).sorted().map { "unexpected checked-in file: $it" }
        differences += (checkedFiles.keys intersect freshFiles.keys).sorted()
            .filter { !checkedFiles.getValue(it).readBytes().contentEquals(freshFiles.getValue(it).readBytes()) }
            .map { "changed checked-in file: $it" }

        if (differences.isNotEmpty()) {
            val details = differences.take(20).joinToString("\n") { "- $it" }
            val remainder = if (differences.size > 20) "\n- ... and ${differences.size - 20} more" else ""
            throw GradleException(
                "Checked-in $label client is stale. Run $regenerationTask\n$details$remainder"
            )
        }
        logger.lifecycle("Checked-in $label client matches fresh generation (${checkedFiles.size} Java files).")
    }
}

val generateAosSpec = registerDistributionSpecTask(
    "generateAosSpec",
    "Applies the Amazon OpenSearch Service overlay and distribution filter to the local OpenAPI specification.",
    aosOverlay,
    "amazon-managed",
    generatedAosSpecification
)
val generateAossSpec = registerDistributionSpecTask(
    "generateAossSpec",
    "Applies the Amazon OpenSearch Serverless overlay and distribution filter to the local OpenAPI specification.",
    aossOverlay,
    "amazon-serverless",
    generatedAossSpecification
)

tasks.register<JavaExec>("generateUnifiedSpec") {
    group = "code generation"
    description = "Builds one OpenAPI specification containing the OSS, AOS, and AOSS API union."
    dependsOn(tasks.named("classes"))
    classpath = sourceSets.named("main").get().runtimeClasspath
    mainClass.set("org.opensearch.client.codegen.aws.UnifiedSpecGenerator")

    inputs.file(localSpecification)
    inputs.file(aosOverlay)
    inputs.file(aossOverlay)
    outputs.file(generatedUnifiedSpecification)

    doFirst {
        args = listOf(
            "--input", localSpecification.asFile.absolutePath,
            "--aos-overlay", aosOverlay.asFile.absolutePath,
            "--aoss-overlay", aossOverlay.asFile.absolutePath,
            "--output", generatedUnifiedSpecification.get().asFile.absolutePath
        )
    }
}

val generateUnifiedClientForCheck = registerClientGenerationTask(
    "generateUnifiedClientForCheck",
    "verification",
    "Generates the unified client in a temporary directory for drift checking.",
    tasks.named<JavaExec>("generateUnifiedSpec"),
    generatedUnifiedSpecification,
    generatedUnifiedCheckSources.get()
)

registerGeneratedDriftCheck(
    "checkUnifiedGenerated",
    "unified OSS/AOS/AOSS",
    generateUnifiedClientForCheck,
    generatedUnifiedSources,
    generatedUnifiedCheckSources,
    "./gradlew :java-codegen:run"
)

tasks.named<JavaCompile>("compileTestJava") {
    sourceCompatibility = JavaVersion.VERSION_17.toString()
    targetCompatibility = JavaVersion.VERSION_17.toString()
}

tasks.named("check") {
    dependsOn("checkUnifiedGenerated")
}
