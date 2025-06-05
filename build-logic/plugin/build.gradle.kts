import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    alias(libs.plugins.java.gradle)
    alias(libs.plugins.kotlin.compiler)
    alias(libs.plugins.ktlint)
    `kotlin-dsl`
}

group = libs.versions.buildLogicPlugin.groupId.get()
version = libs.versions.buildLogicPlugin.version.get()

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.ktlint.gradle.plugin)
    testImplementation(libs.kotlin.test)
}

gradlePlugin {
    plugins {
        create("BuildLogicPlugin") {
            id = libs.versions.buildLogicPlugin.groupId.get()
            version = libs.versions.buildLogicPlugin.version.get()
            implementationClass = libs.versions.buildLogicPlugin.implementationClass.get()
        }
    }
}

val ktlintRuleSet = mapOf(
    "ktlint_standard_final-newline" to "disabled",
    "ktlint_standard_no-empty-file" to "disabled",
    "ktlint_standard_trailing-comma-on-call-site" to "disabled",
)

ktlint {
    android = false
    ignoreFailures = false
    additionalEditorconfig.set(ktlintRuleSet)
    reporters {
        reporter(reporterType = ReporterType.HTML)
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(11)
    }

    targetCompatibility = JavaVersion.VERSION_11
    sourceCompatibility = JavaVersion.VERSION_11
}

kotlin.compilerOptions {
    jvmTarget = JvmTarget.JVM_11
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/tryingKotlin"))