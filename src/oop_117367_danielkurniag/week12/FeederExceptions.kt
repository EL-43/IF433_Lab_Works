package oop_117367_danielkurniag.week12

sealed class FeederException(msg: String) : Exception(msg)

class FoodEmptyException(requested: Int, available: Int) : FeederException("Not enough kibble! requested $requested grams, but only $available grams avilable")

class DispenserJamException: FeederException("Dispenser is jammed!")