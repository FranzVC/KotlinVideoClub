import java.util.* /** TODO: need to remove this line because it is not necessary **/

class Cashier(override val name: String,
              override val address: String,
              override val number: Int,
              override val dateOfBirth: Long,
              override val dateStarted: Long) :User{
    override fun menu() {
        cashierMenu()
    }

    /** TODO: need to refactor this part using some design patter like factory method **/
    private fun cashierMenu() {
        do {
            println("1. registrar devolucion tardia")
            println("2. ver ingresos")
            println("0. salir")
            println("ingrese una opcion: ")
            var op: String? = readLine()
            println("\u001Bc")
            when (op) {
                "1" -> {
                    receivesDevolution()
                }
                "2" -> {
                    showEarnings()
                }
            }

        } while (op != "0")
    }
}
