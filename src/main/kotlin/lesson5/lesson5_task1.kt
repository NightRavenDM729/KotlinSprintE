package lesson5

fun main() {

    val firstNumber = 4
    val secondNumber = 7

    println("To log in solve the task below:")
    println("$firstNumber + $secondNumber")


    val usersAnswerToLogIn = readln().toInt()
    val rightAnswerToLogIn = firstNumber + secondNumber

    if (usersAnswerToLogIn == rightAnswerToLogIn) {
        println("Successfully! Welcome!")
    } else {
        println("Unsuccessful! Try again, please!")
    }
}