fun main() {
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()

    val result = number1 >= number2 && number1 <= number3 || number1 >= number3 && number1 <= number2
    println(result)
}