package oop_117367_danielkurniag.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (SmartDevice in devices) {
            when (SmartDevice) {
                is Switchable -> {
                    SmartDevice.turnOff()
                }
            }
        }
    }
}
