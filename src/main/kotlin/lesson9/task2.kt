package lesson9

import java.util.*

fun main() {

    val ingredientsForTheDish = mutableListOf("Яйцо", "Сахар", "Ванильный сахар")
    println("В рецепте есть базовые ингредиенты: $ingredientsForTheDish")

    println("\nЖелаете добавить ещё?")
    val approval = readln().lowercase(Locale.getDefault())
    if (approval != "да") return
    else {
        println("Какой ингредиент вы хотите добавить?")
        ingredientsForTheDish.add(readln())
    }
    println("Теперь в рецепте есть следующие ингредиенты: $ingredientsForTheDish")
}