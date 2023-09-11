package lesson4

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100

fun main() {

    val cargoWeight1 = 20
    val cargoVolume1 = 80

    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Груз с весом $cargoWeight1 кг и объемом $cargoVolume1 л соответствует категории 'Average': " +
            "${(cargoWeight1 >= MIN_WEIGHT_AVERAGE) && (cargoWeight1 <= MAX_WEIGHT_AVERAGE) && (cargoVolume1 < MAX_VOLUME_AVERAGE)}")
    println("Груз с весом $cargoWeight2 кг и объемом $cargoVolume2 л соответствует категории 'Average': " +
            "${(cargoWeight2 >= MIN_WEIGHT_AVERAGE) && (cargoWeight2 <= MAX_WEIGHT_AVERAGE) && (cargoVolume2 < MAX_VOLUME_AVERAGE)}")

}