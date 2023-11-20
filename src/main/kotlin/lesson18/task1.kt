package lesson18

fun main() {
    val order1 = OrderForOneProduct(123, "Мороженое")
    val order2 = OrderForSeveralProducts(854, arrayOf("Курочка", "Банан", "Чай"))

    val listOfOrders = mutableListOf<OnlineOrder>(order1, order2)
    listOfOrders.forEach { it.getOnlineOrderInfo() }

}

abstract class OnlineOrder(
    private val orderNumber: Int,
) {
    abstract fun getOnlineOrderInfo()
}

class OrderForOneProduct(
    orderNumber: Int,
    private val product: String,
) : OnlineOrder(orderNumber) {
    override fun getOnlineOrderInfo() = println("Заказан товар: $product.")
}

class OrderForSeveralProducts(
    orderNumber: Int,
    private val products: Array<String>,
) : OnlineOrder(orderNumber) {
    override fun getOnlineOrderInfo() {
        println("Заказаны следующие товары:")
        for (i in products) println(i)
    }
}