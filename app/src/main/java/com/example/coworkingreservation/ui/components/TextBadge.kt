package com.example.coworkingreservation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.coworkingreservation.ui.theme.Black
import com.example.coworkingreservation.ui.theme.LocalDimensions
import com.example.coworkingreservation.ui.theme.SemiBoldOpenSans12
import com.example.coworkingreservation.ui.theme.White

@Composable
fun TextBadge(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val dimensions = LocalDimensions.current
    Box(
        modifier = modifier
            .wrapContentSize()
            .clickable { onClick() }
            .background(
                color = White,
                shape = RoundedCornerShape(dimensions.defaultCornerRadius)
            )
            .padding(dimensions.badgePadding)
    ) {
        Text(
            text = text,
            style = SemiBoldOpenSans12,
            color = Black
        )
    }
}

@Preview
@Composable
fun TextBadgePreview() {
    TextBadge(text = "text", onClick = {})
}