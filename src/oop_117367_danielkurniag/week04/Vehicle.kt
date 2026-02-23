package oop_117367_danielkurniag.week04

open class Vehicle(val brand: String){
    var speed: Int = 0

    open fun accelerate() {
        speed +=10
        println("$brand accelerates. Speed: $speed km/hr")
    }

    open fun honk(){
        println("Honk Honk!")
    }
}