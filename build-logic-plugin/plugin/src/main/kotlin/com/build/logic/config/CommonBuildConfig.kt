package com.build.logic.config

import org.gradle.api.Project

fun Project.configureBuildDirectory(buildDirectoryPath: String) {
    this.layout.buildDirectory.set(file("$rootDir/.build/$buildDirectoryPath"))
}