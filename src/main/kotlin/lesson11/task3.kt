package lesson11


fun main() {
    val roomUser1 = RoomUser("поцЫк123", "Фото пёсика", "заглушен")
    val roomUser2 = RoomUser("devo4ka7", "Фото котика", "разговаривает")
    val chatRoomUsers = mutableListOf<RoomUser>(roomUser1, roomUser2)

    val allChatRooms: MutableSet<ChatRoom> = mutableSetOf()
    val chatRoom1 = ChatRoom("Новости подъезда", "Красивое фото района", chatRoomUsers)
    allChatRooms.add(chatRoom1)
    val chatRoom2 = ChatRoom("Кино и домино", "Фото кино и домино", chatRoomUsers)
    allChatRooms.add(chatRoom2)

    println("Заходим в приложение, выводится список комнат:")
    allChatRooms.forEach {it.showChatRoomInfo()}
    println()

    println("Перешли в комнату ${chatRoom1.name}")
    chatRoom1.showUsers(chatRoomUsers)
    println()

    println("Долго жмём на один из аватаров: ")
    roomUser1.showNickname()
    roomUser1.showStatus()

}

class ChatRoom(
    val name: String,
    val cover: String,
    val userList: MutableList<RoomUser>,
) {

    fun showChatRoomInfo(){
        println("$name, $cover, ${userList.size}")
    }

    fun showUsers(userList: MutableList<RoomUser>) {
        println("Список участников чата $name:")
        userList.forEach { it.showPhoto() }
    }
}

class RoomUser(
    val nickname: String,
    val photo: String,
    val status: String,
) {
    fun showPhoto() {
        println(photo)
    }

    fun showNickname() {
        println("Пользователь $nickname.")
    }

    fun showStatus() {
        println("Статус: $status.")
    }

}