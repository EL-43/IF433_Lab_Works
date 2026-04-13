package oop_117367_danielkurniag.week08

fun main(){
    println("==== TEST SAFE CALLS & ELVIS ====")
    val emptyOrder = Order(null, null)
    //chain elegant safe calls.

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n==== TEST LET BLOCK ====")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price ->
        //this piece of code will ONLY run if totalPrice isn't null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid. Harga belum di-set!"

    println(receipt)
    println("\n==== TEST SAFE CASTING ====")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null)
        "Laptop",
        4500000.0
    )
    for (item in mixedData){
        val text = item as? String

        //only prints if cast is done successfully (not null text)
        text?.let{
            println("Found text: ${it.uppercase()}")
        }
    }
}