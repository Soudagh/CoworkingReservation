package com.example.coworkingreservation.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coworkingreservation.R
import com.example.coworkingreservation.ui.theme.Black
import com.example.coworkingreservation.ui.theme.Gray12
import com.example.coworkingreservation.ui.theme.Gray60
import com.example.coworkingreservation.ui.theme.Gray80
import com.example.coworkingreservation.ui.theme.LocalDimensions
import com.example.coworkingreservation.ui.theme.Red
import com.example.coworkingreservation.ui.theme.RegularOpenSans14
import com.example.coworkingreservation.ui.theme.White

@Composable
fun PrimaryTextField(
    modifier: Modifier = Modifier,
    title: String? = null,
    value: String = "",
    placeholder: String? = null,
    supportText: String? = null,
    errorText: String? = null,
    maxQuantityOfChar: Int? = null,
    isMaxQuantityOfCharVisible: Boolean = true,
    maxLines: Int = 1,
    minLines: Int = 1,
    readOnly: Boolean = false,
    singleLine: Boolean = false,
    isError: Boolean = false,
    isOnlyNumbers: Boolean = false,
    onTextChange: (String) -> Unit,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    @DrawableRes trailingIcon: Int? = null,
    keyboardType: KeyboardType = KeyboardType.Text,
    trailingIconModifier: Modifier = Modifier,
    onTrailingIconClicked: () -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val fillMaxWidthModifier = Modifier.fillMaxWidth()
    val dimensions = LocalDimensions.current

    val borderWidth = 1.dp

    Column(modifier = modifier) {
        title?.let {
            Text(
                text = title,
                style = RegularOpenSans14.copy(color = Black)
            )
            Spacer(modifier = Modifier.height(dimensions.fieldsSpacer))
        }
        BasicTextField(
            modifier = fillMaxWidthModifier,
            value = value,
            onValueChange = { text ->
                if (text.length <= (maxQuantityOfChar ?: (text.length + 1))) {
                    onTextChange(text)
                }
            },
            visualTransformation = visualTransformation,
            textStyle = RegularOpenSans14.copy(
                color = Black,
                lineHeight = 24.sp
            ),
            readOnly = readOnly,
            maxLines = maxLines,
            minLines = minLines,
            singleLine = singleLine,
            keyboardOptions = KeyboardOptions(
                keyboardType = if (isOnlyNumbers) {
                    KeyboardType.Number
                } else {
                    keyboardType
                }
            ),
            interactionSource = interactionSource,
            decorationBox = { innerTextField ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(dimensions.defaultCornerRadius))
                        .background(White)
                        .border(
                            width = borderWidth,
                            color = Gray12,
                            shape = RoundedCornerShape(dimensions.defaultCornerRadius)
                        )
                        .padding(
                            top = dimensions.verticalTiny,
                            bottom = dimensions.verticalTiny,
                            start = dimensions.horizontalSmall,
                            end = dimensions.horizontalTiny
                        )
                        .requiredHeightIn(min = dimensions.verticalMedium),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(dimensions.horizontalTiny)
                ) {
                    trailingIcon?.let { trailingIcon ->
                        IconButton(
                            modifier = trailingIconModifier.size(dimensions.iconDefaultSize),
                            onClick = onTrailingIconClicked
                        ) {
                            Icon(
                                imageVector = ImageVector.vectorResource(id = trailingIcon),
                                contentDescription = null,
                                tint = Gray80,
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .weight(5f)
                            .padding(end = dimensions.horizontalTiny)
                    ) {
                        if (value.isEmpty()) {
                            placeholder?.let { placeholderText ->
                                Text(
                                    text = placeholderText,
                                    style = RegularOpenSans14,
                                    color = Gray60
                                )
                            }
                        }
                        innerTextField()
                    }
                }
            }
        )

        Row(
            modifier = fillMaxWidthModifier.padding(top = dimensions.fieldsSpacer)
        ) {
            if (isError) {
                errorText?.let { text ->
                    Spacer(Modifier.width(dimensions.fieldsSpacer))
                    Text(
                        modifier = fillMaxWidthModifier,
                        text = text,
                        style = RegularOpenSans14,
                        color = Red,
                        textAlign = TextAlign.Start
                    )
                }
            } else {
                supportText?.let { text ->
                    Spacer(Modifier.width(dimensions.fieldsSpacer))
                    Text(
                        text = text,
                        style = RegularOpenSans14,
                        color = Gray80,
                        textAlign = TextAlign.Left
                    )
                }
            }
            maxQuantityOfChar?.let {
                if (isMaxQuantityOfCharVisible) {
                    Text(
                        modifier = fillMaxWidthModifier,
                        text = stringResource(
                            id = R.string.limit_of_max_char,
                            value.length,
                            maxQuantityOfChar
                        ),
                        style = RegularOpenSans14,
                        color = Gray80,
                        textAlign = TextAlign.Right
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PrimaryTextFieldPreview() {
    PrimaryTextField(
        modifier = Modifier.fillMaxWidth(),
        title = "Title",
        value = "Value",
        onTextChange = {}
    )
}
