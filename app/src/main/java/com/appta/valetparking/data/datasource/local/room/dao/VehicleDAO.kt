package com.example.movies.data.datasource.local.room.dao

import androidx.room.*
import java.sql.Date
import java.time.LocalDateTime

@Dao
interface VehicleDAO {

    @Query("SELECT * FROM vehicle")
    suspend fun getVehicleByPlate(): List<VehicleEntity>


    @Query("INSERT INTO vehicle (plate, type_vehicle, name_driver, time_entry, time_exit)" +
            " VALUES(:plate,:typeVehicle,:nameDriver, :timeEntry, :timeExit)")
    suspend fun insertVehicle(
        plate: String, typeVehicle: String,
        nameDriver: String, timeEntry: String, timeExit: String
    )

    @Query("DELETE FROM vehicle WHERE plate = :plate")
    suspend fun deleteVehicleByPlate(plate: String)

    @Update
    fun updateVehicle(vehicle: VehicleEntity)
}