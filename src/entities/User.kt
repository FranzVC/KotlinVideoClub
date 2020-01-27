package entities

interface User{
    val name: String
    val address: String
    val number: Int
    val dateOfBirth: Long
    val dateStarted: Long

    fun menu(videoClub: VideoClub)
}