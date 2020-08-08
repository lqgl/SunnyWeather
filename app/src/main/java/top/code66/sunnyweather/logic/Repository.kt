package top.code66.sunnyweather.logic

import androidx.lifecycle.liveData
import top.code66.sunnyweather.logic.network.SunnyWeatherNetwork
import top.code66.sunnyweather.logic.model.Place
import kotlinx.coroutines.Dispatchers

object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if(placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }

}