package oop_117367_danielkurniag.week08

fun main(){
    println("==== TEST SAFE CALLS & ELVIS ====")
    val emptyOrder = Order(null, null)
    //chain elegant safe calls.

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}