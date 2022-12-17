package oop.genre

fun main() {
    val fantasy = Genre.FANTASY
    println(fantasy)

    val allGenre = Genre.values()
    allGenre.forEach { println(it.name.lowercase()) }
}