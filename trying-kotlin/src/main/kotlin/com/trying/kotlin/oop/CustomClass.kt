package com.trying.kotlin.oop

private class HumanBeing(
    private val name: String,
    private val age: Int,
    private val gender: String
) {

    private var favouriteActor: String? = null

    // Secondary constructor
    constructor(
        name: String,
        age: Int,
        gender: String,
        favouriteActor: String?
    ) : this(
        name = name,
        age = age,
        gender = gender
    ) {
        this.favouriteActor = favouriteActor
    }

    // Member function 1
    fun walk() {
        println(message = "$name is walking.")
    }

    // Member function 2
    fun talk() {
        println(message = "$name is talking.")
    }

    // Member function 3
    fun sleep() {
        println(message = "$name is sleeping.")
    }

    // Member function 4
    fun displayInformation() {
        println(message = "Name: $name.")
        println(message = "Age: $age.")
        println(message = "Gender: $gender.")
        println(message = "Favourite actor: ${favouriteActor ?: "NA"}.")
    }
}

private fun displayDivider(bigDivider: Boolean = false) {
    if (bigDivider) {
        println("=======================================================")
    } else {
        println("-------------------------------------------------------")
    }
}

fun main() {
    val joel = HumanBeing(name = "Joel", age = 20, gender = "Male")
    displayDivider(bigDivider = true)
    joel.displayInformation()
    displayDivider()
    joel.walk()
    joel.talk()
    joel.sleep()
    displayDivider(bigDivider = true)
    println()

    val julie = HumanBeing(name = "Julie", age = 20, gender = "Female", favouriteActor = "Chris Evans")
    displayDivider(bigDivider = true)
    julie.displayInformation()
    displayDivider()
    julie.walk()
    julie.talk()
    julie.sleep()
    displayDivider(bigDivider = true)
}