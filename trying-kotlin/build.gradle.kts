import com.build.logic.config.configureGroupIdAndVersion
import com.build.logic.config.configureJvmTargetTo11
import com.build.logic.config.configureKtlint

plugins {
    alias(libs.plugins.build.logic)
    alias(libs.plugins.ktlint)
    alias(libs.plugins.kotlin.compiler)
}

configureGroupIdAndVersion()
configureKtlint()
configureJvmTargetTo11(enableToolchain = true)

dependencies {
    implementation(libs.kotlinx.coroutines.core)
}