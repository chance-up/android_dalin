package com.example.android_dalin.ui.user.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_dalin.data.Advertise

class AdvertiseViewModel:ViewModel() {
    private val _advertises = MutableLiveData<ArrayList<Advertise>>()
    val advertises: LiveData<ArrayList<Advertise>> = _advertises

    init {
        _advertises.value = arrayListOf(
            Advertise("https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1535669%3Ftimestamp%3D20220122164430"),
            Advertise("https://cdn.pixabay.com/photo/2016/03/04/01/46/bottles-1235327_960_720.jpg"),
            Advertise("https://cdn.pixabay.com/photo/2012/05/03/23/13/cat-46676__340.png")
        )
    }
}