fun main() {
    val galacticEmpireShips = readln().toInt()
    val rebelAlliance = readln().toInt()
    val differenceBetweenShips: Int
    differenceBetweenShips = galacticEmpireShips / rebelAlliance
    println(differenceBetweenShips)
}