package com.example.android_dalin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_dalin.ui.dalin.DalinLoginFragment
import com.example.android_dalin.ui.user.views.UserLoginFragment
import com.example.android_dalin.ui.dalin.DalinActivity
import com.example.android_dalin.ui.user.views.UserActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeFragment(1)
    }
    fun changeFragment(index: Int){
        when(index){
            1 -> {
                supportFragmentManager.beginTransaction().replace(R.id.layoutLogin, UserLoginFragment()).commit()
            }
            2 -> {
                supportFragmentManager.beginTransaction().replace(R.id.layoutLogin, DalinLoginFragment()).commit()
            }
        }
    }

    fun changeActivity(index: Int){
        when(index){
            1 -> {
                startActivity(Intent(this, UserActivity()::class.java))
            }
            2 -> {
                startActivity(Intent(this, DalinActivity()::class.java))
            }
        }
    }
}
