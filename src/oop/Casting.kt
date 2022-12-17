package oop

fun main() {
    //safe casting
    val value : Any = "Hadiyan Fathur Rahman"
    val stringValue = value as? Int
    println(stringValue)
}