package com.example.juicetracker2.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.juicetracker2.data.Juice
import com.example.juicetracker2.data.JuiceRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class TrackerViewModel(private val juiceRepository: JuiceRepository): ViewModel()  {

    val juicesStream: Flow<List<Juice>> = juiceRepository.juicesStream

    fun deleteJuice(juice: Juice) = viewModelScope.launch {
        juiceRepository.deleteJuice(juice)
    }
}
