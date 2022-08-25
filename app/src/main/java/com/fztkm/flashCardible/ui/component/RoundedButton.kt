package com.fztkm.flashCardible.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun RoundedButton(
    onClick: () -> Unit = {},
    content: @Composable () -> Unit,
) {
    TextButton(
        onClick = onClick,
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(4.dp, MaterialTheme.colors.primary),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = MaterialTheme.colors.surface
        ),
        contentPadding = PaddingValues(0.dp)
    ) {
        content()
    }
}