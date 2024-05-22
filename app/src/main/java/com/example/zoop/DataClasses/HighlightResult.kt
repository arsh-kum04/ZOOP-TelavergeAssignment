package com.example.zoop.DataClasses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HighlightResult(
    @SerialName("category")
    val category: Category,
    @SerialName("image_link")
    val imageLink: ImageLink,
    @SerialName("name")
    val name: Name
)