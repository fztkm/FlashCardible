package com.fztkm.flashCardible.ui.feature_cardible.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material.icons.rounded.DoubleArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun QACard(
    index: Int?,
    question: String,
    answer: String,
    borderColor: Color? = null,
    favorite: Boolean,
    elevation: Dp = 3.dp,
    setFavorite: (Boolean) -> Unit,
    onShowDetail: () -> Unit,
) {
    Card(
        modifier = Modifier.height(IntrinsicSize.Min),
        elevation = elevation,
        shape = RoundedCornerShape(
            topStart = 40.dp, topEnd = 5.dp, bottomStart = 5.dp, bottomEnd = 40.dp
        ),
        border = borderColor?.let { BorderStroke(0.5.dp, it) }
    ) {
        Row(
            modifier = Modifier
                .padding(vertical = 10.dp, horizontal = 15.dp)
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp, top = 15.dp, start = 5.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        "Q${index?.let { index + 1 }}. ", style = MaterialTheme.typography.body1,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(question, style = MaterialTheme.typography.body1, maxLines = 2)
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        "A.", style = MaterialTheme.typography.body1,
                        fontWeight = FontWeight.Bold
                    )
                    Text(answer, style = MaterialTheme.typography.body1, maxLines = 2)
                }
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = { setFavorite(!favorite) }) {
                    Icon(
                        if (favorite) Icons.Filled.Star
                        else Icons.Filled.StarOutline,
                        contentDescription = ""
                    )
                }
                IconButton(onClick = onShowDetail) {
                    Icon(
                        Icons.Rounded.DoubleArrow,
                        contentDescription = ""
                    )
                }
            }
        }
    }
}