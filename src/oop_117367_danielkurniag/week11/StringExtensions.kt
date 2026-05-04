package oop_117367_danielkurniag.week11

fun String.addGreeting(): String {
    return "hello, $this"
}

fun String.repeatTimes(n : Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}