package lesson4

fun main() {

    val dayOfTraining = 5

    val armTraining = dayOfTraining % 2 != 0
    val legTraining = dayOfTraining % 2 == 0
    val backTraining = dayOfTraining % 2 == 0
    val absTraining = dayOfTraining % 2 != 0



    println("""
        Упражнения для рук: $armTraining
        Упражнения для ног: $legTraining
        Упражнения для спины: $backTraining
        Упражнения для пресса: $absTraining
        
               
    """.trimIndent())

}