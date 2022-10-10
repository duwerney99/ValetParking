package com.example.movies.data.datasource.local.room.impl

import com.example.movies.data.datasource.local.DataBaseDataSource
import com.example.movies.data.datasource.local.room.dao.VehicleDAO
import com.example.movies.data.datasource.local.room.dao.VehicleEntity
import javax.inject.Inject

class DataBaseDataSourceImpl @Inject constructor(private val vehicleDAO: VehicleDAO): DataBaseDataSource {
    override suspend fun getVehicleByPlate(): List<VehicleEntity> {
        return vehicleDAO.getVehicleByPlate()
    }

    override suspend fun insertVehicle(vehicleEntity: VehicleEntity) {
        vehicleDAO.insertVehicle(vehicleEntity.plate, vehicleEntity.type_vehicle, vehicleEntity.name_driver,
                                vehicleEntity.time_entry, vehicleEntity.time_exit)
    }

    override suspend fun deleteVehicle(plate: String){
        vehicleDAO.deleteVehicleByPlate(plate)
    }


}