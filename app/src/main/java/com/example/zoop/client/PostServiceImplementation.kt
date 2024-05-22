//package com.example.zoop.client
//import com.example.zoop.DataClasses.DataResponse
//import io.ktor.client.HttpClient
//import io.ktor.client.request.get
//import io.ktor.client.request.url
//
//class PostServiceImplementation(
//    private val client: HttpClient
//): PostsService {
//    override suspend fun getPosts(): List<DataResponse> {
//    return client.get {
//        url()
//    }
//    }
//
//}