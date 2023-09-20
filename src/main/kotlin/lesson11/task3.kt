package lesson11

import java.util.Objects


fun main() {
    val roomUser1 = RoomUser("поцЫк123", "Фото пёсика", "пользователь заглушен")

    val chatRoom1 = ChatRoom("Новости подъезда", "Красивое фото райна", roomUser1)
}

class ChatRoom(
    val name: String,
    val cover: String,
    val userList: MutableList<RoomUser>
) {

    fun showNickname () {
        println()
    }
}

class RoomUser(
    val nickname: String,
    val photo: String,
    val status: String,
)