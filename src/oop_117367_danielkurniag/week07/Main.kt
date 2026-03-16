package oop_117367_danielkurniag.week07

import oop_117367_danielkurniag.week02.isAlive

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

    println("\n=== DATA CLASS TEST ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Are they the same? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Copy result: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName is $userAge years old")

    println("\n=== SEALED CLASS TEST ===")
    val response: ApiResponse = ApiResponse.Success("Data successfully obtained")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Show ${response.data}"
        is ApiResponse.Error -> "Show ${response.message}"
        is ApiResponse.Loading -> "Loading..."
    }

}