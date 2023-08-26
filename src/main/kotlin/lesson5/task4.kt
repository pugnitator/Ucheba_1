package lesson5

fun main() {
    print("Введите логин для входа в систему: ")
    val login = readln().toString()

    if (login != USER_LOGIN) {
        println("Пользователь с таким логином не найден, повторите попытку или пройдите регистрацию.")
        return
    }

    print("Введите пароль: ")
    val password = readln().toString()

    if (password == USER_PASSWORD) println("Добро пожаловать!")
    else println("Пароль неверный.")
}

const val USER_LOGIN = "Zaphod"
const val USER_PASSWORD = "PanGalactic"