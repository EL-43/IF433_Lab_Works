package oop_117367_danielkurniag.week12

fun dispenseKibble(requestedGrams: Int, availableGrams: Int, isJammed: Boolean): Int {
    require(requestedGrams > 0) { "Requested Grams must be > 0 grams" }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGrams > availableGrams) {
        throw FoodEmptyException(requestedGrams, availableGrams)
    }
    println("Kibble dispensed!")
    return availableGrams - requestedGrams
}

fun main(){
    var currentKibbleStock = 50
    try {
        dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println("Caught Dispenser Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Caught Food Error: ${e.message}")
    } catch (e: Exception) {
        println("Caught Generic Exception: ${e.message}")
    } finally {
        println("Dispenser checks finished.")
    }

    runCatching { dispenseKibble(30, 100, false) }.onSuccess {
        newStock->
        currentKibbleStock = newStock
        println("Dinner successfully dispensed! Current Kibble is $currentKibbleStock grams")
    }.onFailure {
        error->
        println("Reminder ${error.message}")
    }
}