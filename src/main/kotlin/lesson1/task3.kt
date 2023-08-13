package lesson1

//коммент для правильной перезаливки коммита
fun main() {
    val year: String = "1961"
    var hour: String = "09"
    var minute: String = "07"
// на случай, если предполагался такой вариант решения:
//    println(year)
//    println(hour)
//    println(minute)

    println("Взлёт:\nГод:$year\nЧас:$hour\nМинуты:$minute\n")

//ниже меняем время взлета на время посадки
    hour = "10"
    minute = "55"

// на случай, если предполагался такой вариант решения:
//    print(hour + ":")
//    print(minute)

    println("Время посадки: $hour:$minute")

}
