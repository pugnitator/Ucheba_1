package lesson17

fun main() {
    val folder1 = Folder()
    println(folder1.name)
    println(folder1.numberOfFiles)

    folder1.isSecret = true

    println(folder1.name)
    println(folder1.numberOfFiles)
}

class Folder(
    var isSecret: Boolean = false,
) {
    var name: String = "Папка"
        get() = if (isSecret) "Скрытая папка" else field
    var numberOfFiles = 10
        get() = if (isSecret) 0 else field
}