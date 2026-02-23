package oop_117367_danielkurniag.week04

open class Car (brand: String, open val numberOfDoors: Int): Vehicle(brand){
    fun openTrunk(){
        println("Trunk of $brand with $numberOfDoors doors has been opened.")
    }
    override fun honk(){
        println("Honk Honk! $brand coming through!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand Car uses gearshift to accelerate faster.")
    }
}