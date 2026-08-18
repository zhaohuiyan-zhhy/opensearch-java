/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

import com.github.jk1.license.ProjectData
import com.github.jk1.license.render.ReportRenderer
import de.undercouch.gradle.tasks.download.Download
import java.io.FileWriter

buildscript {
    repositories {
        mavenLocal()
        maven(url = "https://ci.opensearch.org/ci/dbc/snapshots/maven/")
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        "classpath"(group = "org.opensearch.gradle", name = "build-tools", version = "3.8.0-SNAPSHOT")
    }
}

plugins {
    application
    id("com.github.jk1.dependency-license-report") version "3.1.4"
    id("org.owasp.dependencycheck") version "13.0.0"
    id("de.undercouch.download") version "5.7.0"

    id("opensearch-java.spotless-conventions")
}
apply(plugin = "opensearch.repositories")
apply(plugin = "org.owasp.dependencycheck")

val runtimeJavaVersion = (System.getProperty("runtime.java")?.toInt())?.let(JavaVersion::toVersion) ?: JavaVersion.current()
logger.quiet("=======================================")
logger.quiet("  Runtime JDK Version   : $runtimeJavaVersion")
logger.quiet("  Gradle JDK Version    : " + JavaVersion.current())
logger.quiet("=======================================")

java {
    targetCompatibility = JavaVersion.VERSION_11
    sourceCompatibility = JavaVersion.VERSION_11

    withJavadocJar()
    withSourcesJar()

    toolchain {
        languageVersion = JavaLanguageVersion.of(runtimeJavaVersion.majorVersion)
        vendor = JvmVendorSpec.ADOPTIUM
    }
}

application {
    mainClass.set("org.opensearch.client.codegen.CodeGenerator")
    applicationDefaultJvmArgs = listOf(
        "--add-exports", "jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED",
        "--add-exports", "jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED",
        "--add-exports", "jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED",
        "--add-exports", "jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED",
        "--add-exports", "jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED"
    )
}

val localSpecification = file("$projectDir/opensearch-openapi.yaml").toURI().toString()
val aosOverlay = layout.projectDirectory.file("overlays/amazon-managed.overlay.yaml")
val generatedAosSpecification = layout.buildDirectory.file("generated-specs/opensearch-amazon-managed.yaml")
val generatedAosSources = project(":java-client").layout.projectDirectory.dir("src/generated-aos/java")
val generatedAosCheckSources = layout.buildDirectory.dir("generated-sources/aos-check/java")

tasks.register<Download>("downloadLatestSpec") {
    src("https://github.com/opensearch-project/opensearch-api-specification/releases/download/main-latest/opensearch-openapi.yaml")
    dest(localSpecification)
}

tasks.named<JavaExec>("run") {
    args = listOf(
        "--input", localSpecification,
        "--eclipse-config", "$rootDir/buildSrc/formatterConfig-generated.xml",
        "--output", "${project(":java-client").projectDir}/src/generated/java/"
    )
}

tasks.register<JavaExec>("generateAosSpec") {
    group = "code generation"
    description = "Applies the Amazon OpenSearch Service overlay and distribution filter to the local OpenAPI specification."
    dependsOn(tasks.classes)
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("org.opensearch.client.codegen.openapi.overlay.DistributionSpecGenerator")

    inputs.file(file("$projectDir/opensearch-openapi.yaml"))
    inputs.file(aosOverlay)
    outputs.file(generatedAosSpecification)

    doFirst {
        args = listOf(
            "--input", file("$projectDir/opensearch-openapi.yaml").absolutePath,
            "--overlay", aosOverlay.asFile.absolutePath,
            "--distribution", "amazon-managed",
            "--output", generatedAosSpecification.get().asFile.absolutePath
        )
    }
}

tasks.register<JavaExec>("generateAosClient") {
    group = "code generation"
    description = "Generates the Amazon OpenSearch Service Java client sources."
    dependsOn("generateAosSpec", tasks.classes)
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("org.opensearch.client.codegen.CodeGenerator")

    inputs.file(generatedAosSpecification)
    outputs.dir(generatedAosSources)

    doFirst {
        args = listOf(
            "--input", generatedAosSpecification.get().asFile.toURI().toString(),
            "--eclipse-config", "$rootDir/buildSrc/formatterConfig-generated.xml",
            "--output", generatedAosSources.asFile.absolutePath
        )
    }
}
val generateAosClientForCheck = tasks.register<JavaExec>("generateAosClientForCheck") {
    group = "verification"
    description = "Generates AOS client sources in a temporary directory for drift checking."
    dependsOn("generateAosSpec", tasks.classes)
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("org.opensearch.client.codegen.CodeGenerator")

    inputs.file(generatedAosSpecification)
    outputs.dir(generatedAosCheckSources)

    doFirst {
        args = listOf(
            "--input", generatedAosSpecification.get().asFile.toURI().toString(),
            "--eclipse-config", "$rootDir/buildSrc/formatterConfig-generated.xml",
            "--output", generatedAosCheckSources.get().asFile.absolutePath
        )
    }
}

tasks.register("checkAosGenerated") {
    group = "verification"
    description = "Fails when checked-in AOS client sources differ from fresh generation."
    dependsOn(generateAosClientForCheck)
    inputs.dir(generatedAosSources)
    inputs.dir(generatedAosCheckSources)

    doLast {
        val checkedRoot = generatedAosSources.asFile
        val freshRoot = generatedAosCheckSources.get().asFile
        if (!checkedRoot.isDirectory) {
            throw GradleException("Checked-in AOS client directory does not exist: $checkedRoot")
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
                "Checked-in AOS client is stale. Run ./gradlew :java-codegen:generateAosClient\n$details$remainder"
            )
        }
        logger.lifecycle("Checked-in AOS client matches fresh generation (${checkedFiles.size} Java files).")
    }
}


tasks.withType<ProcessResources> {
    expand(mapOf(
        "version" to version,
        "git_revision" to (if (rootProject.extra.has("gitHashFull")) rootProject.extra["gitHashFull"] else "unknown")
    ))
}

tasks.withType<Javadoc>().configureEach{
    options {
        encoding = "UTF-8"
    }
}

tasks.withType<Jar> {
    doFirst {
        if (rootProject.extra.has("gitHashFull")) {
            val jar = this as Jar
            jar.manifest.attributes["X-Git-Revision"] = rootProject.extra["gitHashFull"]
            jar.manifest.attributes["X-Git-Commit-Time"] = rootProject .extra["gitCommitTime"]
        } else {
            throw GradleException("No git information available")
        }
    }

    manifest {
        attributes["Implementation-Title"] = "OpenSearch Java client code generator"
        attributes["Implementation-Vendor"] = "OpenSearch"
        attributes["Implementation-URL"] = "https://github.com/opensearch-project/opensearch-java/"
        attributes["Build-Date"] = rootProject.extra["buildTime"]
    }

    metaInf {
        from("../LICENSE.txt")
        from("../NOTICE.txt")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

tasks.named<JavaCompile>("compileTestJava") {
    sourceCompatibility = JavaVersion.VERSION_17.toString()
    targetCompatibility = JavaVersion.VERSION_17.toString()
}

tasks.build {
    dependsOn("spotlessJavaCheck")
}

tasks.named("check") {
    dependsOn("checkAosGenerated")
}

dependencies {
    // Apache 2.0
    implementation("io.swagger.parser.v3", "swagger-parser", "2.1.22")

    // (New) BSD
    implementation("com.samskivert", "jmustache", "1.16")

    // Apache 2.0
    implementation("commons-cli", "commons-cli", "1.8.0")
    implementation("commons-codec", "commons-codec", "1.17.0")
    implementation("commons-logging", "commons-logging", "1.3.2")
    implementation("org.apache.commons", "commons-lang3", "3.14.0")
    implementation("org.apache.commons", "commons-text", "1.12.0")
    implementation("org.apache.logging.log4j", "log4j-api", "[2.17.1,3.0)")
    implementation("org.apache.logging.log4j", "log4j-core", "[2.17.1,3.0)")
    implementation("org.apache.logging.log4j", "log4j-slf4j2-impl", "[2.17.1,3.0)")

    // Apache 2.0
    implementation("com.fasterxml.jackson.core", "jackson-core", "2.17.1")
    implementation("com.fasterxml.jackson.core", "jackson-databind", "2.17.1")
    implementation("com.fasterxml.jackson.dataformat", "jackson-dataformat-yaml", "2.17.1")

    // Apache 2.0
    implementation("com.diffplug.spotless", "spotless-lib", "2.45.0")
    implementation("com.diffplug.spotless", "spotless-lib-extra", "2.45.0")

    // Apache 2.0
    // https://search.maven.org/artifact/com.google.code.findbugs/jsr305
    implementation("com.google.code.findbugs", "jsr305", "3.0.2")

    // Apache 2.0
    compileOnly("org.jetbrains", "annotations", "24.1.0")

    // Apache 2.0
    implementation("org.apache.maven.resolver", "maven-resolver-api", "1.9.20")
    implementation("org.apache.maven.resolver", "maven-resolver-supplier", "1.9.20")

    // MIT
    implementation("org.semver4j", "semver4j", "5.3.0")

    // BSD-2-Clause
    implementation("org.commonmark", "commonmark", "0.24.0")

    // EPL-2.0
    testImplementation(platform("org.junit:junit-bom:6.1.2"))
    testImplementation("org.junit.jupiter", "junit-jupiter")
    testRuntimeOnly("org.junit.platform", "junit-platform-launcher")
}

licenseReport {
    renderers = arrayOf(SpdxReporter(rootProject.layout.buildDirectory.file("release/codegen-dependencies.csv").get().getAsFile()))
    excludeGroups = arrayOf()
}

class SpdxReporter(val dest: File) : ReportRenderer {
    // License names to their SPDX identifier
    val spdxIds = mapOf(
        "Apache 2" to "Apache-2.0",
        "Apache 2.0" to "Apache-2.0",
        "Apache-2.0" to "Apache-2.0",
        "\"Apache-2.0\";link=\"https://www.apache.org/licenses/LICENSE-2.0.txt\"" to "Apache-2.0",
        "\"Apache 2.0\";link=\"http://www.apache.org/licenses/LICENSE-2.0.txt\"" to "Apache-2.0",
        "\"Apache License 2.0\";link=\"http://www.apache.org/licenses/LICENSE-2.0.html\"" to "Apache-2.0",
        "Apache License 2.0" to "Apache-2.0",
        "Apache License, version 2.0" to "Apache-2.0",
        "Apache License, Version 2.0" to "Apache-2.0",
        "Apache Software License, version 2.0" to "Apache-2.0",
        "The Apache License, Version 2.0" to "Apache-2.0",
        "The Apache Software License, Version 2.0" to "Apache-2.0",
        "BSD Zero Clause License" to "0BSD",
        "The (New) BSD License" to "BSD-3-Clause",
        "EDL 1.0" to "BSD-3-Clause",
        "Eclipse Distribution License - v 1.0" to "BSD-3-Clause",
        "Eclipse Distribution License (New BSD License)" to "BSD-3-Clause",
        "Eclipse Public License 2.0" to "EPL-2.0",
        "Eclipse Public License v. 2.0" to "EPL-2.0",
        "Eclipse Public License - v 2.0" to "EPL-2.0",
        "GNU General Public License, version 2 with the GNU Classpath Exception" to "GPL-2.0 WITH Classpath-exception-2.0",
        "COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0" to "CDDL-1.0",
        "Lesser General Public License, version 3 or greater" to "LGPL-3.0+",
        "MIT" to "MIT",
        "MIT License" to "MIT",
        "The MIT License" to "MIT",
        "Mozilla Public License, Version 2.0" to "MPL-2.0",
        "Public Domain" to "PUBLIC-DOMAIN"
    )

    private fun quote(str: String) : String {
        return if (str.contains(',') || str.contains("\"")) {
            "\"" + str.replace("\"", "\"\"") + "\""
        } else {
            str
        }
    }

    override fun render(data: ProjectData?) {
        dest.parentFile.mkdirs()
        FileWriter(dest).use { out ->
            out.append("name,url,version,revision,license\n")
            data?.allDependencies?.forEach { dep ->
                val info = com.github.jk1.license.render.LicenseDataCollector.multiModuleLicenseInfo(dep)

                val depVersion = dep.version
                val depName = dep.group + ":" + dep.name
                val depUrl = if (info.moduleUrls.isNotEmpty()) { info.moduleUrls.first() } else { "<NO MODULE URL>" }

                val licenseIds = info.licenses.mapNotNull { license ->
                    license.name?.let {
                        checkNotNull(spdxIds[it]) { "No SPDX identifier for $license" }
                    }
                }.toSet()

                // Combine multiple licenses.
                // See https://spdx.github.io/spdx-spec/appendix-IV-SPDX-license-expressions/#composite-license-expressions
                val licenseId = licenseIds.joinToString(" OR ")
                out.append("${quote(depName)},${quote(depUrl)},${quote(depVersion)},,${quote(licenseId)}\n")
            }
        }
    }
}

tasks.withType<Jar> {
    doLast {
        ant.withGroovyBuilder {
            "checksum"("algorithm" to "md5", "file" to archiveFile.get())
            "checksum"("algorithm" to "sha1", "file" to archiveFile.get())
            "checksum"("algorithm" to "sha-256", "file" to archiveFile.get(), "fileext" to ".sha256")
            "checksum"("algorithm" to "sha-512", "file" to archiveFile.get(), "fileext" to ".sha512")
        }
    }
}

spotlessConventions {
    eclipseFormatterConfigFile = rootProject.file("buildSrc/formatterConfig-generated.xml")
}
