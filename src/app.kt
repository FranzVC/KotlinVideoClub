import java.util.*

var club = VideoClub()
var username = "username"

fun main(args: Array<String>) {
    var associate = Associate("luis", "av. america #11", 77407521, 12122019, 20191212)
    var cashier = Cashier("cash", "av. america #11", 77407521, 12122019, 20191212)
    var administrator = Administrator("admin", "av. america #11", 77407521, 12122019, 20191212)
    var salesman = Salesman("sales", "av. america #11", 77407521, 12122019, 20191212)
    var movie = Movie("IT", 20.0, 2018, "asdas", "dasdasdasd", "EN", "ES,EU,IT", "terror", 120, "premiere", true, 8)

    club.movies.add(movie)
    club.users.add(administrator)
    club.users.add(associate)
    club.users.add(cashier)
    club.users.add(salesman)

    username?.let {
        do {
            println("ingrese su nombre de usuario")
            username = readLine()!!
            var userValidatorFactory = UserValidatorFactory(club.users).validateUser(username)
            userValidatorFactory?.menu()

        } while (username != "0")
    }
}



fun registerSalesman() {
    club.registerSalesman()
}

fun registerAssociate() {
    club.registerAssociate()
}

fun registerMovieCopies() {
    club.registerMovieCopies()
}

fun deleteMovie() {
    club.deleteMovie()
}

fun registerMovie() {
    club.registerMovie()
}

fun sortByActors() {
    club.showMoviesByActors()
}

fun sortByDirector() {
    club.showMoviesByDirector()
}

fun sortByGenre() {
    club.showMoviesByGenre()
}

fun showMovies() {
    club.showMovies()
}

fun verifyMovieState() {
    club.isMovieAvailable()
}

fun receivesDevolution() {
    club.receivesDevolution()
}

fun sellMovie() {
    club.sellMovie()
}

fun rentMovie() {
    println("ingrese nombre de pelicula: ")
    var movieName = readLine()!!
    println("ingrese nombre de usuario: ")
    var username = readLine()!!
    club.rentMovie(movieName, username)
}

fun showEarnings() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

