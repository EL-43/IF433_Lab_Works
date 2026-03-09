package oop_117367_danielkurniag.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("The OLED screen shows 15:14 WIB")
    }

    override fun connectToBluetooth() {
        println("Searching for devices to pair with...")
    }

    override fun chargeBattery() {
        println("Charging with 15W of power.")
    }
}