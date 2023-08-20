package lesson4

fun main() {
    val bookedTableToday = 13
    val bookedTableTomorrow = 4

    println("Доступность столиков на сегодня: ${bookedTableToday < TOTAL_TABLES}")
    println("Доступность столиков на завтра: ${bookedTableTomorrow < TOTAL_TABLES}")
}

const val TOTAL_TABLES = 13