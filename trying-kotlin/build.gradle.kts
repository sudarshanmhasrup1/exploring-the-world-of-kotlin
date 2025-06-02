import com.build.logic.config.configureJvmTargetTo17
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    alias(libs.plugins.kotlin.compiler)
    alias(libs.plugins.build.logic)
    alias(libs.plugins.ktlint)
}

val ktlintRuleSet = mapOf(
    "ktlint_standard_final-newline" to "disabled",
    "ktlint_standard_no-empty-file" to "disabled",
    "ktlint_standard_trailing-comma-on-call-site" to "disabled",
)

ktlint {
    android = false
    ignoreFailures = false
    additionalEditorconfig.set(ktlintRuleSet)
    reporters {
        reporter(reporterType = ReporterType.HTML)
    }
}

configureJvmTargetTo17(enableToolchain = true)