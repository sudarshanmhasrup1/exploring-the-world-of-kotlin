import com.build.logic.config.configureGroupIdAndVersion
import com.build.logic.config.configureJvmTargetTo11
import com.build.logic.config.configureKtlint

plugins {
    alias(libs.plugins.build.logic)
    alias(libs.plugins.ktlint)
    alias(libs.plugins.kotlin.compiler)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

configureGroupIdAndVersion()
configureKtlint()
configureJvmTargetTo11(enableToolchain = true)

compose.desktop {
    application {
        mainClass = libs.versions.desktopApp.mainClass.get()
    }
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(project(":compose-app"))
}