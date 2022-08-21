package com.example.android_dalin.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android_dalin.data.SubCategory
import com.example.android_dalin.databinding.ItemSubCategoryBinding
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

@FragmentScoped
class SubCategoryAdapter @Inject constructor() :
    ListAdapter<SubCategory, SubCategoryAdapter.MyViewHolder>(diffUtil) {

    var onClickSubCategory: ((Int,String) -> Unit)? = null



    inner class MyViewHolder(private val binding: ItemSubCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(subCategory: SubCategory) {
            binding.subCategory = subCategory
            binding.subCategoryItemView.setOnClickListener {
                Log.d("cccs","clisck1!!")
                onClickSubCategory?.invoke(layoutPosition,subCategory.subCategoryId)
                Log.d("cccs","clisck2!!")

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemSubCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.apply { bind(getItem(position)) }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<SubCategory>() {
            override fun areItemsTheSame(oldItem: SubCategory, newItem: SubCategory): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: SubCategory, newItem: SubCategory): Boolean {
                return oldItem.subCategoryId == newItem.subCategoryId
            }
        }
    }
}