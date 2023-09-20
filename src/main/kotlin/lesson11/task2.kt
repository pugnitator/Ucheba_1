package lesson11

fun main() {
    val user1 = NewUser(1, "kuku", "lala", "tutu@o.ru")

    user1.printUserInfo()


}

class NewUser(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {

    fun printUserInfo() {
        println("Информация о пользователе: $id, $login, $password, $email, $bio.")
    }

    fun enterUserInfoInBio() {
        bio = readln()
    }

    fun changeUserPassword() {
        val oldPassword = readln()
        do {
            if (oldPassword != password) {
                println("Вы ввели неврный пароль.")
                return
            }
        } while (oldPassword != password)

        print("Введите новый пароль: ")
        password = readln()

    }

}
