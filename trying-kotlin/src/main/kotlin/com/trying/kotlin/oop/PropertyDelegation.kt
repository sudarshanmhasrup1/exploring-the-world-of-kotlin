package com.trying.kotlin.oop

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

private class PropertyDelegator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {
    private var fieldData = initialValue

    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): Int {
        return fieldData
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: Int
    ) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}

fun main() {
    var currentChannel by PropertyDelegator(initialValue = 0, minValue = 0, maxValue = 100)

    repeat(times = 102) {
        println(message = "Increasing the current channel by 1.")
        currentChannel++
        println(message = "The current channel is: $currentChannel.\n")
    }

    repeat(times = 102) {
        println(message = "Decreasing the current channel by 1.")
        currentChannel--
        println(message = "The current channel is: $currentChannel.\n")
    }
}