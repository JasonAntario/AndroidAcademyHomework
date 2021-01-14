package com.example.androidacademyhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {

    private lateinit var container: FrameLayout
    private val fragmentMovieDetails = FragmentMovieDetails()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        container = findViewById(R.id.container)
        supportFragmentManager.beginTransaction().add(R.id.container, fragmentMovieDetails).commit()
    }
}