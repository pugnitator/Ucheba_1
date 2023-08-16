package lesson1

fun main() {
    val seconds: Short = 6480

//узнаём, сколько целых часов
    val hours = seconds / 3600
    val hoursWithZeros = String.format("%02d", hours)

// узнаем, какой остаток секунд после расчёта часов для расчёта минут
    val secondsRemains1 = seconds % 3600

// по остатку считаем, сколько целых минут
    val minutes = secondsRemains1 / 60
    val minutesWithZeros = String.format("%02d", minutes)

// по остатку считаем остаток секунд
    val seconds1 = secondsRemains1 % 60
    val secondsWithZeros = String.format("%02d", seconds1)

    println ("Время, проведённое Гагариным в космосе: $hoursWithZeros:$minutesWithZeros:$secondsWithZeros.")

}