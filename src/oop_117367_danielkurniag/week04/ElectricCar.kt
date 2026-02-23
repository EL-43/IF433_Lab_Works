package oop_117367_danielkurniag.week04

class ElectricCar (brand: String, override val numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand accelerates quietly. Battery capacity: $batteryCapacity%.")
    }
}