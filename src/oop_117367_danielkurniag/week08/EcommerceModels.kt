package oop_117367_danielkurniag.week08

sealed class Product

data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()

data class Clothing(val id: String, val name: String, val size: String) : Product()