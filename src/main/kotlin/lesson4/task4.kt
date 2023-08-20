package lesson4

fun main() {

//    считаем ориентируясь на чётность дня тренировки, по чётным - руки и пресс, по нечётным - ноги и спина
//    при входе в приложение мы получаем день тренировки подряд (если не подряд, нам присылают 1)
    print("Какой по счёту день тренировки: ")
    val trainingDay = readln().toInt()
    val handsExercises = true
    val legsExercises = false
    val backExercises = false
    val pressExercises = true

    val evenNumberOfTrainingDay = (trainingDay % 2) == 0

    val recommendation = if (evenNumberOfTrainingDay) """
        Упражнения для рук: ${!handsExercises}
        Упражнения для ног: ${!legsExercises}
        Упражнения для спины: ${!backExercises}
        Упражнения для пресса: ${!pressExercises}
    """.trimIndent()
    else """
        Упражнения для рук: ${handsExercises}
        Упражнения для ног: ${legsExercises}
        Упражнения для спины: ${backExercises}
        Упражнения для пресса: ${pressExercises}
    """.trimIndent()

    println(recommendation)

}