fun main() {
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()

    val result = number1 in number2..number3
    println(result)
}