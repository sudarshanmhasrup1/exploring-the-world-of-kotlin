package com.trying.kotlin.oop

private data class User(
    val username: String,
    val firstName: String,
    val lastName: String,
    val emailAddress: String
)

private val userList = listOf(
    User(
        username = "johndoe",
        firstName = "John",
        lastName = "Doe",
        emailAddress = "johndoe@gmail.com"
    ),
    User(
        username = "joeljack",
        firstName = "Joel",
        lastName = "Jack",
        emailAddress = "joeljack@gmail.com"
    ),
    User(
        username = "marshsteve",
        firstName = "Marsh",
        lastName = "Steve",
        emailAddress = "marshsteve@gmail.com"
    ),
    User(
        username = "juliewilliams",
        firstName = "Julie",
        lastName = "Williams",
        emailAddress = "juliewilliam@gmail.com"
    )
)

fun main() {
    println(message = "List of users: \n")
    userList.forEach { user ->
        // Using destructuring declaration
        val (username, firstName, lastName, emailAddress) = user

        println(message = "Username: $username.")
        println(message = "Name: $firstName $lastName.")
        println(message = "Email: $emailAddress.")
        println()
    }
}