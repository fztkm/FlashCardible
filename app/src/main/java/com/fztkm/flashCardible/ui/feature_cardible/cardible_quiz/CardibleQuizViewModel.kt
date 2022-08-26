package com.fztkm.flashCardible.ui.feature_cardible.cardible_quiz

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CardibleQuizViewModel : ViewModel() {
    var focusedIndex by mutableStateOf(0)
        private set
    var quizList by mutableStateOf(testList)
        private set
    var focusedItem by mutableStateOf(quizList[focusedIndex])
        private set
    var isShowQuestion by mutableStateOf(true)
        private set
    var isFinished by mutableStateOf(false)
        private set
    var redoStep by mutableStateOf(3)

    suspend fun onClickNext(listState: LazyListState) {
        isShowQuestion = true
        if (isFinished) {
            isFinished = false
            focusedIndex = 0
        } else if (focusedIndex >= quizList.size - 1) {
            isFinished = true
        } else {
            focusedIndex += 1
        }
        scrollToFocused(listState)
    }

    fun onClickAnswer() {
        isShowQuestion = false
    }

    suspend fun onClickRedo(listState: LazyListState) {
        isShowQuestion = true
        focusedIndex -= redoStep
        if (focusedIndex < 0) focusedIndex = 0
        scrollToFocused(listState)
    }

    private suspend fun scrollToFocused(listState: LazyListState) {
        focusedItem = quizList[focusedIndex]
        if (focusedIndex > 1)
            listState.animateScrollToItem(focusedIndex - 1)
        else
            listState.animateScrollToItem(0)
    }

}