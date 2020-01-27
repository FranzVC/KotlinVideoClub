package entities

import AssociateContext
import utils.Options.*

class Associate(override val name: String,
                override val address: String,
                override val number: Int,
                override val dateOfBirth: Long,
                override val dateStarted: Long,
                var moviesRented: MutableList<Movie> = mutableListOf()) : User {

    override fun toString(): String {
        return "name: $name, address: $address, number: $number," + moviesRented.toString()
    }

    fun showMoviesRented() {
        println("\ttitle")
        for ((index, movie) in moviesRented.withIndex()) {
            println("${index + 1} \t ${movie.title}")
        }
        println("\n\n\n")
    }

    var videoClub = VideoClub()

    override fun menu(videoClub: VideoClub) {
        this.videoClub = videoClub
        associateMenu()
    }

    private fun associateMenu() {
        var context = AssociateContext()
        do {
            println("${FIRST_OPTION.value} . mostrar peliculas disponibles")
            println("${SECOND_OPTION.value}. ordenar peliculas por genero")
            println("${THIRD_OPTION.value}. ordenar peliculas por director")
            println("${FOURTH_OPTION.value}. ordenar peliculas por actores")
            println("${EXIT_OPTION.value}. salir")
            println("ingrese una opcion: ")
            var option: String = readLine().toString()

            context.startOption(this,option)
        } while (option != EXIT_OPTION.value)
    }

    fun sortByActors() {
        videoClub.showMoviesByActors()
    }

    fun sortByDirector() {
        videoClub.showMoviesByDirector()
    }

    fun sortByGenre() {
        videoClub.showMoviesByGenre()
    }

    fun showMovies() {
        videoClub.showMovies()
    }
}