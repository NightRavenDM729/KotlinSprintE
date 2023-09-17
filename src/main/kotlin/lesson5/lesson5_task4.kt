package lesson5

fun main() {

    println("Welocme, stranger!\nPlease, enter your Username:")
    val username = readln()

    if (username == AUTHORIZED_USER_NAME) {
        println("Enter passowrd:")
        val userPassword = readln()
        if (userPassword == AUTHORIZED_USER_PASSWORD) {
            println("Welcome back, $AUTHORIZED_USER_NAME $AUTHORIZED_USER_PASSWORD!")
        } else {
            println("Wrong passowrd!")
        }
    } else {
        println("Please, sign up to continue")
    }

}

const val AUTHORIZED_USER_NAME = "Patrick"
const val AUTHORIZED_USER_PASSWORD = "Star"