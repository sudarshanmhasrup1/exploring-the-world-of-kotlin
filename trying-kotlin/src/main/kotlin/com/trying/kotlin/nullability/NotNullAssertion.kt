package com.trying.kotlin.nullability

fun main() {
    val userInput: String? = null

    // The program will crash if userInput variable holds a null value.
    println(userInput!!.length)
}