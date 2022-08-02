package com.example.android_dalin.ui.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_dalin.R


class EstimateFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // todo 1. data binding,
        // todo 2, List adapter

        return inflater.inflate(R.layout.fragment_estimate, container, false)
    }

}