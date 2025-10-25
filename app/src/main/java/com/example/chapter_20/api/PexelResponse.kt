package com.example.chapter_20.api

import com.example.chapter_20.api.PhotoResponse
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class PexelResponse(
    val photos: PhotoResponse
)