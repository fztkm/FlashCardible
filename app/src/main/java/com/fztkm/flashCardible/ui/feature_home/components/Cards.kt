package com.fztkm.flashCardible.ui.feature_home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fztkm.flashCardible.ui.theme.FlashCardibleTheme

@Composable
fun CardibleCard(
    title: String,
    cardNum: Int,
    isStared: Boolean,
    setStared: (Boolean) -> Unit,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .height(120.dp)
            .clickable { onClick() }
            .padding(10.dp),
        shape = CircleShape,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 20.dp, horizontal = 30.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Column(
                horizontalAlignment = Alignment.Start
            ) {
                Text(title, style = MaterialTheme.typography.subtitle1)
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "$cardNum Cards",
                    style = MaterialTheme.typography.body2,
                    fontWeight = FontWeight.Light
                )
            }
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
                IconButton(onClick = { setStared(!isStared) }) {
                    Icon(
                        imageVector = if (isStared) Icons.Filled.Star
                        else Icons.Outlined.StarOutline,
                        contentDescription = ""
                    )
                }
            }
        }
    }
}

@Composable
fun FolderCard(
    title: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .height(120.dp)
            .clickable { onClick() }
            .padding(10.dp),
        shape = CircleShape,
        backgroundColor = MaterialTheme.colors.secondary
    ) {
        Text(
            modifier = Modifier
                .padding(top = 20.dp, start = 30.dp),
            text = "Folder",
            style = MaterialTheme.typography.body2,
            fontWeight = FontWeight.Light
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 20.dp, horizontal = 30.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(title, style = MaterialTheme.typography.subtitle1)
        }
    }
}

@Preview
@Composable
private fun CardibleCardPreview() {
    FlashCardibleTheme {
        Surface {
            CardibleCard(
                title = "English words",
                cardNum = 12,
                isStared = false,
                setStared = {}) {}
        }
    }
}

@Preview
@Composable
private fun FolderCardPreview() {
    FlashCardibleTheme {
        Surface {
            FolderCard(title = "Math") {}
        }
    }
}