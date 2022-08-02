package com.example.android_dalin.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_dalin.MainActivity
import com.example.android_dalin.R
import com.example.android_dalin.databinding.FragmentDalinLoginBinding

class DalinLoginFragment : Fragment() {
    private lateinit var fragmentDalinLoginBinding: FragmentDalinLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentDalinLoginBinding = FragmentDalinLoginBinding.inflate(inflater,container,false)
        return fragmentDalinLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mActivity = activity as MainActivity

        fragmentDalinLoginBinding.buttonChangeUser.setOnClickListener {
            mActivity.changeFragment(1)
        }


    }

}