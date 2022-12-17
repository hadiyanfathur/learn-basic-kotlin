fun main() {
    val movies: Array<String> = arrayOf("Avenger", "Spiderman", "Ironman")
    forLoop(movies)
    println("==============")
    forRange(movies)
    println("==============")
    whileLoop(movies)
    println("==============")
    doWhileLoop(movies)
}

fun forLoop(movies : Array<String>){
    for (movie in movies){
        println(movie)
    }
}

fun forRange(movies: Array<String>){
    val arraySize = movies.size-1
    for (i in 0..arraySize){
        println("Movie $i : ${movies[i]}")
    }
}

fun whileLoop(movies: Array<String>){
    var i = 0
    val arraySize = movies.size
    while (i < arraySize){
        println("Movie $i : ${movies[i]}")
        i++
    }
}

fun doWhileLoop(movies: Array<String>){
    var i = 0
    val arraySize = movies.size
    do {
        println("Movie $i : ${movies[i]}")
        i++
    } while (i < arraySize)
}