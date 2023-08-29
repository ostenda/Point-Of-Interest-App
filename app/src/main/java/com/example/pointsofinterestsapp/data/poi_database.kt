package com.example.pointsofinterestsapp.data

import android.content.Context
import androidx.room.*


@Database(entities = [poi_entity::class], version = 1, exportSchema = false)

abstract class poi_database: RoomDatabase() {

    abstract val dao: poiDao
}