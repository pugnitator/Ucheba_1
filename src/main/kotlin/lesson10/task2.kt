package lesson10

fun main() {

    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()

    checkTheLengthOfTheString(login,password)

}
fun checkTheLengthOfTheString(inputLogin: String, inputPassword: String) {
    if ((inputLogin.length < 4) && (inputPassword.length < 4)) println("Логин или пароль недостаточно длинные.")
    else println("Добро пожаловать!")
}
