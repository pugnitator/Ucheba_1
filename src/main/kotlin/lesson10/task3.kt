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
        val char = arrayOf(numbers.random(), symbols.random()).random().toString()

        if (password.isEmpty()) password = char
        else if (password.last() in numbers) password = concatString(password, symbols.random().toString())
        else password = concatString(password, numbers.random().toString())
    }
    return password
}

fun concatString(string1: String, string2: String): String {
    return StringBuilder(string1).append(string2).toString()
}

const val MIN_PASSWORD_LENGTH = 3