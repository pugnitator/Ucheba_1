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
        for (i in 0 until numberOfPasswordChar) {
            val arrayOfRandomChars = arrayOf(numbers.random(), lowercaseLetters.random(), capitalLetters.random())
            val char = arrayOfRandomChars.random().toString()
            if (password == "") password = char
            else password = "$password$char"
        }
    }

//    val passwordList = arrayOf(password.split(" "))
    println(password)


}

