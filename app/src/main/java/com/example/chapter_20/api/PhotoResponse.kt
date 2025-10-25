package com.example.chapter_20.api


import com.example.chapter_20.api.GalleryItem
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PhotoResponse(
    @Json(name = "photos") val galleryItems:List<GalleryItem>
)