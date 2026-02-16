package oop_117367_danielkurniag.week03

fun main(){
    val e = Employee("Budi")
    println("--- test error ---")
    e.salary = 5000 //this will blow up
}