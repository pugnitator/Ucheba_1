package lesson21

fun main() {
    val text = "Kotlin"
    println(text.numberOfVowelLetters())
}

fun String.numberOfVowelLetters(): Int {
    var numberOfVowelLetters = 0
    toCharArray().forEach {
        when (it) {
            'a', 'e', 'i', 'o', 'u' -> numberOfVowelLetters += 1
        }
    }
    return numberOfVowelLetters
}