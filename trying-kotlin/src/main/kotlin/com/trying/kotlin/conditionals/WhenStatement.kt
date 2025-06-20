package com.trying.kotlin.conditionals

@Suppress("KotlinConstantConditions")
fun main() {
    val trafficLightColor = "Red"

    when (trafficLightColor) {
        "Red" -> {
            println(message = "Stop")
        }
        "Yellow", "Amber" -> {
            println(message = "Slow")
        }
        "Green" -> {
            println(message = "Go")
        }
        else -> {
            println(message = "Invalid color.")
        }
    }
}