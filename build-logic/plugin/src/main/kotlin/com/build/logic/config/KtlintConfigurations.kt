package com.build.logic.config

import org.gradle.api.Project
import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

private val ktlintRuleSet = mapOf(
    "ktlint_standard_final-newline" to "disabled",
    "ktlint_standard_no-empty-file" to "disabled",
    "ktlint_standard_trailing-comma-on-call-site" to "disabled",
    "ktlint_standard_trailing-comma-on-declaration-site" to "disabled",
    "ktlint_standard_multiline-expression-wrapping" to "disabled",
    "ktlint_standard_indentation" to "disabled",
    "ktlint_standard_string-template-indent" to "disabled",
    "ktlint_standard_indent" to "disabled",
    "ktlint_standard_no-empty-first-line-in-class-body" to "disabled"
)

/**
 * Configures the Ktlint plugin for the current Gradle [Project].
 *
 * This function should be called after applying the Ktlint plugin using its plugin ID:
 * `"org.jlleitschuh.gradle.ktlint"`.
 *
 * Configuration includes:
 * - Disabling Android-specific rules.
 * - Failing the build on lint errors (`ignoreFailures = false`).
 * - Setting custom `.editorconfig` rules via `additionalEditorconfig`.
 * - Enabling the HTML reporter for lint output.
 *
 * @receiver Project The Gradle project in which the Ktlint plugin is applied.
 */
fun Project.configureKtlint() {
    this.plugins.withId("org.jlleitschuh.gradle.ktlint") {

        val ktlint = project.extensions
            .getByName("ktlint") as KtlintExtension

        ktlint.android.set(false)
        ktlint.ignoreFailures.set(false)
        ktlint.additionalEditorconfig.set(ktlintRuleSet)
        ktlint.reporters {
            reporter(ReporterType.HTML)
        }
    }
}