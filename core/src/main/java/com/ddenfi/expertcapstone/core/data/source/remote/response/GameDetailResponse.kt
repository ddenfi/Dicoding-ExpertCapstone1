package com.ddenfi.expertcapstone.core.data.source.remote.response

import com.ddenfi.expertcapstone.core.domain.model.GameDetail
import com.google.gson.annotations.SerializedName

data class GameDetailResponse(

	@field:SerializedName("added")
	val added: Int,

	@field:SerializedName("name_original")
	val nameOriginal: String,

	@field:SerializedName("metacritic")
	val metacritic: Int,

	@field:SerializedName("rating")
	val rating: Float,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("game_series_count")
	val gameSeriesCount: Int,

	@field:SerializedName("playtime")
	val playtime: Int,

	@field:SerializedName("metacritic_url")
	val metacriticUrl: String,

	@field:SerializedName("alternative_names")
	val alternativeNames: List<String>,

	@field:SerializedName("parents_count")
	val parentsCount: Int,

	@field:SerializedName("platforms")
	val platforms: List<PlatformsItem>,

	@field:SerializedName("metacritic_platforms")
	val metacriticPlatforms: List<MetacriticPlatformsItem>,

	@field:SerializedName("creators_count")
	val creatorsCount: Int,

	@field:SerializedName("rating_top")
	val ratingTop: Int,

	@field:SerializedName("reviews_text_count")
	val reviewsTextCount: String,


	@field:SerializedName("achievements_count")
	val achievementsCount: Int,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("added_by_status")
	val addedByStatus: AddedByStatus,

	@field:SerializedName("reddit_url")
	val redditUrl: String,

	@field:SerializedName("reddit_name")
	val redditName: String,

	@field:SerializedName("ratings_count")
	val ratingsCount: Int,

	@field:SerializedName("reddit_count")
	val redditCount: Int,

	@field:SerializedName("slug")
	val slug: String,

	@field:SerializedName("released")
	val released: String,

	@field:SerializedName("parent_achievements_count")
	val parentAchievementsCount: String,

	@field:SerializedName("website")
	val website: String,

	@field:SerializedName("suggestions_count")
	val suggestionsCount: Int,

	@field:SerializedName("youtube_count")
	val youtubeCount: String,

	@field:SerializedName("additions_count")
	val additionsCount: Int,

	@field:SerializedName("movies_count")
	val moviesCount: Int,

	@field:SerializedName("twitch_count")
	val twitchCount: String,

	@field:SerializedName("background_image_additional")
	val backgroundImageAdditional: String,

	@field:SerializedName("background_image")
	val backgroundImage: String,

	@field:SerializedName("tba")
	val tba: Boolean,

	@field:SerializedName("esrb_rating")
	val esrbRating: EsrbRating,

	@field:SerializedName("screenshots_count")
	val screenshotsCount: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("reddit_description")
	val redditDescription: String,

	@field:SerializedName("reactions")
	val reactions: Reactions,

	@field:SerializedName("reddit_logo")
	val redditLogo: String,

	@field:SerializedName("updated")
	val updated: String
)

