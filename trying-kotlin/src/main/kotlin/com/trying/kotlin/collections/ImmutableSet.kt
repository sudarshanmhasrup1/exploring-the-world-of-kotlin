package com.trying.kotlin.collections

fun main() {
    val solarSystem = setOf("Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Sun", "Saturn", "Uranus", "Neptune")

    println("Solar System Planets:")
    for (planet in solarSystem) {
        println(planet)
    }
}
