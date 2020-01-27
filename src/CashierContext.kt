import entities.Cashier
import utils.Options

class CashierContext {
    fun startOption(user: Cashier, option: String) {
        when (option) {
            Options.FIRST_OPTION.value -> {
                user.receivesDevolution()
            }
            Options.SECOND_OPTION.value -> {
                user.showEarnings()
            }
        }
    }
}