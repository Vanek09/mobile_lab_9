package com.chisw.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.chisw.lab7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val student = Student("Vasya", "TEF", "TI-91")

        Log.d("GG", student.toString())
        Log.d("GG", student.getInfo())
    }
}