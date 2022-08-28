package com.example.android_dalin.user.ui.views.subcategory

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.android_dalin.R
import com.example.android_dalin.databinding.FragmentSubCategoryBinding
import com.example.android_dalin.user.adapter.SubCategoryAdapter
import com.example.android_dalin.user.ui.viewmodels.SubCategoryViewModel
import com.example.android_dalin.user.ui.views.UserLoginFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SubCategoryFragment : Fragment() {
    private lateinit var subCategoryFragmentBinding: FragmentSubCategoryBinding
    private val subCategoryViewModel: SubCategoryViewModel by viewModels()

    @Inject
    lateinit var subCategoryAdapter: SubCategoryAdapter

    private val args:SubCategoryFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        subCategoryFragmentBinding =
            FragmentSubCategoryBinding.inflate(inflater, container, false).apply {
                vm = subCategoryViewModel
                lifecycleOwner = this@SubCategoryFragment
            }

        Log.d("aggag",args.subCategoryType.toString())
        val toolBar = subCategoryFragmentBinding.toolbarSubCategory
        toolBar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
        toolBar.setNavigationOnClickListener {
            Navigation.findNavController(it).popBackStack()
        }
//        subCategoryFragmentBinding.recyclerViewSubCategory.apply {
//            layoutManager = GridLayoutManager(this, 2)
//        }
        subCategoryFragmentBinding.recyclerViewSubCategory.adapter = subCategoryAdapter
            .apply {
                onClickSubCategory = { idx: Int, str: String ->
                    Log.d("ccs", "$idx :: $str")
                    val navToService = SubCategoryFragmentDirections.actionSubCategoryFragmentToServiceFragment("1")
                    Navigation.findNavController(view!!).navigate(navToService)
                }
            }


        return subCategoryFragmentBinding.root
    }


    private fun showList() {
//        subCategoryViewModel.getList()
    }
}