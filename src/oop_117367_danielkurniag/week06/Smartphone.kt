package oop_117367_danielkurniag.week06

class Smartphone : Camera, Phone{
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Smartphone OS booted successfully.")
    }
}