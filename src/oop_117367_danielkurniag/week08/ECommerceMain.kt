package oop_117367_danielkurniag.week08

fun main(){
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()
    for (raw in rawApiData){
        try {
            val parsedData = parser.parseProduct(raw)
            parsedData?.let { product ->
                when (product) {
                    is Electronic ->{
                        println("Electronic ID: ${product.id}, Name: ${product.name}, Warranty (in months): ${product.warrantyMonths}")
                        parser.checkout(product)
                    }
                    is Clothing ->{
                        println("Clothing ID: ${product.id}, Name: ${product.name}, Size: ${product.size}")
                        parser.checkout(product)
                    }
                }
            }
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}