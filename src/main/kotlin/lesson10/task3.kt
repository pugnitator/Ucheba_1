package lesson10

fun main() {

    print("Сколько символов должно быть в пароле (минимальное значение - 3): ")
    val numberOfPasswordChar = readln().toIntOrNull()
    val numbers = '0'..'9'
    val lowercaseLetters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    var password = ""

    if (numberOfPasswordChar == null || numberOfPasswordChar < 3) {
        println("Введено некорретное значение, попробуйте заново.")
        return
    } else {
        do {
            password = ""
            for (i in 0 until numberOfPasswordChar) {
                val arrayOfRandomChars = arrayOf(numbers.random(), lowercaseLetters.random(), capitalLetters.random())
                val char = arrayOfRandomChars.random().toString()

                password = if (password == "") char
                else "$password$char"
            }
        } while (!numbers.any { it in password } || !lowercaseLetters.any { it in password } || !capitalLetters.any { it in password })

        println(password)
    }
}

fun generatePassword(inputNumbersOfChar: Int): String {



//    val numbers = '0'..'9'
//    val chars = '!'..'/'
//    val passwordCharacters = arrayOf(numbers.random(), chars.random(), " ")
//    val password = mutableListOf(inputNumbersOfChar) { Math.random() }
//    for (i in 0 until inputNumbersOfChar) {
//        password.add(passwordCharacters.random())

}