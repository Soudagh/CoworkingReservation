package com.example.coworkingreservation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.coworkingreservation.ui.theme.Black
import com.example.coworkingreservation.ui.theme.Gray60
import com.example.coworkingreservation.ui.theme.LocalDimensions
import com.example.coworkingreservation.ui.theme.RegularOpenSans14
import com.example.coworkingreservation.ui.theme.SemiBoldOpenSans14

@Composable
fun TextWithTitle(
    titleText: String,
    bodyText: String,
    modifier: Modifier = Modifier
) {
    val dimensions = LocalDimensions.current
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(dimensions.verticalTiny)
    ) {
        Text(
            text = titleText,
            style = SemiBoldOpenSans14,
            color = Black
        )
        Text(
            text = bodyText,
            style = RegularOpenSans14,
            color = Gray60
        )
    }
}

@Preview
@Composable
fun TextWithTitlePreview() {
    TextWithTitle(titleText = "Title", bodyText = "Body")
}