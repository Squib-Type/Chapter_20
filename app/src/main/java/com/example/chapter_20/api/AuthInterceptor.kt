package com.example.chapter_20.api

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("Authorization", "0ZWNh5XVSfhtDcA448j01aoJYNb6XhWRDniZq4o2Wzl8hqcowhADWCVj")
            .build()
        return chain.proceed(request)
    }
}