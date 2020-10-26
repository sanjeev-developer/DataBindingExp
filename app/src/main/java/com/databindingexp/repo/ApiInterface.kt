package com.leaderboard.repo

import com.databindingexp.model.ApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("4bd5a7f5-56fb-4d81-980a-998a070cf85f")
    fun fetchdata(): Call<ApiResponse>?
}