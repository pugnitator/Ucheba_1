package lesson9

fun main() {

    val listOfIngredients = sortedSetOf<String>()
    val numberOfIngredients = 5

    while (listOfIngredients.size < numberOfIngredients) {
        println("Введите название ингредиента ${listOfIngredients.size + 1}: ")
        listOfIngredients.add(readln())
    }

    println("${listOfIngredients.joinToString().replaceFirstChar { it.uppercaseChar() }}.")

}





