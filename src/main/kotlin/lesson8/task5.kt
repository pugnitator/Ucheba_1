package lesson8

fun main() {

    print("Введите кол-во ингредиентов в блюде: ")
    val countOfIngredients = readln().toIntOrNull()
    if (countOfIngredients == null) {
        println("Введено неверное значение. Попробуйте заново.")
        return
    }

    val ingredientsForTheDish: MutableList<String> = mutableListOf()

    for (i in 0 until countOfIngredients) {
        print("Введите название ингредиента ${i + 1}: ")
        ingredientsForTheDish.add(readln())
    }

    print("\nСоздан рецепт из $countOfIngredients ингредиентов: ")
    println(ingredientsForTheDish)

}