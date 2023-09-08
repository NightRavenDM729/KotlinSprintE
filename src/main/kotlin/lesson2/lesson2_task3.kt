package lesson2

fun main() {

    val departureHour = 9
    val departureMinutes = 39

    val tripTime = 457
    val tripHours = tripTime / 60
    val tripMinutes = tripTime % 60

    val arrivalHour = departureHour + tripHours + (departureMinutes + tripMinutes) / 60
    val arrivalMinutes = (departureMinutes + tripMinutes) % 60


    println("$arrivalHour:$arrivalMinutes")

}