import java.util.*

open class User(val name: String, val address: String, val number: Int, val dateOfBirth: Date, val dateStarted: Date) {
    override fun toString(): String {
        return "name: $name, address: $address, number: $number,"
    }
}
