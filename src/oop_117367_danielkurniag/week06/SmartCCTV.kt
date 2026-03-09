package oop_117367_danielkurniag.week06

class SmartCCTV : SmartDevice, Switchable, Recordable {
    override val id: String = "03"
    override val name: String = "SmartCCTV"
    override fun startRecord(){
        println("$name with id $id starting recording")
    }
    override fun turnOn() {
        println("$name with id $id turned on")
        startRecord()
    }
    override fun turnOff() {
        println("$name with id $id turned off")
    }
}