package oop.movie

//TYPE ALIAS USED FOR SIMPLIFYING THE NAME OF THE CLASS OR ALIASING DUPLICATE CLASS NAME
typealias Film = Movie
//TYPE ALIAS FOR FUNCTION
typealias StringSupplier = () -> String

fun main() {
    val movie = Movie("Avengers", 2019, 8.5)
    println(movie.title)
    println(movie.year)
    println(movie.rating)

    val film = Film("Avengers", 2019, 8.5)
    println(film.title)
    helloMovie { "Avengers" }
}

fun helloMovie(supplier: StringSupplier) {
    println("Hello Movie ${supplier()}")
}