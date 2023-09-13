package lesson10

fun main() {

    println("Введите логин: ")
    val login = checkTheLengthOfTheString()

    println("Введите пароль: ")
    val password = checkTheLengthOfTheString()
}

fun checkTheLengthOfTheString(): String {

    val inputString = readln()
    if (inputString.length < 4) println("Логин или пароль недостаточно длинные")
    else return inputString

}