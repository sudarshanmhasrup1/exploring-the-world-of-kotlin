package com.trying.kotlin.looping

fun main() {
    var userInput: Int
    do {
        print(message = "Please enter 10: ")
        userInput = readln().toInt()
    } while (userInput != 10)
}