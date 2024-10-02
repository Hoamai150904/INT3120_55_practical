package com.example.thirtydaysapp.model

import androidx.compose.ui.res.stringResource
import com.example.thirtydaysapp.R

class Datasource {
    fun loadRecipeList(): List<Recipe> {
        return listOf<Recipe>(
            Recipe(
                recipeNameResourceId = R.string.recipe1,
                recipeDescriptionResourceId = R.string.des1,
                imageResourceId = R.drawable.recipe1
            ),
            Recipe(
                recipeNameResourceId = R.string.recipe2,
                recipeDescriptionResourceId = R.string.des2,
                imageResourceId = R.drawable.recipe2
            ),
            Recipe(
                recipeNameResourceId = R.string.recipe3,
                recipeDescriptionResourceId = R.string.des3,
                imageResourceId = R.drawable.recipe3
            ),
            Recipe(
                recipeNameResourceId = R.string.recipe4,
                recipeDescriptionResourceId = R.string.des4,
                imageResourceId = R.drawable.recipe4
            ),
            Recipe(
                recipeNameResourceId = R.string.recipe5,
                recipeDescriptionResourceId = R.string.des5,
                imageResourceId = R.drawable.recipe5
            ),
            Recipe(
                recipeNameResourceId = R.string.recipe6,
                recipeDescriptionResourceId = R.string.des6,
                imageResourceId = R.drawable.recipe6
            ),
            Recipe(
                recipeNameResourceId = R.string.recipe7,
                recipeDescriptionResourceId = R.string.des7,
                imageResourceId = R.drawable.recipe7
            )

        )
    }
}