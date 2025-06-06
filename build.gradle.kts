plugins {
    alias(libs.plugins.build.logic) apply false
    alias(libs.plugins.ktlint) apply false
    alias(libs.plugins.kotlin.compiler) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.compose.multiplatform) apply false
    alias(libs.plugins.compose.compiler) apply false
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/tryingKotlin"))