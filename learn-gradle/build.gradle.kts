import com.build.logic.config.configureGroupIdAndVersion
import com.build.logic.config.configureJvmTargetTo11

plugins {
    alias(libs.plugins.build.logic)
}

configureGroupIdAndVersion()

tasks.register("configure") {
    doFirst {
        println("1. Configuring the \"learn-gradle\" module.")
    }
}

tasks.named("configure") {
    doLast {
        println("2. Modifying the \"learn-gradle\" module.")
    }
}

tasks.register("run") {
    doFirst {
        println("3. Generating the output.")
    }
    doLast {
        println("Hello world!")
    }
    dependsOn("configure")
}

configureJvmTargetTo11(enableToolchain = true)