package oop_117367_danielkurniag.week04

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary) {
    override fun work() {
        println("$name is leading a meeting.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}