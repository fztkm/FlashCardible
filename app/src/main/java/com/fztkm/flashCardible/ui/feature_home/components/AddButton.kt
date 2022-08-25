package com.fztkm.flashCardible.ui.feature_home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fztkm.flashCardible.ui.components.RoundedButton
import com.fztkm.flashCardible.ui.theme.FlashCardibleTheme

@Composable
fun AddButton(
    onClick: () -> Unit
) {
    RoundedButton(onClick = onClick) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Filled.Add, contentDescription = "",
                tint = MaterialTheme.colors.primary
            )
            Text(
                "Add", style = MaterialTheme.typography.subtitle1,
                color = MaterialTheme.colors.primary
            )
        }
    }
}

@Preview
@Composable
private fun AddButtonPreview() {
    FlashCardibleTheme {
        AddButton {

        }
    }
}