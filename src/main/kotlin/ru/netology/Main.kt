package ru.netology

fun main() {
    var likes = 1

    while (likes < 212) {
        println("Понравилось " + likes + " " + getTextEnding(likes))
        likes += 1
    }
}

fun getTextEnding(likes:Int): String {

    val remainder10 = likes % 10;
    val remainder100 = ((likes - remainder10) / 10) % 10;

    if (remainder100 != 1) {
        return when (remainder10) {
            1 -> "человеку"
            else -> "людям"
        }
    }

    return "людям"

}