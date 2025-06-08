package com.trying.kotlin.strings

fun main() {
    val message = "Hello world"

    print(message = "Guess the message: ")
    val userGuessInput = readln()

    if (userGuessInput.equals(other = message, ignoreCase = true)) {
        println(message = "Yay! you guessed it right.")
    } else {
        println(message = "Better luck next time.")
    }
}