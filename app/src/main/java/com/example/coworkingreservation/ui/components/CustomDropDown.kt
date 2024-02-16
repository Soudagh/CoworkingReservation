package com.example.coworkingreservation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.example.coworkingreservation.R
import com.example.coworkingreservation.ui.theme.Black
import com.example.coworkingreservation.ui.theme.LocalDimensions
import com.example.coworkingreservation.ui.theme.RegularOpenSans16
import com.example.coworkingreservation.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomDropDown(
    itemList: List<String>,
    textPlaceHolder: String,
    titleText: String,
    onItemSelected: (id: Int) -> Unit,
    modifier: Modifier = Modifier,
    expanded: Boolean = false,
    icon: Int = R.drawable.back,
    isError: Boolean = false,
    errorText: String? = null
) {
    var textFieldSize by remember { mutableIntStateOf(0) }
    var expandedState by remember { mutableStateOf(expanded) }
    var selectedId by remember(itemList) { mutableIntStateOf(-1) }
    var textColorState by remember { mutableStateOf(Black) }

    val dimensions = LocalDimensions.current
    val screenHeight = LocalConfiguration.current.screenHeightDp

    ExposedDropdownMenuBox(
        modifier = modifier
            .clip(shape = RoundedCornerShape(size = dimensions.defaultCornerRadius)),
        expanded = expandedState,
        onExpandedChange = { expandedState = !expandedState }
    ) {
        PrimaryTextField(
            value = if (selectedId >= 0) itemList[selectedId] else "",
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor()
                .padding(bottom = dimensions.fieldsSpacer)
                .onGloballyPositioned { textFieldSize = it.size.width },
            readOnly = true,
            title = titleText,
            onTextChange = { /* Do nothing */ },
            trailingIcon = icon,
            trailingIconModifier = Modifier.rotate(-90f),
            placeholder = textPlaceHolder,
            isError = isError,
            errorText = errorText
        )

        DropdownMenu(
            expanded = expandedState,
            onDismissRequest = { expandedState = !expandedState },
            modifier = Modifier
                .requiredHeightIn(
                    max = screenHeight.times(0.35f).dp,
                    min = dimensions.dropDownMenuMinHeight
                )
                .background(color = White)
                .width(with(LocalDensity.current) { textFieldSize.toDp() })
        ) {
            itemList.forEachIndexed { index, item ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = item,
                            style = RegularOpenSans16
                        )
                    },
                    onClick = {
                        selectedId = index
                        onItemSelected(index)
                        expandedState = !expandedState
                        textColorState = Black
                    }
                )
            }
        }
    }
}