package com.fztkm.flashCardible.ui.feature_cardible.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Style
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fztkm.flashCardible.ui.theme.FlashCardibleTheme

@Composable
fun DoubleColorOperationButton(
    leftIcon: ImageVector? = null,
    leftText: String? = null,
    onClickLeft: () -> Unit,
    rightIcon: ImageVector? = null,
    rightText: String? = null,
    onClickRight: () -> Unit,
    leftColor: Color = MaterialTheme.colors.primary,
    rightColor: Color = Color(0xff35a00b)
) {

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        TextButton(
            onClick = onClickLeft,
            modifier = Modifier.weight(1f),
            shape = RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp),
            border = BorderStroke(4.dp, leftColor),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = MaterialTheme.colors.surface
            ),
            contentPadding = PaddingValues(0.dp),
        ) {
            Row(
                modifier = Modifier
                    .padding(13.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                leftIcon?.let {
                    Icon(
                        it, contentDescription = "",
                        tint = leftColor
                    )
                }
                leftText?.let {
                    Text(
                        it,
                        style = MaterialTheme.typography.subtitle1,
                        color = leftColor
                    )
                }
            }
        }
        Spacer(modifier = Modifier.width(4.dp))
        TextButton(
            onClick = onClickRight,
            modifier = Modifier.weight(1f),
            shape = RoundedCornerShape(topEnd = 20.dp, bottomEnd = 20.dp),
            border = BorderStroke(4.dp, rightColor),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = MaterialTheme.colors.surface
            ),
            contentPadding = PaddingValues(0.dp),
        ) {
            Row(
                modifier = Modifier
                    .padding(13.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                rightText?.let {
                    Text(
                        it,
                        style = MaterialTheme.typography.subtitle1,
                        color = rightColor
                    )
                }
                rightIcon?.let {
                    Icon(
                        it, contentDescription = "",
                        tint = rightColor
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun DoubleColorOperationButtonPreview() {
    FlashCardibleTheme {
        Surface {
            DoubleColorOperationButton(
                leftIcon = Icons.Filled.Style,
                leftText = "Answer",
                onClickLeft = {},
                rightIcon = Icons.Filled.Check,
                rightText = "Next",
                onClickRight = {}
            )
        }
    }
}