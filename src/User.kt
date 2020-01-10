import java.util.*

interface User/*(val name: String, val address: String, val number: Int, val dateOfBirth: Date, val dateStarted: Date) */{
    val name: String
    val address: String
    val number: Int
    val dateOfBirth: Long
    val dateStarted: Long
    fun menu()
}
