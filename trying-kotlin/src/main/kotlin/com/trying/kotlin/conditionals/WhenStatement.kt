package com.trying.kotlin.conditionals

fun main() {
    val trafficLightColor = "Red"

    when (trafficLightColor) {
        "Red" -> {
            println(message = "Stop")
        }
        "Yello", "Amber" -> {
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