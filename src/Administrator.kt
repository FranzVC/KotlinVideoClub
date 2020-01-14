import User.Companion.EXIT_OPTION

class Administrator(override val name: String, override val address: String, override val number: Int, override val dateOfBirth: Long, override val dateStarted: Long):User{
    val DELETE_MOVIE_OPTION = "1"
    val REGISTER_MOVIE_OPTION = "2"
    val REGISTER_COPIES_OPTION = "3"
    val REGISTER_ASSOCIATE_OPTION = "4"
    val REGISTER_SALESMAN_OPTION = "5"

    override fun menu() {
        administratorMenu()
    }

    /** TODO: Need to refactor these part maybe you need to think something design patter like factory or strategy **/
    private fun administratorMenu() {
        do {
            println("$DELETE_MOVIE_OPTION. eliminar pelicula")
            println("$REGISTER_MOVIE_OPTION. registrar pelicula")
            println("$REGISTER_COPIES_OPTION. aumentar copias de pelicula")
            println("$REGISTER_ASSOCIATE_OPTION. registrar asociado")
            println("$REGISTER_SALESMAN_OPTION. registrar salesman")
            println("$EXIT_OPTION. salir")
            println("ingrese una opcion: ")
            var op: String? = readLine()
            println("\u001Bc")
            when (op) {
                DELETE_MOVIE_OPTION -> {
                    deleteMovie()
                }
                REGISTER_MOVIE_OPTION -> {
                    registerMovie()
                }
                REGISTER_COPIES_OPTION -> {
                    registerMovieCopies()
                }
                REGISTER_ASSOCIATE_OPTION -> {
                    registerAssociate()
                }
                REGISTER_SALESMAN_OPTION -> {
                    registerSalesman()
                }
            }

        } while (op != EXIT_OPTION)
    }

    private fun registerSalesman() {
        club.registerSalesman()
    }

    private fun registerAssociate() {
        club.registerAssociate()
    }

    private fun registerMovieCopies() {
        club.registerMovieCopies()
    }

    private fun deleteMovie() {
        club.deleteMovie()
    }

    private fun registerMovie() {
        club.registerMovie()
    }
}
