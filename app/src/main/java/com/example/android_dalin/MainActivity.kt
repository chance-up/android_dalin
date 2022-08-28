package com.example.android_dalin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.android_dalin.dalin.ui.views.DalinActivity
import com.example.android_dalin.user.ui.views.UserActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeActivity(1)
        Log.d("11111", this@MainActivity.toString())
    }

    fun changeActivity(index: Int) {
        Log.d("11111", this@MainActivity.toString())

        when (index) {
            1 -> {
                startActivity(Intent(this, UserActivity()::class.java))
            }
            2 -> {
                startActivity(Intent(this, DalinActivity()::class.java))
            }
        }
    }
}