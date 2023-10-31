package lesson14

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val blackCircle = Circle(BLACK_COLOR, 5.02f)
    val whiteCircle = Circle(WHITE_COLOR, 3.00f)
    val blackRectangle = Rectangle(BLACK_COLOR, 8.1f, 20.23f)
    val whiteRectangle = Rectangle(WHITE_COLOR, 7.77f, 10.54f)

    val figureList: MutableList<Figure> =
        mutableListOf<Figure>(blackCircle, whiteCircle, blackRectangle, whiteRectangle)

    val sumBlackFiguresPerimeter =
        figureList.filter { it.color == BLACK_COLOR }.map { it.calculateThePerimeterOfTheFigure() }.sum()
    val sumWhiteFiguresArea =
        figureList.filter { it.color == WHITE_COLOR }.map { it.calculateTheAreaOfTheFigure() }.sum()


    println(
        """
        Сумма периметров чёрных фигур: ${String.format("%.2f", sumBlackFiguresPerimeter)}
        Сумма площадей белых фигур: ${String.format("%.2f", sumWhiteFiguresArea)}
    """.trimIndent()
    )
}

abstract class Figure(val color: String) {
    abstract fun calculateTheAreaOfTheFigure(): Float
    abstract fun calculateThePerimeterOfTheFigure(): Float
}

class Circle(
    color: String,
    val radius: Float,
) : Figure(color) {
    override fun calculateTheAreaOfTheFigure(): Float {
        return (PI * (radius.pow(2))).toFloat()
    }

    override fun calculateThePerimeterOfTheFigure(): Float {
        return (PI * 2 * radius).toFloat()
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

const val WHITE_COLOR = "белый"
const val BLACK_COLOR = "черный"