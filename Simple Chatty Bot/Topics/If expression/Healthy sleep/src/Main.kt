fun main() {    
    val A = readln().toInt()
    val B = readln().toInt()
    val H = readln().toInt()
    if ( H >= A && H <= B) {
        println("Normal")
    } else if (H < A) {
        println("Deficiency")
    } else {
        println("Excess")
    }
}