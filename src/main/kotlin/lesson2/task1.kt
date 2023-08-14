package lesson2

fun main() {
    val studentQuantity = 4
    val englishGradesList = floatArrayOf(3.0f,4.0f,3.0f,5.0f)
    val englishAverageScore = englishGradesList.sum()/studentQuantity

    println(String.format("%.2f", englishAverageScore))
}