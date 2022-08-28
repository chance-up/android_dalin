package com.example.android_dalin.user.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_dalin.user.data.SubCategory

//@HiltViewModel
class SubCategoryViewModel: ViewModel() {
    private val _subCategories = MutableLiveData<ArrayList<SubCategory>>()
    val subCategories: LiveData<ArrayList<SubCategory>> = _subCategories

    init {
        _subCategories.value = arrayListOf(
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
            SubCategory(
                "4", "입주청소",
                "https://dalin-bucket.s3.ap-northeast-2.amazonaws.com/static/b0284898-4f31-41c3-a94e-a8a20ca44fcfsample1.png",
                "샘플 설명"
            ),
            SubCategory(
                "5", "에어컨청소",
                "https://dalin-bucket.s3.ap-northeast-2.amazonaws.com/static/b0284898-4f31-41c3-a94e-a8a20ca44fcfsample1.png",
                "샘플 설명"
            ),
            SubCategory(
                "6", "세탁기청소",
                "https://dalin-bucket.s3.ap-northeast-2.amazonaws.com/static/b0284898-4f31-41c3-a94e-a8a20ca44fcfsample1.png",
                "샘플 설명"
            ),
        )
    }

//    fun getList() = subCategoryApiRepo.getSubCategories()
//


}