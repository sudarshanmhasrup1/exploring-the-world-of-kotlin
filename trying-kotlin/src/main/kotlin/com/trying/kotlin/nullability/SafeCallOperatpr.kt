package com.trying.kotlin.nullability

@Suppress(
    "UNNECESSARY_SAFE_CALL",
    "VariableInitializerIsRedundant",
    "VARIABLE_WITH_REDUNDANT_INITIALIZER"
)
fun main() {
    var username: String? = null
    username = "sudarshanmhasrup"
    println(message = username?.length) // Safe call operator
}