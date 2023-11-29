package lesson18

fun main() {
    val order1 = OnlineOrder("123")
    val order2 = OnlineOrder("854")

    order1.getOneProductOrderInfo("Молоко")
    order2.getOneProductOrderInfo(arrayOf("Курочка", "Банан", "Чай"))
}

class OnlineOrder(private val orderNumber: String) {
    fun getOneProductOrderInfo(product: String) = println("Заказан товар: $product.")
    fun getOneProductOrderInfo(products: Array<String>) {
        println("Заказаны следующие товары:")
        for (i in products) println(i)
    }
}