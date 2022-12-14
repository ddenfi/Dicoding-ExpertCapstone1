package com.ddenfi.expertcapstone.core.data.source.local.entity


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "game")
data class GameEntity(
    @PrimaryKey
    val id: Int,
    val page:Int,
    val name: String?= "",
    val released: String?= "",
    val rating: String?= "",
    val parentPlatform: List<Int>?= listOf(),
    var isFavorite: Boolean?= false
)
