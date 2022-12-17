package oop.movie

class Movie {
    var title: String?
    var year: Int?
    var rating: Double? = null

    constructor(title: String, year: Int) {
        println("Movie $title")
        this.title = title
        this.year = year
    }

    constructor(title: String, year: Int, rating: Double) {
        println("Movie $title")
        this.title = title
        this.year = year
        this.rating = rating
    }
}