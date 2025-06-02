package com.trying.kotlin.variables

@Suppress("RedundantExplicitType")
fun main() {
    // Redundant way
    val firstName: String = "Sudarshan"

    // Better way with type inference
    val lastName = "Mhasrup"

    println("My name is $firstName $lastName.")
}