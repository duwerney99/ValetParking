package com.appta.valetparking.domain.repository

import com.appta.valetparking.domain.model.VehicleModel
import com.example.movies.data.datasource.local.room.dao.VehicleEntity

interface VehicleRepository {
    suspend fun getVehicles(): List<VehicleModel>

    suspend fun insertVehicle(vehicleEntity: VehicleEntity)
}