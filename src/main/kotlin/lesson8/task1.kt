package lesson8

fun main() {

    val numberOfViewsByDayOfTheWeek = arrayOf(1, 2, 3, 4, 5, 6, 7)

    numberOfViewsByDayOfTheWeek[0] = 10
    numberOfViewsByDayOfTheWeek[1] = 40
    numberOfViewsByDayOfTheWeek[2] = 7
    numberOfViewsByDayOfTheWeek[3] = 53
    numberOfViewsByDayOfTheWeek[4] = 23
    numberOfViewsByDayOfTheWeek[5] = 67
    numberOfViewsByDayOfTheWeek[6] = 81

    val numberOfViewsPerWeek = numberOfViewsByDayOfTheWeek.sum()

    println("Колчиство просмотров за прошлую неделю: $numberOfViewsPerWeek.")

}