package com.example.coworkingreservation.domain.models

data class UiReservationInfo(
    val id: String,
    val roomInfo: UiMeetingRoomInfo,
    val date: Long,
    val eventName: String,
    val timeRange: Long,
    val peopleCount: Int,
    val phone: String,
    val comment: String?,
    val periodTimes: PeriodTimes = PeriodTimes.Разовое,
    val periodDays: PeriodDays?,
    val equip: List<String>
)