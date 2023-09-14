package lesson5

fun main() {

    println("Welcome!\nWe are glad to see you at our lottery!")
    println("Winning numbers are between 1 and 100")
    println("You will need to match 2 numbers to win the main prize!")

    println("Enter the first number:")
    val userNumber1 = readln().toInt()
    println("Enter the second number:")
    val userNumber2 = readln().toInt()

    val numbersToWin = intArrayOf(39, 45)

    if (userNumber1 in numbersToWin && userNumber2 in numbersToWin) {
        println("You won the main prize! Congratulations!")
    } else if (userNumber1 in numbersToWin || userNumber2 in numbersToWin) {
        println("You won a consolation prize!")
    } else {
        println("Failure! Spin the wheel!")
    }

    println("Winning numbers were: ${numbersToWin.contentToString()}")

}