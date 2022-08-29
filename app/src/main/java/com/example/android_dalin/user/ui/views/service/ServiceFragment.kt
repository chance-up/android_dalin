package com.example.android_dalin.user.ui.views.service

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.android_dalin.databinding.FragmentServiceBinding
import com.example.android_dalin.user.ui.viewmodels.ServiceViewModel

class ServiceFragment : Fragment() {
private lateinit var serviceFragmentBinding:FragmentServiceBinding
private val serviceViewModel:ServiceViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        serviceFragmentBinding = FragmentServiceBinding.inflate(inflater,container,false).apply {
            vm=serviceViewModel
            lifecycleOwner=this@ServiceFragment
        }

        return serviceFragmentBinding.root
    }

}