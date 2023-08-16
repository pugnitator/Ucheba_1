package lesson2

fun main() {
    val englishGradesList = floatArrayOf(3.0f, 4.0f, 3.0f, 5.0f)
    val englishAverageScore = englishGradesList.average()
    println(String.format("Средний балл по английскому языку: %.2f", englishAverageScore))
}