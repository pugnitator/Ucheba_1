package lesson2

import kotlin.math.pow

fun main() {

    val initialAmountP = 70000
    val interestRatePerYearR = 16.7
    val depositPeriodInYearsT = 20

    val totalAmount = initialAmountP * (1 + (interestRatePerYearR / 100)).pow(depositPeriodInYearsT)

    println(String.format("Итоговая сумма вклада через 20 лет: %.3f", totalAmount))

}