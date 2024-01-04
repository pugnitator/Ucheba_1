package lesson21

fun main() {
    val text = "Kotlin"
    println(text.numberOfVowelLetters())
}

fun String.numberOfVowelLetters() = toCharArray().count { it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' }