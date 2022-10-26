fun main() {
    val numberOfParts = readln().toInt()
    var largerPart = 0
    var smallerPart = 0
    var perfectPart = 0
    repeat(numberOfParts){
        val parts = readln().toInt()
        if (parts == 0){
            perfectPart += 1
        }else if (parts == 1){
            largerPart += 1
        }else if (parts == -1){
            smallerPart += 1
        }
    }
    println("$perfectPart $largerPart $smallerPart")
}