package com.trying.kotlin.functions

private fun display(
    message: String,
    from: String
) {
    println(message = "Message: $message")
    println(message = "From: $from.")
}

fun main() {
    // Function call without named argument
    display("Hey! How you doing?", "Sudarshan")

    // Function call with named arguments
    display(message = "Hey! what's up?", from = "John doe")
}