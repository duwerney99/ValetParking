package com.example.movies.data.di

import android.content.Context
import androidx.room.Room
import com.appta.valetparking.utils.DATABASE
import com.example.movies.data.datasource.local.room.VehicleRoomDatabase
import com.example.movies.data.datasource.local.room.dao.VehicleDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {


    @Provides
    @Singleton
    fun providevehicleDao(vehicleRoomDatabase: VehicleRoomDatabase): VehicleDAO {
        return vehicleRoomDatabase.vehicleDAO()
    }

    @Provides
    @Singleton
    fun provideVehicleDatabase(@ApplicationContext app: Context) = Room.databaseBuilder(
        app,
        VehicleRoomDatabase::class.java,
        DATABASE
    ).build()
}