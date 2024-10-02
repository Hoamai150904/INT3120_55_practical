package com.example.thirtydaysapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recipe(
    @StringRes val recipeNameResourceId: Int,
    @StringRes val recipeDescriptionResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
