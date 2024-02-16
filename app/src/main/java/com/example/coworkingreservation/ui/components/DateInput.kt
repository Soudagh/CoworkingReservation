package com.example.coworkingreservation.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.coworkingreservation.R
import java.text.SimpleDateFormat

@SuppressLint("SimpleDateFormat")
@Composable
fun DateInput(
    titleText: String,
    onDateSelected: (dateInMillis: Long, dateInString: String) -> Unit,
    modifier: Modifier = Modifier,
    isError: Boolean = false,
    dateInString: String = "",
    dateInMillis: Long = 0L
) {
    var selectedDateInMillis by remember { mutableLongStateOf(dateInMillis) }
    var inputTextValue by remember {
        mutableStateOf(dateInString.replace(Regex("\\D"), ""))
    }
    var isErrorWithInput by remember { mutableStateOf(false) }
    val isDatePickerEnabled = remember { mutableStateOf(false) }

    Box(modifier = modifier) {
        PrimaryTextField(
            value = if (selectedDateInMillis == 0L) {
                inputTextValue
            } else {
                SimpleDateFormat("dd.MM.yyyy").format(selectedDateInMillis)
            },
            onTextChange = {
                selectedDateInMillis = 0L
                if (it.length <= 8) {
                    inputTextValue = it.replace(Regex("\\D"), "")
                }
            },
            title = titleText,
            placeholder = stringResource(id = R.string.date_format),
            isError = isErrorWithInput || isError,
            errorText = stringResource(id = R.string.date_error_text),
            trailingIcon = R.drawable.menu_schedule,
            onTrailingIconClicked = {
                isDatePickerEnabled.value = !isDatePickerEnabled.value
                isErrorWithInput = false
            },
            keyboardType = KeyboardType.Number,
            maxLines = 1,
            modifier = Modifier.fillMaxWidth()
        )

        if (isDatePickerEnabled.value) {
            DateInputDialog(
                onDateSelected = {
                    inputTextValue = ""
                    selectedDateInMillis = it ?: 0L
                },
                onDialogOpened = {
                    isDatePickerEnabled.value = it
                }
            )
        }
    }

//    isErrorWithInput =
//        inputTextValue.length == 8 && !DateUtils.isValidDate(DateUtils.formatDate(inputTextValue))
//
//    if (selectedDateInMillis != 0L) {
//        onDateSelected(
//            selectedDateInMillis.normalizeTime() ?: 0L,
//            DateUtils.DATE_FORMAT.format(selectedDateInMillis)
//        )
//    } else {
//        if (inputTextValue.length >= 8 && DateUtils.isValidDate(DateUtils.formatDate(inputTextValue))) {
//            DateUtils.convertDateStringToLong(DateUtils.formatDate(inputTextValue)).normalizeTime()
//                ?.let {
//                    onDateSelected(it, DateUtils.formatDate(inputTextValue))
//                }
//        }
//    }
}

@Preview
@Composable
fun DatePickerPreview() {
    var longDate by remember { mutableLongStateOf(0L) }
    var stringDate by remember { mutableStateOf("") }
    DateInput(
        isError = false,
        onDateSelected = { dateInMillis, dateInString ->
            longDate = dateInMillis
            stringDate = dateInString
        },
        titleText = "Дата"
    )
}