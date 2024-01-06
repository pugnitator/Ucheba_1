package lesson21

fun main() {
    val text = "Kotlin"
    println(text.numberOfVowelLetters())
}

fun String.numberOfVowelLetters() = count { it in "aeiou" }