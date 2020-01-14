import User.Companion.EXIT_OPTION

class Cashier(override val name: String,
              override val address: String,
              override val number: Int,
              override val dateOfBirth: Long,
              override val dateStarted: Long) :User{

    val RECIVES_DEVOLUTION_OPTION = "1"
    val SHOW_EARNINGS_OPTION = "2"
    override fun menu() {
        cashierMenu()
    }

    /** TODO: need to refactor this part using some design patter like factory method **/
    private fun cashierMenu() {
        do {
            println("$RECIVES_DEVOLUTION_OPTION. registrar devolucion tardia")
            println("$SHOW_EARNINGS_OPTION. ver ingresos")
            println("$EXIT_OPTION. salir")
            println("ingrese una opcion: ")
            var op: String? = readLine()
            println("\u001Bc")
            when (op) {
                RECIVES_DEVOLUTION_OPTION -> {
                    receivesDevolution()
                }
                SHOW_EARNINGS_OPTION -> {
                    showEarnings()
                }
            }

        } while (op != EXIT_OPTION)
    }

    private fun showEarnings() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun receivesDevolution() {
        club.receivesDevolution()
    }
}
