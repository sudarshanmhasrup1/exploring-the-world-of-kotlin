package com.trying.kotlin.strings

import java.util.UUID

private val usedIdList = mutableListOf<String>()

fun main() {
    val message = buildString {
        repeat(times = 20) {
            val randomId = UUID.randomUUID().toString()
            append("Hello from random person with id: $randomId")
            appendLine("!")
        }
    }

    println(message = message)
}