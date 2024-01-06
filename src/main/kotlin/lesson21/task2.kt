package lesson21

fun main() {
    val listOfNumbers = listOf<Int>(1, 2, 3, 4, 5, 2, 6)
    println(listOfNumbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() = filter { it % 2 == 0 }.sum()