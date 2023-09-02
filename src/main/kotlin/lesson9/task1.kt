package lesson9

fun main() {

    val ingredientsForTheDish = listOf("Яйцо", "Сахар", "Ванильный сахар")

    println("Список ингредиентов: ")
    for (i in ingredientsForTheDish) println("${ingredientsForTheDish.indexOf(i) + 1}. $i")

}