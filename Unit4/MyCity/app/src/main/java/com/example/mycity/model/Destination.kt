package com.example.mycity.model

sealed class Destination(
    open val name: String,
    open val description: String,
    open val address: String
) {
    data class CoffeeShop(
        override val name: String,
        override val description: String,
        override val address: String
    ) : Destination(name, description, address)

    data class Restaurant(
        override val name: String,
        override val description: String,
        override val address: String
    ) : Destination(name, description, address)

    data class Park(
        override val name: String,
        override val description: String,
        override val address: String
    ) : Destination(name, description, address)

    data class ShoppingCenter(
        override val name: String,
        override val description: String,
        override val address: String
    ) : Destination(name, description, address)
}