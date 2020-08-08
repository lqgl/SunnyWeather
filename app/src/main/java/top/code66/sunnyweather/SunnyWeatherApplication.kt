package top.code66.sunnyweather

import android.app.Application
import android.content.Context

//提供一个可全局获取的 Context 的方式
class SunnyWeatherApplication : Application() {

    companion object {
        const val TOKEN = "4mrYmZ6CicZqyI7T"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}