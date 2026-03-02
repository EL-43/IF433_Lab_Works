package oop_117367_danielkurniag.week05

fun main(){
    val eWallet = EWallet(50000.0)
    val creditCard = CreditCard(100000.0)

    val paymentList: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (paymentMethod in paymentList) {
        paymentMethod.processPayment(75000.0)
    }
}