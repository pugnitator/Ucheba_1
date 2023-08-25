package lesson6

fun main() {

    print("Придумайте логин: ")
    val login = readln().toString()
    print("Придумайье пароль: ")
    val password = readln().toString()

    println("\nПройдите авторизацию.")
    var attemptCounter = 0

    do {
        if (attemptCounter in 1 until NUMBER_OF_ATTEMPTS) println(
            "\nЛогин и/или пароль были введены неверно, попробуйте ещё раз. " +
                    "Попыток остлось: ${NUMBER_OF_ATTEMPTS - attemptCounter}"
        )
        if (attemptCounter == 3) {
            println("\nПопыток для ввода авторизационных данных не осталось, " +
                    "восстановите пароль или пройдите регистрацию заново.")
            return
        }
        print("Введите логин: ")
        val theEnteredLogin = readln().toString()
        print("Введите пароль: ")
        val theEnteredPassword = readln().toString()
        attemptCounter += 1
    } while ((theEnteredLogin != login) || (theEnteredPassword != password))

}

const val NUMBER_OF_ATTEMPTS = 3