package lesson2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2f

    val buffCrystalOre = buff * crystalOre
    val buffIronOre = buff * ironOre

    println(
        String.format(
            """
        Бонус к кристаллической руде: %.0f
        Бонус к железной руде: %.0f
    """.trimIndent(), buffCrystalOre, buffIronOre
        )
    )

}