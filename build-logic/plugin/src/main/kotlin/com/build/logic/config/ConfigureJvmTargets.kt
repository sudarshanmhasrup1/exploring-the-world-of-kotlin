package com.build.logic.config

import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.internal.jvm.inspection.JvmVendor
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JvmVendorSpec
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/**
 * Sets the JVM target for both Java and Kotlin compilers in the project.
 *
 * @param project Current Gradle project.
 * @param javaTarget Java target version (used for source and target compatibility).
 * @param kotlinTarget Kotlin JVM target.
 * @param jdk JDK version number (used for toolchain if enabled).
 * @param enableToolchain If true, sets the Java toolchain to the specified JDK version.
 */
private fun setJvmTarget(
    project: Project,
    javaTarget: JavaVersion,
    kotlinTarget: JvmTarget,
    jdk: Int,
    enableToolchain: Boolean = false
) {
    project.plugins.withId("java") {
        project.extensions.findByType(JavaPluginExtension::class.java)?.apply {
            if (enableToolchain) {
                toolchain.languageVersion.set(JavaLanguageVersion.of(jdk))
                toolchain.vendor.set(JvmVendorSpec.ADOPTIUM)
            }
            sourceCompatibility = javaTarget
            targetCompatibility = javaTarget
        }
    }

    project.tasks.withType(KotlinCompile::class.java).configureEach {
        compilerOptions {
            jvmTarget.set(kotlinTarget)
        }
    }
}

// Set JVM target to Java 8
fun Project.configureJvmTargetTo8(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_1_8,
        kotlinTarget = JvmTarget.JVM_1_8,
        jdk = 8,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 9
fun Project.configureJvmTargetTo9(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_1_9,
        kotlinTarget = JvmTarget.JVM_9,
        jdk = 9,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 10
fun Project.configureJvmTargetTo10(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_1_10,
        kotlinTarget = JvmTarget.JVM_10,
        jdk = 10,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 11
fun Project.configureJvmTargetTo11(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_11,
        kotlinTarget = JvmTarget.JVM_11,
        jdk = 11,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 12
fun Project.configureJvmTargetTo12(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_12,
        kotlinTarget = JvmTarget.JVM_12,
        jdk = 12,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 13
fun Project.configureJvmTargetTo13(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_13,
        kotlinTarget = JvmTarget.JVM_13,
        jdk = 13,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 14
fun Project.configureJvmTargetTo14(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_14,
        kotlinTarget = JvmTarget.JVM_14,
        jdk = 14,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 15
fun Project.configureJvmTargetTo15(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_15,
        kotlinTarget = JvmTarget.JVM_15,
        jdk = 15,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 16
fun Project.configureJvmTargetTo16(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_16,
        kotlinTarget = JvmTarget.JVM_16,
        jdk = 16,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 17
fun Project.configureJvmTargetTo17(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_17,
        kotlinTarget = JvmTarget.JVM_17,
        jdk = 17,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 18
fun Project.configureJvmTargetTo18(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_18,
        kotlinTarget = JvmTarget.JVM_18,
        jdk = 18,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 19
fun Project.configureJvmTargetTo19(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_19,
        kotlinTarget = JvmTarget.JVM_19,
        jdk = 19,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 20
fun Project.configureJvmTargetTo20(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_20,
        kotlinTarget = JvmTarget.JVM_20,
        jdk = 20,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 21
fun Project.configureJvmTargetTo21(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_21,
        kotlinTarget = JvmTarget.JVM_21,
        jdk = 21,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 22
fun Project.configureJvmTargetTo22(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_22,
        kotlinTarget = JvmTarget.JVM_22,
        jdk = 22,
        enableToolchain = enableToolchain
    )
}

// Set JVM target to Java 23
fun Project.configureJvmTargetTo23(enableToolchain: Boolean = false) {
    setJvmTarget(
        project = this,
        javaTarget = JavaVersion.VERSION_23,
        kotlinTarget = JvmTarget.JVM_23,
        jdk = 23,
        enableToolchain = enableToolchain
    )
}