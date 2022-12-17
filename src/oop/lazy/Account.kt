package oop.lazy

class Account {
    val name: String by lazy {
        println("init name") //this called once
        "Hadiyan"
    }
}