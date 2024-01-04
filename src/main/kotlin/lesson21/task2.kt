package lesson21

fun main() {
    val listOfNumbers = mutableListOf<Int>(1, 2, 3, 4, 5, 2, 6)
    println(listOfNumbers.evenNumbersSum())
}

fun MutableList<Int>.evenNumbersSum() = asSequence().filter { it % 2 == 0 }.sum()