fun main() {
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()

    val result = number1 + number2 == 20 || number1 + number3 == 20 || number2 + number3 == 20
    println(result)
}