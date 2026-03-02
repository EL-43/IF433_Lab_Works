package oop_117367_danielkurniag.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("$nama sedang menyiapkan materi perkulaiah dan RPKPS.")
    }

    fun mengajar(){
        println("$nama mengajar mahasiswa di kelas.")
    }

}

