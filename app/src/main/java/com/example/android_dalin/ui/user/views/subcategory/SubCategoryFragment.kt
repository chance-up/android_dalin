package com.example.android_dalin.ui.user.views.subcategory

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.android_dalin.R
import com.example.android_dalin.adapter.SubCategoryAdapter
import com.example.android_dalin.databinding.FragmentSubCategoryBinding
import com.example.android_dalin.ui.user.viewmodels.SubCategoryViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SubCategoryFragment : Fragment() {
    private lateinit var subCategoryFragmentBinding: FragmentSubCategoryBinding
    private val subCategoryViewModel: SubCategoryViewModel by viewModels()

    @Inject
    lateinit var subCategoryAdapter: SubCategoryAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        subCategoryFragmentBinding =
            FragmentSubCategoryBinding.inflate(inflater, container, false).apply {
                vm = subCategoryViewModel
                lifecycleOwner=this@SubCategoryFragment
            }
        val toolBar = subCategoryFragmentBinding.toolbarSubCategory
        toolBar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
        toolBar.setNavigationOnClickListener {
            Log.d("ccccc","customBurron!!")
        }

        subCategoryFragmentBinding.recyclerViewSubCategory.adapter = subCategoryAdapter
//        showList()


        return subCategoryFragmentBinding.root
    }


    private fun showList(){
//        subCategoryViewModel.getList()
    }
}