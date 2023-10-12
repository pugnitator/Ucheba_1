package lesson13

fun main () {
    val contactList = mutableListOf<Contact2>()
    val contact = Contact2("Ростислав", 89123456789, "Reddit")
    val contact1 = Contact2("Маша", 89173450089, null)
    val contact2 = Contact2("Петя", 89263456661, "Ромашка")

    contactList.add(contact)
    contactList.add(contact1)
    contactList.add(contact2)

    contactList.forEach { println(it.getContact()) }
}
class Contact2(
    val name: String,
    val number: Long,
    val company: String? = null,
) {
    fun getContact() : String {
        val company = company ?: "[не указано]"
        return "Имя: ${name} \nНомер: ${number} \nКомпания: $company\n"
    }
}