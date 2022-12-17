package oop.scopefunction

import oop.movie.Movie

fun main() {
    val movie = Movie("Avenger", 2019, )
    movie.let {
        println(it.title)
        println(it.year)
    }

    val result : String = movie.run {
        "Movie : ${this.title}"
    }
    println(result)

    val result2 : Movie = movie.apply {
        "Movie : $title"
    }

    println(result2)

    val result3 : Movie = movie.also {
        "Movie : ${it.title}"
    }
    println(result3)

    val result4 : String = with(movie) {
        "Movie : $title"
    }
    println(result4)
}