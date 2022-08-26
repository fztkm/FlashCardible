package com.fztkm.flashCardible

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.fztkm.flashCardible.ui.feature_cardible.cardible_quiz.CardibleQuizScreen
import com.fztkm.flashCardible.ui.theme.FlashCardibleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlashCardibleTheme {
                CardibleQuizScreen()
            }
        }
    }
}
