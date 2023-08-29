package lesson7

fun main() {

    print("Какое кол-во секунд нужно засечь: ")
    val numberOfSeconds = readln().toIntOrNull()

    if (numberOfSeconds == null) {
        println("Введено некорректное значение. Начните заново.")
        return
    } else {
        for (i in numberOfSeconds downTo 1) {
            println(i)
            Thread.sleep(1000)
        }
    }
    println("Время вышло.")
}