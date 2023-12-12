package lesson20

fun main() {

    val player = Player();

    { player: Player ->
        String
        if (player.haveAKey == true) println("Дверь открылась.")
        else println("Дверь заперта.")
    }(player)

    player.haveAKey = true

    { player: Player ->
        String
        if (player.haveAKey == true) println("Дверь открылась.")
        else println("Дверь заперта.")
    }(player)

}

class Player(var haveAKey: Boolean = false)