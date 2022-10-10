package com.appta.valetparking.domain.usecase.getVehicle

import com.appta.valetparking.domain.model.VehicleModel
import com.appta.valetparking.domain.repository.VehicleRepository
import javax.inject.Inject

class GetVehiclesUseCaseImpl @Inject constructor(private val vehicleRepository: VehicleRepository): GetVehiclesUseCase {

    override suspend fun invoke(): List<VehicleModel>{
        return vehicleRepository.getVehicles()
    }
}