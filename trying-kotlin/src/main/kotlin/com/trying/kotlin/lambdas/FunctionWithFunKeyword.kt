package com.trying.kotlin.lambdas

fun main() {
    greet()
}

private val greet = {
    println(message = "Good morning!")
}