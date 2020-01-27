import entities.Administrator
import utils.Options

class AdministratorContext {

    fun startOption(user: Administrator, option: String) {
        when (option) {
            Options.FIRST_OPTION.value -> {
                user.deleteMovie()
            }
            Options.SECOND_OPTION.value -> {
                user.registerMovie()
            }
            Options.THIRD_OPTION.value -> {
                user.registerMovieCopies()
            }
            Options.FOURTH_OPTION.value -> {
                user.registerAssociate()
            }
            Options.FIFTH_OPTION.value -> {
                user.registerSalesman()
            }
        }
    }
}