package com.appta.valetparking.domain.model

import java.sql.Date
import java.time.Instant


data class VehicleModel(
    val plate: String,
    val typeVehicle: String,
    val nameDriver: String,
    val timeEntry: String,
    val timeExit: String
)