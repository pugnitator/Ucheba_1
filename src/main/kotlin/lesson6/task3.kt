package lesson6

fun main() {

    print("Какое кол-во секунд нужно засечь: ")
    var numberOfSeconds = readln().toIntOrNull()

    if (numberOfSeconds == null) {
        println("Введено некорректное значение. Начните заново.")
        return
    } else {
        while (numberOfSeconds > 0) {
            println("Осталось секунд: $numberOfSeconds")
            Thread.sleep(1000)
            numberOfSeconds--
        }
    }
    println("Время вышло.")
}

