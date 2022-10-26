fun main() {
    val symbol1: Char = readln().first()
    val symbol2: Char = readln().first()
    val symbol3: Char = readln().first()
    val symbol4: Char = readln().first()

    val isSymbol1IsADigit1 = symbol1.isDigit()
    val isSymbol1IsADigit2 = symbol2.isDigit()
    val isSymbol1IsADigit3 = symbol3.isDigit()
    val isSymbol1IsADigit4 = symbol4.isDigit()

    println(isSymbol1IsADigit1)
    println(isSymbol1IsADigit2)
    println(isSymbol1IsADigit3)
    println(isSymbol1IsADigit4)
}