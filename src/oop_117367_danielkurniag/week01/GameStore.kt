package oop_117367_danielkurniag.week01

fun calculateDiscount(price: Int) : Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title : String, finalPrice: Int, userNote : String?) = println("Title: $title\nPrice: $finalPrice\nNote: ${userNote?: "Tidak ada catatan."}")

fun main(){
    //declarations
    val gameTitle = "Library Of Ruina"
    val price = 50000
    val userNote : String? = "congrats"
    val finalPrice = price - calculateDiscount(price)

    //call printreceipt
    printReceipt(title = gameTitle, finalPrice = finalPrice, userNote = userNote)
}