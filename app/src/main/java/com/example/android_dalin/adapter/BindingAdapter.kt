package com.example.android_dalin.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.example.android_dalin.data.Advertise

object BindingAdapter {
    @BindingAdapter("items")
    @JvmStatic
    fun ViewPager2.setItems(ads:ArrayList<Advertise>){
        (this.adapter as ViewPagerAdapter).submitList(ads.toMutableList())
    }

    @BindingAdapter("imageUrl")
    @JvmStatic
    fun ImageView.loadImage(imageUrl : String) {
        Glide.with(context)
            .load(imageUrl)
            .error(com.example.android_dalin.R.drawable.ic_android_black_24dp)
            .into(this)
    }
}