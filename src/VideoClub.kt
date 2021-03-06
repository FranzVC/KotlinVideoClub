import java.util.*

class VideoClub {
    var movies = mutableListOf<Movie>()
    var users = mutableListOf<User>()
    var associates = mutableListOf<Associate>()
    var salesmans = mutableListOf<Salesman>()
    var cashiers = mutableListOf<Cashier>()
    var administrators = mutableListOf<Administrator>()

    fun rentMovie(movieName: String, username: String) {

        val movieFound = searchMovie(movieName)
        movieFound?.let {
            val associate = associates.find { it.name == username }
            associate?.moviesRented?.add(movieFound)
        }
    }

    private fun searchMovie(movieName: String): Movie? {
        return movies.find { it.title == movieName }
    }

    fun findUserByName(username: String): User? {
        return users.find { it.name == username }
    }

    fun showMovies() {
        println("\ttitle\tprice\tduration\tgenre")
        for ((index, movie) in movies.filter { it.state }.withIndex()) {
            println("${index + 1} \t ${movie.title} \t ${movie.price} \t ${movie.duration}\t${movie.filmGenre}")

        }
        println("\n\n\n")
    }


    fun sellMovie() {
        println("ingrese nombre de pelicula: ")
        var movieName = readLine()
        movieName?.let {
            var movieToSell = searchMovie(movieName)
            movieToSell?.let {
                movieToSell.state = false
            }
        }
    }

    fun showMoviesByGenre() {
        movies.sortBy { it.filmGenre }
    }

    fun showMoviesByDirector() {
        movies.sortBy { it.directors }
    }

    fun showMoviesByActors() {
        movies.sortBy { it.actors }
    }

    fun registerMovie() {
        println("insert title :")
        val title: String = readLine()!!
        println("insert price :")
        var price: Double = readLine()!!.toDouble()
        println("insert filmed year :")
        val filmedYear: Int = readLine()!!.toInt()
        println("insert directors names :")
        val directors: String = readLine()!!
        println("insert actors names :")
        val actors: String = readLine()!!
        println("insert language :")
        val language: String = readLine()!!
        println("insert available languages :")
        val availableLanguages: String = readLine()!!
        println("insert film genre :")
        val filmGenre: String = readLine()!!
        println("insert duration :")
        val duration: Int = readLine()!!.toInt()
        println("insert popularity (premier,normal or on sale) :")
        var popularity: String = readLine()!!
        var state: Boolean = true
        println("insert quantity of copies :")
        var quantity: Int = readLine()!!.toInt()
        println("\n\n")

        var movie = Movie(title, price, filmedYear, directors, actors, language, availableLanguages, filmGenre, duration, popularity, state, quantity)
        movies.add(movie)

        println("movie inserted successfully!!")
    }

    fun deleteMovie() {
        println("ingrese nombre de la pelicula que desea eliminar:")
        var movieName = readLine()!!
        movies.remove(searchMovie(movieName))
    }

    fun registerMovieCopies() {
        println("ingrese nombre de la pelicula que desea aniadir copias:")
        var movieName = readLine()!!
        var movie = searchMovie(movieName)
        movie?.let {
            println("ingrese cantidad de copias para aniadir:")
            var quantity = readLine()!!.toInt()
            movie.quantity += quantity
        }
    }

    fun isMovieAvailable() {
        println("ingrese nombre de la pelicula que desea verificar:")
        var movieName = readLine()!!
        var movie = searchMovie(movieName)
        movie?.let {
            println("Disponible!!\n\n")
        }.also {
            println("NO Disponible\n\n")
        }
    }
}