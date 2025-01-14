package com.example.storyapp2.utils

import android.content.Context
import com.example.storyapp2.data.api.ApiConfig
import com.example.storyapp2.data.api.StoryRepository
import com.example.storyapp2.data.local.UserPreference
object Injection {
    fun provideRepository(context: Context): StoryRepository {
        val apiService = ApiConfig.getApiService()
        val pref = com.example.storyapp2.data.UserPreference(context)
        return StoryRepository(apiService, pref)
    }
}