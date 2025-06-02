package com.trying.kotlin.functions

// Function with block body
@Suppress("SameParameterValue")
private fun greet(greetings: String) {
    println(message = greetings)
}

// Function with expression body
@Suppress("SameParameterValue")
private fun increaseAgeBy1Year(age: Int) = age + 1

fun main() {
    greet(greetings = "Good morning!")

    val currentAge = 20
    println(message = "Your current age is: $currentAge years.")
    println(message = "Your age will be ${increaseAgeBy1Year(age = currentAge)} years in the next year.")
}