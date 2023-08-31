package lesson8

fun main() {
    val ingredientsForMashedPotatoes: Array<String> =
        arrayOf("картошка", "лук", "сливочное масло", "молоко", "яйцо", "соль", "перец")

    println("Список ингредиентов:")
    for (i in ingredientsForMashedPotatoes) println(i)

    print("\nКакой ингредиент нужно найти и заменить: ")
    val desiredIngredient = readln()
    if (desiredIngredient !in ingredientsForMashedPotatoes) {
        println("Такого ингредиента в рецепте нет.")
        return
    } else {
        val indexOfDesiredngredient = ingredientsForMashedPotatoes.indexOf(element = desiredIngredient)
        print("На какой игредиент его нужно заменить: ")
        ingredientsForMashedPotatoes[indexOfDesiredngredient] = readln()
    }

    println("\nСписок ингредиентов:")
    for (i in ingredientsForMashedPotatoes) println(i)
}