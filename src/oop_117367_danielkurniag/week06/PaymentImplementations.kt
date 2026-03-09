package oop_117367_danielkurniag.week06

class Gopay : PaymentMethod{
    override fun pay(amount: Double) {
        println("Processing Rp.$amount via Gopay")
    }
}

class CreditCard : PaymentMethod{
    override fun pay(amount: Double) {
        println("Processing Rp.$amount via Bank Credit Card")
    }
}