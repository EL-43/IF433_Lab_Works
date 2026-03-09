package oop_117367_danielkurniag.week06

fun main(){
    val ruangTamu = SmartLamp()
    val googleNestDapur = SmartSpeaker()
    val evizGarasi = SmartCCTV()
    val hub = SmartHomeHub()
    hub.addDevice(ruangTamu)
    hub.addDevice(googleNestDapur)
    hub.addDevice(evizGarasi)
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}