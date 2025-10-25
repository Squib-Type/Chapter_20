package com.example.chapter_20.api

import com.example.chapter_20.api.PhotoResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface PexelApi {
    @GET("curated")
    suspend fun fetchPhotos(@Query("per_page") perPage: Int = 100,
                            @Query("page") page: Int = 3): PhotoResponse
}