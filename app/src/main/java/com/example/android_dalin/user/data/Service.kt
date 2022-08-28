package com.example.android_dalin.user.data

data class Service(
    val id: String,
    val dalinNm: String,
    val dalinId: String,
    val svcId: String,
    val svcNm: String,
    val svcImg: String, //
    val svcThumbnail: String,
    val svcScore: Double, //
    val svcPrice:Double,
    val svcAvgPrice: Double, //
    val desc: String,
    val place: String,
)
