import entities.Salesman
import utils.Options

class SalesmanContext {
    fun startOption(user: Salesman, option: String) {
        when (option) {
            Options.FIRST_OPTION.value -> {
                user.rentMovie()
            }
            Options.SECOND_OPTION.value  -> {
                user.sellMovie()
            }
            Options.THIRD_OPTION.value  -> {
                user.receivesDevolution()
            }
            Options.FOURTH_OPTION.value  -> {
                user.verifyMovieState()
            }
        }
    }
}