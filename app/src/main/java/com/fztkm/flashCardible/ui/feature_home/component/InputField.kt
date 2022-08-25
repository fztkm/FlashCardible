package com.fztkm.flashCardible.ui.feature_home.component

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fztkm.flashCardible.ui.theme.FlashCardibleTheme

@Composable
fun InputField(
    text: String,
    onChangeText: (String) -> Unit,
) {
    TextField(
        value = text,
        onValueChange = onChangeText,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = MaterialTheme.colors.surface,
            unfocusedIndicatorColor = MaterialTheme.colors.primary
        )
    )
}

@Preview
@Composable
fun InputFieldPreview() {
    FlashCardibleTheme {
        Surface {
            InputField(text = "", onChangeText = {})
        }
    }
}