package com.example.android_dalin.api

import com.example.android_dalin.data.SubCategorys
import retrofit2.http.GET
import retrofit2.http.Query

interface SubCategoryApi {
    @GET("subSubCategory/getSubCategorys")
    suspend fun getSubCategorys(
        @Query("categoryId") q: String?
    ): SubCategorys
}