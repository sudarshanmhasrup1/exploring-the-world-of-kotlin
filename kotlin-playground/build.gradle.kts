import com.build.logic.config.configureGroupIdAndVersion
import com.build.logic.config.configureJvmTargetTo11
import com.build.logic.config.configureKtlint

plugins {
    alias(libs.plugins.build.logic)
    alias(libs.plugins.kotlin.compiler)
}

configureKtlint()
configureGroupIdAndVersion()
configureJvmTargetTo11(enableToolchain = true)