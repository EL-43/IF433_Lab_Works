package oop_117367_danielkurniag.week07

fun main() {
    println("=== SINGLETON TEST ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== COMPANION OBJECT TEST ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== REGULAR CLASS TEST ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Are they the same? ${reg1 == reg2}")
}