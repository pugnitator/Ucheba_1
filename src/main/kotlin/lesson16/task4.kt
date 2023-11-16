package lesson16

fun main() {
    val order1 = Order(12, "Ожидает сборки")
    println("Статус заказа: ${order1.getStatus()}")
    order1.sendARequest()
    println("Статус заказа: ${order1.getStatus()}")
}

class Order(
    private val orderNumber: Int,
    private var orderStatus: String,
) {
    private fun changeStatus(status: String) {
        orderStatus = status
    }

    fun sendARequest() {
        print("Введите актуальный статус заказа: ")
        val status = readln()
        changeStatus(status)
    }

    fun getStatus() = orderStatus
}



