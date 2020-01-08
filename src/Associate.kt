import java.util.*

class Associate(name: String, address: String, number: Int, dateOfBirth: Date, dateStarted: Date, var moviesRented: MutableList<Movie> = mutableListOf()) : User(name, address, number, dateOfBirth, dateStarted) {
    override fun toString(): String {
        return "name: $name, address: $address, number: $number," + moviesRented.toString()
    }
}