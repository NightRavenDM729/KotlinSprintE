package lesson4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "Winter"

fun main() {

    val isWeatherSunnyCurrent: Boolean = true
    val isAwningOpenCurrent: Boolean = true
    val airHumidityCurrent: Int = 20
    val seasonCurrent: String = "Winter"

    println("Благоприятные ли условия сейчас для роста бобовых?" +
            " ${(IS_SUNNY == isWeatherSunnyCurrent) &&
                (IS_AWNING_OPEN == isAwningOpenCurrent) &&
                (AIR_HUMIDITY == airHumidityCurrent) && 
                (UNFAVORABLE_SEASON != seasonCurrent)}")
}