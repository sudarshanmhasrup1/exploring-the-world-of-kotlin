import org.gradle.kotlin.dsl.provideDelegate

rootProject.name = "ExploringTheWorldOfKotlin"

pluginManagement {
    repositories {
        gradlePluginPortal()
    }

    val foojayResolverConventionPluginId: String by settings
    val foojayResolverConventionPluginVersion: String by settings

    plugins {
        id(foojayResolverConventionPluginId) version foojayResolverConventionPluginVersion
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
    }
}

include(":learn-gradle")
include(":trying-kotlin")