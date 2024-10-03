package com.example.mycity.data

import com.example.mycity.model.Destination

data class DestinationUiState(
    val chosenCoffeeShop: Destination.CoffeeShop ?= null,
    val chosenRestaurant: Destination.Restaurant ?= null,
    val chosenPark: Destination.Park ?= null,
    val chosenShoppingCenter: Destination.ShoppingCenter ?= null
)
