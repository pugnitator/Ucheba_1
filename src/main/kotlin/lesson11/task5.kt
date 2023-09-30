package lesson11

fun main() {

    val forum = Forum()
    println("Заполните данные для регистрации:")
    val user1 = forum.createNewUser(readln(), readln(), readln())
    println("Заполните данные для регистрации:")
    val user2 = forum.createNewUser(readln(), readln(), readln())
    forum.createNewMassage(user1)
    forum.createNewMassage(user2)
    forum.createNewMassage(user1)
    forum.createNewMassage(user2)

    forum.printThread()

}

class Forum {
    val users = mutableSetOf<NewUserT5>()
    val massages = mutableMapOf<Int, Pair<String, String>>()

    fun createNewUser(login: String, password: String, email: String): NewUserT5 {
        val lastUserId = users.lastOrNull()?.id ?: 0
        val id = lastUserId + 1
        val user = NewUserT5(id, login, password, email)
        users.add(user)
        return user
    }

    fun createNewMassage(author: NewUserT5): MutableMap<Int, Pair<String, String>> {
        val lastMassageId: Int = massages.keys.lastOrNull() ?: 0
        val massageId = lastMassageId + 1
        println("${author.login}, введите сообщение: ")
        val massage = Pair<String, String>(author.login, readln())
        massages[massageId] = massage
        return massages
    }

    fun printThread() {
        massages.forEach { println("${it.value.first}: ${it.value.second}") }
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