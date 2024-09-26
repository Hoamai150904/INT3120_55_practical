package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme{
                ArtSpaceApp()
            }
        }
    }
}

@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier) {
    var currentArt by remember { mutableStateOf(1) }
    when(currentArt) {
        1 -> {
            AllComponents(
                artId = R.drawable.pic1,
                contentDescriptionId = R.string.contentDescription1,
                artNameId = R.string.pic1_name,
                artistId = R.string.artist1,
                onNextButtonClick = {
                    if (currentArt == 3) {
                        currentArt = 1
                    } else {
                        currentArt++
                    }
                },
                onPreviousButtonClick = {
                    if (currentArt == 1) {
                        currentArt = 3
                    } else {
                        currentArt--
                    }
                }
            )
        }
        2 -> {
            AllComponents(
                artId = R.drawable.pic2,
                contentDescriptionId = R.string.contentDescription2,
                artNameId = R.string.pic2_name,
                artistId = R.string.artist2,
                onNextButtonClick = {
                    if (currentArt == 3) {
                        currentArt = 1
                    } else {
                        currentArt++
                    }
                },
                onPreviousButtonClick = {
                    if (currentArt == 1) {
                        currentArt = 3
                    } else {
                        currentArt--
                    }
                }
            )
        }
        3 -> {
            AllComponents(
                artId = R.drawable.pic3,
                contentDescriptionId = R.string.contentDescription3,
                artNameId = R.string.pic3_name,
                artistId = R.string.artist3,
                onNextButtonClick = {
                    if (currentArt == 3) {
                        currentArt = 1
                    } else {
                        currentArt++
                    }
                },
                onPreviousButtonClick = {
                    if (currentArt == 1) {
                        currentArt = 3
                    } else {
                        currentArt--
                    }
                }
            )
        }
    }
}

@Composable
fun AllComponents(
    modifier: Modifier = Modifier,
    artId: Int,
    contentDescriptionId: Int,
    artNameId: Int,
    artistId: Int,
    onPreviousButtonClick: () -> Unit,
    onNextButtonClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        ArtworkWall(artId = artId, contentDescriptionId = contentDescriptionId)
        Spacer(modifier = Modifier.height(30.dp))
        ArtworkDescriptor(artNameId = artNameId, artistId = artistId)
        Spacer(modifier = Modifier.height(20.dp))
        DisplayController(
            onPreviousButtonClick = onPreviousButtonClick,
            onNextButtonClick = onNextButtonClick
        )
    }
}

@Composable
fun ArtworkWall(
    modifier: Modifier = Modifier,
    artId: Int,
    contentDescriptionId: Int
) {
    Surface(
        modifier = Modifier.wrapContentSize().padding(10.dp),
        shadowElevation = 30.dp,
        shape = RoundedCornerShape(5)
    ) {
        Image(
            painter = painterResource(artId),
            contentDescription = stringResource(contentDescriptionId),
            alignment = Alignment.Center,
            modifier = Modifier.padding(10.dp).size(width = 250.dp, height = 320.dp)
        )
    }
}

@Composable
fun ArtworkDescriptor(
    modifier: Modifier = Modifier,
    artNameId: Int,
    artistId: Int
) {
    Surface(
        modifier = Modifier.fillMaxWidth().padding(10.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(10.dp)
        ) {
            Text(
                text = stringResource(artNameId),
                fontSize = 32.sp
            )
            Text(
                text = stringResource(artistId),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
    }
}

@Composable
fun DisplayController(
    modifier: Modifier = Modifier,
    onNextButtonClick: () -> Unit,
    onPreviousButtonClick: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.padding(40.dp)
    ) {
        Button(
            onClick = onPreviousButtonClick,
            modifier = Modifier.weight(2f).size(width=60.dp, height=50.dp)) {
            Text(
                text = "Previous",
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = onNextButtonClick,
            modifier = Modifier.weight(2f).size(width=60.dp, height=50.dp)) {
            Text(
                text = "Next"
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        ArtworkWall(artId = R.drawable.pic1, contentDescriptionId = R.string.contentDescription1)
    }
}