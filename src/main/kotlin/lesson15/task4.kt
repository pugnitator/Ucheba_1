package lesson15

fun main() {

}

abstract class Good(
    val name: String,
    val quantityInStock: Int,
)

class MusicalInstrument(
    name: String,
    quantityInStock: Int,
    val listOfComponents: MutableList <Component>
) : Good(name, quantityInStock) {

}

class Component(
    name: String,
    quantityInStock: Int,
    val musicalInstrument: MusicalInstrument,
) : Good(name, quantityInStock)

interface ProductSearch {

    fun findProduct (searchQuery: String) {
        println("Поиск товара $searchQuery")
    }

}
