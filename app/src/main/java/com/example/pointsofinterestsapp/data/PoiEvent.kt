package com.example.pointsofinterestsapp.data

import com.example.pointsofinterestsapp.SortType

sealed interface PoiEvent{
     object SavePoi: PoiEvent
    data class SetFirstName(val firstName: String): PoiEvent
    data class SetLastName(val lasttName: String): PoiEvent
    data class SetPoiPlace(val poiPlace: String): PoiEvent

    object ShowDialog: PoiEvent
    object HydeDialog: PoiEvent
    data class SortPoi(val sortType: SortType): PoiEvent
    data class DeleteContact(val pois: poi_entity): PoiEvent
}