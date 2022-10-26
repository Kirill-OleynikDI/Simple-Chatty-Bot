fun main() {
    val x = readln().toInt()
    if (x % 2 == 0){
        println("EVEN")
    }else if( x % 2 == 1 || x % 2 == -1){
        println("ODD")
    }
}