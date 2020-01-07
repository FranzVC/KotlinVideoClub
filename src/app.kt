import java.util.*

open class User(val name: String, val address: String, val number: Int, val dateOfBirth: Date, val dateStarted: Date) {
    override fun toString(): String {
        return "name: $name, address: $address, number: $number,"
    }
}

class Associate(name: String, address: String, number: Int, dateOfBirth: Date, dateStarted: Date, var moviesRented: MutableList<Movie> = mutableListOf()) : User(name, address, number, dateOfBirth, dateStarted) {
    override fun toString(): String {
        return "name: $name, address: $address, number: $number," + moviesRented.toString()
    }
}

class Salesman(name: String, address: String, number: Int, dateOfBirth: Date, dateStarted: Date) : User(name, address, number, dateOfBirth, dateStarted)

class Cashier(name: String, address: String, number: Int, dateOfBirth: Date, dateStarted: Date) : User(name, address, number, dateOfBirth, dateStarted)

class Administrator(name: String, address: String, number: Int, dateOfBirth: Date, dateStarted: Date) : User(name, address, number, dateOfBirth, dateStarted)


class Movie(val title: String, val filmedYear: Int, val directors: String, val actors: String, val language: String, val availableLanguages: String, val filmGenre: String, val duration: Int, var popularity: String, var quantity: Int) {
    override fun toString(): String {
        return "title: $title, filmedYear: $filmedYear, language: $language"
    }
}


class VideoClub() {
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
}

fun main(args: Array<String>) {
    var club = VideoClub()
    var user = Associate("luis", "av. america #11", 77407521, Date(12122019), Date(20191212))
    var movie = Movie("IT", 2018, "asdas", "dasdasdasd", "EN", "ES,EU,IT", "terror", 120, "premiere", 8)

    club.movies.add(movie)
    club.users.add(user)

    var username = readLine()
    var option = 1
    username?.let {
        when (club.findUserByName(it)) {
            is Associate -> {
                do {
                    associateMenu()
                } while (option != 0)
            }
            is Salesman -> {
                do {
                    salesmanMenu()
                } while (option != 0)
            }
            is Cashier -> {
                do {
                    cashierMenu()
                } while (option != 0)
            }
            is Administrator -> {
                do {
                    administratorMenu()
                } while (option != 0)
            }
            else -> println("Not found")
        }
    }
}

fun associateMenu() {
    println("")
}

fun salesmanMenu() {
    println("")
}

fun cashierMenu() {
    println("")
}

fun administratorMenu() {
    println("")
}

