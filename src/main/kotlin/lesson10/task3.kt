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
    val symbols = ('!'..'/').toList()
    val space = " "
    var password = ""

    for (i in 0 until inputNumbersOfChar) {
        val arrayOfRandomChars = arrayOf(numbers.random(), symbols.random(), " ")
        val char = arrayOfRandomChars.random().toString()

        password = if (password.isEmpty()) char
        else "$password$char"
    }

    return password
}

const val MIN_PASSWORD_LENGTH = 3