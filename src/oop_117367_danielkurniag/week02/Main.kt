package oop_117367_danielkurniag.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- UMN PMB ---")

    println("Enter Name: ")
    val name = scanner.nextLine()

    print("Enter NIM (must be 5 characters): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5){
        println("ERROR: Enrollment cancelled, NIM must be 5 characters!")
    } else {
        print("Enter Major: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Enrollment finished.")
    }
}