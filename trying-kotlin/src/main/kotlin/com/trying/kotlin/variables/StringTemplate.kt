package com.trying.kotlin.variables

@Suppress("ConvertToStringTemplate")
fun main() {
    val fullName = "Sudarshan Mhasrup"

    // Dumb way to print full name
    println(message = "My name is " + fullName + ".")

    // Smart way to print full name
    println(message = "My name is $fullName.")
}