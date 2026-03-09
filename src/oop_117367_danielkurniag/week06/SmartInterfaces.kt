package oop_117367_danielkurniag.week06

interface SmartDevice{
    val id: String
    val name: String
}

interface Switchable{
    fun turnOn()
    fun turnOff()
}

interface Recordable{
    fun startRecord()
    fun stopRecord(){
        println("Recording stopped and sent to Cloud.")
    }
}