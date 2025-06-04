plugins {
    alias(libs.plugins.build.logic) apply false
    alias(libs.plugins.kotlin.compiler) apply false
    alias(libs.plugins.ktlint) apply false
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/tryingKotlin"))