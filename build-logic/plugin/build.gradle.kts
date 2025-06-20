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

private val ktlintRuleSet = mapOf(
    "ktlint_standard_final-newline" to "disabled",
    "ktlint_standard_no-empty-file" to "disabled",
    "ktlint_standard_trailing-comma-on-call-site" to "disabled",
    "ktlint_standard_trailing-comma-on-declaration-site" to "disabled",
    "ktlint_standard_multiline-expression-wrapping" to "disabled",
    "ktlint_standard_indentation" to "disabled",
    "ktlint_standard_string-template-indent" to "disabled",
    "ktlint_standard_indent" to "disabled",
    "ktlint_standard_no-empty-first-line-in-class-body" to "disabled"
)

ktlint {
    android = false
    ignoreFailures = false
    additionalEditorconfig.set(ktlintRuleSet)
    reporters {
        reporter(reporterType = ReporterType.HTML)
    }
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/tryingKotlin"))