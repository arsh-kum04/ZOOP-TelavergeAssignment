package com.example.zoop.DataClasses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Category(
    @SerialName("matchLevel")
    val matchLevel: String,
    @SerialName("matchedWords")
    val matchedWords: List<String>,
    @SerialName("value")
    val value: String
)