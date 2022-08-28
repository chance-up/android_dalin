package com.example.android_dalin.user.api

import com.example.android_dalin.user.data.SubCategorys
import retrofit2.http.GET
import retrofit2.http.Query

interface SubCategoryApi {
    @GET("subSubCategory/getSubCategorys")
    suspend fun getSubCategorys(
        @Query("categoryId") q: String?
    ): SubCategorys
}