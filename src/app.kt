import java.util.*

var club = VideoClub()
var username = "username"

fun main(args: Array<String>) {
    var associate = Associate("luis", "av. america #11", 77407521, Date(12122019), Date(20191212))
    var cashier = Cashier("cash", "av. america #11", 77407521, Date(12122019), Date(20191212))
    var administrator = Administrator("admin", "av. america #11", 77407521, Date(12122019), Date(20191212))
    var salesman = Salesman("sales", "av. america #11", 77407521, Date(12122019), Date(20191212))
    var movie = Movie("IT", 20.0, 2018, "asdas", "dasdasdasd", "EN", "ES,EU,IT", "terror", 120, "premiere",true, 8)

    club.movies.add(movie)
    club.users.add(administrator)
    club.users.add(associate)
    club.users.add(cashier)
    club.users.add(salesman)

    username?.let {
        do {
            println("ingrese su nombre de usuario")
            username = readLine()!!

            when (club.findUserByName(username)) {
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
        } while (username != "0")
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

