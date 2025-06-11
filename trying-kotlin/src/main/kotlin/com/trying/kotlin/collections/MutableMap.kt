package com.trying.kotlin.collections

fun main() {
    val users = mutableMapOf(
        "user1" to "Jake",
        "user2" to "Julie",
        "user3" to "James"
    )

    users.put(key = "user4", value = "Jimmy")

    users.forEach {
        println("${it.key}: ${it.value}.")
    }
}