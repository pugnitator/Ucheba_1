package lesson17

class Quiz {
    var question = "?"
        get() = field
        set(value) {
            field = value
        }
    var answer = "!"
        set(value) {
            field = value
        }
}