package com.fztkm.flashCardible.ui.feature_home.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fztkm.flashCardible.ui.feature_home.component.CardibleCard
import com.fztkm.flashCardible.ui.feature_home.component.FolderCard
import com.fztkm.flashCardible.ui.theme.FlashCardibleTheme

@Composable
fun HomeScreen(
) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = MaterialTheme.colors.surface,
                elevation = 0.dp
            ) {
                Text(
                    "Flash Cardible",
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Light,
                    color = MaterialTheme.colors.primary,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(Icons.Filled.Add, contentDescription = "")
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
        ) {
            CardibleCard(title = "English words",
                cardNum = 23, favorite = true, setFavorite = {}) {}
            CardibleCard(title = "History words",
                cardNum = 230, favorite = false, setFavorite = {}) {}
            CardibleCard(title = "Science words",
                cardNum = 10000, favorite = true, setFavorite = {}) {}
            FolderCard(title = "Mathematics") {

            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    FlashCardibleTheme {
        Surface {
            HomeScreen()
        }
    }
}


