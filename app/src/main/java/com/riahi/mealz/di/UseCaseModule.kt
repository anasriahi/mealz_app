package com.riahi.mealz.di

import com.riahi.domain.repo.MealsRepo
import com.riahi.domain.usecase.GetMealz
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideUseCase(mealsRepo: MealsRepo): GetMealz {
        return GetMealz(mealsRepo)
    }
}