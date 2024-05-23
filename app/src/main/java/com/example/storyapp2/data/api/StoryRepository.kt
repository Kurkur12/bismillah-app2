package com.example.storyapp2.data.api

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.example.storyapp2.data.StoryPagingSource


class StoryRepository(private val apiService: ApiService, private val pref: com.example.storyapp2.data.UserPreference) {

    val token = pref.getToken()

    fun getAllStories(): LiveData<PagingData<ListStoryItem>> {
        return Pager(
            config = PagingConfig(
                pageSize = 5
            ),
            pagingSourceFactory = {
                StoryPagingSource(apiService, token.toString())
            }
        ).liveData
    }

}