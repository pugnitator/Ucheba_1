package lesson17

fun main() {
    val folder1 = Folder("Папка1", 10)
    println(folder1.name)
    println(folder1.numberOfFiles)
    println()

    folder1.isSecret = true

    println(folder1.name)
    println(folder1.numberOfFiles)
}

class Folder(
    name: String,
    numberOfFiles: Int,
    var isSecret: Boolean = false,
) {
    var name = name
        get() = if (isSecret) "Скрытая папка" else field
    var numberOfFiles = numberOfFiles
        get() = if (isSecret) 0 else field
}