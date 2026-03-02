package oop_117367_danielkurniag.week05

class EWallet(var balance: Double) : PaymentMethod("Bob") {
    override fun processPayment(amount: Double) {
        if (balance > amount){
            balance -= amount
            println("Balance subtracted successfully.")
            println("Current balance: $balance.")
        } else {
            println("Not enough balance.")
        }
    }
    fun topUp(amount: Double) {
        balance += amount
        println("Balance added successfully.")
        println("Current balance: $balance.")
    }
}