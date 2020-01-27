package entities

class Movie(val title: String,
            var price: Double,
            val filmedYear: Int,
            val directors: String,
            val language: String,
            val availableLanguages: String,
            val filmGenre: String,
            val duration: Int,
            var popularity: String,
            var state: Boolean = true) {
    val copies: MutableList<Copy> = mutableListOf()
    val actors: List<Actor> = emptyList()
    override fun toString(): String {
        return "title: $title, filmedYear: $filmedYear, language: $language"
    }
}