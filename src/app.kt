import entities.*
import utils.Options


fun main(args: Array<String>) {

    var videoClub = VideoClub()
    var username = "username"
    val associate = Associate("luis", "av. america #11", 77407521, 12122019, 20191212)
    val cashier = Cashier("cash", "av. america #11", 77407521, 12122019, 20191212)
    val administrator = Administrator("admin", "av. america #11", 77407521, 12122019, 20191212)
    val salesman = Salesman("sales", "av. america #11", 77407521, 12122019, 20191212)
    val movie = Movie("IT", 20.0, 2018, "asdas", "EN", "ES,EU,IT", "terror", 120, "premiere", true)

    videoClub.movies.add(movie)

    videoClub.users.add(administrator)
    videoClub.administrators.add(administrator)

    videoClub.users.add(associate)
    videoClub.associates

    videoClub.users.add(cashier)
    videoClub.cashiers.add(cashier)

    videoClub.users.add(salesman)
    videoClub.salesMans.add(salesman)

    username.let {
        do {
            println("ingrese su nombre de usuario")
            username = readLine()!!
            UserMenuStrategy(videoClub.users).showMenu(username,videoClub)
        } while (username != Options.EXIT_OPTION.value)
    }
}






