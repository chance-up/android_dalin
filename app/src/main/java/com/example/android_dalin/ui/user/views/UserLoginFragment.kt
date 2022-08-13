package com.example.android_dalin.ui.user.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_dalin.MainActivity
import com.example.android_dalin.databinding.FragmentUserLoginBinding


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
            mActivity.changeActivity(1)
        }
        fragmentUserLoginBinding.buttonChangeDalin.setOnClickListener{
            mActivity.changeFragment(2)
        }
    }

}