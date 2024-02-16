package com.example.coworkingreservation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coworkingreservation.R
import com.example.coworkingreservation.ui.components.ToolBar
import com.example.coworkingreservation.ui.theme.CoworkingReservationTheme

@Composable
fun Menu() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        ToolBar(
            titleText = stringResource(id = R.string.choose_coworking_location),
            onNavigationIconClick = {}
        )

        LazyColumn (
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxHeight()
                .padding(24.dp)

        ) {
            items(
                items = listOf(
                    R.string.kronv_cowork,
                    R.string.lomo_cowork,
                    R.string.so_cowork,
                    R.string.yandex_portal
                )
            ) { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFFFFFFFF))
                        .height(80.dp)
                        .shadow(elevation = 4.dp, shape = RoundedCornerShape(20.dp), clip = true),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(item),
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(start = 16.dp),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                    IconButton(
                        onClick = { /* Open portal activity */ },
                        modifier = Modifier.padding(end = 16.dp),
                    ) {
                        Image(
                            contentDescription = null,
                            modifier = Modifier.size(32.dp),
                            painter = painterResource(id = R.drawable.go_to_map_button),
                        )
                        }

                    }
                }

            }
        }

    }



@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    CoworkingReservationTheme {
        Menu()
    }
}