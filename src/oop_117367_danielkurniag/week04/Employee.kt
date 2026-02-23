package oop_117367_danielkurniag.week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work(){
        println("$name is working.")
    }

    open fun calculateBonus(): Int{
        return baseSalary / 10
    }
}