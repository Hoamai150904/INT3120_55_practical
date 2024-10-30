package com.example.juicetracker3.data

import android.content.Context

class AppDataContainer(private val context: Context) : AppContainer {
    override val juiceRepository: JuiceRepository by lazy {
        RoomJuiceRepository(AppDatabase.getDatabase(context).juiceDao())
    }
}
