package com.trying.kotlin.lambdas

fun main() {
    display { "Hello world!" }
}

private fun display(message: () -> String) {
    println(message = message())
}