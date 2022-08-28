package com.example.android_dalin.user.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_dalin.user.data.Service
import com.example.android_dalin.user.data.SubCategory

class ServiceViewModel : ViewModel() {
    private val _service = MutableLiveData<Service>()
    val service: LiveData<Service> = _service


    init {
        _service.value =
            Service(
                "1",
                "최찬섭",
                "ccs6473@naver.com",
                "1",
                "입주청소",
                "https://dalin-bucket.s3.ap-northeast-2.amazonaws.com/static/b0284898-4f31-41c3-a94e-a8a20ca44fcfsample1.png",
                "https://dalin-bucket.s3.ap-northeast-2.amazonaws.com/static/b0284898-4f31-41c3-a94e-a8a20ca44fcfsample1.png",
                5.0,
                1500.0,
                15000.0,
                "설명설명",
                "경기오산"
            )
    }

}