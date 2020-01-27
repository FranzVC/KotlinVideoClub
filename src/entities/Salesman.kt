package entities

import utils.Options
import utils.Options.*
import SalesmanContext

class Salesman(override val name: String, override val address: String, override val number: Int, override val dateOfBirth: Long, override val dateStarted: Long): User {

    var videoClub = VideoClub()
    override fun menu(videoClub: VideoClub) {
        this.videoClub = videoClub
        salesmanMenu()
    }

    private fun salesmanMenu() {
        val context = SalesmanContext()
        do {
            println("${FIRST_OPTION.value}. rentar pelicula")
            println("${SECOND_OPTION.value}. vender pelicula")
            println("${THIRD_OPTION.value}. devolver pelicula")
            println("${FOURTH_OPTION.value}. verificar pelicula")
            println("${EXIT_OPTION.value}. salir")
            println("ingrese una opcion: ")
            val option: String = readLine()!!
            context.startOption(this,option)
        } while (option != Options.EXIT_OPTION.value)
    }

     fun verifyMovieState() {
        videoClub.isMovieAvailable()
    }

     fun receivesDevolution() {
        videoClub.receivesDevolution()
    }

     fun sellMovie() {
        videoClub.sellMovie()
    }
     fun rentMovie() {
        println("ingrese nombre de pelicula: ")
        var movieName = readLine()!!
        println("ingrese nombre de usuario: ")
        var username = readLine()!!
        videoClub.rentMovie(movieName, username)
    }
}
