package com.example.zoop.DataClasses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Hit(
    @SerialName("category")
    val category: String,
    @SerialName("_highlightResult")
    val highlightResult: HighlightResult,
    @SerialName("image_link")
    val imageLink: String,
    @SerialName("name")
    val name: String,
    @SerialName("objectID")
    val objectID: String,
    @SerialName("position")
    val position: Int,
    @SerialName("_score")
    val score: Double,
    @SerialName("url")
    val url: String
)