package com.trying.kotlin.collections

private fun prettyPrint(
    title: String,
    list: List<String>
) {
    print(message = "$title: ")
    println(message = "${list.joinToString(separator = ", ")}.")
}

fun main() {
    val userList = listOf("Jack", "James", "Joel", "Joe", "Julie", "John")
    prettyPrint(title = "Revered list", list = userList.reversed())
    prettyPrint(title = "Sorted list", list = userList.sorted())
}