package com.appta.valetparking.data.datasource.cache.impl

import com.appta.valetparking.data.datasource.cache.CacheDataSource
import com.appta.valetparking.data.model.VehicleDTO
import com.example.movies.data.datasource.local.room.dao.VehicleEntity
import javax.inject.Inject

class CacheDataSourceImpl @Inject constructor() : CacheDataSource {
    override fun getVehicles(): List<VehicleDTO> {
        return listOf()
    }

    override fun insertVehicle(vehicleEntity: VehicleEntity){}

    override fun updateVehicle(vehicleEntity: VehicleEntity) {}
}