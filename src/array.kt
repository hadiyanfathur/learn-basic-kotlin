fun main() {
    val movies: Array<String> = arrayOf("Avenger", "Spiderman", "Ironman")
    val anime: Array<String> = arrayOf("Naruto", "Bleach", "One Piece")

    println(movies)
    println(anime)

    println(movies[0])
    println(anime.get(0))

    println(movies.size)
    anime.set(0, "Naruto Shippuden")
    movies[1] = "Spiderman Homecoming"
    println(anime[0])
    println(movies[1])

    val newMovies: Array<String?> = arrayOfNulls(3)
    newMovies[0] = "Avenger Endgame"
    newMovies[1] = "Amazing Spiderman"
    newMovies[2] = "Ironman 2"
    // will throw error index of bound
    //newMovies[3] = "Ironman 3"
    println(newMovies)
}