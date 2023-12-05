package lesson19

fun main() {
    val product1 = Good(751230, "Рубашка", Goods.CLOTHES)
    val product2 = Good(916274, "Циркуль", Goods.OFFICE_SUPPLIES)
    val product3 = Good(257291, "Ароматизатор для авто", Goods.OTHER)

    println(product1.getGoodInfo())
    println(product2.getGoodInfo())
    println(product3.getGoodInfo())
}

class Good(
    private val id: Int,
    private val name: String,
    private val category: Goods,
) {
    fun getGoodInfo() = "Товар: $name, категория: ${category.getGoodsCategoryName()}, артикул: $id."
}

enum class Goods(private val categoryName: String) {
    CLOTHES("Одежда"),
    OFFICE_SUPPLIES("Канцелярские товары"),
    OTHER("Разное");

    fun getGoodsCategoryName() = categoryName
}