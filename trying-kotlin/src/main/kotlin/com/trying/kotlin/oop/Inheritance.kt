package com.trying.kotlin.oop

@Suppress("Unused")
open class SmartDevice(
    private val name: String,
    private val category: String
) {
    var deviceStatus = "Online"
        protected set

    open fun turnOn() {
        deviceStatus = "On"
        println(message = "$name is turned on.")
    }

    open fun turnOff() {
        deviceStatus = "Off"
        println(message = "$name is turned off.")
    }
}

// IS-A relationship
class SmartTvDevice(
    name: String,
    category: String
) : SmartDevice(
    name = name,
    category = category
) {
    private var speakerVolume = 1
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    private var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println(message = "Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println(message = "Channel number increased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println(message = "Speaker volume is set to $speakerVolume and channel is set to $channelNumber.")
    }
}

// IS-A relationship
class SmartLightDevice(
    name: String,
    category: String
) : SmartDevice(
    name = name,
    category = category
) {
    private var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness() {
        brightnessLevel++
        println(message = "Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {
        brightnessLevel = 2
        super.turnOn()
        println(message = "The brightness level is: $brightnessLevel.")
    }

    override fun turnOff() {
        brightnessLevel = 0
        super.turnOff()
    }
}

// HAS-A relationship
@Suppress("Unused")
class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {
    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}

fun main() {
    val smartDevice = SmartDevice(name = "Android Phone", category = "Entertainment")
    smartDevice.turnOn()
    println(message = "Device status: ${smartDevice.deviceStatus}")
    smartDevice.turnOff()
    println(message = "Device status: ${smartDevice.deviceStatus}")
    println()

    val smartTv = SmartTvDevice(name = "Android TV", category = "Entertainment")
    smartTv.turnOn()
    smartTv.turnOff()
    println()

    val smartLight = SmartLightDevice(name = "Google Light", category = "Utility")
    smartLight.turnOn()
    smartLight.turnOff()
    println()

    val mySmartHome = SmartHome(smartTvDevice = smartTv, smartLightDevice = smartLight)
    mySmartHome.turnOnTv()
    mySmartHome.turnOnLight()
    println(message = "Total turned on devices: ${mySmartHome.deviceTurnOnCount}.")
    mySmartHome.turnOffAllDevices()
    println(message = "Total turned on devices: ${mySmartHome.deviceTurnOnCount}.")
}