package lesson15

fun main() {

    val harmonica = MusicalInstrument("harm", 12)
    val harmonicaCase = Component("футляр", 90)

    harmonica.findProduct(harmonicaCase.name)

}

abstract class Good(
    val name: String,
    val quantityInStock: Int,
)

class MusicalInstrument(
    name: String,
    quantityInStock: Int,
) : Good(name, quantityInStock), ProductSearch

class Component(
    name: String,
    quantityInStock: Int,
) : Good(name, quantityInStock)

interface ProductSearch {
    fun findProduct(searchQuery: String) {
        println("Поиск товара \"$searchQuery\"")
    }
}
