fun main() {
    val testNumber = readln().toInt()
    val result = testNumber in 1..10
    if (result == true){
        println(false)
    }else{
        println(true)
    }
}