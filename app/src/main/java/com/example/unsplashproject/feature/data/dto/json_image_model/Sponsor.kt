package com.example.unsplashproject.feature.data.dto.json_image_model

data class Sponsor(
    val accepted_tos: Boolean,
    val bio: String,
    val first_name: String,
    val id: String,
    val instagram_username: String,
    val last_name: Any,
    val links: SponsorLinks,
    val location: Any,
    val name: String,
    val portfolio_url: String,
    val profile_image: SponsorProfileImage,
    val total_collections: Int,
    val total_likes: Int,
    val total_photos: Int,
    val twitter_username: String,
    val updated_at: String,
    val username: String
)