package lesson11

fun main() {

    val forum = Forum()
    val user1 = forum.createNewUser()
    val user2 = forum.createNewUser()
    forum.createNewMassage(user1)
    forum.createNewMassage(user2)
    forum.createNewMassage(user1)
    forum.createNewMassage(user2)

    forum.printThread()

}

class Forum {
    val users = mutableSetOf<NewUserT5>()
    val massages = mutableMapOf<Int, Pair<String, String>>()

    fun createNewUser(): NewUserT5 {
        val userId = users.size + 1
        val user: NewUserT5 = NewUserT5(userId, "0", "0", "0")
        print("Введите никнейм: ")
        user.login = readln().toString()
        print("Введите пароль: ")
        user.password = readln().toString()
        print("Введите e-mail: ")
        user.email = readln().toString()

        println("Пользователь зарегистрирован.")

        return user
    }

    fun createNewMassage(author: NewUserT5): MutableMap<Int, Pair<String, String>> {
        val massageId: Int = massages.size + 1
        println("Введите сообщение: ")
        val massage = Pair<String, String>(author.login, readln())
        massages[massageId] = massage
        return massages
    }

    fun printThread() {
        massages.forEach{println(it.value.toString().replace(',', ':').removePrefix("(").removeSuffix(")"))}
    }
}

class NewUserT5(
    var id: Int,
    var login: String,
    var password: String,
    var email: String,
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
        var attemptsNumber = PASSWORD_ENTRY_ATTEMPTS_T5
        do {
            attemptsNumber -= 1
            oldPassword = readln()
            if (oldPassword != password) println("Вы ввели неврный пароль, попробуйте снова.")
        } while ((oldPassword != password) && (attemptsNumber != 0))

        print("Введите новый пароль: ")
        password = readln()
        println("Пароль изменён.")

    }

    fun sendAMassageToEmail(massage: String) {
        println("Дарахой $login, $massage.")
    }

}

const val PASSWORD_ENTRY_ATTEMPTS_T5 = 3