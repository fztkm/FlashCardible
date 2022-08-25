package com.fztkm.flashCardible.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
    bottomUpperPadding: Int = 20,
    bottom: @Composable () -> Unit,
    body: @Composable () -> Unit,
) {
    Surface {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            body()
        }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            BottomSheet(
                shape = RoundedCornerShape(
                    topStart = 40.dp, topEnd = 40.dp, bottomStart = 0.dp, bottomEnd = 0.dp,
                ),
            ) {
                Box(
                    modifier = Modifier
                        .padding(horizontal = 25.dp)
                        .padding(bottom = 25.dp, top = bottomUpperPadding.dp)
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