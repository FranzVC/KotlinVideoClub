package entities

import AdministratorContext
import utils.Options.*

class Administrator(override val name: String, override val address: String, override val number: Int, override val dateOfBirth: Long, override val dateStarted: Long) : User {

    var videoClub = VideoClub()
    override fun menu(videoClub: VideoClub) {
        this.videoClub = videoClub
        administratorMenu()
    }

    private fun administratorMenu() {
        val context = AdministratorContext()
        do {
            println("${FIRST_OPTION.value}. eliminar pelicula")
            println("${SECOND_OPTION.value}. registrar pelicula")
            println("${THIRD_OPTION.value}. aumentar copias de pelicula")
            println("${FOURTH_OPTION.value}. registrar asociado")
            println("${FIFTH_OPTION.value}. registrar salesman")
            println("${EXIT_OPTION.value}. salir")
            println("ingrese una opcion: ")
            val option: String = readLine()!!

            context.startOption(this,option)
        } while (option != EXIT_OPTION.value)
    }

    fun registerSalesman() {
        videoClub.registerSalesman()
    }

    fun registerAssociate() {
        videoClub.registerAssociate()
    }

    fun registerMovieCopies() {
        videoClub.registerMovieCopies()
    }

    fun deleteMovie() {
        videoClub.deleteMovie()
    }

    fun registerMovie() {
        videoClub.registerMovie()
    }
}
