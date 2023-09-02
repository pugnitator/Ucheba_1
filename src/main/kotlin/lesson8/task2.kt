package lesson8

fun main() {

    val ingredientsForMashedPotatoes: Array<String> =
        arrayOf("картошка", "лук", "сливочное масло", "молоко", "яйцо", "соль", "перец")

    print("Какой ингредиент нужно найти: ")
    val desiredIngredient = readln()

    for (i in ingredientsForMashedPotatoes) {
        if (i == desiredIngredient) {
            println("Ингредиент $i в рецепте есть.")
            return
        } else continue
    }
    println("Такого ингредиента в рецепте нет.")
}