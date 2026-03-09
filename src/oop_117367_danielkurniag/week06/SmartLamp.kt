package oop_117367_danielkurniag.week06

class SmartLamp: SmartDevice, Switchable{
    override val id: String = "01"
    override val name: String = "SmartLamp"
    override fun turnOn() {
        println("$name with id $id turned on")
    }
    override fun turnOff() {
        println("$name with id $id turned off")
    }
}