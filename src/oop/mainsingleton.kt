package oop

fun main() {
    Singleton.name = "Hadiyan"
    Singleton.run("value")
    a()
    b()
}

fun a() {
    println(Singleton.name)
}

fun b() {
    println(Singleton.name)
}