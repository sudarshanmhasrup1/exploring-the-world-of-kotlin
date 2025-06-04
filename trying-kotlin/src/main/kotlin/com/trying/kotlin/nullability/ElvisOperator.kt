package com.trying.kotlin.nullability

@Suppress("KotlinUnreachableCode")
fun main() {
    var name: String? = "Sudarshan"
    println(message = "Hello from $name.")

    name = null
    println(message = "Hello from ${name ?: "Unknown"}.") // Providing default value for name variable when it's null
}