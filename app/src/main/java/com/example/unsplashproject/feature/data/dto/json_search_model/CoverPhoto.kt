package com.example.unsplashproject.feature.data.dto.json_search_model

data class CoverPhoto(
    val alt_description: String,
    val categories: List<Any>,
    val color: String,
    val created_at: String,
    val current_user_collections: List<Any>,
    val description: String,
    val height: Int,
    val id: String,
    val liked_by_user: Boolean,
    val likes: Int,
    val links: CoverPhotoLinks,
    val promoted_at: Any,
    val sponsorship: Any,
    val updated_at: String,
    val urls: Urls,
    val user: User,
    val width: Int
)