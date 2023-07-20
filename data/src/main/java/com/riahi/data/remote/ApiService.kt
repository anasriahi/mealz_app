package com.riahi.data.remote

import com.riahi.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    fun getMeals(): CategoryResponse
}