package com.trying.kotlin.lambdas

private fun calculate(expression: () -> Any) {
    val result = expression()
    println(message = result)
}

fun main() {
    calculate(expression = { 40 + 20 })
}