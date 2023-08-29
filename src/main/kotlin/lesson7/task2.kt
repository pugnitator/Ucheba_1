package lesson7

fun main() {

    do {
        val code = (1000..9999).random().toString()
        println("Ваш код авторизации: $code")

        print("Введите код авторизации: ")
        val inputCode = readln()

        if (inputCode == code) println("Добро пожаловать!")
        else println("Код введён неверно, вам будет направлен новый код.\n")

    } while (inputCode != code)

}