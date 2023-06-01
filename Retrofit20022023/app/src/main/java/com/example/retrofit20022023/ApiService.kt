package com.example.retrofit20022023

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("posts/1")
    fun getPost1(): Call<Post>
}
