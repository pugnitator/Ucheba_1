package lesson18

import kotlin.math.pow

fun main() {
    val cubePackage = Package()
    val rectanglePackage = Package()

    println(cubePackage.getPackageSurfaceArea(12.5f))
    println(rectanglePackage.getPackageSurfaceArea(6.4f, 4.7f, 9.1f))
}

class Package {
    fun getPackageSurfaceArea(
        length: Float,
        width: Float,
        high: Float,
    ) = 2 * ((length * width) + (length * high) + (width * high))

    fun getPackageSurfaceArea(cubeSideLength: Float) = 6 * cubeSideLength.pow(2)
}

