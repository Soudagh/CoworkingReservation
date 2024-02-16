package com.example.coworkingreservation.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.coworkingreservation.R
import com.example.coworkingreservation.ui.theme.Black
import com.example.coworkingreservation.ui.theme.LocalDimensions
import com.example.coworkingreservation.ui.theme.PrimaryBlue
import com.example.coworkingreservation.ui.theme.SemiBoldOpenSans16

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolBar(
    titleText: String,
    modifier: Modifier = Modifier,
    onNavigationIconClick: () -> Unit,
) {
    val dimensions = LocalDimensions.current
    
    CenterAlignedTopAppBar(
        modifier = modifier,
        title = {
            Text(
                text = titleText,
                style = SemiBoldOpenSans16,
                color = Black
            )
        },
        navigationIcon = {
            IconButton(
                onClick = onNavigationIconClick
            ) {
                Icon(
                    modifier = Modifier.size(dimensions.iconDefaultSize),
                    imageVector = ImageVector.vectorResource(R.drawable.back),
                    contentDescription = null,
                    tint = PrimaryBlue
                )
            }
        }
    )
}

@Preview
@Composable
fun ToolBarPreview() {
    ToolBar(
        titleText = "Бронирование",
        onNavigationIconClick = {}
    )
}