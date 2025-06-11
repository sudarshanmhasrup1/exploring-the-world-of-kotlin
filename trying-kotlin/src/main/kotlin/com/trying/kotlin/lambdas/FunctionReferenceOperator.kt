package com.trying.kotlin.lambdas

private fun displayHelloWorld() {
    println(message = "Hello world!")
}

fun main() {
    // Storing a reference of displayHelloWorld() function into a variable
    val displayHelloWorldFunction = ::displayHelloWorld
    displayHelloWorldFunction()
}