package lesson14

import kotlin.math.pow

fun main() {
    val blackCircle = Circle("чёрный", 5.02f)
    val wightCircle = Circle("белый", 3.00f)
    val blackRectangle = Rectangle("чёрный", 8.1f, 20.23f)
    val wightRectangle = Rectangle("белый", 7.77f, 10.54f)

    val figureList : MutableList<Figure> = mutableListOf<Figure>(blackCircle, wightCircle, blackRectangle, wightRectangle)
    var sumBlackFiguresPerimeter = 0.00f
    var sumWightFiguresArea = 0.00f

    for (i: Int in 0 until figureList.size) {
        if (figureList[i].color == "чёрный") sumBlackFiguresPerimeter += figureList[i].calculateThePerimeterOfTheFigure()
        if (figureList[i].color == "белый") sumWightFiguresArea += figureList[i].calculateTheAreaOfTheFigure()
    }

    println("""
        Сумма периметров чёрных фигур: $sumBlackFiguresPerimeter
        Сумма площадей белых фигур: $sumWightFiguresArea
    """.trimIndent())
}

abstract class Figure(val color: String) {
    open fun calculateTheAreaOfTheFigure(): Float {
        return 0.0f
    }
    open fun calculateThePerimeterOfTheFigure(): Float {
        return 0.0f
    }
}

class Circle(
    color: String,
    val radius: Float,
) : Figure(color) {
    override fun calculateTheAreaOfTheFigure(): Float {
        return PI * (radius.pow(2))
    }
    override fun calculateThePerimeterOfTheFigure(): Float {
        return PI * 2 * radius
    }
}

class Rectangle(
    color: String,
    val height: Float,
    val width: Float,
) : Figure(color) {
    override fun calculateTheAreaOfTheFigure(): Float {
        return height * width
    }
    override fun calculateThePerimeterOfTheFigure(): Float {
        return (height + width) * 2
    }
}

const val PI = 3.14f