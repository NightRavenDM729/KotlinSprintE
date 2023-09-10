package lesson3

fun main() {

    val chessMoveData = "D2-D4;0"

    val fromPosition = chessMoveData.subSequence(0,2)
    val toPosition = chessMoveData.subSequence(3,5)
    val moveNumber = chessMoveData.subSequence(6,7)

    println(fromPosition)
    println(toPosition)
    println(moveNumber)

}