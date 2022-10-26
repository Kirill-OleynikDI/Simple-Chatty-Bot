fun main() {
    val ch1: Char = readln().first()
    val ch2: Char = readln().first()
    val ch3: Char = readln().first()

    val result = ch2 + 1 == ch3 && ch3 - 2 == ch1

    println(result)
}