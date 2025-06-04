package com.trying.kotlin.nullability

@Suppress("UNNECESSARY_SAFE_CALL", "VariableInitializerIsRedundant")
fun main() {
    var username: String? = null
    username = "sudarshanmhasrup"
    println(username?.length) // Safe call operator
}