package com.example.android_dalin.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_dalin.MainActivity
import com.example.android_dalin.databinding.FragmentUserLoginBinding
import com.example.android_dalin.ui.user.UserActivity


class UserLoginFragment : Fragment() {
    lateinit var fragmentUserLoginBinding: FragmentUserLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentUserLoginBinding = FragmentUserLoginBinding.inflate(inflater,container,false)
        return fragmentUserLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mActivity = activity as MainActivity
        fragmentUserLoginBinding.buttonLogin.setOnClickListener{
            Log.d("ttt","ttttg")
//            mActivity?.let{
//                val intent = Intent(it, UserActivity::class.java)
//                it.startActivity(intent)
//            }

//            val intent = Intent (getActivity(), userActivity::class.java)
//            getActivity()?.startActivity(intent)

        }
        fragmentUserLoginBinding.buttonChangeDalin.setOnClickListener{
            mActivity.changeFragment(2)
        }
    }

}