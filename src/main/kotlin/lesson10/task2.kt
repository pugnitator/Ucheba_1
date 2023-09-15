package lesson10

fun main() {

    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()

    checkTheLengthOfTheString(login, password)
}

fun checkTheLengthOfTheString(inputLogin: String, inputPassword: String) {
    if ((inputLogin.length < MIN_LOG_AND_PASSWORD_LENGTH) || (inputPassword.length < MIN_LOG_AND_PASSWORD_LENGTH))
        println("Логин или пароль недостаточно длинные.")
    else println("Добро пожаловать!")
}

const val MIN_LOG_AND_PASSWORD_LENGTH = 4
