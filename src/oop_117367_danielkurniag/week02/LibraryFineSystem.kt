package oop_117367_danielkurniag.week02

class Loan (
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
)

fun calculateFine(loanDuration: Int) =
    if (loanDuration > 3)
        (loanDuration - 3) * 2000
    else
        0

fun main(){
    val fineSystem = Loan("Moby Dick", "Ishmael", 67)
    val denda = calculateFine(fineSystem.loanDuration)
    print("Final fee is: $denda")
}