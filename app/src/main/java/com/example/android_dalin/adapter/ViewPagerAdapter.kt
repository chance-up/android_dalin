package com.example.android_dalin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android_dalin.data.Advertise
import com.example.android_dalin.databinding.ItemAdvertiseBinding

class ViewPagerAdapter : ListAdapter<Advertise, ViewPagerAdapter.MyViewHolder>(diffUtil) {


    class MyViewHolder(private val binding: ItemAdvertiseBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(advertise: Advertise) {
            binding.ad = advertise
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemAdvertiseBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            bind(getItem(position))
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Advertise>() {
            override fun areItemsTheSame(oldItem: Advertise, newItem: Advertise): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Advertise, newItem: Advertise): Boolean {
                return oldItem.url == newItem.url
            }
        }
    }

}