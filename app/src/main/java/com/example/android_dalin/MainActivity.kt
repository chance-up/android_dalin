package com.example.android_dalin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.android_dalin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivityBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(mainActivityBinding.navHostFragmentContainer.id) as NavHostFragment
        val navController = navHostFragment.findNavController()
        mainActivityBinding.bottomNavView.setupWithNavController(navController)
    }
}
