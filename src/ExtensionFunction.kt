fun String.moviePref(): String = "Movie : $this"

fun String.printMovie() = println("Movie : $this")

fun main() {
    val movie = "Avenger"
    println(movie.moviePref())

    movie.printMovie()

    "Spiderman".printMovie()

    //Extension function pada class tidak bisa mengakses property private
}