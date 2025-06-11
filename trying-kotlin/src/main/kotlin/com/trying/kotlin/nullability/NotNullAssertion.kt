package com.trying.kotlin.nullability

@Suppress("KotlinConstantConditions")
fun main() {
    val userInput: String? = null

    // The program will crash if userInput variable holds a null value.
    println(message = userInput!!.length)
}