fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    var x = 0
    for(x in 1..1000){
        if (a * (x * x * x) + b * (x * x) + c * x + d == 0){
            println(x)
        }
    }
}