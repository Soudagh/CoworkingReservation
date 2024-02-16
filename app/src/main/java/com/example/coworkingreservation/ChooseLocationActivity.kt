package com.example.coworkingreservation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coworkingreservation.ui.theme.CoworkingReservationTheme

class ChooseLocationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoworkingReservationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Menu()
                }
            }
        }
    }
}

@Composable
fun Menu(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Кнопка назад и заголовок
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier
                    .clickable { /* Handle click */ }
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arrow_left),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.back),
                        color = Color(0xFF1846C7),
                        fontSize = 16.sp
                    )
                }
            }

            Text(
                text = stringResource(id = R.string.choose_coworking_location),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 48.dp),
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium

            )

        }

        //Локации
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