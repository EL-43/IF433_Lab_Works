package oop_117367_danielkurniag.week08

class ApiParser{
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        try {
            val parsedID = requireNotNull(rawJson["id"] as? String){
               "ERROR: ID must not be null"
            }
            val parsedName = requireNotNull(rawJson["name"] as? String){
                "ERROR: Name must not be null"
            }
            val type = requireNotNull(rawJson["type"] as? String){
                "ERROR: Type must not be null"
            }
            when (type){
                "ELECTRONIC" ->{
                    val parsedWarranty = requireNotNull(rawJson["warranty"] as? Int ?: 12)
                    return Electronic(parsedID, parsedName, parsedWarranty)
                }
                "CLOTHING" ->{
                    val parsedSize = requireNotNull(rawJson["size"] as? String ?: "All Size")
                    return Clothing(parsedID, parsedName, parsedSize)
                }
            }
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
        return null
    }

}
