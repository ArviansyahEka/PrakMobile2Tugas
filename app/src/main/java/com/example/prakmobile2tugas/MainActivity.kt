package com.example.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.prakmobile2tugas.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding =
            ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            loginButton.setOnClickListener {
                val inputUsername = binding.username.text.toString()
                val inputPassword = binding.password.text.toString()

                if (inputUsername == "user" && inputPassword == "1234") {
                    Toast.makeText(this@MainActivity, "Login Successful!", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    Toast.makeText(this@MainActivity, "Login Failed!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
