package lesson9

fun main() {

    val ingredientsForTheDish = mutableListOf("Яйцо", "Сахар", "Ванильный сахар")
    println("В рецепте есть базовые ингредиенты: $ingredientsForTheDish")

    println("\nЖелаете добавить ещё?")
    val approval = readln()

    if ((approval != "ДА") && (approval != "да") && (approval != "Да")) return
    else {
        println("Какой ингредиент вы хотите добавить?")
        ingredientsForTheDish.add(readln())
    }
    println("Теперь в рецепте есть следующие ингредиенты: $ingredientsForTheDish")
}