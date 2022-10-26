fun main() {
    val numberOfElements = readln().toInt()
    val four = 4
    var max = 0
    repeat(numberOfElements){
        val nextNumber = readln().toInt()
        if(nextNumber % four == 0 && max < nextNumber){
            max = nextNumber
        }
    }
    println(max)
}