class Movie(val title: String,
            var price: Double,
            val filmedYear: Int,
            val directors: String,
            val actors: String,
            val language: String,
            val availableLanguages: String,
            val filmGenre: String,
            val duration: Int,
            var popularity: String,
            var state: Boolean = true,
            var quantity: Int) {
    override fun toString(): String {
        return "title: $title, filmedYear: $filmedYear, language: $language"
    }
}