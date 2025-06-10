package com.trying.kotlin.collections

fun main() {
    val solarSystem = mutableSetOf("Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Sun", "Saturn", "Uranus", "Neptune")

    solarSystem += "Pluto"

    println("Solar System Planets:")
    for (planet in solarSystem) {
        println(planet)
    }
}
