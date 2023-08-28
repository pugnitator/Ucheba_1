package lesson7

fun main() {

    print("Сколько символов должно быть в пароле: ")
    val numberOfPasswordChar = readln().toIntOrNull()
    val numbers = '0'..'9'
    val lowercaseLetters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    var password = ""

    if (numberOfPasswordChar == null) {
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



