package oop_117367_danielkurniag.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}