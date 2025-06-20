import com.build.logic.config.configureGroupIdAndVersion
import com.build.logic.config.configureJvmTargetTo11
import com.build.logic.config.configureKtlint

plugins {
    alias(libs.plugins.build.logic)
    alias(libs.plugins.ktlint)
    alias(libs.plugins.kotlin.compiler)
    alias(libs.plugins.compose.multiplatform)
}

configureGroupIdAndVersion()
configureKtlint()
configureJvmTargetTo11(enableToolchain = true)

compose.desktop {
    application {
        mainClass = "com.cmp.desktop.MainAppKt"
    }
}