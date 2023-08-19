package lesson4

fun main() {
    val totalTables = 13
    val bookedTableToday = 13
    val bookedTableTomorrow = 4

    println("Доступность столиков на сегодня: ${bookedTableToday < totalTables}")
    println("Доступность столиков на завтра: ${bookedTableTomorrow < totalTables}")
}