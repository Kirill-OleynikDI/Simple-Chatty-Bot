fun main() {
    var positive = 0
    val numberOfElements = readln().toInt()
    repeat(numberOfElements){
        val number = readln().toInt()
        if(number > 0){
            positive += 1
        }
    }
    println(positive)
}