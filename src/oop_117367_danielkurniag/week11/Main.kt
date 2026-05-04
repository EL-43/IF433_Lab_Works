package oop_117367_danielkurniag.week11

fun main(){
    println("==== TEST EXTENSION FUNCTIONS ====")
    println("Alex".addGreeting())
    println("Hi".repeat(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}
