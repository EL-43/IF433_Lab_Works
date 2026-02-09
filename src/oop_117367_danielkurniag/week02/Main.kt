package oop_117367_danielkurniag.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- UMN PMB ---")

    println("Enter Name: ")
    val name = scanner.nextLine()

    print("Enter NIM (must be 5 characters): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Enrollment cancelled, NIM must be 5 characters!")
    }

    print("Choose route (1. Regular, 2. General): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Enter Major: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Enrolled in ${s1.major} with starting GPA ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(name, nim)
        println("Enrolled in ${s2.major} with starting GPA ${s2.gpa}")
    } else {
        println("Invalid choice! enrollment cancelled.")
    }


}
