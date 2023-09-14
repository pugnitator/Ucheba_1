package lesson7

fun main() {

    print("Сколько символов должно быть в пароле (минимальное значение - $MIN_PASSWORD_LENGTH): ")
    val numberOfPasswordChar = readln().toIntOrNull()
    val numbers = '0'..'9'
    val lowercaseLetters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    var password: String

    if (numberOfPasswordChar == null || numberOfPasswordChar < MIN_PASSWORD_LENGTH) {
        println("Введено некорретное значение, попробуйте заново.")
        return
    } else {
        do {
            password = ""
            for (i in 0 until numberOfPasswordChar) {
                val arrayOfRandomChars = arrayOf(numbers.random(), lowercaseLetters.random(), capitalLetters.random())
                val char = arrayOfRandomChars.random().toString()
                password = if (password.isEmpty()) char
                else "$password$char"
            }
        } while (!isTheCreatedPasswordCorrect(password, numbers, lowercaseLetters, capitalLetters))

        println(password)
    }
}

fun isTheCreatedPasswordCorrect(
    password: String,
    range1: CharRange,
    range2: CharRange,
    range3: CharRange,
): Boolean {
    return (range1).any { it in password } && (range2).any { it in password } && (range3).any { it in password }
}

const val MIN_PASSWORD_LENGTH = 3

