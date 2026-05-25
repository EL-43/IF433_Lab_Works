package oop_117367_danielkurniag.week14
import oop_117367_danielkurniag.week08.Order
import java.io.File

class BadOrderProcessor{
    //VIOLATION: Hardcoded File I/O (DIP), runs calculations + I/O + notifs all in one class
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String){

        //VIOLATION: hard to edit if a customer type / new discount is added in the future (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        //VIOLATION SRP/DIP: writes file to business class directly
        file.appendText("$itemName, $finalPrice, $customerType\n")

        //VIOLATION SRP/DIP: notifications are tied strongly to the order system
        println("Email terkirim: Pesanan $itemName anda telah dikonfirmasi.")
    }
}
