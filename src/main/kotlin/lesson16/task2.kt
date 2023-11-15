package lesson16

import kotlin.math.pow

fun main() {
    val circle = Circle(12.1f)
    println("Площаадь круга: ${circle.getAreaOfCircle()}")
    println("Длина окружности: ${circle.getCircumference()}")
}

class Circle(
    private val radius: Float,
) {
    fun getAreaOfCircle() = PI * (radius.pow(2))
    fun getCircumference() = PI * 2 * radius
}

private const val PI = 3.14f