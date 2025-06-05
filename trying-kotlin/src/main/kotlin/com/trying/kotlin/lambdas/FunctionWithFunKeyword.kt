package com.trying.kotlin.lambdas

fun main() {
    greet()
}

val greet = {
    println(message = "Good morning!")
}