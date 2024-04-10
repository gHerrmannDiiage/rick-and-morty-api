package org.mathieu.cleanrmapi.ui.core.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EpisodeCardContent(
    date: String = "",
    title: String = ""
) = Row(
    modifier = Modifier
        .fillMaxWidth()
        .padding(start = 15.dp, end = 40.dp, top = 10.dp, bottom = 10.dp),
    horizontalArrangement = Arrangement.Start
) {
    BasicText(
        text = date,
        modifier = Modifier
            .padding(10.dp),
    )
    BasicText(
        text = title,
        modifier = Modifier
            .padding(10.dp),
    )
}