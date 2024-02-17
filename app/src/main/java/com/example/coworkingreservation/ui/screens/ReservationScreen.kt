package com.example.coworkingreservation.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.coworkingreservation.R
import com.example.coworkingreservation.domain.models.MeetingRoomViewModel
import com.example.coworkingreservation.ui.components.CustomDropDown
import com.example.coworkingreservation.ui.components.DateInput
import com.example.coworkingreservation.ui.components.PrimaryButton
import com.example.coworkingreservation.ui.components.PrimaryTextField
import com.example.coworkingreservation.ui.components.TextWithTitle
import com.example.coworkingreservation.ui.components.ToolBar
import com.example.coworkingreservation.ui.theme.LocalDimensions

@Composable
fun ReservationScreen(
    navHostController: NavHostController,
    onNavigateUp: () -> Unit,
    meetingRoomViewModel: MeetingRoomViewModel
) {
    val roomInfo = meetingRoomViewModel.roomInfo
    val dimensions = LocalDimensions.current
    var longDate by remember { mutableLongStateOf(0L) }
    var stringDate by remember { mutableStateOf("") }
    var eventName by remember {mutableStateOf("")}
    var members by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("")}
    var extra by remember { mutableStateOf("") }
    var periodTimes by remember { mutableStateOf("Разовое") }
    var periodDays by remember { mutableStateOf("Каждый день") }

    val times = listOf("Периодическое", "Разовое")
    val days = listOf("Каждый день", "Каждую неделю", "Через неделю")

    Column {
        ToolBar(titleText = "Бронирование", onNavigationIconClick = onNavigateUp)
        Column(
            modifier = Modifier
                .padding(horizontal = dimensions.defaultPadding)
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(dimensions.verticalSmall))
            TextWithTitle(
                titleText = stringResource(R.string.room_name),
                bodyText = "${roomInfo?.classroom} \"${roomInfo?.classroomName}\""
            )
            Spacer(modifier = Modifier.height(dimensions.verticalSmall))
            DateInput(
                titleText = "Дата бронирования"
            )
            Spacer(modifier = Modifier.height(dimensions.verticalSmall))
            PrimaryTextField(
                onTextChange = { eventName = it },
                value = eventName,
                title = "Название мероприятия",
                placeholder = "Введите название мероприятия",
                minLines = 1,
            )
            Spacer(modifier = Modifier.height(dimensions.verticalSmall))
            //Сделать TimeRangePicker
            Spacer(modifier = Modifier.height(dimensions.verticalSmall))
            PrimaryTextField(
                onTextChange = {members = it},
                value = members,
                title = "Количество человек",
                placeholder = "Введите количество",
                maxLines = 1,
                isOnlyNumbers = true
            )
            Spacer(modifier = Modifier.height(dimensions.verticalSmall))
            PrimaryTextField(
                onTextChange = {phone = it},
                value = phone,
                title = "Контактный телефон",
                placeholder = "+X (XXX) XXXXXXX",
                maxLines = 1,
                isOnlyNumbers = true
            )
            Spacer(modifier = Modifier.height(dimensions.verticalSmall))
            PrimaryTextField(
                onTextChange = { extra = it },
                value = extra,
                title = "Дополнительно",
                placeholder = "Дополнительные данные",
                minLines = 1,
            )
            Spacer(modifier = Modifier.height(dimensions.verticalSmall))
            CustomDropDown(
                itemList = times,
                textPlaceHolder = "Разовое",
                titleText = "Периодичность мероприятия",
                onItemSelected = {
                    periodTimes = times[it]
                }
            )
            if (periodTimes == "Периодическое") {
                Spacer(modifier = Modifier.height(dimensions.verticalSmall))
                CustomDropDown(
                    itemList = days,
                    titleText = "Период проведения",
                    textPlaceHolder = "Каждый день",
                    onItemSelected = {
                        periodDays = days[it]
                    }
                )
            }
            Spacer(modifier = Modifier.height(dimensions.verticalMedium))
            PrimaryButton(
                modifier = Modifier.fillMaxWidth(),
                text = "Отправить",
                onButtonClick = { /*TODO*/ }
            )
            Spacer(modifier = Modifier.height(dimensions.verticalMedium))
        }
    }

}

@Preview
@Composable
fun ReservationScreenPreview() {
}