package com.fztkm.flashCardible.ui.feature_cardible.cardible

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fztkm.flashCardible.ui.component.ScreenFrame
import com.fztkm.flashCardible.ui.feature_cardible.component.QACard
import com.fztkm.flashCardible.ui.feature_cardible.component.TextBottomSheet

@Composable
fun CardibleScreen() {
    ScreenFrame(
        bottomUpperPadding = 10,
        bottom = {
            TextBottomSheet(
                title = "English word",
                leftIcon = Icons.Filled.Add,
                leftText = "Add",
                rightIcon = Icons.Filled.PlayArrow,
                rightText = "Play",
                onClickLeft = {},
                onClickRight = {}
            )
        }) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(horizontal = 10.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            QACard(
                question = "What is your favorite sport?",
                answer = "Track and field",
                favorite = true,
                setFavorite = {},
                onShowDetail = {}
            )
            QACard(
                question = "What is your favorite sport?",
                answer = "Track and field",
                favorite = false,
                setFavorite = {},
                onShowDetail = {}
            )
            QACard(
                question = "What is your favorite sport?",
                answer = "Track and field",
                favorite = false,
                setFavorite = {},
                onShowDetail = {}
            )
            QACard(
                question = "What is your favorite sport?",
                answer = "Track and field",
                favorite = true,
                setFavorite = {},
                onShowDetail = {}
            )
            QACard(
                question = "What is your favorite sport?",
                answer = "Track and field",
                favorite = true,
                setFavorite = {},
                onShowDetail = {}
            )
            QACard(
                question = "What is your favorite sport?",
                answer = "Track and field",
                favorite = false,
                setFavorite = {},
                onShowDetail = {}
            )
            QACard(
                question = "What is your favorite sport?",
                answer = "Track and field",
                favorite = true,
                setFavorite = {},
                onShowDetail = {}
            )
            QACard(
                question = "What is your favorite sport?",
                answer = "Track and field",
                favorite = true,
                setFavorite = {},
                onShowDetail = {}
            )
            QACard(
                question = "What is your favorite sport?",
                answer = "Track and field",
                favorite = true,
                setFavorite = {},
                onShowDetail = {}
            )
        }
    }
}



