package com.fztkm.flashCardible.ui.feature_cardible.cardible_quiz

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Style
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fztkm.flashCardible.ui.component.ScreenFrame
import com.fztkm.flashCardible.ui.feature_cardible.component.FocusedCard
import com.fztkm.flashCardible.ui.feature_cardible.component.OperationButton
import com.fztkm.flashCardible.ui.feature_cardible.component.QACard

@Composable
fun CardibleQuizScreen() {
    ScreenFrame(
        bottomUpperPadding = 10.dp,
        bottom = {
            Column(modifier = Modifier.fillMaxWidth()) {
                FocusedCard(
                    text = "New York",
                    index = 25,
                    isQuestion = false,
                    description = "紀元前201年にローマの勝利で第二次ポエニ戦争が終結し、戦争後に結ばれた講和条約" +
                            "でカルタゴはローマの許可なく戦争を起こすことが禁じられた。ローマの同盟国であったヌミ" +
                            "ディアのマシニッサ王はこの状況を利用してカルタゴの領土を公然と襲撃し、占領する行為を" +
                            "繰り返した。これに耐えかねたカルタゴは紀元前151年にローマとの条約を無視して将軍のハス" +
                            "" +
                            "ドルバル（英語版）が率いる軍隊をヌミディアに向けて派遣した。しかし、この軍事作戦はオロ" +
                            "スコパの戦いでカルタゴ軍が完敗するという結果に終わり、ローマはこの不正な軍事行動を口実" +
                            "に懲罰的な遠征の準備を始めた。"
                )
                Spacer(modifier = Modifier.height(10.dp))
                OperationButton(
                    leftIcon = Icons.Filled.Style,
                    leftText = "Answer",
                    onClickLeft = {},
                    rightIcon = Icons.Filled.Check,
                    rightText = "Next",
                    onClickRight = {}
                )
                //Icons.Filled.Redo
            }
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

