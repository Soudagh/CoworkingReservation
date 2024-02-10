package com.example.coworkingreservation.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Dimensions(
    val horizontalTiny: Dp = 8.dp,
    val defaultCornerRadius: Dp = 6.dp,
    val modalCornerRadius: Dp = 12.dp
)

val LocalDimensions = compositionLocalOf { Dimensions() }