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

include(":learn-gradle")
include(":trying-kotlin")