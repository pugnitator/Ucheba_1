package lesson5

fun main() {

    print("Введите год вашего рождения: ")
    val yearOfBirth = readln().toIntOrNull()
    val thisYear = 2023

    if (yearOfBirth == null) println("Вы ввели неверное значение. Начните сначала.")

    val userAge = (thisYear - (yearOfBirth ?: return))

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом.")
    else if (userAge in MIN_AGE_FOR_LIMITED_CONTENT until AGE_OF_MAJORITY)
        println("Показать экран с ограниченным контентом.")
    else println("Доступ к скрытому контенту запрещён.")
}

const val AGE_OF_MAJORITY = 18
const val MIN_AGE_FOR_LIMITED_CONTENT = 16