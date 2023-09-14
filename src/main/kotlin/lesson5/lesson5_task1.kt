package lesson5

fun main() {

    println("To log in solve the task below:\n7 + 4 = ?")

    val usersAnswerToLogIn = readln().toInt()
    val rightAnswerToLogIn = 11

    if (usersAnswerToLogIn == rightAnswerToLogIn) {
        println("Successfully! Welcome!")
    } else {
        println("Unsuccessful! Try again, please!")
    }
}