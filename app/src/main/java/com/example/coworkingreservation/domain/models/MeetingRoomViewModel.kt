package com.example.coworkingreservation.domain.models

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MeetingRoomViewModel() : ViewModel() {
    var roomInfo by mutableStateOf<UiMeetingRoomInfo?>(null)
        private set

    fun addRoomInfo(newRoomInfo: UiMeetingRoomInfo) {
        roomInfo = newRoomInfo
    }
}