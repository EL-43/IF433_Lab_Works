package oop_117367_danielkurniag.week11

fun String.addGreeting(): String {
    return "hello, $this"
}

fun String.repeatTimes(n : Int): String {
    return this.repeat(n)
}