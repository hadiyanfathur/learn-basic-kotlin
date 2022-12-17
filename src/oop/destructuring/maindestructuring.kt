package oop.destructuring

fun main() {
    val game = Game("GTA", 100)
    val (name, price) = game
    println("name: $name, price: $price")
    val laptop = Laptop("Asus", 1000)
    val (nameLaptop, priceLaptop) = laptop
    println("name: $nameLaptop, price: $priceLaptop")

    val (min, max) = minmax(10, 20)
    println("min: $min, max: $max")
    val (min2, _) = minmax(10, 20)
    println("min: $min2")

    val login = Login("Hadiyan", "123")
    //login(login){login -> login.user == "Hadiyan" && login.password == "123"}
    login(login){(user, password) -> user == "Hadiyan" && password == "123"}
}

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean) : Boolean {
    return callback(login)
}