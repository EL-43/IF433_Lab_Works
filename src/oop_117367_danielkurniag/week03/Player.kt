package oop_117367_danielkurniag.week03

class Player {
    var username = String
    private var xp : Int = 0
    var level : Int = 0
        get() {
            return (xp / 100) + 1
        }
    var amount = 0
    fun addXp(amount: Int) {
        var currentLevel = level
        if(amount < 0) {
            println("ERROR! XP added cannot be negative!")
        } else{
            xp += amount
        }
        if (level > currentLevel) {
            println("Level up! $username has levelled up to level $level")
        }
    }
}