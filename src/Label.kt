//lambda
fun operation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    // Label
    // Label digunakan untuk menghentikan eksekusi dari sebuah loop atau menghentikan eksekusi dari sebuah function.
    // Label digunakan dengan cara menambahkan nama label di depan loop atau function.


    loopi@ for (i in 1..10) {
       loopj@ for (j in 1..10) {
            if (i == 5 && j == 5) {
                break@loopi
            }
            println("i : $i, j : $j")
        }
    }

    //Mengakali return di lambda menggunakan label
    val operate = operation(10, 10) operation@{ valueA, valueB ->
        if (valueA == 0) return@operation 0
        return@operation valueA + valueB
    }
    println(operate)
}