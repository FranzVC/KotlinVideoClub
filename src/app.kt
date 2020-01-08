import java.util.*
var club = VideoClub()

fun main(args: Array<String>) {
    var user = Associate("luis", "av. america #11", 77407521, Date(12122019), Date(20191212))
    var movie = Movie("IT",20.0, 2018, "asdas", "dasdasdasd", "EN", "ES,EU,IT", "terror", 120, "premiere", false,8)

    club.movies.add(movie)
    club.users.add(user)
    println("ingrese su nombre de usuario")

    var username = readLine()
    username?.let {
        when (club.findUserByName(it)) {
            is Associate -> {
                associateMenu()
            }
            is Salesman -> {
                salesmanMenu()
            }
            is Cashier -> {
                cashierMenu()
            }
            is Administrator -> {
                administratorMenu()
            }
            else -> println("Not found")
        }
    }
}

fun associateMenu() {
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


fun salesmanMenu() {
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


fun cashierMenu() {
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

fun administratorMenu() {
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

    } while (op != "0")
}

fun registerSalesman() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

fun registerAssociate() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

fun sellMovie() {
    club.sellMovie()
}

fun rentMovie() {
    println()
    club.rentMovie()

}

fun showEarnings() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

