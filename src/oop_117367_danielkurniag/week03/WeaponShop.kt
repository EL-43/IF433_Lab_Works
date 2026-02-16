package oop_117367_danielkurniag.week03

fun main(){
    val w = Weapon()
    w.damage = -50
    println("Damage is ${w.damage}")
    println("Weapon is ${w.tier} Tier!")

    w.damage = 50000
    println("Damage is ${w.damage}")
    println("Weapon is ${w.tier} Tier!")
}