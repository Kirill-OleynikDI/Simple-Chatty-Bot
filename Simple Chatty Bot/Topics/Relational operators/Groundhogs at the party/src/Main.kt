fun main() {
    val penautButter = readln().toInt()
    val isWeekend = readln().toBoolean()

    if (isWeekend == true){
        var result = penautButter <= 25 && penautButter >= 15
        println(result)
    }
        else{
            var result2 = penautButter <= 20 && penautButter >=10
            println(result2)
    }

}