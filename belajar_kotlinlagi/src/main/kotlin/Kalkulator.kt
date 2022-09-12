fun main() {
    try {
        print("Masukkan angka pertama: ")
        val angka1 = readLine()!!.toDouble()
        print("Masukkan angka kedua: ")
        val angka2 = readLine()!!.toDouble()
        print("Masukkan angka ketiga: ")
        val angka3 = readLine()!!.toDouble()
        print("Masukkan aksi operasi - Tambah(a), Kurang(b), Perkalian(c), Pembagian (d): ")
        when (readLine()) {
            "a" -> {
                print("Hasil = ${angka1+angka2+angka3}")
            }
            "b" -> {
                print("Hasil = ${angka1-angka2+angka3}")
            }
            "c" -> {
                print("Hasil = ${angka1*angka2+angka3}")
            }
            "d" -> {
                print("Hasil = ${angka1/angka2+angka3}")
            }
            else -> {
                print("Operasi yang dimasukkan tidak valid")
            }
        }
    } catch (e: Exception){
        print("Angka yang dimasukkan tidak valid")
    }
}