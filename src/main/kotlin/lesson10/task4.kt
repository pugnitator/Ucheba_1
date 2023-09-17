package lesson10

fun main() {
    var roundNumber = 0
    var numbersOfWinsPerPerson = 0
    do {
        roundNumber += 1
        println("\nРаунд $roundNumber. \nХод игрока.")
        val personsTotalPoints = rollTheDice()
        println("Ход комьютера.")
        val machineTotalPoints = rollTheDice()

        if (isPlayerWin(personsTotalPoints, machineTotalPoints)) numbersOfWinsPerPerson += 1

    } while (isPlayerWantToPlay())

    println("Количество раундов: $roundNumber. Количество побед человека: $numbersOfWinsPerPerson.")

}

fun isPlayerWantToPlay(): Boolean {
    val playAgain: Boolean
    var answer: String
    println("Хотите бросить кости еще раз? Введите Да или Нет.")
    do {
        answer = readln().lowercase()
        if (answer != "да" && answer != "нет") println("Вы ввели неверное значение. Попробуйте снова:")
    } while (answer != "да" && answer != "нет")

    playAgain = (answer == "да")

    return playAgain

}

fun isPlayerWin(playerScore: Int, notPlayerScore: Int): Boolean {
    var playerIsWin = false
    if (playerScore > notPlayerScore) {
        println("В этом раунде победило человечество!")
        playerIsWin = true
    } else if (playerScore < notPlayerScore) {
        print("В этом раунде победила машина.")
    } else {
        println("В этом раунде ничья.")
    }

    return playerIsWin
}