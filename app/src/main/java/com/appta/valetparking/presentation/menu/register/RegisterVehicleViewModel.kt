package com.appta.valetparking.presentation.menu.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appta.valetparking.domain.usecase.registerVehicle.RegisterVehicleUseCase
import com.example.movies.data.datasource.local.room.dao.VehicleEntity
import com.example.movies.presentation.di.IoDispatcher
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class RegisterVehicleViewModel @Inject constructor(
    private val registerVehicleUseCase: RegisterVehicleUseCase,
    @IoDispatcher private val dispatcher: CoroutineDispatcher = Dispatchers.IO
):
    ViewModel(){

        fun insertVehicle(vehicleEntity: VehicleEntity) {
            viewModelScope.launch(dispatcher) {
                registerVehicleUseCase(vehicleEntity)
            }
        }

}