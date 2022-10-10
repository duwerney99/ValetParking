package com.example.movies.data.datasource.local

import com.example.movies.data.datasource.local.room.dao.VehicleEntity

interface DataBaseDataSource {

    suspend fun getVehicleByPlate(): List<VehicleEntity>

    suspend fun insertVehicle(vehicleEntity: VehicleEntity)

    suspend fun deleteVehicle(plate: String)

}