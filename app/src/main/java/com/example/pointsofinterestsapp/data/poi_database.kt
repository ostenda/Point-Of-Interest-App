package com.example.pointsofinterestsapp.data

import android.content.Context
import androidx.room.*


@Database(entities = [poi_entity::class], version = 1, exportSchema = false)

abstract class poi_database: RoomDatabase() {

    abstract fun poiDao(): poiDao

    companion object {
        private var instance: poi_database? = null


        fun getDatabase(ctx: Context) : poi_database {
            var tmpInstance = instance
            if(tmpInstance == null) {
                tmpInstance = Room.databaseBuilder(
                    ctx.applicationContext,
                    poi_database::class.java,
                    "poiDatabase"
                ).build()
                instance = tmpInstance
            }
            return tmpInstance
        }
    }
}