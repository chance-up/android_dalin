package com.example.android_dalin.user.ui.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.android_dalin.databinding.FragmentHomeBinding
import com.example.android_dalin.user.adapter.ViewPagerAdapter
import com.example.android_dalin.user.ui.viewmodels.AdvertiseViewModel

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
        val viewPager = homeFragmentBinding.advertiseViewpager
        viewPager.adapter=ViewPagerAdapter()

        val uActivity = activity as UserActivity
        homeFragmentBinding.buttonClean.setOnClickListener {
            // 이걸 번들로 전달하는 방법도 있다.
//            var tempArg:Int=0
//            val bundle = bundleOf("amount" to tempArg)
//            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_subCategoryFragment,bundle)


            val navToClean = HomeFragmentDirections.actionHomeFragmentToSubCategoryFragment(1)
            Navigation.findNavController(it).navigate(navToClean)
        }

        return homeFragmentBinding.root
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("cccc", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("cccc", "onDetach")

    }



}