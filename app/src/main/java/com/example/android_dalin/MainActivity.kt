package com.example.android_dalin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_dalin.ui.DalinLoginFragment
import com.example.android_dalin.ui.UserLoginFragment

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentUserLogin:UserLoginFragment
    private lateinit var fragmentDalinLogin:DalinLoginFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentUserLogin = UserLoginFragment()
        fragmentDalinLogin = DalinLoginFragment()
        changeFragment(1);
    }
    fun changeFragment(index: Int){
        when(index){
            1 -> {
                supportFragmentManager.beginTransaction().replace(R.id.layoutLogin, fragmentUserLogin).commit()
            }
            2 -> {
                supportFragmentManager.beginTransaction().replace(R.id.layoutLogin, fragmentDalinLogin).commit()
            }
        }
    }
}
