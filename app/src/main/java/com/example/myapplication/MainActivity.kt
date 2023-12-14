package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       with(binding) {
           button.setOnClickListener {
               result.text = if(login.text.toString() == "login" &&
                   password.text.toString() == "123456")
                   getString(R.string.success)
               else
                   getString(R.string.failure)
           }
       }
    }
}