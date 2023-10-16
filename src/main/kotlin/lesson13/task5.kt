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
    var number: Long?
    do {
        print("Введите номер телефона: ")
        val inputNumber = readln()
        number = inputNumber.toLongOrNull()
        if (number == null) {
            println("Ошибка ввода.")
            break
        } else if (number.toString().length != NUMBER_LENGTH) {
            println("Недостаточно цифр в номере. Повторите попытку.")
            number = null
        }
    } while (number == null)

    return number
}

const val NUMBER_LENGTH = 11