package lesson3

fun main() {

    val chessMoveData = "D2-D4;0"

    val fromPosition = chessMoveData.split("-", ";")[0]
    val toPosition = chessMoveData.split("-", ";")[1]
    val moveNumber = chessMoveData.split("-", ";")[2]

    println(fromPosition)
    println(toPosition)
    println(moveNumber)

}