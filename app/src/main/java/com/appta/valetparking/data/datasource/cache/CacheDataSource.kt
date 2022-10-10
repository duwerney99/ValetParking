package com.appta.valetparking.data.datasource.cache

import com.appta.valetparking.data.model.VehicleDTO
import com.example.movies.data.datasource.local.room.dao.VehicleEntity

interface CacheDataSource {
    fun getVehicles(): List<VehicleDTO>
    fun insertVehicle(vehicleEntity: VehicleEntity)
    fun updateVehicle(vehicleEntity: VehicleEntity)
}