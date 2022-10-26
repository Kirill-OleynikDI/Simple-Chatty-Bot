fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    var i = 0
    var result = 0
    for(i in a..b){
        if(i % n == 0){
            result += 1
        }
    }
    println(result)
}