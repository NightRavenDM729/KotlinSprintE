package lesson2

import kotlin.math.pow

fun main() {

    val moneyInDeposit = 70000.0
    val percentageOfDeposit = 16.7
    val yearsOfDeposit = 20

    val depositSum = moneyInDeposit * (1 + 0.01 * percentageOfDeposit).pow(yearsOfDeposit)

    println(String.format("%.3f", depositSum))
}