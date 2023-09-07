package lesson2

import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {

    val moneyInDeposit = 70000.0
    val percentageOfDeposit = 16.7
    val yearsOfDeposit = 20

    val depositSum = moneyInDeposit * (1 + 0.01 * percentageOfDeposit).pow(yearsOfDeposit)
    val roundedDepositSum = (depositSum * 1000).roundToInt() / 1000.0

    println(roundedDepositSum)
}