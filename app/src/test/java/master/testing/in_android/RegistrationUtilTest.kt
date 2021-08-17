package master.testing.in_android

import com.google.common.truth.Truth.assertThat
import org.junit.Test

/* Belong Here In Test Directly
*  Coz this fun does not relay on a component
*     (activity or fragment)
*     Runs With VM
*     assertThat -> Google Truth Imp
*     import com.google.common.truth.Truth.assertThat
* */
class RegistrationUtilTest {

    /*
    TDD
    * Here Test Cases before Implementation RegistrationUtil
    *
    * */

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        /*
        * googleTruth!
        *
        * */
        assertThat(result).isFalse()
    }




}