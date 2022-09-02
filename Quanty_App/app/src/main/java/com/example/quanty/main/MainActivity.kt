package com.example.quanty.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quanty.R

class MainActivity : AppCompatActivity() {


    //private lateinit var bindin

       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }

   /* private fun setupBottomNavigationBar() {
        val navGraphIds = listOf(
            R.navigation.home,
            R.navigation.movemenst,
            R.navigation.settings,
        )*/
}