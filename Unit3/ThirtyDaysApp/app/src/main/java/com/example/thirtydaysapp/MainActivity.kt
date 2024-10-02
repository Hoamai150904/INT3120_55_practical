package com.example.thirtydaysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydaysapp.model.Datasource
import com.example.thirtydaysapp.model.Recipe
import com.example.thirtydaysapp.ui.theme.ThirtyDaysAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThirtyDaysAppTheme {
                RecipesApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipesApp() {
    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text="30 Days of Fitness",
                        style = MaterialTheme.typography.headlineLarge,
                        textAlign = TextAlign.Start
                    )
                }
            )
        }
    ) { it ->
        RecipesList(contentPadding = it, recipeList = Datasource().loadRecipeList())
    }
}

@Composable
fun RecipesList(recipeList: List<Recipe>,
                modifier: Modifier = Modifier,
                contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(
        contentPadding = contentPadding,
        modifier = modifier
    ) {
        itemsIndexed(recipeList) { index, recipe ->
            RecipeCard(
                recipe = recipe, index = index
            )
        }
    }
}


@Composable
fun RecipeCard(modifier: Modifier = Modifier, recipe: Recipe, index: Int) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        elevation = CardDefaults.cardElevation(5.dp),
        modifier = Modifier
            .padding(
                horizontal = dimensionResource(R.dimen.padding_medium),
                vertical = dimensionResource(R.dimen.padding_small)
            )
            .animateContentSize()
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                expanded = !expanded
            }
    ) {
        Column(modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))) {
            Text(
                text = "Day ${index+1}",
                style = MaterialTheme.typography.labelSmall
            )
            Text(
                text = stringResource(recipe.recipeNameResourceId),
                style = MaterialTheme.typography.displayLarge
            )
            Box(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(MaterialTheme.shapes.small)
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(recipe.imageResourceId),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
            if (expanded) {
                Text(
                    text = stringResource(recipe.recipeDescriptionResourceId),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecipeCardPreview() {
    ThirtyDaysAppTheme {
        RecipeCard(recipe = Recipe(
            recipeNameResourceId = R.string.recipe1,
            recipeDescriptionResourceId = R.string.des1,
            imageResourceId = R.drawable.recipe1
        ), index = 1)
    }
}