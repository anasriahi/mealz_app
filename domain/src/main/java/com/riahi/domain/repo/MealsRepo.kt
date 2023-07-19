package com.riahi.domain.repo

import com.riahi.domain.entity.CategoryResponse

interface MealsRepo {
    fun getMealsFromRemote(): CategoryResponse
}