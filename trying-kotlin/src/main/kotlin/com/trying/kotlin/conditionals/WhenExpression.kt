package com.trying.kotlin.conditionals

fun main() {
    val trafficLightColor = "Red"

    val message = when (trafficLightColor) {
        "Red" -> "Stop"
        "Yello", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid color."
    }

    println(message = message)
}