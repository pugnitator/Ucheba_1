package lesson6

fun main() {

    print("Какое кол-во секунд нужно засечь: ")
    val numberOfSeconds = readln().toIntOrNull()

    if (numberOfSeconds == null) {
        println("Введено некорректное значение. Начните заново.")
        return
    } else Thread.sleep((numberOfSeconds * 1000).toLong())
    println("Прошло $numberOfSeconds секунд.")
}