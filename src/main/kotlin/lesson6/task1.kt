package lesson6

fun main() {

    print("Придумайте логин: ")
    val login = readln().toString()
    print("Придумайье пароль: ")
    val password = readln().toString()

    println("\nПройдите авторизацию для логина $login.")
    var attemptCounter = 0

    do {
        if (attemptCounter in 1 until NUMBER_OF_ATTEMPTS) println(
            "\nПароль был введен неверно, попробуйте ещё раз. " +
                    "Попыток остлось: ${NUMBER_OF_ATTEMPTS - attemptCounter}"
        )
        if (attemptCounter == 3) {
            println("\nПопыток для ввода пароля не осталось, " +
                    "восстановите пароль или пройдите регистрацию заново.")
            return
        }
        print("Введите пароль: ")
        val theEnteredPassword = readln().toString()
        attemptCounter += 1
    } while (theEnteredPassword != password)

    println("Авторизация прошла успешно!")

}

const val NUMBER_OF_ATTEMPTS = 3