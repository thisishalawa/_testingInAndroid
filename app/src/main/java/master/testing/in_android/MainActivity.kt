package master.testing.in_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import master.testing.in_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
    /*
    *  Testing In Android
    *  Ui tests
    *  Integration tests (20% test cases)
    *  Unit tests (70% test cases)
    *
    * */

    /*
    * Unit tests
    * test single fun as example
    *
    * */

    /*
    *  Integration test
    *  test how different component interact with each other
    *  as ->
    *  how fragment interact with viewModel
    *
    * */

    /*
    *  Ui test
    *  interact user with design navigation
    *  Ui & and other stuff!
    * */


    /*

     $ Unit Tests $


    *  Test Driven Development
    *  TDD  (only for unit tests)
    *
    *  -  write tests before implementation
    *  -  write test cases for the fun
    *  example ->" RegistrationUtil.object "

      Good test ?
     - Scope - Speed - Fidelity

    * */
}