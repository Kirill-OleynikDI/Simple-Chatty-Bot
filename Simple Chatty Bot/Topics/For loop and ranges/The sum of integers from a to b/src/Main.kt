fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    var i = 0
    var result = 0
    for(i in a..b){
        result += i
    }
    println(result)
}