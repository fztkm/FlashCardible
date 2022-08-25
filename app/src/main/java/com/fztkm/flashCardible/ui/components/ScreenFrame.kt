package com.fztkm.flashCardible.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ScreenFrame(
    bottom: @Composable () -> Unit,
    body: @Composable () -> Unit,
) {
    Surface(
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                body()
            }
            BottomSheet(
                modifier = Modifier
                    .height(120.dp),
                shape = RoundedCornerShape(
                    topStart = 40.dp, topEnd = 40.dp, bottomStart = 0.dp, bottomEnd = 0.dp,
                ),
            ) {
                Box(
                    modifier = Modifier.padding(25.dp)
                ) {
                    bottom()
                }
            }
        }
    }
}

@Composable
fun BottomSheet(
    modifier: Modifier = Modifier,
    shape: Shape = MaterialTheme.shapes.medium,
    backgroundColor: Color = MaterialTheme.colors.surface,
    border: BorderStroke? = null,
    elevation: Dp = 1.dp,
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        elevation = elevation,
        color = backgroundColor,
        shape = shape,
        border = border,
        content = content
    )
}