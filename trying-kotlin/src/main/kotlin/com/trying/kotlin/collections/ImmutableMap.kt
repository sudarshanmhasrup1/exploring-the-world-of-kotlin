package com.trying.kotlin.collections

fun main() {
    val users = mapOf(
        "user1" to "Jake",
        "user2" to "Julie",
        "user3" to "James"
    )

    users.forEach {
        println("${it.key}: ${it.value}.")
    }
}