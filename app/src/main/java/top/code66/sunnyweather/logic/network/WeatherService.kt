package top.code66.sunnyweather.logic.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import top.code66.sunnyweather.SunnyWeatherApplication
import top.code66.sunnyweather.logic.model.DailyResponse
import top.code66.sunnyweather.logic.model.RealtimeResponse

interface WeatherService {

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
}