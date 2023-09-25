package lesson11

fun main() {

}
fun sendSms (mobileNumber: String) {
    val massage = readln()
    println("Отправь на номер $mobileNumber сообщение: \"$massage\"")
}

fun makeACall (mobileNumber: String) {
    val massage = readln()
    println("Отправь на номер $mobileNumber сообщение: \"$massage\"")
}

class Contact(
    val firstName: String,
    val lustName: String? = null,
    val mobileNumber: String,
    val homeNumber: String? = null,
    var photo: String = "стандарный кружочек",
    val iCloud: String,
    val closePeopleSet: MutableSet<Contact>,
) {

    fun showContactInfo() {
        println(
            "$photo \n$firstName $lustName \n$mobileNumber \n$homeNumber \n$iCloud \n${showClosePeopleSet()}}"
        )
    }

    fun showClosePeopleSet() {
        closePeopleSet.forEach { println(it) }
    }
}

class SquareIcon(
    val icon: String,
    val iconName: String,
)

class RoundIcon(
    val icon: String,
)