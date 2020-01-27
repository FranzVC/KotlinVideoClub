import entities.*

class UserMenuStrategy(val users: List<User>) {

    fun showMenu(name: String, videoClub: VideoClub) {
        val userFound = findUserByName(name)
        when (userFound) {
            is Associate -> {
                val associate: Associate = userFound
                associate.menu(videoClub)
            }
            is Administrator -> {
                val administrator: Administrator = userFound
                administrator.menu(videoClub)
        }
            is Cashier -> {
                val cashier: Cashier = userFound
                cashier.menu(videoClub)
            }
            is Salesman -> {
                val salesman: Salesman = userFound
                salesman.menu(videoClub)
            }
        }
    }

    private fun findUserByName(name: String): User? {
        return users.find { it.name == name }
    }
}