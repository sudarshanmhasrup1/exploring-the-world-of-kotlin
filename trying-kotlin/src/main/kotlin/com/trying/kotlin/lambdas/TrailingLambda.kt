package com.trying.kotlin.lambdas

fun main() {
    display { "Hello world!" }
}

fun display(message: () -> String) {
    println(message = message())
}