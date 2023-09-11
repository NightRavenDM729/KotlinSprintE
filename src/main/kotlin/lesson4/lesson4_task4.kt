package lesson4

fun main() {

    val dayOfTraining = 5

    val isArmAbsDayToday = dayOfTraining % 2 == 1

    println("""
        Упражнения для рук: $isArmAbsDayToday
        Упражнения для ног: ${!isArmAbsDayToday}
        Упражнения для спины: ${!isArmAbsDayToday}
        Упражнения для пресса: $isArmAbsDayToday     
                      
            """.trimIndent())
}