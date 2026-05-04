package oop_117367_danielkurniag.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Phillips WiZ Living Room", "Lighting").apply{
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera Terhubung")
        homeDevices.add(it)
    }
}