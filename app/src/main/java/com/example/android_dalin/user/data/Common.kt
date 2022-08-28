package com.example.android_dalin.user.data

data class Common(
    val code:Int,
    val message:String
)
data class Data<T>(
    val value:T,
    val pagination:Pagination
)
data class Pagination(
    val count:Int
)