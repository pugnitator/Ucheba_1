package lesson18

import kotlin.math.pow

fun main() {
    val cubePackage = CubePackage(12.5f)
    val rectanglePackage = RectanglePackage(6.4f, 4.7f, 9.1f)

    println(cubePackage.getPackageSurfaceArea())
    println(rectanglePackage.getPackageSurfaceArea())
}

abstract class Package() {
    abstract fun getPackageSurfaceArea(): Float
}

class CubePackage(private val cubeSideLength: Float) : Package() {
    override fun getPackageSurfaceArea() = 6 * cubeSideLength.pow(2)
}

class RectanglePackage(private val length: Float, private val width: Float, private val high: Float) : Package() {
    override fun getPackageSurfaceArea() = 2 * ((length * width) + (length * high) + (width * high))
}