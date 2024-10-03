package com.example.mycity.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycity.R
import com.example.mycity.data.DataSource
import com.example.mycity.model.Destination
import com.example.mycity.model.Destination.Restaurant

@Composable
fun RestaurantsScreen(
    options: List<Restaurant>,
    onCancelButtonClicked: () -> Unit,
    onNextButtonClicked: () -> Unit,
    onSelectionChanged: (Restaurant) -> Unit,
    modifier: Modifier = Modifier
) {
    BaseMenuScreen(
        options = options,
        onCancelButtonClicked = onCancelButtonClicked,
        onNextButtonClicked = onNextButtonClicked,
        onSelectionChanged = onSelectionChanged as (Destination) -> Unit,
        modifier = modifier
    )
}