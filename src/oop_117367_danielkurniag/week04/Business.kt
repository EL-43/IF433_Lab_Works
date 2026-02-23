package oop_117367_danielkurniag.week04

fun main (){
    val manager = Manager("Dante", 500000)
    val developer = Developer("Faust", 200000, "C++")

    manager.work()
    println(manager.calculateBonus())
    developer.work()
    println(developer.calculateBonus())
}