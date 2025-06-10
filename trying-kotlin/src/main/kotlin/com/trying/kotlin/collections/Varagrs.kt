package com.trying.kotlin.collections

@Suppress("SameParameterValue")
private fun sumAll(vararg numbers: Int): Int {
    return numbers.sum()
}

fun main() {
    val array = intArrayOf(10, 20, 40, 50)
    print(message = sumAll(numbers = array))
}