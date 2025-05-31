package com.build.logic.plugin

import org.gradle.api.Project

fun Project.configureBuildDirectory(buildDirectoryPath: String) {
    this.layout.buildDirectory.set(file("$rootDir/.build/$buildDirectoryPath"))
}