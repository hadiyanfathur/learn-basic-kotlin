package oop

object Singleton {
    var name: String = "Singleton"
    fun run(value: String) {
        println("$name is running, value is $value")
    }
}