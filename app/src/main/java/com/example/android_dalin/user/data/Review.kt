package com.example.android_dalin.user.data

data class Review(
    val id: String,
    val userId: String,
    val svcId: String,
    val reviewId: String,
    val reviewImg: String,
    val reviewScore: Double,
    val reviewContent: String
)