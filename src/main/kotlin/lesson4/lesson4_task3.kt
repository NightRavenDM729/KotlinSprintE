package lesson4

fun main() {

    val favorableWeatherIsSunny = true
    val openTentStatus = true
    val airHumidity = 20
    val unfavorableSeason = "Winter"

    val currentWeatherIsSunny: Boolean = true
    val currentOpenTentStatus: Boolean = true
    val currentAirHumidity: Int = 20
    val currentSeason: String = "Winter"




    println("Благоприятные ли условия сейчас для роста бобовых?" +
            " ${(favorableWeatherIsSunny == currentWeatherIsSunny) &&
            (openTentStatus == currentOpenTentStatus) &&
            (airHumidity == currentAirHumidity) &&
            (currentSeason != unfavorableSeason)}")

}