package oop.overloadingoperator

data class Fruit(val qty: Int) {
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(this.qty + fruit.qty)
    }
}