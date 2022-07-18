package com.example.android_dalin.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.android_dalin.adapter.ViewPagerAdapter
import com.example.android_dalin.databinding.FragmentHomeBinding
import com.example.android_dalin.ui.viewmodel.AdvertiseViewModel

class HomeFragment : Fragment() {
    private lateinit var homeFragmentBinding : FragmentHomeBinding
    private val advertiseViewModel: AdvertiseViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        homeFragmentBinding= FragmentHomeBinding.inflate(inflater,container,false).apply {
            homeVm=advertiseViewModel
            lifecycleOwner=this@HomeFragment
        }
        return homeFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager = homeFragmentBinding.advertiseViewpager
//        val tabLayout = homeFragmentBinding.advertiseIndicatorTablayout
        viewPager.adapter=ViewPagerAdapter()


    }

}