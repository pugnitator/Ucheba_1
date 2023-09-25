package lesson11

fun main() {
    val user1ClosePeople = mutableSetOf<Contact>()
    val user1 = Contact(
        "First Name",
        "Second Name",
        null,
        "8(999)999-42-42",
        "8(999)888-42-42",
        "мышка",
        "mail.mail.ru",
        user1ClosePeople
    )
    val user1ContactPage = ContactPage(user1)
    user1ContactPage.showContactPage()

}

class SquareIcon(
    val icon: String,
    val iconName: String,
) {
    fun showIcon(): String {
        return "$icon \n$iconName"
    }
}

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
    val closePeopleSet: MutableSet<Contact>,
) {

    fun showBasicContactInfo() {
        println("$photo \n$firstName ${secondName ?: ""} ${lastName ?: ""}")
    }

    fun showContactsPhoneNumbers() {
        println("$mobileNumber \n$homeNumber")
    }

    fun showContactsIcloud() {
        println(iCloud)
    }

    fun showClosePeopleSet() {
        closePeopleSet.forEach { println(it) }
    }
}

//class FaceTime() {
//    val faceTimeVideoCall = RoundIcon("иконка камеры")
//    val faceTimeCall = RoundIcon("иконка телефона")
//
//    fun showFaceTimeBlock(): String {
//        return "$faceTimeVideoCall $faceTimeCall"
//    }
//}

class ContactPage(user: Contact) {
    val smsIcon = SquareIcon("иконка сообщения", "написать")
    val callIcon = SquareIcon("иконка телефона", "вызов")
    val videoCallIcon = SquareIcon("иконка камеры", "видео")
    val emailIcon = SquareIcon("иконка конверта", "почта")

    val faceTimeVideoCall = RoundIcon("иконка камеры")
    val faceTimeCall = RoundIcon("иконка телефона")

    val pageHeader = user.showBasicContactInfo()
    val userNumbers = user.showContactsPhoneNumbers()
    val userEmail = user.showContactsIcloud()
    val userClosePeopleSet = user.showClosePeopleSet()

    fun showContactPage(): String {
        return (
                """
            $pageHeader
            ${smsIcon.icon} ${callIcon.icon} ${videoCallIcon.icon} ${emailIcon.icon}
            ${smsIcon.iconName} ${callIcon.iconName} ${videoCallIcon.iconName} ${emailIcon.iconName}
            $userNumbers
            ${faceTimeVideoCall.showIcon()} ${faceTimeCall.showIcon()}
            $userEmail
            $userClosePeopleSet
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