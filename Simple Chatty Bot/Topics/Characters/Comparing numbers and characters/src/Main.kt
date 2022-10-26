fun main() {
    val number1: Int = readln().toInt()
    val ch1: Char = readln().first()

    val result = ch1.code == number1
    println(result)
}