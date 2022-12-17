package oop.user

fun main() {
    val user = User(1, "Hadiyan")
    println(user.id)
    println(user.name)
    println(user.email)

    user.sayHello("Guys")

    //companion object
    println(User.toUpper("Hadiyan"))
}