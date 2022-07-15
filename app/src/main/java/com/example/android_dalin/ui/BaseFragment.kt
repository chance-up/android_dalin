package com.example.android_dalin.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android_dalin.R
import com.example.android_dalin.databinding.FragmentBaseBinding


class BaseFragment : Fragment() {
    private lateinit var baseFragmentBinding: FragmentBaseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        baseFragmentBinding = FragmentBaseBinding.inflate(inflater, container, false)
        return baseFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            it.supportFragmentManager.beginTransaction().replace(baseFragmentBinding.layoutView.id, HomeFragment()).commit()
        }

        baseFragmentBinding.bottomNavigationView.run {
            setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.home -> {
                        Log.d("msg", "home")
                        activity?.let {
                            it.supportFragmentManager.beginTransaction().replace(baseFragmentBinding.layoutView.id, HomeFragment()).commit()
                        }
                    }
                    R.id.estimate -> {
                        Log.d("msg", "est")
                        activity?.let {
                            it.supportFragmentManager.beginTransaction().replace(baseFragmentBinding.layoutView.id, EstimateFragment()).commit()
                        }
                    }
                    R.id.search -> {
                        Log.d("msg", "search")
                        activity?.let {
                            it.supportFragmentManager.beginTransaction().replace(baseFragmentBinding.layoutView.id, SearchFragment()).commit()
                        }
                    }
                    R.id.chat -> {
                        Log.d("msg", "chat")
                        activity?.let {
                            it.supportFragmentManager.beginTransaction().replace(baseFragmentBinding.layoutView.id, ChatFragment()).commit()
                        }
                    }
                    R.id.profile -> {
                        Log.d("msg", "profile")
                        activity?.let {
                            it.supportFragmentManager.beginTransaction().replace(baseFragmentBinding.layoutView.id, ProfileFragment()).commit()
                        }
                    }
                }
                true
            }
        }
    }
}