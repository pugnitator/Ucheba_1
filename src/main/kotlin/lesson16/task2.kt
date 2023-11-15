package lesson16

import kotlin.math.pow

fun main() {
    val circle = Circle(12.1f)
    println(circle.getAreaOfCircle())
    println(circle.getCircumference())
}

class Circle(
    private val radius: Float,
) {
    private val pi = 3.14f
    fun getAreaOfCircle() = (pi * (radius.pow(2)))
    fun getCircumference() = (pi * 2 * radius)
}