package com.example.android_dalin.repository

import androidx.lifecycle.liveData
import com.example.android_dalin.api.SubCategoryApi
import com.example.android_dalin.data.ResultStatus
import com.example.android_dalin.data.SubCategory

import java.lang.Exception
import javax.inject.Inject

class SubCategoryApiRepository @Inject constructor(private val api:SubCategoryApi) {
    fun getSubCategories() = liveData {
        val tempValue = arrayListOf(
            SubCategory(
                "1", "입주청소",
                "https://dalin-bucket.s3.ap-northeast-2.amazonaws.com/static/b0284898-4f31-41c3-a94e-a8a20ca44fcfsample1.png",
                "샘플 설명"
            ),
            SubCategory(
                "2", "에어컨청소",
                "https://dalin-bucket.s3.ap-northeast-2.amazonaws.com/static/b0284898-4f31-41c3-a94e-a8a20ca44fcfsample1.png",
                "샘플 설명"
            ),
            SubCategory(
                "3", "세탁기청소",
                "https://dalin-bucket.s3.ap-northeast-2.amazonaws.com/static/b0284898-4f31-41c3-a94e-a8a20ca44fcfsample1.png",
                "샘플 설명"
            ),
        )

        emit(ResultStatus.Loading)
        try{
            emit(ResultStatus.Success(tempValue))
        } catch (e: Exception) {
            emit(ResultStatus.Error(e))
        }
    }
}