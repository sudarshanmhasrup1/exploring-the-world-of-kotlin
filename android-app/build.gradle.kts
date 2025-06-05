import com.build.logic.config.configureKtlint

plugins {
    alias(libs.plugins.build.logic)
    alias(libs.plugins.ktlint)
}

configureKtlint()