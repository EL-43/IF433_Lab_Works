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