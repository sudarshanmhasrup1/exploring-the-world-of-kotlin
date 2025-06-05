package com.build.logic.config

import com.build.logic.util.ProjectDirectoryNameManager
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension

/**
 * Configures the build directory for the project.
 *
 * Sets the build output directory to a custom path relative to the root project directory.
 * The path will be: `<rootDir>/.build/<buildDirectoryPath>`
 *
 * @param buildDirectoryPath The custom directory name to be used under `.build` folder.
 */
fun Project.configureBuildDirectory(buildDirectoryPath: String) {
    this.layout.buildDirectory.set(file("$rootDir/.build/$buildDirectoryPath"))
}

/**
 * Configures the `group` and `version` properties of the current project based on values
 * defined in the `libs.versions.toml` version catalog.
 *
 * This function expects the version catalog to contain entries in the following format:
 *
 * ```
 * [versions]
 * myModule-groupId = "com.example.mymodule"
 * myModule-version = "1.0.0"
 * ```
 *
 * Where `myModule` is the formatted project name returned by a internal method.
 *
 * For example, if the project directory name is `learn-gradle`, then it will look for:
 * - `learnGradle-groupId` in the version catalog
 * - `learnGradle-version` in the version catalog
 *
 * If either entry is missing, this method throws an `IllegalArgumentException` with a helpful message.
 *
 * Usage:
 * Call this method in your module's `build.gradle.kts` to automatically assign group and version.
 */
fun Project.configureGroupIdAndVersion() {

    val libs = project.extensions.getByType(VersionCatalogsExtension::class.java)
        .named("libs")

    val formattedProjectDirectoryName = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
        projectDirectoryName = project.name
    )

    val groupIdIdentifier = "$formattedProjectDirectoryName-groupId"
    val versionIdentifier = "$formattedProjectDirectoryName-version"

    val groupId = libs.findVersion(groupIdIdentifier).orElseThrow {
        IllegalArgumentException(
            """
            No version definition found for "$groupIdIdentifier" in your libs.version.catalog.
            Please make sure this version is defined if you're calling the configureGroupIdAndVersion() method in your build configuration.
            """.trimIndent()
        )
    }
    val version = libs.findVersion(versionIdentifier).orElseThrow {
        IllegalArgumentException(
            """
                No definition found for version "$versionIdentifier" in your libs.version.catalog. 
                Please ensure version "$versionIdentifier" exits in your lib.version.catalog if you're calling configureGroupIdAndVersion() method in your build configuration.
            """.trimIndent()
        )
    }

    this.group = groupId
    this.version = version
}