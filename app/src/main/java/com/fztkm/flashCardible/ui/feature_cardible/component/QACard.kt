package com.fztkm.flashCardible.ui.feature_cardible.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material.icons.rounded.DoubleArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun QACard(
    question: String,
    answer: String,
    favorite: Boolean,
    setFavorite: (Boolean) -> Unit,
    onShowDetail: () -> Unit
) {
    Card(
        modifier = Modifier.height(IntrinsicSize.Min),
        elevation = 3.dp,
        shape = RoundedCornerShape(
            topStart = 40.dp, topEnd = 5.dp, bottomStart = 5.dp, bottomEnd = 40.dp
        )
    ) {
        Row(
            modifier = Modifier
                .padding(vertical = 10.dp, horizontal = 15.dp)
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp, top = 15.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        "Q.", style = MaterialTheme.typography.body1,
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