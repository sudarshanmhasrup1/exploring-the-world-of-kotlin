package com.trying.kotlin.oop

private enum class Gender {
    MALE,
    Female,
    Unspecified
}

fun main() {
    println(message = Gender.entries)
}