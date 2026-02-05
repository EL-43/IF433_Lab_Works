package oop_117367_danielkurniag.week01

fun calculateDiscount(price: Int) : Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title : String, finalPrice: Int) = println("Title: $title\nPrice: $finalPrice")

fun main(){
    //declarations
    val gameTitle = "Library Of Ruina"
    val price = 50000

    val finalPrice = price - calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice)


//println(calculateDiscount(price))

//println("Price: $finalPrice")
//  println(printReceipt(gameTitle, $finalPrice))

}