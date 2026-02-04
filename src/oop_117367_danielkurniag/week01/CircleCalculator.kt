package oop_117367_danielkurniag.week01

fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"

fun main(args: Array<String>) {
// Variable definition
    val radius = 7.0
    val pi = 3.14
// Calculation
    val area: Double = pi * radius * radius

// Output Concatenation
    println("Radius: $radius, Area: $area")
// Logic check
    println(checkSize(area))
}