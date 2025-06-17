package com.trying.kotlin.oop

class Human {
    fun eat() {
        println(message = "Eating.")
    }

    fun sleep() {
        println(message = "Sleeping.")
    }
}

@Suppress("UnusedReceiverParameter")
private fun Human.sing() {
    println(message = "Singing.")
}

fun main() {
    val joel = Human()
    joel.eat()
    joel.sleep()
    joel.sing()
}