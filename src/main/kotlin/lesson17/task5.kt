package lesson17

fun main() {
    val user = User175("Yo4", "qwerty")
    user.login = "Yo44"
    println(user.login)

    println(user.password)
    user.password = "0123456789"
    println(user.password)
}

class User175(
    inputLogin: String,
    inputPassword: String,
) {
    var login = inputLogin
        set(value) {
            field = value
            println("Логин успешно изменён.")
        }
    var password = inputPassword
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль.")
        }
}
