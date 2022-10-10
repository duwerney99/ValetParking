package com.appta.valetparking.domain.usecase.registerVehicle

import com.example.movies.data.datasource.local.room.dao.VehicleEntity

interface RegisterVehicleUseCase {
    suspend operator fun invoke(vehicleEntity: VehicleEntity)
}