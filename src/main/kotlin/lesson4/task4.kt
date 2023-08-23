package lesson4

fun main() {

//    считаем ориентируясь на чётность дня тренировки, по чётным - руки и пресс, по нечётным - ноги и спина
//    при входе в приложение мы получаем день тренировки подряд (если не подряд, нам присылают 1)

    print("Какой по счёту день тренировки: ")
    val trainingDay = readln().toInt()

    val evenNumberOfTrainingDay = (trainingDay % 2) == 0

    val handsExercises = !evenNumberOfTrainingDay
    val legsExercises = evenNumberOfTrainingDay
    val backExercises = evenNumberOfTrainingDay
    val pressExercises = !evenNumberOfTrainingDay

    val recommendation = """
        Упражнения для рук: $handsExercises
        Упражнения для ног: $legsExercises
        Упражнения для спины: $backExercises
        Упражнения для пресса: $pressExercises
    """.trimIndent()

    println(recommendation)

}