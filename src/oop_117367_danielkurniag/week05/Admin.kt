package oop_117367_danielkurniag.week05

class Admin(nama: String) : Pegawai(nama){
    override fun bekerja() {
        println("$nama sedang melayani administrasi.")
    }

    fun doAdminWork() {
        println("$nama sedang merekap data absensi mahasiswa.")
    }
}