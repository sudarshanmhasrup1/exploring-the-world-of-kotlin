package com.trying.kotlin.oop

@Suppress("UnusedReceiverParameter")
val Human.name: String
    get() = "Joel"

fun main() {
    val joel = Human()
    println(message = joel.name)
}