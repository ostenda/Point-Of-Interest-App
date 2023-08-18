package com.example.pointsofinterestsapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pois")
data class poi_entity(
    val name:String,
    val type:String,
    val desc:String,
    @PrimaryKey val id:Int? = null
)