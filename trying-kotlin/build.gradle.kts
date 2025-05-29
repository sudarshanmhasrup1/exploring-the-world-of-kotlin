plugins {
    alias(libs.plugins.kotlin.compiler)
}

repositories {
    mavenCentral()
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/tryingKotlin"))