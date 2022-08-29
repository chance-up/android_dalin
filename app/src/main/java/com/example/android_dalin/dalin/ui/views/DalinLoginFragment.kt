package com.example.android_dalin.dalin.ui.views

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_dalin.databinding.FragmentDalinLoginBinding
import com.example.android_dalin.user.ui.views.UserActivity

class DalinLoginFragment : Fragment() {
    private lateinit var fragmentDalinLoginBinding: FragmentDalinLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentDalinLoginBinding = FragmentDalinLoginBinding.inflate(inflater, container, false)
        return fragmentDalinLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        fragmentDalinLoginBinding.buttonLoginDalin.setOnClickListener {
        }
        fragmentDalinLoginBinding.buttonChangeUser.setOnClickListener {
            val dActivity = activity as DalinActivity
            dActivity.apply {
                startActivity(Intent(this, UserActivity::class.java))
            }
        }
    }

}