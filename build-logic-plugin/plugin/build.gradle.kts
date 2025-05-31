plugins {
    id("java-gradle-plugin")
    id("org.jetbrains.kotlin.jvm") version "2.1.21"
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("BuildLogicPlugin") {
            id = "com.build.logic.plugin"
            version = "1.0.0"
            implementationClass = "com.build.logic.plugin.BuildLogic"
        }
    }
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/tryingKotlin"))