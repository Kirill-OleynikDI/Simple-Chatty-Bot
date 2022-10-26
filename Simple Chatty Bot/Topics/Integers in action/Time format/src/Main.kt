fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val endOfDaysSeconds: Long
    endOfDaysSeconds = totalSeconds % 86400
    val hours: Int = (endOfDaysSeconds / 3600).toInt()
    val hoursOstatok: Int = (endOfDaysSeconds % 3600).toInt()
    val minutes: Int = (hoursOstatok / 60)
    val minutesOstatok: Int = (hoursOstatok % 60)
    val seconds: Int = (minutesOstatok % 60)
    println("$hours:$minutes:$seconds")

}