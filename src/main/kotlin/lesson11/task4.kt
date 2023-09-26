package lesson11

fun main() {
    val user1ClosePeople = mutableListOf<String>()
    val user0 = Contact(
        "жена",
        null,
        null,
        "8(999)999-42-42",
        "8(999)888-42-42",
        "жена",
        "mail.mail.ru",
        null
    )
    user1ClosePeople.add(user0.firstName)
    val user2 = Contact(
        "подруга",
        null,
        null,
        "8(999)999-42-42",
        "8(999)888-42-42",
        "жена",
        "mail.mail.ru",
        null
    )
    user1ClosePeople.add(user2.firstName)
    val user3 = Contact(
        "подруга",
        null,
        null,
        "8(999)999-42-42",
        "8(999)888-42-42",
        "жена",
        "mail.mail.ru",
        null
    )
    user1ClosePeople.add(user3.firstName)

    val user1 = Contact(
        "First Name",
        "Second Name",
        null,
        "8(999)999-42-42",
        "8(999)888-42-42",
        "фото мышки",
        "mail.mail.ru",
        user1ClosePeople
    )
    val user1ContactPage = ContactPage(user1)
    user1ContactPage.showContactPage(user1)
}

class SquareIcon(
    val icon: String,
    val iconName: String,
)

class RoundIcon(
    val icon: String,
) {
    fun showIcon(): String {
        return icon
    }
}

class Contact(
    val firstName: String,
    val secondName: String? = null,
    val lastName: String? = null,
    val mobileNumber: String,
    val homeNumber: String? = null,
    var photo: String = "стандарный кружочек",
    val iCloud: String,
    val closePeopleSet: MutableList<String>? = null,
) {

    fun showBasicContactInfo() {
        println("$photo \n$firstName ${secondName ?: ""} ${lastName ?: ""}")
    }

    fun showContactsPhoneNumbers() {
        println("$mobileNumber \n$homeNumber")
    }

    fun showContactsICloud() {
        println(iCloud)
    }

    fun showClosePeopleSet() {
        closePeopleSet?.forEach { println(it) }
    }
}

class ContactPage(user: Contact) {
    val smsIcon = SquareIcon("иконка сообщения", "написать")
    val callIcon = SquareIcon("иконка телефона", "вызов")
    val videoCallIcon = SquareIcon("иконка камеры", "видео")
    val emailIcon = SquareIcon("иконка конверта", "почта")

    val faceTimeVideoCall = RoundIcon("иконка камеры")
    val faceTimeCall = RoundIcon("иконка телефона")


    fun showActionButtons () {
        println("""
            ${smsIcon.icon} | ${callIcon.icon} | ${videoCallIcon.icon} | ${emailIcon.icon}
            ${smsIcon.iconName} | ${callIcon.iconName} | ${videoCallIcon.iconName} | ${emailIcon.iconName}
        """.trimIndent())
    }

    fun showFaceTimeButtons() {
        println("${faceTimeVideoCall.showIcon()} | ${faceTimeCall.showIcon()}")
    }

    fun showContactPage(user: Contact): String {
        return (
                """
            ${user.showBasicContactInfo()}
            ${showActionButtons()}
            ${user.showContactsPhoneNumbers()}
            ${showFaceTimeButtons()}
            ${user.showContactsICloud()}
            ${user.showClosePeopleSet()}
        """.trimIndent()
                )
    }

    fun sendSms(mobileNumber: String) {
        val massage = readln()
        println("Отправь на номер $mobileNumber сообщение: \"$massage\"")
    }

    fun startCall(mobileNumber: String) {
        val massage = readln()
        println("Отправь на номер $mobileNumber сообщение: \"$massage\"")
    }

    fun startVideoCall(mobileNumber: String) {
        println("Видеозвонок на номер $mobileNumber")
    }

    fun startFaceTimeCall(mobileNumber: String) {
        val massage = readln()
        println("Звонок на номер $mobileNumber")
    }

    fun startFaceTimeVideoCall(mobileNumber: String) {
        println("Видеозвонок на номер $mobileNumber")
    }
}