import java.util.* /**TODO: need to remove this line because it is not necessary **/

class Salesman(override val name: String, override val address: String, override val number: Int, override val dateOfBirth: Long, override val dateStarted: Long):User{
    override fun menu() {
        salesmanMenu()
    }

    /** TODO: need to think to apply in some design pattern like factory method **/
    private fun salesmanMenu() {
        do {
            println("1. rentar pelicula")
            println("2. vender pelicula")
            println("3. devolver pelicula")
            println("4. verificar pelicula")
            println("0. salir")
            println("ingrese una opcion: ")
            var op: String? = readLine()
            println("\u001Bc")
            when (op) {
                "1" -> {
                    rentMovie()
                }
                "2" -> {
                    sellMovie()
                }
                "3" -> {
                    receivesDevolution()
                }
                "4" -> {
                    verifyMovieState()
                }
            }

        } while (op != "0")
    }
}
