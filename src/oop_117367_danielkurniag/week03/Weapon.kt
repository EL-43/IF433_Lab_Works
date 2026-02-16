package oop_117367_danielkurniag.week03

class Weapon {
    private val name: String = "Sword of Destiny"
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR, damage cannot be negative. Damage set to 0")
                field = 0
            } else if (value > 1000) {
                println("ERROR, damage too high! setting damage to max (1000)")
                field = 1000
            } else {
                field = value
            }
        }
    var tier: String = ""
        get() {
            if(damage > 800) return "Legendary"
            else if(damage > 500) return "Epic"
            else return "Common"
        }
}