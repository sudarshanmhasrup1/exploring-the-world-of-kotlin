package com.trying.kotlin.functions

private fun addition(
    firstNumber: Int,
    secondNumber: Int
): Int {
    return firstNumber + secondNumber
}

fun main() {
    val result1 = addition(firstNumber = 20, secondNumber = 40)
    println(message = "The addition of 20 and 40 is: $result1.")

    val result2 = addition(firstNumber = 40, secondNumber = 80)
    println(message = "The addition of 40 and 80 is: $result2.")
}