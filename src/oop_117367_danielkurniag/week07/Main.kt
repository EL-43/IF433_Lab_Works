package oop_117367_danielkurniag.week07

fun main() {
    println("=== SINGLETON TEST ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== COMPANION OBJECT TEST===")
    val client = NetworkClient.createClient()
    client.connect()
}