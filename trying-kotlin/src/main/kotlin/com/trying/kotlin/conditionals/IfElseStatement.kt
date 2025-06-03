package com.trying.kotlin.conditionals

@Suppress("SameParameterValue")
private fun checkShopAvailability(hour: Int): String {
    return if (hour >= 10 && hour <= 17) {
        "The shop is currently open."
    } else {
        "The shop is currently closed."
    }
}

fun main() {
    val shopAvailability = checkShopAvailability(hour = 14)
    println(message = shopAvailability)
}