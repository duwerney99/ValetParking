package com.example.movies.data.di

import com.appta.valetparking.data.repository.VehicleRepositoryImpl
import com.appta.valetparking.domain.repository.VehicleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {


    @Binds
    @Singleton
    abstract fun bindVehicleRepository(vehicleRepositoryImpl: VehicleRepositoryImpl): VehicleRepository
}