package oop_117367_danielkurniag.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

class BankAccount(var balance: Double){
    fun withdraw(amount: Double){
        if (amount < 0){
            throw IllegalArgumentException("Amount must be positive")
        }
        if (amount > balance){
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}

fun main(){
    println("==== TEST MULTIPLE CATCH ====")
    val account = BankAccount(100.0)
    try {
        account.withdraw(150.0)
    } catch (e: InsufficientFundsException) {
        println("Caught Domain Error: insufficient funds ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Caught Argument Error: invalid input ${e.message}")
    } catch (e: Exception) {
        println("Caught General Exception: unexpected error")
    }
}