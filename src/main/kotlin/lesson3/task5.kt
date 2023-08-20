package lesson3

fun main() {

    println("Запишите ваш ход в формате [откуда-куда;номер хода]:")
    val chessMove = readln()

    val (movesRecording, strokeNumber) = chessMove.split(";")
    val (starCell, endCell) = movesRecording.split("-")

    println(
        """
        $starCell
        $endCell
        $strokeNumber
    """.trimIndent()
    )

}