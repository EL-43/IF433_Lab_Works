package oop_117367_danielkurniag.week03

fun main(){
    val e = Employee("Budi")

    // 1. Test salary validation, top should print error
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()

    // 3. Test Computed Property
    println("Pajak yang harus dibayar ${e.tax}")
}