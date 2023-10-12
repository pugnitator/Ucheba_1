package lesson13

fun main () {
    val contactList = mutableListOf<Contact3>()

    contactList.forEach { println(it.getContact()) }
}
class Contact3(
    var name: String?,
    var number: Long,
    var company: String? = null,
) {

    fun createName () : String? {
        println("Введите имя: ")
        val inputName = readln().trimStart().trimEnd()
        if (inputName == "") name = null
        else name = inputName

        return name
    }

    fun createNumber () : Long {
        do {
            println("Введите номер телефона: ")
            val inputNumber = readln().toLongOrNull()
            if (inputNumber == null) {
                println("Введено неверное значение, попробуйте снова.")
                break
            } else if (inputNumber.toString().length < 11) {
                println("Введено неверное значение, попробуйте снова.")
                break
            } else number = inputNumber
        }while (number != inputNumber)
    }
    fun createContact() {
        do {
            println("Введите имя: ")
            val inputName = readln().trimStart().trimEnd()
            if (inputName == "") name = null
            else name = inputName

            println("Введите номер телефона: ")
            val inputNumber = readln().toLongOrNull()
            if (inputNumber == null) {
                println()
                break
            }
            else if (inputNumber.toString().length < 11) {
                println()
                break
            }
            else number = inputNumber

        }while()
    }
    fun getContact() : String {
        val company = company ?: "[не указано]"
        return "Имя: ${name} \nНомер: ${number} \nКомпания: $company\n"
    }
}