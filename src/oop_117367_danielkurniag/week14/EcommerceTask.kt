package oop_117367_danielkurniag.week14
import java.io.File


interface OrderRepository{
    fun saveOrder(outputFile: File, itemName: String, basePrice: Double)
}

class CsvOrderRepository : OrderRepository{
    override fun saveOrder(outputFile: File, itemName: String, basePrice: Double) {
        outputFile.writer().use { writer ->
            writer.append("$itemName,$basePrice\n")
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

interface PricingStrategy{
    fun calculate(price: Double): Double
}

class VipPricing : PricingStrategy{
    override fun calculate(price: Double) : Double = price * 0.90
}

class RegularPricing : PricingStrategy{
    override fun calculate(price: Double) : Double = price
}

class SafeOrderProcessor(val repo: OrderRepository, val notifier: NotificationService){
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String, strategy: PricingStrategy){
        val finalPrice = strategy.calculate(basePrice)
        println("Processing $itemName with price $finalPrice")
        repo.saveOrder(file, itemName, finalPrice)
        notifier.sendNotification(itemName)
    }
}