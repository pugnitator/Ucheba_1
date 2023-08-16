package lesson2

fun main() {
    val numberOfPermanentStaff = 50
    val numberOfInterns = 30
    val numberOfAllEmployee = numberOfPermanentStaff + numberOfInterns
    val employeeSalary = 30000
    val internSalary = 20000
    val monPermanentStaffSalaryExpenses = numberOfPermanentStaff * employeeSalary
    val monInternsSalaryExpenses = numberOfInterns * internSalary
    val monSalaryExpenses = monPermanentStaffSalaryExpenses + monInternsSalaryExpenses
    val averageSalary = monSalaryExpenses / numberOfAllEmployee

    println(
        """
        Расходы на выплату зарплаты постоянных сотрудников: $monPermanentStaffSalaryExpenses.
        Общие расходы по ЗП после прихода стажеров: $monSalaryExpenses.
        Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary.""".trimIndent()
    )


}