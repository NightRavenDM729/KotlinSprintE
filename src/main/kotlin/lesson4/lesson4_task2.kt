package lesson4

fun main() {

    val minWeightAverage = 35
    val maxWeightAverage = 100
    val maxVolumeAverage = 100

    val cargoWeight1 = 20
    val cargoVolume1 = 80

    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Груз с весом $cargoWeight1 кг и объемом $cargoVolume1 л соответствует категории 'Average': " +
            "${(cargoWeight1 >= minWeightAverage) && (cargoWeight1 <= maxWeightAverage) && (cargoVolume1 < maxVolumeAverage)}")
    println("Груз с весом $cargoWeight2 кг и объемом $cargoVolume2 л соответствует категории 'Average': " +
            "${(cargoWeight2 >= minWeightAverage) && (cargoWeight2 <= maxWeightAverage) && (cargoVolume2 < maxVolumeAverage)}")

}