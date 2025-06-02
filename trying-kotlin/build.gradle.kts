import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.compiler)
    alias(libs.plugins.build.logic)
    alias(libs.plugins.ktlint)
}

ktlint {
    android = false
    ignoreFailures = false
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