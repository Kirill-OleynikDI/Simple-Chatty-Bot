fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var max = 0
    if (a < b){
        max = b
    }
    if (b < a){
        max = a
    }

    if(a == b){
        max = a
    }
    println(max)
}