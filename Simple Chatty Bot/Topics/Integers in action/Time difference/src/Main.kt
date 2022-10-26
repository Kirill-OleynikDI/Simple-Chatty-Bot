fun main() {

    var hour1 = readln().toInt()
    var minutes1 = readln().toInt()
    val seconds1 = readln().toInt()
    hour1 *= 3600
    minutes1 *= 60
    val amountOfFirstTime: Int = hour1 + minutes1 + seconds1

    var hour2 = readln().toInt()
    var minutes2 = readln().toInt()
    val seconds2 = readln().toInt()
    hour2 *= 3600
    minutes2 *= 60
    val amountOfSecondTime: Int = hour2 + minutes2 + seconds2

    val differenceBetweenTimes: Int = amountOfSecondTime - amountOfFirstTime
    println(differenceBetweenTimes)

}