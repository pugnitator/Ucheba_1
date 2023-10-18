package lesson13

fun main() {
    val contact: Contact4
    val number = enterNumber1()
    if (number != null) {
        contact = Contact4("Маша", number, null)
        println(contact.getContact())
    }
}

class Contact4(
    var name: String?,
    var number: Long,
    var company: String? = null,
) {
    fun getContact(): String {
        val company = company ?: "[не указано]"
        return "Имя: ${name} \nНомер: ${number} \nКомпания: $company\n"
    }
}

fun enterNumber1(): Long? {
    var number : Long?
        print("Введите номер телефона: ")
        try {
            number = readln().toLong()
        } catch (e: NumberFormatException) {
            number = null
            println("Ошибка ввода.")
        }
    return number
}