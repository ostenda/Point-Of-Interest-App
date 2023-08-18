package com.example.pointsofinterestsapp.data

import androidx.room.*
import com.example.pointsofinterestsapp.data.poi_entity


@Dao
interface poiDao {

    @Query("SELECT * FROM pois WHERE id=:id")
    suspend fun getPoiById (id: Long): poi_entity?

    @Query("SELECT * FROM pois")
    fun getpois(): List<poi_entity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun instertpois(pois: poi_entity): Long

    @Update
    suspend fun update(pois: poi_entity) : Int

    @Delete
    suspend fun delete(pois: poi_entity) : Int

}