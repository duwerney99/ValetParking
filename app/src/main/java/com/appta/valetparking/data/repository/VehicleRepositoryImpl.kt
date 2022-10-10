package com.appta.valetparking.data.repository

import com.appta.valetparking.data.datasource.cache.CacheDataSource
import com.appta.valetparking.data.mapper.toListVehicleModel
import com.appta.valetparking.domain.model.VehicleModel
import com.appta.valetparking.domain.repository.VehicleRepository
import com.example.movies.data.datasource.local.room.dao.VehicleEntity
import javax.inject.Inject

class VehicleRepositoryImpl @Inject constructor(private val cacheDataSource: CacheDataSource): VehicleRepository{

    override suspend fun getVehicles(): List<VehicleModel>{
        return cacheDataSource.getVehicles().toListVehicleModel()
    }

    override suspend fun insertVehicle(vehicleEntity: VehicleEntity) {
        cacheDataSource.insertVehicle(vehicleEntity)
    }
}