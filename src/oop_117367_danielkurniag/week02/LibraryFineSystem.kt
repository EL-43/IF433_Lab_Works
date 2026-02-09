package oop_117367_danielkurniag.week02

import java.util.Scanner

fun calculateFine(loanDuration: Int) =
    if (loanDuration > 3)
        (loanDuration - 3) * 2000
    else
        0

fun main(){
    //scanner in
    val scanner = Scanner(System.`in`)

    println("Enter Book Title: ")
    val bookTitle = scanner.nextLine()

    print("Enter Borrower Name: ")
    val borrower = scanner.next()
    scanner.nextLine()

    print("Enter Duration of borrowing: ")
    var borrowDuration = scanner.nextInt()
    scanner.nextLine()

    if (borrowDuration < 0) {
       borrowDuration = 1
    }

    val loan = Loan(bookTitle, borrower, borrowDuration)
    val denda = calculateFine(loan.loanDuration)
    println("Detail Pemesanan: \nJudul: ${loan.bookTitle}\nPeminjam: ${loan.borrower}\nLama Peminjaman: ${loan.loanDuration}")
    println("Final fee is: $denda")
}