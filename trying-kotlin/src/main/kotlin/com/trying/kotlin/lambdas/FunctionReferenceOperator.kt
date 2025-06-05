package com.trying.kotlin.lambdas

fun main() {
    // Storing a reference of displayHelloWorld() function into a variable
    val displayHelloWorldFunction = ::displayHelloWorld
    displayHelloWorldFunction()
}

private fun displayHelloWorld() {
    println(message = "Hello world!")
}