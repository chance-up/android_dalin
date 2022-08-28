package com.example.android_dalin.user.data

import com.google.gson.annotations.SerializedName


data class SubCategorys(
    @SerializedName("total_count")
    val common:Common,
    @SerializedName("items")
    val data:Data<ArrayList<SubCategory>>
)

data class SubCategory(
    val subCategoryId:String,
    val subCategoryNm:String,
    val imgUrl:String,
    val desc:String
)