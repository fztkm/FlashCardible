package com.fztkm.flashCardible.ui.feature_home.add_folder

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fztkm.flashCardible.ui.component.ScreenFrame
import com.fztkm.flashCardible.ui.feature_home.component.AddButton
import com.fztkm.flashCardible.ui.feature_home.component.InputField
import com.fztkm.flashCardible.ui.theme.FlashCardibleTheme

@Composable
fun AddFolderScreen(
    onClickAdd: () -> Unit
) {
    ScreenFrame(bottom = {
        AddButton {
            onClickAdd()
        }
    },
        body = {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    "Folder name", color = MaterialTheme.colors.primary,
                    style = MaterialTheme.typography.h4
                )
                InputField(text = "", onChangeText = {})
                Spacer(modifier = Modifier.weight(4f))
            }
        }
    )
}

@Preview
@Composable
private fun AddFolderPreview() {
    FlashCardibleTheme {
        Surface {
            AddFolderScreen {}
        }
    }
}