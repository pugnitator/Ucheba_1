package lesson11

fun main() {
    val user1 = NewUser(1, "kuku", "lala", "tutu@o.ru")

    user1.enterUserInfoInBio()
    println()

    user1.changeUserPassword()
    println()

    user1.printUserInfo()
    println()

    print("Введите сообщение, которое нужно отправить пользователю: ")
    user1.sandAMassageToEmail(readln())

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
        print("Введите информацию о пользователе: ")
        bio = readln()
    }

    fun changeUserPassword() {
        print("Для изменения пароля введите текущий пароль: ")
        var oldPassword: String
        var attemptsNumber = PASSWORD_ENTRY_ATTEMPTS
        do {
            attemptsNumber -= 1
            oldPassword = readln()
            if (oldPassword != password) println("Вы ввели неврный пароль, попробуйте снова.")
        } while ((oldPassword != password) && (attemptsNumber != 0))

        print("Введите новый пароль: ")
        password = readln()
        println("Пароль изменён.")

    }

    fun sandAMassageToEmail(massage: String) {
        println("Дарахой $login, $massage.")
    }

}

const val PASSWORD_ENTRY_ATTEMPTS = 3