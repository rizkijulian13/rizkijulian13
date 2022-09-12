fun main(){
    println("Masukkan nama anda ")
    val nama: String? = readLine()

    println("Masukkan bilangan 1 : ")
    val satu = readLine()!!.toDouble()
    println("Masukkan bilangan 2 : ")
    val dua = readLine()!!.toDouble()

    var tambah : Double = satu + dua
    var kurang : Double = satu - dua
    var kali : Double = satu * dua
    var bagi : Double = (satu / dua)

    println("Nama lengkap kamu adalah : $nama")

    println("hasil operator tambah : $tambah")
    println("hasil operator kurang : $kurang")
    println("hasil operator kali : $kali")
    println("hasil operator bagi : $bagi")
}