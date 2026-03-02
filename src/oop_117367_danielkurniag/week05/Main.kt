package oop_117367_danielkurniag.week05

fun main(){
    val dosen1 = Dosen("Pak Tatang", "0123456")
    val admin1 = Admin("Bu Dewi")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("==== KEGIATAN PEGAWAI ====")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when(pegawai){
            is Dosen -> {
                println("==> Terdeteksi sebagai Dosen dengan NIDN ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is Admin -> {
                println("===> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------------")
    }
}