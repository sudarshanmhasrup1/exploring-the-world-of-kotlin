package com.trying.kotlin.collections

fun main() {
    val randomNumberList = mutableListOf<Int>()

    repeat(times = 10) {
        val randomNumber = (0..100).random()
        randomNumberList.add(element = randomNumber)
    }

    print(message = "Generated list: ")
    println(message = randomNumberList.joinToString(separator = ", ", postfix = "."))
}