package com.riahi.data.repo

import com.riahi.data.remote.ApiService
import com.riahi.domain.entity.CategoryResponse
import com.riahi.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService): MealsRepo {
    override fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}