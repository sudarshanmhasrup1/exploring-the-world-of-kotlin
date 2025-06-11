package com.trying.kotlin.nullability

@Suppress("UNNECESSARY_SAFE_CALL", "VariableInitializerIsRedundant")
fun main() {
    var username: String? = null
    username = "sudarshanmhasrup"
    println(message = username?.length) // Safe call operator
}