package com.example.movies.data.datasource.local.room.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "vehicle")
data class VehicleEntity(
    @PrimaryKey(autoGenerate = false)
    val plate: String,
    @ColumnInfo(name = "type_vehicle")
    val type_vehicle: String,
    @ColumnInfo(name = "name_driver")
    val name_driver: String,
    @ColumnInfo(name = "time_entry")
    val time_entry: String,
    @ColumnInfo(name = "time_exit")
    val time_exit: String
    )
