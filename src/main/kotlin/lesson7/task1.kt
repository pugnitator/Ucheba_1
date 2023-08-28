package lesson7

fun main() {

    val symbol1 = ('a'..'z').random()
    val symbol2 = (0..9).random()
    val symbol3 = ('a'..'z').random()
    val symbol4 = (0..9).random()
    val symbol5 = ('a'..'z').random()
    val symbol6 = (0..9).random()

    val password = "$symbol1$symbol2$symbol3$symbol4$symbol5$symbol6"
    println(password)

}