import utils.Options.*
import entities.Associate

class AssociateContext {
    fun startOption(user: Associate, option:String) {
        when (option) {
            FIRST_OPTION.value -> {
                user.showMovies()
            }

            SECOND_OPTION.value -> {
                user.sortByGenre()
                user.showMovies()
            }

            THIRD_OPTION.value -> {
                user.sortByDirector()
                user.showMovies()
            }

            FOURTH_OPTION.value -> {
                user.sortByActors()
                user.showMovies()
            }
        }
    }
}
