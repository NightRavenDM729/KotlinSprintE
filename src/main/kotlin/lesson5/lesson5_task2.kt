package lesson5

import java.util.*

fun main() {

    println("Enter your birth year:")

    val userBirthYear = readLine()!!.toInt()
    val userAge = Calendar.getInstance().weekYear - userBirthYear

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Show screen with restricted content"
    } else if (userAge == 16 || userAge == 17) {
        "Show screen with limited content"
    } else {
        "Return to Home screen"
    }

    println(resultText)
}

const val AGE_OF_MAJORITY = 18