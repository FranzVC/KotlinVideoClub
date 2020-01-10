class UserValidatorFactory(val users: MutableList<User> = mutableListOf()) {

    fun validateUser(name: String): User? {
        val userFound = findUserByName(name)
        return when (userFound) {
            is Associate -> {
                userFound
            }
            is Salesman -> {
                userFound
            }
            is Cashier -> {
                userFound
            }
            is Administrator -> {
                userFound
            }
            else -> null
        }
    }

    private fun findUserByName(name: String): User? {
        return users.find { it.name == name }
    }
}