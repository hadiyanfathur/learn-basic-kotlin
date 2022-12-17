fun display(value: Int) {
    println("Display : $value")
    if(value == 0) return
    display(value - 1)
}

tailrec fun displayTailRec(value: Int) {
    println("Display : $value")
    if(value == 0) return
    displayTailRec(value - 1)
}


fun factorial(value: Int): Int {
    return when(value){
        1 -> 1
        //this cannot be tail recursive because it is not the only function call
        else -> value * factorial(value - 1)
    }
}

tailrec fun factorialTailRec(value: Int, total: Int = 1): Int {
    return when(value) {
        1 -> total
        else -> factorialTailRec(value - 1, total * value)
    }
}

fun main() {
    //StackOverFlow
    //display(100000)
    //displayTailRec(100000)
    println(factorialTailRec(10))
}