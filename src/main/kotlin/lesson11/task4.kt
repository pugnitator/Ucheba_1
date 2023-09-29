package lesson11

fun main() {

    val closeContact1 = CloseContact(1, "жена")
    val closeContact2 = CloseContact(2, "подруга")
    val closeContact3 = CloseContact(3, "подруга")
    val closeContactList = mutableSetOf(closeContact1, closeContact2, closeContact3)

    val user4 = Contact(
        "First Name",
        "Second Name",
        null,
        "8(999)999-42-42",
        "8(999)888-42-42",
        "фото мышки",
        "mail.mail.ru",
        closeContactList,
    )

    user4.getContactInfo()
    user4.getCloseContact()

}

class CloseContact(
    val id: Int,
    val name: String,
)

class Contact(
    val firstName: String,
    val secondName: String? = null,
    val lastName: String? = null,
    val mobileNumber: String,
    val homeNumber: String? = null,
    var photo: String = "стандарный кружочек",
    val iCloud: String,
    val closePeopleSet: MutableSet<CloseContact>? = null,
) {
    fun getContactInfo() {
        return println(
            """
            $photo 
            $firstName ${secondName ?: ""} ${lastName ?: ""}
            $mobileNumber
            $homeNumber
            $iCloud 
        """.trimIndent()
        )
    }

    fun getCloseContact(): String {
        return closePeopleSet?.forEach { println(it.name) }.toString()
    }

    fun sendSms() {
        val massage = readln()
        println("Отправь на номер $mobileNumber сообщение: \"$massage\"")
    }

    fun startCall() {
        val massage = readln()
        println("Отправь на номер $mobileNumber сообщение: \"$massage\"")
    }

    fun startVideoCall() {
        println("Видеозвонок на номер $mobileNumber")
    }

    fun startFaceTimeCall() {
        val massage = readln()
        println("Звонок на номер $mobileNumber")
    }

    fun startFaceTimeVideoCall() {
        println("Видеозвонок на номер $mobileNumber")
    }
}