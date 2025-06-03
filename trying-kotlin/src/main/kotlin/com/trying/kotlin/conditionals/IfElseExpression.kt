package com.trying.kotlin.conditionals

@Suppress("CascadeIf")
fun main() {
    val trafficLightColor = "Red"

    val message = if (trafficLightColor == "Red") {
        "Red"
    } else if (trafficLightColor == "Yellow" || trafficLightColor == "Amber") {
        "Yellow"
    } else if (trafficLightColor == "Green") {
        "Green"
    } else {
        "Invalid color"
    }

    println(message = message)
}