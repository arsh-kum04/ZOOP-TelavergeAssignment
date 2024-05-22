package com.example.zoop.client
import com.example.zoop.DataClasses.DataResponse

interface PostsService {
    suspend fun getPosts():List<DataResponse>
}