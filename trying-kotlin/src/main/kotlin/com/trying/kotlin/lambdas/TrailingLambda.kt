package com.trying.kotlin.lambdas

private fun display(message: () -> String) {
    println(message = message())
}

fun main() {
    display { "Hello world!" }
}