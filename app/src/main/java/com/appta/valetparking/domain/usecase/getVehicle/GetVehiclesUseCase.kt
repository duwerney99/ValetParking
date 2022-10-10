package com.appta.valetparking.domain.usecase.getVehicle

import com.appta.valetparking.domain.model.VehicleModel

interface GetVehiclesUseCase {
    suspend operator fun invoke(): List<VehicleModel>
}