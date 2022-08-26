package com.fztkm.flashCardible.ui.feature_cardible.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fztkm.flashCardible.ui.theme.FlashCardibleTheme

@Composable
fun FocusedCard(
    text: String,
    index: Int,
    isQuestion: Boolean,
    description: String?
) {
    Box(
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            val label = if (isQuestion) "Q." else "A."
            Text(
                text = "$label $index:",
                style = MaterialTheme.typography.body1,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = text,
                style = MaterialTheme.typography.body1,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            description?.let {
                if (it.isNotEmpty()) {
                    Divider(
                        modifier = Modifier
                            .padding(horizontal = 25.dp, vertical = 10.dp)
                            .fillMaxWidth()
                    )
                    Text(
                        description,
                        style = MaterialTheme.typography.body2,
                        fontWeight = FontWeight.Light
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun FocusedCardPreview() {
    FlashCardibleTheme {
        Surface {
            FocusedCard(
                text = "I like Baseball",
                index = 19,
                isQuestion = false,
                description = "紀元前201年にローマの勝利で第二次ポエニ戦争が終結し、戦争後に結ばれた講和条約" +
                        "でカルタゴはローマの許可なく戦争を起こすことが禁じられた。ローマの同盟国であったヌミ" +
                        "ディアのマシニッサ王はこの状況を利用してカルタゴの領土を公然と襲撃し、占領する行為を" +
                        "繰り返した。これに耐えかねたカルタゴは紀元前151年にローマとの条約を無視して将軍のハス" +
                        "" +
                        "ドルバル（英語版）が率いる軍隊をヌミディアに向けて派遣した。しかし、この軍事作戦はオロ" +
                        "スコパの戦いでカルタゴ軍が完敗するという結果に終わり、ローマはこの不正な軍事行動を口実" +
                        "に懲罰的な遠征の準備を始めた。"
            )
        }
    }
}