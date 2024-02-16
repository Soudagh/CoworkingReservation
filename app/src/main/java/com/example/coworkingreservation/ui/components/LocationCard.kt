package com.example.coworkingreservation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coworkingreservation.R
import com.example.coworkingreservation.ui.theme.Black
import com.example.coworkingreservation.ui.theme.LocalDimensions
import com.example.coworkingreservation.ui.theme.PrimaryBlue
import com.example.coworkingreservation.ui.theme.SemiBoldOpenSans14
import com.example.coworkingreservation.ui.theme.White

@Composable
fun LocationCard(
    modifier: Modifier = Modifier,
    cardText: String,
    onClick: () -> Unit
) {
    val dimensions = LocalDimensions.current
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(dimensions.defaultCornerRadius),
        colors = CardDefaults.cardColors(
            containerColor = White,
            contentColor = Black
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Row(
            modifier = Modifier.padding(start = dimensions.textCardPadding),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier.weight(0.7f),
                text = cardText,
                style = SemiBoldOpenSans14,
                color = Black
            )
            IconButton(onClick = onClick) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.blue_circle),
                    contentDescription = null,
                    tint = PrimaryBlue
                )
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.arrow_right),
                    contentDescription = null,
                    tint = White
                )
            }
        }
    }
}


@Preview
@Composable
fun LocationCardPreview() {
    LocationCard(cardText = "Коворкинг на Ломоносова", onClick = {})
}