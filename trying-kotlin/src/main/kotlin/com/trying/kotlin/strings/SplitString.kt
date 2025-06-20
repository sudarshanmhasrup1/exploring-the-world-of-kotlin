package com.trying.kotlin.strings

fun main() {
    val listOfStudent = "Sudarshan, Rahul, Rohit, Brohit, Virat, Jasprit".split(", ")
    listOfStudent.forEach {
        println(message = it)
    }
}