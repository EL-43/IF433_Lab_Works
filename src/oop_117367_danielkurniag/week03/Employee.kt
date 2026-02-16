package oop_117367_danielkurniag.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value)  {
            println("Mencoba set gaji ke $value")
            //WARNING, THE CODE BELOW IS DANGEROUS
            this.salary = value
        }
}