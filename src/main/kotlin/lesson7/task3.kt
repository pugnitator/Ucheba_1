package lesson7

fun main() {

    print("Введите число: ")
    val firstNumber = 0
    val lastNumber = readln().toIntOrNull()

    if (lastNumber == null) {
        println("Введено некорректное значение. Начните заново.")
        return
    } else for (i in firstNumber..lastNumber step 2) println(i)
}