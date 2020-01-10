import java.util.*

class Associate(override val name: String,
                override val address: String,
                override val number: Int,
                override val dateOfBirth: Long,
                override val dateStarted: Long,
                var moviesRented: MutableList<Movie> = mutableListOf()):User{

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

    override fun menu() {
        associateMenu()
    }

    private fun associateMenu() {
        do {
            println("1. mostrar peliculas disponibles")
            println("2. ordenar peliculas por genero")
            println("3. ordenar peliculas por director")
            println("4. ordenar peliculas por actores")
            println("0. salir")
            println("ingrese una opcion: ")
            var op: String? = readLine()
            println("\u001Bc")
            when (op) {
                "1" -> {
                    showMovies()
                }
                "2" -> {
                    sortByGenre()
                    showMovies()
                }
                "3" -> {
                    sortByDirector()
                    showMovies()
                }
                "4" -> {
                    sortByActors()
                    showMovies()
                }
            }

        } while (op != "0")
    }
}