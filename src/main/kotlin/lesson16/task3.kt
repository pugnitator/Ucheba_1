package lesson16

fun main() {
    val user = User("123", "321")
    println(user.checkPassword())
}

class User(
    val login: String,
    private val password: String,
) {
    fun checkPassword(): String {
        return when (enterThePassword()) {
            password -> "Пароль верный"
            else -> "Пароль неверный"
        }
    }

    fun enterThePassword(): String {
        print("Введите пароль:")
        return readln()
    }
}