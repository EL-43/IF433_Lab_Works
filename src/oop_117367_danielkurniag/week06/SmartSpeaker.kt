package oop_117367_danielkurniag.week06

class SmartSpeaker : SmartDevice, Switchable {
    override val id: String = "02"
    override val name: String = "SmartSpeaker"
    override fun turnOn() {
        println("$name with id $id turned on")
    }
    override fun turnOff() {
        println("$name with id $id turned off")
    }

    fun playMusic(song: String){
        println("$name playing $song from Spotify")
    }
}