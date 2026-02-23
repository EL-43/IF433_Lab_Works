package oop_117367_danielkurniag.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
    override fun work() {
        println("$name is programming in $programmingLanguage")
    }
}