import User.Companion.EXIT_OPTION

var club = VideoClub()
var username = "username"

fun main(args: Array<String>) {
    val associate = Associate("luis", "av. america #11", 77407521, 12122019, 20191212)
    val cashier = Cashier("cash", "av. america #11", 77407521, 12122019, 20191212)
    val administrator = Administrator("admin", "av. america #11", 77407521, 12122019, 20191212)
    val salesman = Salesman("sales", "av. america #11", 77407521, 12122019, 20191212)
    val movie = Movie("IT", 20.0, 2018, "asdas", "dasdasdasd", "EN", "ES,EU,IT", "terror", 120, "premiere", true, 8)

    club.movies.add(movie)

    club.users.add(administrator)
    club.administrators.add(administrator)

    club.users.add(associate)
    club.associates

    club.users.add(cashier)
    club.cashiers.add(cashier)

    club.users.add(salesman)
    club.salesMans.add(salesman)

    username.let {
        do {
            println("ingrese su nombre de usuario")
            username = readLine()!!
            val userValidatorFactory = UserValidatorFactory(club.users).validateUser(username)
            userValidatorFactory?.menu()

        } while (username != EXIT_OPTION)
    }
}






