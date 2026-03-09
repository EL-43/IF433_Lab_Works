package oop_117367_danielkurniag.week06

class SmartCCTV : SmartDevice, Switchable, Recordable {
    override val id: String = "01"
    override val name: String = "SmartLamp"
    override fun turnOn() {
        println("$name with id $id turned on")
        fun startRecord() {
            println("$name with id $id starting recording")
        }
    }
    override fun turnOff() {
        println("$name with id $id turned off")
    }
    override fun startRecord() {

    }
}