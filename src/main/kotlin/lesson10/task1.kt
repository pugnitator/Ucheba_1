package lesson10

import kotlin.random.Random

fun main() {

    println("Ход игрока.")
    val personsTotalPoints = rollTheDice()

    println("Ход комьютера.")
    val robotTotalPoints = rollTheDice()

    if (personsTotalPoints > robotTotalPoints) print("Победило человечество!")
    else if (personsTotalPoints < robotTotalPoints) print("Победила машина.")
    else print("Ничья, придётся сразиться ещё раз.")

}

fun rollTheDice(): Int {
    val dice1 = Random.nextInt(1, 6)
    val dice2 = Random.nextInt(1, 6)
    val totalPointsPerTurn: Int = dice1 + dice2
    println("Значение первой кости: $dice1, значение второй кости: $dice2. Сумма за ход: $totalPointsPerTurn.\n")
    return totalPointsPerTurn
}