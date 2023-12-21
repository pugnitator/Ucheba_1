package lesson21

fun main() {
    val listOfNumbers = mutableListOf<Int>(1, 2, 3, 4, 5, 2)
    println(listOfNumbers.evenNumbersSum())
}

fun MutableList<Int>.evenNumbersSum(): Int {
    var evenNumberSum = 0
    for (i in asSequence()) {
        when (i % 2) {
            0 -> evenNumberSum += i
        }
    }
    return evenNumberSum
}