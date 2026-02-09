package oop_117367_danielkurniag.week02

fun attack(name: String, targetName: String) = "$name attacks $targetName!"

fun takeDamage(hp: Int, damage: Int) = hp - damage

fun isAlive(hp: Int, boolean: Boolean) =
    if (hp > 0) true
    else false

fun main(){

}