fun main() {
    val threeDigitInteger = readln().toInt()
    val aTest : Int = threeDigitInteger/10
    val b : Int = aTest/10
    val c : Int = aTest%10
    val d : Int = threeDigitInteger % 10
    val result : Int = b + c + d
    println(result)
}