package lesson13

fun main() {
    val contactList = mutableListOf<Contact3>()
    do {
        println("Создание контакта: ")
        contactList.add(createContact())
        println("Создать ещё один контакт?")
    } while (getConsent())

    println()

    contactList.forEach { println(it.getContact()) }
}

class Contact3(
    var name: String?,
    var number: Long,
    var company: String? = null,
) {
    fun getContact(): String {
        val company = company ?: "[не указано]"
        return "Имя: ${name} \nНомер: ${number} \nКомпания: $company\n"
    }
}

fun enterName(): String? {
    val name: String?
    print("Введите имя: ")
    val inputName = readln().trimStart().trimEnd()
    if (inputName.isEmpty()) name = null
    else name = inputName

    return name
}

fun enterNumber(): Long {
    var number: Long
    do {
        print("Введите номер телефона: ")
        val inputNumber = readln().toLongOrNull()
        if ((inputNumber == null) || (inputNumber.toString().length < 11)) {
            println("Введено неверное значение, попробуйте снова.")
            number = 0
            continue
        } else number = inputNumber
    } while (number != inputNumber)

    return number
}

fun enterCompany(): String? {
    val company: String?
    print("Введите название комании: ")
    val inputCompany: String = readln().trimStart().trimEnd()
    if (inputCompany.isEmpty()) company = null
    else company = inputCompany

    return company
}

fun createContact(): Contact3 {
    return Contact3(
        enterName(),
        enterNumber(),
        enterCompany()
    )
}

fun getConsent(): Boolean {
    var consent: Boolean?
    do {
        val inputAnswer = readln()
        if (inputAnswer.equals("да", true)) consent = true
        else if (inputAnswer.equals("нет", true)) consent = false
        else {
            println("Введено неверное значение, попробуйте снова.")
            consent = null
        }
    } while (consent == null)

    return consent
}