package com.build.logic

import com.build.logic.config.configureBuildDirectory
import com.build.logic.util.ProjectDirectoryNameManager
import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildLogic : Plugin<Project> {

    override fun apply(project: Project) {
        configureBuildDirectory(project = project)
    }

    private fun configureBuildDirectory(project: Project) {
        val formattedProjectDirectoryName = ProjectDirectoryNameManager.getFormattedProjectDirectoryName(
            projectDirectoryName = project.name
        )
        project.configureBuildDirectory(buildDirectoryPath = formattedProjectDirectoryName)
    }
}