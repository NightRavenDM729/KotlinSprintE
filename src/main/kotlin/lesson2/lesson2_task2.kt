package lesson2

fun main() {

    val workersQuantity = 50
    val workersSalary = 30000
    val internsQuantity = 30
    val internsSalary = 20000

    val salaryExpensesWorkers = workersQuantity * workersSalary
    val salaryExpensesInterns = internsQuantity * internsSalary
    val salaryExpensesTotal = salaryExpensesWorkers + salaryExpensesInterns

    val averageSalaryTotal = salaryExpensesTotal / (workersQuantity + internsQuantity)

    println(salaryExpensesWorkers)
    println(salaryExpensesTotal)
    println(averageSalaryTotal)

}