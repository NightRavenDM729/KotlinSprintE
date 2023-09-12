package lesson4

const val IS_SHIP_DAMAGED = false
const val MIN_CREW_ON_BOARD = 55
const val MAX_CREW_ON_BOARD = 70
const val MIN_PROVISION = 50
const val IS_WEATHER_FAVORABLE = true

fun main() {

    println("Is there any damage to the ship? true/false")
    val isShipDamagedNow = readln().toBoolean()
    println("What is the size of your crew?")
    val crewOnBoard = readln().toInt()
    println("How many crates of provision do you have?")
    val provisionCrates = readln().toInt()
    println("Is the weather favorable for traveling now? true/false")
    val isCurrentWeatherFavorable = readln().toBoolean()

    val conditionsForSail =
            (isShipDamagedNow == IS_SHIP_DAMAGED) &&
            (crewOnBoard > MIN_CREW_ON_BOARD) &&
            (crewOnBoard < MAX_CREW_ON_BOARD) &&
            (provisionCrates > MIN_PROVISION) &&
            (isCurrentWeatherFavorable == IS_WEATHER_FAVORABLE)

    val alternativeConditionsForSail =
            (isShipDamagedNow != IS_SHIP_DAMAGED) &&
            (crewOnBoard == MAX_CREW_ON_BOARD)
            (provisionCrates > MIN_PROVISION) &&
            (isCurrentWeatherFavorable == IS_WEATHER_FAVORABLE)

    val messageOnStatus = if (conditionsForSail || alternativeConditionsForSail)
    {"Your ship is ready to sail!"} else
    {"Your ship is not ready to sail, check that your ship meets the required values"}

    println(messageOnStatus)

}