package com.example.coworkingreservation.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.coworkingreservation.ui.theme.BrightBlue
import com.example.coworkingreservation.ui.theme.LocalDimensions
import com.example.coworkingreservation.ui.theme.PrimaryBlue
import com.example.coworkingreservation.ui.theme.SemiBoldOpenSans14
import com.example.coworkingreservation.ui.theme.White

@Composable
fun PrimaryButton(
    text: String,
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    isEnabled: Boolean = true
) {
    val dimensions = LocalDimensions.current

    Button(
        modifier = modifier,
        enabled = isEnabled,
        onClick = onButtonClick,
        shape = RoundedCornerShape(dimensions.defaultCornerRadius),
        colors = ButtonDefaults.buttonColors(
            containerColor = PrimaryBlue,
            contentColor = White,
            disabledContainerColor = BrightBlue.copy(alpha = 0.5f),
            disabledContentColor = White.copy(alpha = 0.5f)
        )
    ) {
        leftIcon?.let { icon ->
            Icon(
                imageVector = ImageVector.vectorResource(id = icon), contentDescription = null
            )
        }
        Spacer(modifier = Modifier.width(dimensions.horizontalTiny))
        Text(
            text = text,
            style = SemiBoldOpenSans14
        )
        Spacer(modifier = Modifier.width(dimensions.horizontalTiny))
        rightIcon?.let { icon ->
            Icon(
                imageVector = ImageVector.vectorResource(id = icon), contentDescription = null
            )
        }
    }
}

@Preview
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Click",
        onButtonClick = { }
    )
}