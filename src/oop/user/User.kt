package oop.user

class User(var id: Int, var name: String, var email: String) {
    constructor(id: Int, name: String) : this(id, name, "") {
        println("Secondary constructor")
    }

    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    companion object {
        fun toUpper(name: String): String {
            return name.uppercase()
        }
    }
}