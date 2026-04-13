package oop_117367_danielkurniag.week08

fun main(){
    println("==== TEST SAFE CALLS & ELVIS ====")
    val emptyOrder = Order(null, null)
    //chain elegant safe calls.

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n==== TEST LET BLOCK ====")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price ->
        //this piece of code will ONLY run if totalPrice isn't null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid. Harga belum di-set!"

    println(receipt)
    println("\n==== TEST SAFE CASTING ====")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )
    for (item in mixedData){
        val text = item as? String

        //only prints if cast is done successfully (not null text)
        text?.let{
            println("Found text: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100 //original type of Int
    //try to cast it to a string.
    //if it fails (null), replace with "Unknown String"
    val safeString = someObject as? String?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    println("\n==== TEST THE RED BUTTON (!!) ====")
    val toxicData: String? = null
    try {
        //DANGEROUS! Forces the compiler to believe this data isn't null
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("NPE CRASH! Jangan gunakan !! secara sembarangan.")
    }

    val apiResponse : Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        //apiResponse["token"]
        val token = requireNotNull(apiResponse["token"]) {
            "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalArgumentException) {
        print(e.message) //prints custom error message, not a blind crash
    }

    println("\n==== TEST JAVA INTEROPERABILITY ====")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    // we use !! because we KNOW that the Java implementation is safe.
    val statusLength = javaResponse!!.length
    println("Status dari java: $javaResponse (Length: $statusLength)")

    runMockUnitText()
}