package lesson15

fun main() {
    val admin = AdminUser(1, "admin")
    val user = SimpleUser(2, "Бритни")

    admin.sendMassage()
    admin.readMassage()
    admin.deleteMassage()
    println()
    user.sendMassage()
    user.readMassage()
}

abstract class User15(val id: Int, val name: String) {
    fun readMassage() {
        println("Жмём кнопку для прочтения сообщения")
    }

    fun sendMassage() {
        println("Жмём кнопку для отправки сообщения")
    }
}

class AdminUser(id: Int, name: String) : User15(id, name) {
    fun deleteMassage() {
        println("Жмём кнопку для удаления сообщения")
    }
}

class SimpleUser(id: Int, name: String) : User15(id, name)