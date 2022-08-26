package com.fztkm.flashCardible.ui.feature_cardible.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun TextBottomSheet(
    title: String,
    leftIcon: ImageVector? = null,
    leftText: String? = null,
    onClickLeft: () -> Unit,
    rightIcon: ImageVector? = null,
    rightText: String? = null,
    onClickRight: () -> Unit
) {
    Column {
        Text(
            title,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(start = 10.dp),
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(10.dp))
        OperationButton(
            leftIcon = leftIcon,
            leftText = leftText,
            onClickLeft = onClickLeft,
            rightIcon = rightIcon,
            rightText = rightText,
            onClickRight = onClickRight
        )
    }
}
