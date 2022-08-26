package com.fztkm.flashCardible.ui.feature_cardible.cardible_quiz

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Style
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fztkm.flashCardible.ui.feature_cardible.component.FocusedCard
import com.fztkm.flashCardible.ui.feature_cardible.component.OperationButton
import com.fztkm.flashCardible.ui.feature_cardible.component.QACard
import com.fztkm.flashCardible.ui.feature_cardible.component.QuizScreenFrame
import kotlinx.coroutines.launch

@Composable
fun CardibleQuizScreen() {
    QuizScreenFrame(
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
        val listState = rememberLazyListState()
        val coroutineScope = rememberCoroutineScope()
        LazyColumn(
            modifier = Modifier
                .fillMaxHeight()
                .padding(horizontal = 10.dp),
            state = listState,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(testList) { quiz ->
                QACard(question = quiz.question, answer = quiz.answer,
                    favorite = false, setFavorite = {}) {

                }
            }
        }
        LaunchedEffect(key1 = null) {
            coroutineScope.launch {
                listState.scrollToItem(8)
            }
        }
    }
}

data class Quiz(
    val question: String,
    val answer: String,
)

val testList = listOf(
    Quiz(
        question = "0What is your favorite sport?",
        answer = "Track and field",
    ),
    Quiz(
        question = "1What is your favorite sport?",
        answer = "Track and field",
    ),
    Quiz(
        question = "2What is your favorite sport?",
        answer = "Track and field",
    ),
    Quiz(
        question = "3What is your favorite sport?",
        answer = "Track and field",
    ),
    Quiz(
        question = "4What is your favorite sport?",
        answer = "Track and field",
    ),
    Quiz(
        question = "5What is your favorite sport?",
        answer = "Track and field",
    ),
    Quiz(
        question = "6What is your favorite sport?",
        answer = "Track and field",
    ),
    Quiz(
        question = "7What is your favorite sport?",
        answer = "Track and field",
    ),
    Quiz(
        question = "8What is your favorite sport?",
        answer = "Track and field",
    ),

    )

