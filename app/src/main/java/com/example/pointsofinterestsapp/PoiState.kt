package com.example.pointsofinterestsapp

import com.example.pointsofinterestsapp.data.PoiEvent
import com.example.pointsofinterestsapp.data.poi_entity

data class PoiState(
    val poiList: List<poi_entity> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val sortType: SortType = SortType.FIRST_NAME
)
