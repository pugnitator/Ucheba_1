package lesson6

fun main() {

    print("Придумайте логин: ")
    val login = readln().toString()
    print("Придумайье пароль: ")
    val password = readln().toString()

    println("\nПройдите авторизацию для логина $login.")
    var attemptCounter = 3

    do {
        if (attemptCounter in 1 until 3) println(
            "\nПароль был введен неверно, попробуйте ещё раз. " +
                    "Попыток остлось: $attemptCounter"
        )
        if (attemptCounter == 0) {
            println("\nПопыток для ввода пароля не осталось, " +
                    "восстановите пароль или пройдите регистрацию заново.")
            return
        }
        print("Введите пароль: ")
        val theEnteredPassword = readln().toString()
        attemptCounter--
    } while (theEnteredPassword != password)

    println("Авторизация прошла успешно!")

}