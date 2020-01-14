import User.Companion.EXIT_OPTION

class Associate(override val name: String,
                override val address: String,
                override val number: Int,
                override val dateOfBirth: Long,
                override val dateStarted: Long,
                var moviesRented: MutableList<Movie> = mutableListOf()):User{

    val SHOW_MOVIES_OPTION = "1"
    val SORT_BY_GENRE_OPTION = "2"
    val SORT_BY_DIRECTOR_OPTION = "3"
    val SORT_BY_ACTORS_OPTION = "4"

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

    /** TODO: Need to refactor these part maybe you need to think something design patter like factory or strategy **/
    private fun associateMenu() {
        do {
            println("$SHOW_MOVIES_OPTION. mostrar peliculas disponibles")
            println("$SORT_BY_GENRE_OPTION. ordenar peliculas por genero")
            println("$SORT_BY_DIRECTOR_OPTION. ordenar peliculas por director")
            println("$SORT_BY_ACTORS_OPTION. ordenar peliculas por actores")
            println("$EXIT_OPTION. salir")
            println("ingrese una opcion: ")
            var op: String? = readLine()
            println("\u001Bc")
            when (op) {
                SHOW_MOVIES_OPTION -> {
                    showMovies()
                }
                SORT_BY_GENRE_OPTION -> {
                    sortByGenre()
                    showMovies()
                }
                SORT_BY_DIRECTOR_OPTION -> {
                    sortByDirector()
                    showMovies()
                }
                SORT_BY_ACTORS_OPTION -> {
                    sortByActors()
                    showMovies()
                }
            }

        } while (op != EXIT_OPTION)
    }

    private fun sortByActors() {
        club.showMoviesByActors()
    }

    private fun sortByDirector() {
        club.showMoviesByDirector()
    }

    private fun sortByGenre() {
        club.showMoviesByGenre()
    }

    private fun showMovies() {
        club.showMovies()
    }
}