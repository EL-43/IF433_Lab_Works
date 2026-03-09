package oop_117367_danielkurniag.week06

interface Clickable {
    val name : String
    fun click()
}

class Button (override val name: String) : Clickable {
    override fun click() {
        println("Button $name clicked.")
    }
}