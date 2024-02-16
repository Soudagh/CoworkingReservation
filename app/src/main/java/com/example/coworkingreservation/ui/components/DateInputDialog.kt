package com.example.coworkingreservation.ui.components

import androidx.compose.foundation.background
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.coworkingreservation.ui.theme.Black
import com.example.coworkingreservation.ui.theme.PrimaryBlue
import com.example.coworkingreservation.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DateInputDialog(
    onDateSelected: (Long?) -> Unit,
    onDialogOpened: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    val datePickerState = rememberDatePickerState()
    val confirmEnabled = remember {
        derivedStateOf { datePickerState.selectedDateMillis != null }
    }
    var confirmTextColor by remember { mutableStateOf(Black) }

    if (datePickerState.selectedDateMillis != null) {
        confirmTextColor = PrimaryBlue
    }

    DatePickerDialog(
        modifier = modifier,
        colors = DatePickerDefaults.colors(containerColor = White),
        onDismissRequest = {
            onDateSelected(datePickerState.selectedDateMillis)
            onDialogOpened(false)
        },
        confirmButton = {},
        dismissButton = {}
    ) {
        DatePicker(
            modifier = Modifier.background(White),
            state = datePickerState,
            showModeToggle = false,
            colors = DatePickerDefaults.colors(
                containerColor = White,
                headlineContentColor = Black,
                yearContentColor = Black,
                currentYearContentColor = Black,
                selectedYearContentColor = Black,
                selectedYearContainerColor = Black,
                weekdayContentColor = Black,
                dayContentColor = Black,
                selectedDayContentColor = Black,
                selectedDayContainerColor = PrimaryBlue,
                todayContentColor = PrimaryBlue,
                todayDateBorderColor = Black
            )
        )
    }
}

@Preview
@Composable
fun DateInputDialogPreview() {
    DateInputDialog(onDateSelected = {}, onDialogOpened = {})
}