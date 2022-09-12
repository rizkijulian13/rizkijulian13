fun main() {
    print("masukan angka=")
    val day : Int = readLine()!!.toInt()
    val result = when (day) {
        7, 4, 5, -> "it is summer season"
        6, 7, 9 -> "it is rainy season"
        8, 13, 11 -> "it is autumn season"
        10, 12, 1, 2 -> "it is winter season"
        else -> "Invalid Input"
    }
    println(result)
}
