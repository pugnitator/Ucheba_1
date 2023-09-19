package lesson11

fun main() {
    val user1 = User(1, "kuku", "lala", "tutu@o.ru")
    val user2 = User(2, "pupu", "1234", "wqwq@re.com")

    println("${user1.id}, ${user1.login}, ${user1.password}, ${user1.email}")
    println("${user2.id}, ${user2.login}, ${user2.password}, ${user2.email}")
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

}