package com.example.zoop.DataClasses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Result(
    @SerialName("hits")
    val hits: List<Hit>,
    @SerialName("processingTimeMS")
    val processingTimeMS: Int
)