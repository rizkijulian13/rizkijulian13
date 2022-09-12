// if
// if else
fun main() {
    println("MASUKAN NILAI UAS")
    val UAS:Int = readLine()!!.toInt()
    println("MASUKAN NILAI UTS")
    val UTS:Int = readLine()!!.toInt()
    val NA:Double = (0.4 * UTS) + (0.6 * UAS)

    if(NA > 80){
        print("SELAMAT NAIK SEMESTER")
    }else{
        print("Kamu Tidak Lulus DAN kamu HARUS CUTI SEMESTER")
    }
}
// if else if
// when = switch


