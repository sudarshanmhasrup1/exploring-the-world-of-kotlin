plugins {

}

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