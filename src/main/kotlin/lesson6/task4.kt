package lesson6

fun main() {

    val randomNumber = (1..9).random()
    var numberOfAttempts = 5
    println(randomNumber)

    do {
        numberOfAttempts--
        print("Угадайте число от 1 до 9: ")
        val inputNumber = readln().toIntOrNull()

        if ((inputNumber == null) || (inputNumber !in 1..9)) {
            println("Введено некорректное значение, начните заново.")
            return
        }

        if ((numberOfAttempts == 0) && (inputNumber != randomNumber)) {
            println("\nБыло загадано число $randomNumber.")
            return
        } else if (inputNumber == randomNumber) println("\nЭто была великолепная игра!")
        else println("\nНеверно, попробуйте ещё раз, осталось попыток: $numberOfAttempts")

    } while ((inputNumber != randomNumber) && (numberOfAttempts != 0))

}