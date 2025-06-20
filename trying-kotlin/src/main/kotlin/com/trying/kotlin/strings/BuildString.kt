package com.trying.kotlin.strings

import java.util.UUID

fun main() {
    val message = buildString {
        repeat(times = 20) {
            val randomId = UUID.randomUUID().toString()
            append("Hello from random person with id: $randomId")
            appendLine(value = "!")
        }
    }

    println(message = message)
}