package com.trying.kotlin.functions

private fun greet(
    greetings: String = "Hello",
    name: String = "Stranger"
) {
    println(message = "$greetings $name!")
}

fun main() {
    // Function call with some default arguments
    greet(name = "Sudarshan")

    // Function call with all default arguments
    greet()

    // Function call without no default arguments
    greet(greetings = "Good night", name = "John")
}