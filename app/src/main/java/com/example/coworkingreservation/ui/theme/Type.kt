package com.example.coworkingreservation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.coworkingreservation.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val CoworkingAppOpenSans = FontFamily(
    Font(R.font.opensans_bold, FontWeight.Bold),
    Font(R.font.opensans_regular, FontWeight.Normal),
    Font(R.font.opensans_semibold, FontWeight.SemiBold)
)

private val RegularOpenSansStyle = TextStyle(
    fontFamily = CoworkingAppOpenSans,
    fontWeight = FontWeight.Normal,
    lineHeight = 24.sp,
    platformStyle = PlatformTextStyle(
        includeFontPadding = false
    )
)

private val BoldOpenSansStyle = TextStyle(
    fontFamily = CoworkingAppOpenSans,
    fontWeight = FontWeight.Bold,
    platformStyle = PlatformTextStyle(
        includeFontPadding = false
    )
)

private val SemiBoldOpenSansStyle = TextStyle(
    fontFamily = CoworkingAppOpenSans,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 24.sp,
    platformStyle = PlatformTextStyle(
        includeFontPadding = false
    )
)


val RegularOpenSans16 = RegularOpenSansStyle.copy(fontSize = 16.sp)
val RegularOpenSans14 = RegularOpenSansStyle.copy(fontSize = 14.sp)

val SemiBoldOpenSans18 = SemiBoldOpenSansStyle.copy(fontSize = 18.sp)
val SemiBoldOpenSans16 = SemiBoldOpenSansStyle.copy(fontSize = 16.sp)
val SemiBoldOpenSans14 = SemiBoldOpenSansStyle.copy(fontSize = 14.sp)
val SemiBoldOpenSans12 = SemiBoldOpenSansStyle.copy(fontSize = 12.sp)

val BoldOpenSans14 = BoldOpenSansStyle.copy(fontSize = 14.sp)
val BoldOpenSans16 = BoldOpenSansStyle.copy(fontSize = 16.sp)
