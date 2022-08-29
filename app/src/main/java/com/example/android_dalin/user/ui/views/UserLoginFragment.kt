package com.example.android_dalin.user.ui.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.android_dalin.dalin.ui.views.DalinActivity
import com.example.android_dalin.user.ui.views.UserActivity
import com.example.android_dalin.databinding.FragmentUserLoginBinding


class UserLoginFragment : Fragment() {
    lateinit var fragmentUserLoginBinding: FragmentUserLoginBinding
    private lateinit var userContext: Context
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentUserLoginBinding = FragmentUserLoginBinding.inflate(inflater, container, false)
        return fragmentUserLoginBinding.root
    }

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        userContext = context
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val mActivity = activity as MainActivity
        fragmentUserLoginBinding.buttonLogin.setOnClickListener {
            val navToHome = UserLoginFragmentDirections.actionUserLoginFragmentToHomeFragment()
            Navigation.findNavController(it).navigate(navToHome)
        }
        fragmentUserLoginBinding.buttonChangeDalin.setOnClickListener {
            val userActivity = activity as UserActivity
            userActivity.apply {
                startActivity(Intent(this, DalinActivity::class.java))
            }
        }
    }

}