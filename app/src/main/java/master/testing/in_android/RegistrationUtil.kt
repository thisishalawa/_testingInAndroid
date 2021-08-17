package master.testing.in_android

object RegistrationUtil {

    /*   Object So do not create an instance to use its fun
    *
    *   Generate test class for  RegistrationUtil ?
    *   rightClick -> Generate -> Test -> junit4
    *
    * */

    private val existingUsers = listOf("Mohamed", "Halawa")

    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (userName.isEmpty() || password.isEmpty()) {
            return false
        }
        if (userName in existingUsers) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}