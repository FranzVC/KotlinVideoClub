class UserValidatorFactory(val users: MutableList<User> = mutableListOf()) {

    fun validateUser(name: String): User? {
        return findUserByName(name)
    }

    private fun findUserByName(name: String): User? {
        return users.find { it.name == name }
    }
}