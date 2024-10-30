package com.example.juicetracker2

import android.app.Application
import com.example.juicetracker2.data.AppContainer
import com.example.juicetracker2.data.AppDataContainer

class JuiceTrackerApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
