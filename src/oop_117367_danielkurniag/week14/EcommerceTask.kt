package oop_117367_danielkurniag.week14
import java.io.File


interface OrderRepository{
    fun saveOrder(outputFile: File, itemName: String, basePrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository{
    override fun saveOrder(outputFile: File, itemName: String, basePrice: Double, customerType: String) {
        outputFile.writer().use { writer ->
            writer.append("$itemName,$basePrice,$customerType \n")
        }
    }
}

interface NotificationService{
    fun sendNotification(itemName: String)
}

class EmailNotifier: NotificationService{
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan anda $itemName telah dikirim.")
    }
}

class SafeOrderProcessor(val repo: OrderRepository, val notifier: NotificationService){
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String){
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        repo.saveOrder(file, itemName, basePrice, customerType)
        notifier.sendNotification(itemName)
    }
}