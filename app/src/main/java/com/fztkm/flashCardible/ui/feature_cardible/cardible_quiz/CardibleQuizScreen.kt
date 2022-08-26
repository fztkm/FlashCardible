package com.fztkm.flashCardible.ui.feature_cardible.cardible_quiz

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Redo
import androidx.compose.material.icons.filled.Style
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.fztkm.flashCardible.ui.feature_cardible.component.DoubleColorOperationButton
import com.fztkm.flashCardible.ui.feature_cardible.component.FocusedCard
import com.fztkm.flashCardible.ui.feature_cardible.component.QACard
import com.fztkm.flashCardible.ui.feature_cardible.component.QuizScreenFrame
import kotlinx.coroutines.launch

@Composable
fun CardibleQuizScreen() {
    val viewModel: CardibleQuizViewModel = viewModel()
    val focusedItem = viewModel.focusedItem
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    QuizScreenFrame(
        bottomUpperPadding = 10.dp,
        bottom = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                val isShowQuestion = viewModel.isShowQuestion
                FocusedCard(
                    modifier = Modifier.animateContentSize(
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioNoBouncy,
                            stiffness = Spring.StiffnessLow
                        )
                    ),
                    text = if (isShowQuestion) focusedItem.question
                    else focusedItem.answer,
                    index = viewModel.focusedIndex + 1,
                    isQuestion = isShowQuestion,
                    description = if (isShowQuestion) null else focusedItem.description
                )
                Spacer(modifier = Modifier.height(10.dp))
                DoubleColorOperationButton(
                    leftIcon = if (isShowQuestion) Icons.Filled.Style else Icons.Filled.Redo,
                    leftText = if (isShowQuestion) "Answer" else "Redo",
                    onClickLeft = {
                        if (isShowQuestion) viewModel.onClickAnswer()
                        else coroutineScope.launch { viewModel.onClickRedo(listState) }
                    },
                    rightIcon = Icons.Filled.Check,
                    rightText = "Next",
                    onClickRight = {
                        coroutineScope.launch {
                            viewModel.onClickNext(listState)
                        }
                    }
                )
            }
        }) {

        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 10.dp),
                state = listState,
                verticalArrangement = Arrangement.spacedBy(10.dp),
                reverseLayout = true
            ) {
                items(viewModel.quizList.size) { index ->
                    val quiz = viewModel.quizList[index]
                    QACard(
                        index = index,
                        question = quiz.question,
                        answer = if (!viewModel.isFinished && index >= viewModel.focusedIndex) "" else quiz.answer,
                        favorite = false,
                        setFavorite = {}) {
                    }
                }
            }
        }
    }
}


data class Quiz(
    val question: String,
    val answer: String,
    val description: String = ""
)

val testList = listOf(
    Quiz(
        question = "0What is your favorite sport?",
        answer = "Track and field",
        description = "aburiwfnvohagiurhwuajncwniuvhuiahgruihfuihwjucndwnfhiuhauivhnfjnejgnrjeaviu"
    ),
    Quiz(
        question = "1What is your favorite sport?",
        answer = "Track and field",
        description = "aburiwfnvohagiurhwuajncwniuvhuiahgruihfuihw" +
                "jucndwnfhiuhauivhnfjnejgnrjeaviu" +
                "aburiwfnvohagiurhwuajncwniuvhuiahgruihfuihwjucndwnfhiuhauivhnfjnejgnrjeaviu"
    ),
    Quiz(
        question = "2What is your favorite sport?",
        answer = "Track and field",
        description = "aburiwfnvohagiurhwuajncwniuvhuiahgruihfuihw" +
                "jucndwnfhiuhauivhnfjnejgnrjeaviu" +
                "aburiwfnvohagiurhwuajncwniuvhuiahgruihfuihwjucndwnfhiuhauivhnfjnejgnrjeaviu"
    ),
    Quiz(
        question = "3What is your favorite sport?",
        answer = "Track and field",
        description = "aburiwfnvohagiurhwuajncwniuvhuiahgruihfuihw" +
                "jucndwnfhiuhauivhnfjnejgnrjeaviu" +
                "aburiwfnvohagiurhwuajncwniuvhuiahgruihfuihwjucndwnfhiuhauivhnfjnejgnrjeaviu"
    ),
    Quiz(
        question = "4What is your favorite sport?",
        answer = "Track and field",
        description = "aburiwfnvohagiurhwuajncwniuvhuiahgruihfuihw" +
                "jucndwnfhiuhauivhnfjnejgnrjeaviu" +
                "aburiwfnvohagiurhwuajncwniuvhuiahgruihfuihwjucndwnfhiuhauivhnfjnejgnrjeaviu"
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

