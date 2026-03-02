package oop_117367_danielkurniag.week05

class MathHelper {
    fun hitungLuas(sisi: Int): Int{
        val hasil = sisi * sisi
        return hasil
    }
    fun hitungLuas(panjang: Int, lebar: Int): Int{
        val hasil = panjang * lebar
        return hasil
    }
    fun hitungLuas(jariJari: Double): Double{
        val hasil = jariJari * jariJari * 3.14
        return hasil
    }
}