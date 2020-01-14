
interface User{
    val name: String
    val address: String
    val number: Int
    val dateOfBirth: Long
    val dateStarted: Long

    companion object {
        val EXIT_OPTION = "0"
    }

    fun menu()
}
