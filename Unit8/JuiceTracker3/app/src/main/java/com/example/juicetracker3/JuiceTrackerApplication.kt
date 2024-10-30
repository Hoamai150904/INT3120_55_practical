package com.example.juicetracker3

import android.app.Application
import com.example.juicetracker3.data.AppContainer
import com.example.juicetracker3.data.AppDataContainer

class JuiceTrackerApplication : Application() {

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
