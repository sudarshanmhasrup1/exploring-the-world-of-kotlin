package com.trying.kotlin.functions

@Suppress("SameParameterValue")
private fun sendMail(
    senderEmailAddress: String,
    receiverEmailAddress: String,
    message: String
) {
    println(message = "Email from: $senderEmailAddress.")
    println(message = "Email to: $receiverEmailAddress.")
    println(message = "With message: $message")
    println(message = "Have been sent successfully!")
}

fun main() {
    sendMail(
        senderEmailAddress = "sudarshanmhasrup@gmail.com",
        receiverEmailAddress = "johndoe@gmail.com",
        message = "Good morning John!"
    )
}