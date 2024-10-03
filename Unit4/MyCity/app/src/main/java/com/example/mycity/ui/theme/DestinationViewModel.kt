package com.example.mycity.ui.theme

import androidx.lifecycle.ViewModel
import com.example.mycity.data.DestinationUiState
import com.example.mycity.model.Destination
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DestinationViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(DestinationUiState())
    val uiState: StateFlow<DestinationUiState> = _uiState.asStateFlow()

    fun updateCoffeeShop(chosenCoffeeShop: Destination.CoffeeShop) {
        val previousCoffeeShop = _uiState.value.chosenCoffeeShop
        updateItem(chosenCoffeeShop, previousCoffeeShop)
    }

    fun updatePark(chosenPark: Destination.Park) {
        val previousPark = _uiState.value.chosenPark
        updateItem(chosenPark, previousPark)
    }

    fun updateRestaurant(chosenRestaurant: Destination.Restaurant) {
        val previousRestaurant = _uiState.value.chosenRestaurant
        updateItem(chosenRestaurant, previousRestaurant)
    }

    fun updateShoppingCenter(chosenShoppingCenter: Destination.ShoppingCenter) {
        val previousShoppingCenter = _uiState.value.chosenShoppingCenter
        updateItem(chosenShoppingCenter, previousShoppingCenter)
    }

    fun resetDestination() {
        _uiState.value = DestinationUiState()
    }

    private fun updateItem(newDestination: Destination, previousDestination: Destination?) {
        _uiState.update { currentState ->
            currentState.copy(
                chosenCoffeeShop = if (newDestination is Destination.CoffeeShop) newDestination else currentState.chosenCoffeeShop,
                chosenRestaurant = if (newDestination is Destination.Restaurant) newDestination else currentState.chosenRestaurant,
                chosenPark = if (newDestination is Destination.Park) newDestination else currentState.chosenPark,
                chosenShoppingCenter = if(newDestination is Destination.ShoppingCenter) newDestination else currentState.chosenShoppingCenter
            )
        }
    }
}