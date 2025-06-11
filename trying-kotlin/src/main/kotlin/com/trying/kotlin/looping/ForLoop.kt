package com.trying.kotlin.looping

fun main() {
    var sum = 0
    for (i in 1..100) {
        val currentSumValue = sum
        sum += i
        println(message = "$i + $currentSumValue = $sum")
    }
}