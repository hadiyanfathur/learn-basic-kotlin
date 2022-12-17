package oop.delegation

interface Base {
    fun sayHello()
    fun sayGoodBye()
}

class BaseImpl(val name: String) : Base {
    override fun sayHello() {
        println("Hello $name")
    }

    override fun sayGoodBye() {
        println("Good Bye $name")
    }
}

class Delegate(base: Base) : Base by base
//if you want to override the method, you can do it like this
//class Delegate(base: Base) : Base by base {
//    override fun sayHello() {
//        println("Hello Hadiyan")
//    }
//}