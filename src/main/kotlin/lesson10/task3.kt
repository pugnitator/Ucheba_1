package lesson10

fun main() {

    print("Сколько символов должно быть в пароле (минимальное значение - $MIN_PASSWORD_LENGTH): ")
    val numberOfPasswordChar = readln().toIntOrNull()

    if (numberOfPasswordChar == null || numberOfPasswordChar < MIN_PASSWORD_LENGTH) {
        println("Введено некорретное значение, попробуйте заново.")
        return
    } else println(generatePassword(numberOfPasswordChar))
}

fun generatePassword(inputNumbersOfChar: Int): String {
    val numbers = ('0'..'9').toList()
    val symbols = (' '..'/').toList()
    var password = ""

    for (i in 0 until inputNumbersOfChar) {
        val arrayOfRandomChars = arrayOf(numbers.random(), symbols.random())
        val char = arrayOfRandomChars.random().toString()

        if (password.isEmpty()) password = char
        else password = "$password$char"
//      если нужно соблюдать условие чередования цифр и символов:
//        else if (password.last() in numbers) password = "$password${symbols.random()}"
//        else password = "$password${numbers.random()}"
    }
    return password
}

const val MIN_PASSWORD_LENGTH = 3