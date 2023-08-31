package lesson8

fun main() {
    val ingredientsForMashedPotatoes: Array<String> =
        arrayOf("картошка", "лук", "сливочное масло", "молоко", "яйцо", "соль", "перец")

    print("Какой ингредиент нужно найти: ")
    val desiredIngredient = readln()

    if (desiredIngredient in ingredientsForMashedPotatoes) println("Ингредиент $desiredIngredient в рецепте есть.")
    else println("Такого ингредиента в рецепте нет.")
}