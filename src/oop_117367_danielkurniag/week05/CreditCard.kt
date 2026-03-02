package oop_117367_danielkurniag.week05

class CreditCard(val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod("Bobert") {
    override fun processPayment(amount: Double) {
        if ((usedAmount + amount) < limit) {
            usedAmount += amount
            println("Amount added to card.")
            println("Transaction successful.")
        } else if ((usedAmount + amount) > limit) {
            println("ERROR: Would go over card limit! Transaction denied.")
        }
    }
}