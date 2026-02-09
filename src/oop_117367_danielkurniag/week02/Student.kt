package oop_117367_danielkurniag.week02

class Student(val name: String, val nim: String, var major: String, val gpa: Double = 0.0) {
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated"){
        println("LOG: MENGGUNAKAN CONSTRUCTOR JALUR UMUM (TANPA JURUSAN)")
    }
    init {
        if (nim.length != 5) {
            println("WARNING: Object with NIM ($nim) is invalid!")
            println("Student data under name $name might cause issues in the system.")
        } else{
            println("LOG: Object student under name $name, and NIM $nim successfully allocated in memory.")
        }
    }
}