package lesson14

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val blackCircle = Circle(BLACK_COLOR, 5.02f)
    val wightCircle = Circle(WIGHT_COLOR, 3.00f)
    val blackRectangle = Rectangle(BLACK_COLOR, 8.1f, 20.23f)
    val wightRectangle = Rectangle(WIGHT_COLOR, 7.77f, 10.54f)

    val figureList : MutableList<Figure> = mutableListOf<Figure>(blackCircle, wightCircle, blackRectangle, wightRectangle)
//    var sumBlackFiguresPerimeter = figureList.filter { it.color == BLACK_COLOR }.forEach{it.calculateThePerimeterOfTheFigure}

    var sumBlackFiguresPerimeter = figureList.filter { it.color == BLACK_COLOR }.map.it.calculateThePerimeterOfTheFigure.sum()
    var sumWightFiguresArea = 0.00f

//    for (i: Int in 0 until figureList.size) {
//        if (figureList[i].color == "чёрный") sumBlackFiguresPerimeter += figureList[i].calculateThePerimeterOfTheFigure()
//        if (figureList[i].color == "белый") sumWightFiguresArea += figureList[i].calculateTheAreaOfTheFigure()
//    }

    println("""
        Сумма периметров чёрных фигур: $sumBlackFiguresPerimeter
        Сумма площадей белых фигур: $sumWightFiguresArea
    """.trimIndent())
}

abstract class Figure(val color: String) {
    open abstract fun calculateTheAreaOfTheFigure(): Float
    open abstract fun calculateThePerimeterOfTheFigure(): Float
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

const val WIGHT_COLOR = "белый"
const val BLACK_COLOR = "черный"