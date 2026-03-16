package oop_117367_danielkurniag.week07

class Weapon private constructor(val items: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon{
            return Weapon(GameItem("Splintered Wooden Sword", 5, ItemRarity.COMMON), 50)
        }
        fun forgeEpicSword(): Weapon{
            return Weapon(GameItem("Heaven's Gate", 50, ItemRarity.RARE), 500)
        }
    }
}