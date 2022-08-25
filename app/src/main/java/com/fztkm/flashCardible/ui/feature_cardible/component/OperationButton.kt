package com.fztkm.flashCardible.ui.feature_cardible.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.fztkm.flashCardible.ui.component.RoundedButton

@Composable
fun OperationButton(
    leftIcon: ImageVector? = null,
    leftText: String? = null,
    onClickLeft: () -> Unit,
    rightIcon: ImageVector? = null,
    rightText: String? = null,
    onClickRight: () -> Unit
) {
    RoundedButton {
        Row(
            modifier = Modifier
                .height(IntrinsicSize.Min)
                .fillMaxWidth()
        ) {
            TextButton(
                modifier = Modifier.weight(1f),
                onClick = onClickLeft
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
                            tint = MaterialTheme.colors.primary
                        )
                    }
                    leftText?.let {
                        Text(
                            it,
                            style = MaterialTheme.typography.subtitle1,
                            color = MaterialTheme.colors.primary
                        )
                    }
                }
            }
            Divider(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(2.dp)
                    .padding(vertical = 10.dp),
            )
            TextButton(
                modifier = Modifier.weight(1f),
                onClick = onClickRight
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
                            color = MaterialTheme.colors.primary
                        )
                    }
                    rightIcon?.let {
                        Icon(
                            it, contentDescription = "",
                            tint = MaterialTheme.colors.primary
                        )
                    }
                }
            }
        }
    }
}