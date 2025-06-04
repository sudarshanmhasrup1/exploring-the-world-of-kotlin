import org.jetbrains.kotlin.gradle.dsl.JvmTarget

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
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
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