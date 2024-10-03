package com.example.mycity.data

import com.example.mycity.model.Destination.CoffeeShop
import com.example.mycity.model.Destination.Restaurant
import com.example.mycity.model.Destination.Park
import com.example.mycity.model.Destination.ShoppingCenter

object DataSource {

    val coffeeShopsList: List<CoffeeShop> = listOf<CoffeeShop>(
        CoffeeShop(
            name = "A Coffee Shop",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            address = "33/44/55"
        ),
        CoffeeShop(
            name = "B Coffee Shop",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        CoffeeShop(
            name = "C Coffee Shop",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        CoffeeShop(
            name = "D Coffee Shop",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        CoffeeShop(
            name = "E Coffee Shop",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        )
    )

    val restaurantsList: List<Restaurant> = listOf<Restaurant>(
        Restaurant(
            name = "Alpha Coffee Shop",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        Restaurant(
            name = "Beta Coffee Shop",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        Restaurant(
            name = "Gamma Coffee Shop",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        Restaurant(
            name = "Delta Coffee Shop",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        Restaurant(
            name = "Lambda Coffee Shop",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        )
    )

    val parksList: List<Park> = listOf<Park>(
        Park(
            name = "Park 1",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        Park(
            name = "Park 2",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        Park(
            name = "Park 3",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        Park(
            name = "Park 4",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        )
    )

    val shoppingCentersList: List<ShoppingCenter> = listOf<ShoppingCenter>(
        ShoppingCenter(
            name = "SCenter 1",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        ShoppingCenter(
            name = "SCenter 2",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        ShoppingCenter(
            name = "SCenter 3",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        ShoppingCenter(
            name = "SCenter 4",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        ShoppingCenter(
            name = "SCenter 5",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        ),
        ShoppingCenter(
            name = "SCenter 6",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            "33/44/55"
        )
    )
}
