fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val result = a > 0 && b <= 0 && c <=0 || a <= 0 && b > 0 && c <= 0 || a <= 0 && b <= 0 && c >0
    println(result)
}