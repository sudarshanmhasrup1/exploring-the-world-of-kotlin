package com.build.logic.config

import org.gradle.api.Project

/**
 * Configures the build directory for the project.
 *
 * Sets the build output directory to a custom path relative to the root project directory.
 * The path will be: `<rootDir>/.build/<buildDirectoryPath>`
 *
 * @param buildDirectoryPath The custom directory name to be used under `.build` folder.
 */
internal fun Project.configureBuildDirectory(buildDirectoryPath: String) {
    this.layout.buildDirectory.set(file("$rootDir/.build/$buildDirectoryPath"))
}