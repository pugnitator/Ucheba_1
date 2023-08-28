package lesson6

fun main() {

    var numberOfAttempts = 3

    do {
        numberOfAttempts--
        val number1 = (1..9).random()
        val number2 = (1..9).random()

        val captchaRightAnswer = number1 + number2

        print("Решите уровнение: $number1 + $number2. Ответ (введите целое число): ")
        val enteredValue = readln().toIntOrNull()

        if (enteredValue == null) {
            println("Вы ввели не целое число, начните заново.")
            return
        }

        if (enteredValue == captchaRightAnswer) println("\nДобро пожаловать!")
        else if (numberOfAttempts != 0) println("\nПопробуйте ещё раз. Попыток осталось: $numberOfAttempts")
        else println("\nДоступ запрещён.")

    } while ((enteredValue != captchaRightAnswer) && (numberOfAttempts != 0))
}