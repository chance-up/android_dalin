package com.example.android_dalin.dalin.ui.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_dalin.databinding.ActivityDalinBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DalinActivity : AppCompatActivity() {
    private lateinit var activityDalinBinding: ActivityDalinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDalinBinding = ActivityDalinBinding.inflate(layoutInflater)
        setContentView(activityDalinBinding.root)
    }
}