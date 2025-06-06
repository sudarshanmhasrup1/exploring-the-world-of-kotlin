package com.trying.kotlin.lambdas

fun main() {
    calculate(expression = { 40 + 20 })
}

private fun calculate(expression: () -> Any) {
    val result = expression()
    println(message = result)
}