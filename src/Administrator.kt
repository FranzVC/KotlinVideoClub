import java.util.* /** TODO: neeed to remove this because is not necessary */

class Administrator(override val name: String, override val address: String, override val number: Int, override val dateOfBirth: Long, override val dateStarted: Long):User{
    override fun menu() {
        administratorMenu()
    }

    private fun administratorMenu() {
        do {
            println("1. eliminar pelicula")
            println("2. registrar pelicula")
            println("3. aumentar copias de pelicula")
            println("4. registrar asociado")
            println("5. registrar salesman")
            println("0. salir")
            println("ingrese una opcion: ")
            var op: String? = readLine()
            println("\u001Bc")
            /** TODO: Avoid to use magic numbers **/
            when (op) {
                "1" -> {
                    deleteMovie()
                }
                "2" -> {
                    registerMovie()
                }
                "3" -> {
                    registerMovieCopies()
                }
                "4" -> {
                    registerAssociate()
                }
                "5" -> {
                    registerSalesman()
                }
            }

        } while (op != "0") /** TODO: What this magic number means **/
    }
}
