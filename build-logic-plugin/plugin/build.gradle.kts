import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.java.gradle)
    alias(libs.plugins.kotlin.compiler)
}

repositories {
    mavenCentral()
}

group = libs.versions.buildLogicPlugin.groupId.get()
version = libs.versions.buildLogicPlugin.version.get()

gradlePlugin {
    plugins {
        create("BuildLogicPlugin") {
            id = libs.versions.buildLogicPlugin.groupId.get()
            version = libs.versions.buildLogicPlugin.version.get()
            implementationClass = "com.build.logic.plugin.BuildLogic"
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