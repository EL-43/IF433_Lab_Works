package oop_117367_danielkurniag.week12

fun main(){
    println("==== TEST RUNCATCHING ====")
    val result : Result<Int> = runCatching {
        "42X".toInt()
    }
}