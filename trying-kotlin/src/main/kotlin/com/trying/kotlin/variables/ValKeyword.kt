package com.trying.kotlin.variables

fun main() {
    // Immutable variables
    val username = "sudarshanmhasrup"
    val gender = "Male"
    val firstName = "Sudarshan"
    val lastName = "Mhasrup"
    val age = 21

    val message = """
        Username: $username.
        Full name: $firstName $lastName.
        Gender: $gender.
        Age: $age years.
    """.trimIndent()
    println(message = message)
}