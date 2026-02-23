package oop_117367_danielkurniag.week04

fun main(){
    println("--vehicle testing--")
    val generalVehicle = Vehicle("Toyota Corolla")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--car testing--")
    val myCar = Car("1984 Toyota Corolla", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}