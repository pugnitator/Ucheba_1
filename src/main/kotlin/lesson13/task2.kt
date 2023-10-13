package lesson13

fun main () {
    val contact = Contact1("Ростислав", 89123456789, "Reddit")
    println(contact.getContact())
}
class Contact1(
    val name: String,
    val number: Long,
    val company: String? = null,
) {
    fun getContact() : String {
        val company = company ?: "[не указано]"
        return "Имя: ${name} \nНомер: ${number} \nКомпания: $company"
    }
}