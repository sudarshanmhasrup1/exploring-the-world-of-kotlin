import com.build.logic.config.configureGroupIdAndVersion
import com.build.logic.config.configureJvmTargetTo11
import com.build.logic.config.configureKtlint

plugins {
    alias(libs.plugins.build.logic)
    alias(libs.plugins.ktlint)
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

configureGroupIdAndVersion()
configureKtlint()
configureJvmTargetTo11(enableToolchain = true)

android {
    compileSdk = libs.versions.androidApp.compileSdk.get().toInt()
    namespace = libs.versions.androidApp.groupId.get()

    defaultConfig {
        applicationId = libs.versions.androidApp.groupId.get()
        targetSdk = libs.versions.androidApp.targetSdk.get().toInt()
        minSdk = libs.versions.androidApp.minSdk.get().toInt()
        versionCode = libs.versions.androidApp.versionCode.get().toInt()
        versionName = libs.versions.androidApp.versionName.get()
    }

    compileOptions {
        targetCompatibility = JavaVersion.VERSION_11
        sourceCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.activity.compose)
}