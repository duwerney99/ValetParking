package com.example.movies.domain.di

import com.appta.valetparking.domain.usecase.getVehicle.GetVehiclesUseCase
import com.appta.valetparking.domain.usecase.getVehicle.GetVehiclesUseCaseImpl
import com.appta.valetparking.domain.usecase.registerVehicle.RegisterVehicleUseCase
import com.appta.valetparking.domain.usecase.registerVehicle.RegisterVehicleUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {

    @Binds
    @Singleton
    abstract fun  bindGetMoviesUseCase(getVehiclesUseCaseImpl: GetVehiclesUseCaseImpl): GetVehiclesUseCase

    @Binds
    @Singleton
    abstract fun  bindRegisterVehicleUseCase(registerVehicleUseCaseImpl: RegisterVehicleUseCaseImpl): RegisterVehicleUseCase


}