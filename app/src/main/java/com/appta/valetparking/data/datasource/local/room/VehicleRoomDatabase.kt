package com.example.movies.data.datasource.local.room


import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.appta.valetparking.data.datasource.local.room.Converters
import com.example.movies.data.datasource.local.room.dao.VehicleEntity
import com.example.movies.data.datasource.local.room.dao.VehicleDAO


@Database(
    entities = [VehicleEntity::class],
    version = 3,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class VehicleRoomDatabase : RoomDatabase() {
    abstract fun vehicleDAO(): VehicleDAO
}
