package lesson6

fun main() {

    print("Какое кол-во секунд нужно засечь: ")
    val numberOfSeconds = readln().toIntOrNull()
    var totalIteration = numberOfSeconds

    if (totalIteration == null) {
        println("Введено некорректное значение. Начните заново.")
        return
    } else {
        while (totalIteration > 0) {
            totalIteration--
            Thread.sleep(1000)
        }
    }
    println("Прошло $numberOfSeconds секунд.")
}