package com.appta.valetparking.data.mapper

import com.appta.valetparking.data.model.VehicleDTO
import com.appta.valetparking.domain.model.VehicleModel

fun VehicleDTO.toVehicleModel() = VehicleModel(this.plate, this.type_vehicle, this.name_driver, this.time_entry, this.time_exit )

fun List<VehicleDTO>.toListVehicleModel() = this.map { it.toVehicleModel() }