package lesson1

fun main() {

    val secondsTotal = 6480
    val seconds = secondsTotal % 60
    val minutesTotal = secondsTotal / 60
    val minutes = minutesTotal % 60
    val hours = minutesTotal / 60
    val formatted = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formatted)
}