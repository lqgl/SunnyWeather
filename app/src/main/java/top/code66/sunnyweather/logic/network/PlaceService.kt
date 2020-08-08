package top.code66.sunnyweather.logic.network

import top.code66.sunnyweather.SunnyWeatherApplication
import top.code66.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
//定义用于访问彩云天气城市搜索API的Retrofit接口
interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}