fun main() {
    // Closure
    // Closure adalah kemampuan sebuah function untuk mengakses variable yang berada diluar function tersebut (di sekitarnya)
    // Closure sangat powerful namun berbahaya bila salah mengakses variable

    var counter: Int = 0
    val increment: () -> Unit = {
        println("Increment")
        counter++
    }

    val decrement: () -> Unit = {
        println("Decrement")
        counter--
    }

    increment()
    increment()
    increment()
    decrement()
    increment()
    decrement()

    println(counter)
}