package oop_117367_danielkurniag.week06

interface Camera {
    fun turnOn(){
        println("Camera opened and sensor active.")
    }
}

interface Phone{
    fun turnOn(){
        println("Searching for cell signal...")
    }
}