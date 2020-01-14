import User.Companion.EXIT_OPTION

class Salesman(override val name: String, override val address: String, override val number: Int, override val dateOfBirth: Long, override val dateStarted: Long):User{
    val RENT_MOVIE_OPTION = "1"
    val SELL_MOVIE_OPTION = "2"
    val RECIEVES_DEVOLUTION_OPTION = "3"
    val VERIFY_MOVIE_STATE_OPTION = "4"

    override fun menu() {
        salesmanMenu()
    }

    /** TODO: need to think to apply in some design pattern like factory method **/
    private fun salesmanMenu() {
        do {
            println("$RENT_MOVIE_OPTION. rentar pelicula")
            println("$SELL_MOVIE_OPTION. vender pelicula")
            println("$RECIEVES_DEVOLUTION_OPTION. devolver pelicula")
            println("$VERIFY_MOVIE_STATE_OPTION. verificar pelicula")
            println("$EXIT_OPTION. salir")
            println("ingrese una opcion: ")
            var op: String? = readLine()
            println("\u001Bc")
            when (op) {
                RENT_MOVIE_OPTION -> {
                    rentMovie()
                }
                SELL_MOVIE_OPTION -> {
                    sellMovie()
                }
                RECIEVES_DEVOLUTION_OPTION -> {
                    receivesDevolution()
                }
                VERIFY_MOVIE_STATE_OPTION -> {
                    verifyMovieState()
                }
            }

        } while (op != EXIT_OPTION)
    }

    private fun verifyMovieState() {
        club.isMovieAvailable()
    }

    private fun receivesDevolution() {
        club.receivesDevolution()
    }

    private fun sellMovie() {
        club.sellMovie()
    }
    private fun rentMovie() {
        println("ingrese nombre de pelicula: ")
        var movieName = readLine()!!
        println("ingrese nombre de usuario: ")
        var username = readLine()!!
        club.rentMovie(movieName, username)
    }


}
