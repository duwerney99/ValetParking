package com.appta.valetparking.domain.usecase.registerVehicle

import com.appta.valetparking.domain.repository.VehicleRepository
import com.example.movies.data.datasource.local.room.dao.VehicleEntity
import javax.inject.Inject

class RegisterVehicleUseCaseImpl @Inject constructor(private val vehicleRepository: VehicleRepository):
    RegisterVehicleUseCase{

    override suspend fun invoke(vehicleEntity: VehicleEntity) {
        vehicleRepository.insertVehicle(vehicleEntity)
    }
}