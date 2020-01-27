package entities

import CashierContext
import utils.Options.*

class Cashier(override val name: String,
              override val address: String,
              override val number: Int,
              override val dateOfBirth: Long,
              override val dateStarted: Long) : User {

    private var videoClub = VideoClub()
    override fun menu(videoClub: VideoClub) {
        this.videoClub = videoClub
        cashierMenu()
    }

    private fun cashierMenu() {
        val context = CashierContext()
        do {
            println("${FIRST_OPTION.value}. registrar devolucion tardia")
            println("${SECOND_OPTION.value}. ver ingresos")
            println("${EXIT_OPTION.value}. salir")
            println("ingrese una opcion: ")
            var option: String = readLine()!!

            context.startOption(this,option)
        } while (option != EXIT_OPTION.value)
    }

    fun showEarnings() {
    }

    fun receivesDevolution() {
        videoClub.receivesDevolution()
    }
}
