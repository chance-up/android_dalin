package com.example.android_dalin.ui.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.android_dalin.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var activityUserBinding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityUserBinding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(activityUserBinding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(activityUserBinding.navHostFragmentContainer.id) as NavHostFragment
        val navController = navHostFragment.findNavController()
        activityUserBinding.bottomNavView.setupWithNavController(navController)
    }
}