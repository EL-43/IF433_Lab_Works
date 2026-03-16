package oop_117367_danielkurniag.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame(){
        when (isGameRunning) {
            true -> {println("Game already running! Preventing multiple instances.")}
            false -> {isGameRunning = true
                println("Starting game engine...")
            }
        }
    }
}